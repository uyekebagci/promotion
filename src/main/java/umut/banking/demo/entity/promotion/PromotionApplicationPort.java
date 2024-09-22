package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import umut.banking.demo.utils.StringUtils;


/**
 * Created by INNGKISAKOL on 7/31/2017.
 */
@Entity
@Table(name = "DFM_PROMO_APP_PORT")
public class PromotionApplicationPort extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_APP_PORT_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "PORT_CODE", length = 3)
	private String portCode;
	
	@Column(name = "CITY_CODE", length = 3)
	private String cityCode;
	
	@Column(name = "PORT_NAME")
	private String portName;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "COUNTRY_CODE")
	private String countryCode;
	
	@Column(name = "ORIGIN")
	private Boolean origin = new Boolean(false);

	@ManyToOne(optional = false)
	@JoinColumn(name = "PROMO_APP_ID")
	private PromotionApplication promotionApplication;

	public String getPortLabel()
	{
		return new StringBuilder()
				.append(StringUtils.defaultIfEmpty(this.cityCode, StringUtils.EMPTY))
				.append("//")
				.append(StringUtils.defaultIfEmpty(this.cityName, StringUtils.EMPTY))
				.append("//")
				.append(StringUtils.defaultIfEmpty(this.portCode, StringUtils.EMPTY))
				.append("//")
				.append(StringUtils.defaultIfEmpty(this.portName, StringUtils.EMPTY))
				.toString();
	}
	public PromotionApplicationPort()
	{

	}
	public PromotionApplicationPort(String portCode,
									String cityCode,
									String portName,
									String cityName,
									String countryName,
									String countryCode,
									Boolean origin, PromotionApplication promotionApplication)
	{
		this.portCode = portCode;
		this.cityCode = cityCode;
		this.portName = portName;
		this.cityName = cityName;
		this.country = countryName;
		this.countryCode = countryCode;
		this.origin = origin;
		this.promotionApplication = promotionApplication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPortCode() {
		return portCode;
	}

	public void setPortCode(String portCode) {
		this.portCode = portCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Boolean getOrigin() {
		return origin;
	}

	public void setOrigin(Boolean origin) {
		this.origin = origin;
	}

	public PromotionApplication getPromotionApplication() {
		return promotionApplication;
	}

	public void setPromotionApplication(PromotionApplication promotionApplication) {
		this.promotionApplication = promotionApplication;
	}
}