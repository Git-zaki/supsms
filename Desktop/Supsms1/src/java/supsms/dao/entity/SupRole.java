package supsms.dao.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author AbdouBox
 */

@Entity
@Table(name="SUPROLE")
public class SupRole implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_Role")
    private Long Id_Role;

    @Column (name = "roleName", nullable = false)
    private String RoleName;
    
    @ManyToOne
    @JoinColumn(name ="id_User")
    private SupUser user;

    public SupUser getUser() {
        return user;
    }

    public void setUser(SupUser user) {
        this.user = user;
    }
    
    public Long getId_Role() {
        return Id_Role;
    }

    public void setId_Role(Long Id_Role) {
        this.Id_Role = Id_Role;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }
    
    
    
}
