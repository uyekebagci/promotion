package umut.banking.demo.entity.rule;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;

import java.util.List;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_RULE_CHANNEL_GROUP_TYPE")
public class RuleChannelGroupType extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_RULE_CHANNELGROUP_TYPE_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "GROUP_NAME")
	private String groupName;

	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ruleChannelGroup", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<RuleChannelType> ruleChannelTypes;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<RuleChannelType> getRuleChannelTypes() {
		return ruleChannelTypes;
	}

	public void setRuleChannelTypes(List<RuleChannelType> ruleChannelTypes) {
		this.ruleChannelTypes = ruleChannelTypes;
	}
}