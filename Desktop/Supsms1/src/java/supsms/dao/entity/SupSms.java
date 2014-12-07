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
import javax.validation.constraints.Size;

/**
 *
 * @author AbdouBox
 */

@Entity
@Table(name="SUPSMS")
public class SupSms implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_sms")
    private Long Id_sms;

    @Column (name = "sender_PhoneNum", nullable = false)
    private int Sender_PhoneNum;
    
    @Column (name = "recipient_PhoneNum", nullable = false)
    private int Recipient_PhoneNum;
   
    @Column (name = "smsText", nullable = false)
    @Size(max=160)
    private String SmsText;
    
    @Column (name = "sentDate", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date SentDate;

    public Long getId_sms() {
        return Id_sms;
    }

    public void setId_sms(Long Id_sms) {
        this.Id_sms = Id_sms;
    }

    public int getSender_PhoneNum() {
        return Sender_PhoneNum;
    }

    public void setSender_PhoneNum(int Sender_PhoneNum) {
        this.Sender_PhoneNum = Sender_PhoneNum;
    }

    public int getRecipient_PhoneNum() {
        return Recipient_PhoneNum;
    }

    public void setRecipient_PhoneNum(int Recipient_PhoneNum) {
        this.Recipient_PhoneNum = Recipient_PhoneNum;
    }

    public String getSmsText() {
        return SmsText;
    }

    public void setSmsText(String SmsText) {
        this.SmsText = SmsText;
    }

    public Date getSentDate() {
        return SentDate;
    }

    public void setSentDate(Date SentDate) {
        this.SentDate = SentDate;
    }

    @Override
    public String toString() {
        return "SupSms{" + "Id_sms=" + Id_sms + '}';
    }      
    
   }
