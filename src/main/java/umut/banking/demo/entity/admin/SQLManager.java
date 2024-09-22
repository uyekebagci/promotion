package umut.banking.demo.entity.admin;

import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;


/**
 * SQLManager modeli,
 * 
 * @author A_BISKINLER
 * 
 */
@Entity
@Table(name="DFM_SQLMANAGER")
public class SQLManager extends AbstractModel
{

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DFM_SQLManager_SEQ")
	@SequenceGenerator(name = "DFM_SQLManager_SEQ", sequenceName = "DFM_SQLManager_SEQ", allocationSize=1, initialValue=1)
	private Long id;

	@Column(name="SQL")
	@Lob
	private String sql;
	
	@Column(name="ResultTable")
	@Lob
	private String resultTable;
	
	@Column(name="DescribeSQL",length=255)
	private String describeSQL;
	
	@Column(name="StartPosition")
	private int startPosition = 0;
	
	@Column(name="MaxResult")
	private int maxResult = 0;

	@Column(name="Restriction")
	private boolean restriction = true;
	
	public String toString() {
		return this.id + " -> " + sql + ", " +  startPosition + ", " +  maxResult + ", " +  restriction;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getResultTable() {
		return resultTable;
	}

	public void setResultTable(String resultTable) {
		this.resultTable = resultTable;
	}

	public String getDescribeSQL() {
		return describeSQL;
	}

	public void setDescribeSQL(String describeSQL) {
		this.describeSQL = describeSQL;
	}

	public int getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getMaxResult() {
		return maxResult;
	}

	public void setMaxResult(int maxResult) {
		this.maxResult = maxResult;
	}

	public boolean isRestriction() {
		return restriction;
	}

	public void setRestriction(boolean restriction) {
		this.restriction = restriction;
	}
}
