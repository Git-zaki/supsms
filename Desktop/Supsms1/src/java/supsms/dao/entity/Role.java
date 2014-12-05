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
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Oto
 */
@Entity
public class Role implements Serializable{
    
    @Id
    private int id_role;
    
    @NotEmpty
    @Column(nullable=false)
    private String nomRole;

    public int getId() {
        return id_role;
    }

    public void setId(int id) {
        this.id_role = id;
    }

    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    @Override
    public String toString() {
        return "Role{" + "id=" + id_role +'}';
    }
    
    
}
