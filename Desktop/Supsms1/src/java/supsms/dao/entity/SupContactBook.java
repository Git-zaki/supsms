/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supsms.dao.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author AbdouBox
 */
@Entity
public class SupContactBook implements Serializable {
    @Id
    private Long id;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    
    
}
