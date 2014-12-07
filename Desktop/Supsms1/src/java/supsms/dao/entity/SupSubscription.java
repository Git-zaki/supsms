package supsms.dao.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author AbdouBox
 */
@Entity
@Table(name="SUPSUBSCRIPTION")
public class SupSubscription implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_subscription")
    private Long Id_subscription;
    
    @Column (name = "dateSubcription", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DateSubcription;

    public Long getId_subscription() {
        return Id_subscription;
    }

    public void setId_subscription(Long Id_subscription) {
        this.Id_subscription = Id_subscription;
    }

    public Date getDateSubcription() {
        return DateSubcription;
    }

    public void setDateSubcription(Date DateSubcription) {
        this.DateSubcription = DateSubcription;
    }

    @Override
    public String toString() {
        return "SupSubscription{" + "Id_subscription=" + Id_subscription + '}';
    }
    
    
   
}
