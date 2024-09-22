package umut.banking.demo.entity.promotion;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_APP_ADDITION")
public class PromotionApplicationAddition extends AbstractModel
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DFM_PROMO_APP_ADDITION_SEQ")
    @SequenceGenerator(name = "DFM_PROMO_APP_ADDITION_SEQ", sequenceName = "DFM_PROMO_APP_ADDITION_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "ECO_LIMITED_ACCOUNT_CODE")
    private String ecoLimitedAccountCode;

    @Column(name = "ECO_SEAT_ACCOUNT_CODE")
    private String ecoSeatAccountCode;

    @Column(name = "BUSINESS_LIMITED_ACCOUNT_CODE")
    private String businessLimitedAccountCode;

    @Column(name = "BUSINESS_SEAT_ACCOUNT_CODE")
    private String businessSeatAccountCode;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROMO_APP_ID")
    private PromotionApplication promotionApplication;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEcoLimitedAccountCode() {
        return ecoLimitedAccountCode;
    }

    public void setEcoLimitedAccountCode(String ecoLimitedAccountCode) {
        this.ecoLimitedAccountCode = ecoLimitedAccountCode;
    }

    public String getEcoSeatAccountCode() {
        return ecoSeatAccountCode;
    }

    public void setEcoSeatAccountCode(String ecoSeatAccountCode) {
        this.ecoSeatAccountCode = ecoSeatAccountCode;
    }

    public String getBusinessLimitedAccountCode() {
        return businessLimitedAccountCode;
    }

    public void setBusinessLimitedAccountCode(String businessLimitedAccountCode) {
        this.businessLimitedAccountCode = businessLimitedAccountCode;
    }

    public String getBusinessSeatAccountCode() {
        return businessSeatAccountCode;
    }

    public void setBusinessSeatAccountCode(String businessSeatAccountCode) {
        this.businessSeatAccountCode = businessSeatAccountCode;
    }

    public PromotionApplication getPromotionApplication() {
        return promotionApplication;
    }

    public void setPromotionApplication(PromotionApplication promotionApplication) {
        this.promotionApplication = promotionApplication;
    }
}
