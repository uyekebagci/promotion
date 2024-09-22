package umut.banking.demo.entity.definition;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import java.util.List;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_LU_PAYMENT_TYPE_GROUPS")
public class LookUpPaymentTypeGroups extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "LU_PAYMENT_TYPES_G_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "DFM_LU_PAYMENT_TYPE_CT", joinColumns = @JoinColumn(name = "PAYMENT_GROUP_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "PAYMENT_TYPE_ID", referencedColumnName = "ID"))
	private List<LookUpPaymentTypes> lookUpPaymentTypes;

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

	public List<LookUpPaymentTypes> getLookUpPaymentTypes() {
		return lookUpPaymentTypes;
	}

	public void setLookUpPaymentTypes(List<LookUpPaymentTypes> lookUpPaymentTypes) {
		this.lookUpPaymentTypes = lookUpPaymentTypes;
	}
}
