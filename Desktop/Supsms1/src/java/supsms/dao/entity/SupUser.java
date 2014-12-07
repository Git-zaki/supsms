package supsms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AbdouBox
 */

@Entity
@Table(name="SUPUSER")
public class SupUser implements Serializable {
    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_User")
    private Long Id_User;
    
    @Column (name = "firstname", nullable = false)
    private String Firstname;
    
    @Column (name = "lastname", nullable = false)
    private String Lastname;
    
    @Column (name = "email", nullable = false)
    private String Email;
    
    @Column (name = "phoneNumber", nullable = false)
    private int PhoneNumber;
    
    @Column (name = "password", nullable = false)
    private int Password;
    
    @OneToMany
    @JoinTable( name="USER_SUBSCRIPTION", 
                joinColumns=@JoinColumn(name="id_User"), 
                inverseJoinColumns=@JoinColumn(name="id_subscription"))
    private Collection<SupSubscription> supsubscription = new ArrayList<SupSubscription>();
    
     public Collection<SupSubscription> getSupSubscription() {
        return supsubscription;
    }
    public void setSupSubscription(Collection<SupSubscription> supsubscription) {
        this.supsubscription = supsubscription;
    }
    
    public Long getId_User() {
        return Id_User;
    }

    public void setId_User(Long Id_User) {
        this.Id_User = Id_User;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }
  
    @Override
    public String toString() {
        return "SupUser{" + "Id_User=" + Id_User + '}';
    }
    
    
}
