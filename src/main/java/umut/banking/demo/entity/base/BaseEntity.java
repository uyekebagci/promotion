package umut.banking.demo.entity.base;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;



@MappedSuperclass
public abstract class BaseEntity implements Entity, Serializable
{
	@Version
	@Column(name = "Version", nullable = false)
	private Integer version;

	@Column(name = "CreateUser")
	private String createUser;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreateDate", length = 23)
	private Date createDate;

	@Column(name = "UpdateUser")
	private String updateUser;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UpdateDate", length = 23)
	private Date updateDate;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
