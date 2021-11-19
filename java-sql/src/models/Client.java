package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client extends modelDeBase {
    private String nom;
    private String prenom;
    private String email;
    private char genre;
    private Date dateInscription;
    private Date dateNaissance;
    final private List<Telephone> TELEPHONES;

    public Client(int id, String nom, String prenom, String email, Character genre, Date dateInscription, Date dateNaissance) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.genre = genre;
        this.dateInscription = dateInscription;
        this.dateNaissance = dateNaissance;
        this.TELEPHONES = new ArrayList<>();
    }

    public Client(String nom, String prenom, String email, Character genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.genre = genre;
        this.TELEPHONES = new ArrayList<>();
    }
    public Client(int id, String nom, String prenom, String email, Character genre) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.genre = genre;
        this.TELEPHONES = new ArrayList<>();
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void add(Telephone telephone) {
        TELEPHONES.add(telephone);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + this.getId() + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", genre=" + genre +
                ", dateInscription=" + dateInscription +
                ", dateNaissance=" + dateNaissance +
                ", TELEPHONES=" + TELEPHONES +
                '}';
    }
}
