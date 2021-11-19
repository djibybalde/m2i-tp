package dao.impl;

import dao.interfaces.IClientDAO;
import models.Client;
import service.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements IClientDAO {
    // Getters des de results
    private Client getRow(ResultSet res) throws SQLException {
        return new Client(
                res.getInt("id"),
                res.getString("nom"),
                res.getString("prenom"),
                res.getString("email"),
                res.getString("genre").charAt(0),
                res.getDate("dateInscription"),
                res.getDate("dateNaissance")
        );
    }
    private void setAttributes(PreparedStatement statement, Client client) throws SQLException {
        statement.setString(1, client.getNom());
        statement.setString(2, client.getPrenom());
        statement.setString(3, client.getEmail());
        statement.setString(4, String.valueOf(client.getGenre()));
    }

    @Override
    public List<Client> getAll() {
        List<Client> clients=new ArrayList<>();
        try{
            Connection connexion=DBConnection.getInstance();
            Statement statement=connexion.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM clients");
            while (resultSet.next()){
                clients.add(this.getRow(resultSet));
            }
        }catch (SQLException err){
            err.printStackTrace();
        }
        return clients;
    }

    @Override
    public Client getById(int id) {
        Client client=null;
        try {
            Connection connexion = DBConnection.getInstance();
            PreparedStatement statement = connexion.prepareStatement("SELECT * FROM clients WHERE id=?");
            statement.setInt(1, id);
            ResultSet resultSet=statement.executeQuery();
            while (resultSet.next()){
                client=this.getRow(resultSet);
            }
        }catch (SQLException err){
            err.printStackTrace();
        }
        return client;
    }

    @Override
    public void save(Client client) {
        try{
            Connection connexion=DBConnection.getInstance();
            PreparedStatement statement=connexion.prepareStatement(
                    "INSERT INTO clients(nom,prenom,email,genre) values(?,?,?,?)"
            );
            this.setAttributes(statement,client);
            statement.executeUpdate();
            System.out.println("Client crée avec succès");
        }catch (SQLException err){
            err.printStackTrace();
        }
    }

    @Override
    public void update(Client client) {
        try{
            Connection connexion=DBConnection.getInstance();
            PreparedStatement statement=connexion.prepareStatement("UPDATE clients SET nom=?,prenom=?,email=?,genre=? WHERE id=?");
            this.setAttributes(statement,client);
            statement.setInt(5, client.getId());
            statement.executeUpdate();
            System.out.println("Client mis à jour avec succès");
        }catch (SQLException err){
            err.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try{
            Connection connexion=DBConnection.getInstance();
            PreparedStatement statement=connexion.prepareStatement("DELETE FROM clients WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Client supprimé avec succès");
        }catch (SQLException err){
            err.printStackTrace();
        }
    }
}
