package supsms.dao.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author AbdouBox
 */
@Entity
@Table(name="SUPCONTACTBOOK")
public class SupContactBook implements Serializable {
    @Id
    private Long id;
    private static final long serialVersionUID = 1L;

    
}
