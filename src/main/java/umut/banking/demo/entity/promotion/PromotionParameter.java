package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import umut.banking.demo.entity.enums.PromotionType;

/**
 * 
 * @author O_BILIR
 */
@Entity
@Table(name = "DFM_PROMO_PARAMETER")
public class PromotionParameter extends AbstractModel {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_PARAM_SEQ", allocationSize = 1)
	private Long id;
	
	public PromotionParameter() {
	}
	
	@Column(name = "PROMOTION_TYPE", length = 200)
	@Enumerated(EnumType.STRING)
	private PromotionType promotionType;
	
	@Column(name = "TABLE_NAME", length = 30)
	private String tableName;
	
	@Column(name = "COLUMN_NAME", length = 30)
	private String columnName;
	
	@Column(name = "DEFAULT_VALUE", length = 255)
	private String defaultValue;
	
	@Column(name = "IS_REQUIRED")
	private boolean required;
	
//	@Column(name = "AUTO_FILL")
//	private boolean autoFill;
	
	@Column(name = "DELETE_WHEN_PROMO_TYPE_CHANGE")
	private boolean deleteWhenPromoTypeChange;

	@SuppressWarnings("unchecked")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PromotionParameter other = (PromotionParameter) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "com.thy.ps.tk_dfm_web.model.PromotionParameter[ id=" + id + " ]";
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

//	public boolean isAutoFill() {
//		return autoFill;
//	}
//
//	public void setAutoFill(boolean autoFill) {
//		this.autoFill = autoFill;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PromotionType getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(PromotionType promotionType) {
		this.promotionType = promotionType;
	}

	public boolean isDeleteWhenPromoTypeChange() {
		return deleteWhenPromoTypeChange;
	}

	public void setDeleteWhenPromoTypeChange(boolean deleteWhenPromoTypeChange) {
		this.deleteWhenPromoTypeChange = deleteWhenPromoTypeChange;
	}

}