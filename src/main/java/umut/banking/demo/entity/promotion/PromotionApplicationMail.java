package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_APP_MAIL")
public class PromotionApplicationMail extends AbstractModel
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DFM_PROMO_APP_MAIL_SEQ")
    @SequenceGenerator(name = "DFM_PROMO_APP_MAIL_SEQ", sequenceName = "DFM_PROMO_APP_MAIL_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "MAIL", unique = true)
    private String mail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
