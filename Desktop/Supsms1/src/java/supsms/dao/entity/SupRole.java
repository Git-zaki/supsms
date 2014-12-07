package supsms.dao.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author AbdouBox
 */

@Entity
public class SupRole implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_Role")
    private Long Id_Role;

    @Column (name = "roleName", nullable = false)
    private String RoleName;
    
}
