package com.example.mscandidat.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Candidat implements Serializable {
    private static final long serialVersionUID=6 ;

    @Id
    @GeneratedValue
    private int id ;
    private  String nom,prenom,email;

    public Candidat(String nom, String prenom, String email) {
    }


    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public  String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public  String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public Candidat(String nom) {
        super();
        this.nom = nom;
    }

    public Candidat() {
        super();
    }



}
