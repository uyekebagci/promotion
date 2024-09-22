package umut.banking.demo.entity.rule;




import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_RULE_CHANNEL_TYPE")
public class RuleChannelType extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_RULE_CHANNEL_TYPE_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "CHANNEL")
	private String channel;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "GROUP_ID")
	private RuleChannelGroupType ruleChannelGroup;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public RuleChannelGroupType getRuleChannelGroup() {
		return ruleChannelGroup;
	}

	public void setRuleChannelGroup(RuleChannelGroupType ruleChannelGroup) {
		this.ruleChannelGroup = ruleChannelGroup;
	}
}