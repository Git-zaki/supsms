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
    
    ///Id_User
   
}
