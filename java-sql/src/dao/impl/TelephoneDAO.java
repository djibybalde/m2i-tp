package dao.impl;

import dao.interfaces.ITelephoneDAO;
import models.Client;
import models.Telephone;
import service.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TelephoneDAO implements ITelephoneDAO {
    // Getters des de results
    private Telephone getRow(ResultSet res) throws SQLException {
        return new Telephone(
                res.getInt("id"),
                res.getInt("idClient"),
                res.getString("numero")
        );
    }

    private void setAttributes(PreparedStatement statement, Telephone telephone) throws SQLException {
        statement.setInt(1, telephone.getIdClient());
        statement.setString(2, telephone.getNumero());
    }

    @Override
    public List<Telephone> getAll() {
        List<Telephone> telephones = new ArrayList<>();
        try {
            Connection connexion = DBConnection.getInstance();
            Statement statement = connexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM telephones");
            while (resultSet.next()) {
                telephones.add(this.getRow(resultSet));
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return telephones;
    }

    @Override
    public Telephone getById(int id) {
        Telephone telephone = null;
        try {
            Connection connexion = DBConnection.getInstance();
            PreparedStatement statement = connexion.prepareStatement("SELECT * FROM telephones WHERE id=?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                telephone = this.getRow(resultSet);
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return telephone;
    }

    @Override
    public void save(Telephone telephone) {
        try {
            Connection connexion = DBConnection.getInstance();
            PreparedStatement statement = connexion.prepareStatement(
                    "INSERT INTO telephones(idClient, numero) values(?, ?)"
            );
            this.setAttributes(statement, telephone);
            statement.executeUpdate();
            System.out.println("Client crée avec succès");
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    @Override
    public void update(Telephone telephone) {
        try {
            Connection connexion = DBConnection.getInstance();
            PreparedStatement statement = connexion.prepareStatement("UPDATE telephones SET idClient=?,numero=? WHERE id=?");
            this.setAttributes(statement, telephone);
            statement.setInt(3, telephone.getId());
            statement.executeUpdate();
            System.out.println("Telephone mis à jour avec succès");
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Connection connexion = DBConnection.getInstance();
            PreparedStatement statement = connexion.prepareStatement("DELETE FROM telephones WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Telephones supprimé avec succès");
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }
}
