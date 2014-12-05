/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supsms.dao.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;
import supsms.dao.entity.Role;

/**
 *
 * @author Oto
 */
@Entity
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_user;
    
    @ManyToOne @JoinColumn
    private Role id_role;
    
    @NotEmpty
    @Column(nullable=false)
    private String nom;
    
    @NotEmpty
    @Column(nullable = false)
    private String prenom;

    @NotEmpty
    @Column(unique = true,nullable = false)
    private int numeroTel;
    
    @NotEmpty
    @Column(unique=true,nullable = false)
    private String email;
    
    @NotEmpty
    @Column(nullable = false)
    private String motdepasse;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public Role getId_role() {
        return id_role;
    }

    public void setId_role(Role id_role) {
        this.id_role = id_role;
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

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + '}';
    }
    
    
}
