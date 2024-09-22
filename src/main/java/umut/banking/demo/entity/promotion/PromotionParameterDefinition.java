package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_PARAMETER_DEFINITION")
public class PromotionParameterDefinition extends AbstractModel
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_PARAMETER_SEQ", allocationSize = 1)
	private Long id;
	
	@Column(name = "PARAMETER")
	private String parameter;
	
	@Column(name = "DESCRIPION")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}