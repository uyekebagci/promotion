package umut.banking.demo.entity.rule;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
/**
 * Created by INNGKISAKOL on 7/31/2017.
 */
@Entity
@Table(name = "DFM_RULE_TRANSFER_TYPE")
public class RuleTransferType extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_RULE_TRANSFER_TYPE_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "TRANSFER_TYPE")
	private String transferType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
}