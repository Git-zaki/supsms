package supsms.dao.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author AbdouBox
 */

@Entity
public class SupPayment implements Serializable {
    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_Suply")
    private Long Id_Suply;
            
    @Column (name = "firstName", nullable = false)
    private String FirstName;
    
    @Column (name = "lastName", nullable = false)
    private String LastName;
    
    @Column (name = "cardNumber", nullable = false)
    private Long CardNumber;
    
    @Column (name = "crypto", nullable = false)
    private Long Crypto;
    
    @Column (name = "expiryDate", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ExpiryDate;
    
    @OneToOne
    @JoinColumn(name="id_Role")
    private SupRole suprole;

    public Long getId_Suply() {
        return Id_Suply;
    }

    public void setId_Suply(Long Id_Suply) {
        this.Id_Suply = Id_Suply;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Long getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(Long CardNumber) {
        this.CardNumber = CardNumber;
    }

    public Long getCrypto() {
        return Crypto;
    }

    public void setCrypto(Long Crypto) {
        this.Crypto = Crypto;
    }

    public Date getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(Date ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public SupRole getSuprole() {
        return suprole;
    }

    public void setSuprole(SupRole suprole) {
        this.suprole = suprole;
    }

    @Override
    public String toString() {
        return "SupPayment{" + "Id_Suply=" + Id_Suply + '}';
    }
       
    }
