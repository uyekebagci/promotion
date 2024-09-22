package umut.banking.demo.entity.definition;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "LU_PAYMENT_TYPE_CT")
public class LookUpPaymentTypeCrossTable extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "LU_PAYMENT_TYPES_CT_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "PAYMENT_TYPE_ID", nullable = false)
	@NotNull
	private Long paymentTypeId;

	@Column(name = "PAYMENT_GROUP_ID", nullable = false)
	@NotNull
	private Long paymentGroupId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPaymentTypeId() {
		return paymentTypeId;
	}

	public void setPaymentTypeId(Long paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public Long getPaymentGroupId() {
		return paymentGroupId;
	}

	public void setPaymentGroupId(Long paymentGroupId) {
		this.paymentGroupId = paymentGroupId;
	}
}
