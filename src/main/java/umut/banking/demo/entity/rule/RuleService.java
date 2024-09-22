package umut.banking.demo.entity.rule;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_RULE_SERVICE")
public class RuleService extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_RULE_SERVICE_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "SERVICE_NAME", length = 2, nullable = false, unique = true)
	private String serviceName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}