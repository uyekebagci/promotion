package umut.banking.demo.entity.rule;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */
@Entity
@Table(name = "DFM_RULE_FARE_CLASS")
public class RuleFareClass extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_RULE_FARE_CLASS_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "FARE")
	private String fare;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}
}