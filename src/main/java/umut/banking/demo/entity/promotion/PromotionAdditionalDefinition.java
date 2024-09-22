package umut.banking.demo.entity.promotion;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
import umut.banking.demo.entity.enums.PromotionEnum;


/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_ADD_DEF")
public class PromotionAdditionalDefinition extends AbstractModel
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DFM_PROMO_ADD_DEF_SEQ")
    @SequenceGenerator(name = "DFM_PROMO_ADD_DEF_SEQ", sequenceName = "DFM_PROMO_ADD_DEF_SEQ", allocationSize = 1)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "IS_COMPENSATION")
    private PromotionEnum.Answer isCompensation = PromotionEnum.Answer.NO;

    @Column(name = "MAX_FLIGHT_DURATION")
    private Integer maxFlightDuration;

    @Column(name = "MAX_TICKETING_DURATION")
    private Integer maxTicketingDuration;

    @OneToOne
    @JoinColumn(name = "PROMO_APP_ID")
    private PromotionApplication promotionApplication;
    @Column(name = "DESCRIPTION")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PromotionEnum.Answer getIsCompensation() {
        return isCompensation;
    }

    public void setIsCompensation(PromotionEnum.Answer isCompensation) {
        this.isCompensation = isCompensation;
    }

    public Integer getMaxFlightDuration() {
        return maxFlightDuration;
    }

    public void setMaxFlightDuration(Integer maxFlightDuration) {
        this.maxFlightDuration = maxFlightDuration;
    }

    public Integer getMaxTicketingDuration() {
        return maxTicketingDuration;
    }

    public void setMaxTicketingDuration(Integer maxTicketingDuration) {
        this.maxTicketingDuration = maxTicketingDuration;
    }

    public PromotionApplication getPromotionApplication() {
        return promotionApplication;
    }

    public void setPromotionApplication(PromotionApplication promotionApplication) {
        this.promotionApplication = promotionApplication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
