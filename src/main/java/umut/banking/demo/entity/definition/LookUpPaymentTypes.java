package umut.banking.demo.entity.definition;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_LU_PAYMENT_TYPES")
public class LookUpPaymentTypes extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "LU_PAYMENT_TYPES_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "DESCRIPTION")
	private String description;

	@NotNull
	@Column(name = "PAYMENT_TYPE", nullable = false)
	private String paymentType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
}
