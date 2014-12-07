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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author AbdouBox
 */
@Entity
@Table(name="SUPBILL")
public class SupBill implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_Bill")
    private Long Id_Bill;

    @Column (name = "bill_date", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Bill_date;
    
    @OneToOne
    @JoinColumn(name="id_Subscription")
    private SupPayment supPayment;

    public Long getId_Bill() {
        return Id_Bill;
    }

    public void setId_Bill(Long Id_Bill) {
        this.Id_Bill = Id_Bill;
    }

    public Date getBill_date() {
        return Bill_date;
    }

    public void setBill_date(Date Bill_date) {
        this.Bill_date = Bill_date;
    }

    public SupPayment getSupPayment() {
        return supPayment;
    }

    public void setSupPayment(SupPayment supPayment) {
        this.supPayment = supPayment;
    }

    @Override
    public String toString() {
        return "SupBill{" + "Id_Bill=" + Id_Bill + '}';
    }
    
}
