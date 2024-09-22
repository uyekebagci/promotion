package umut.banking.demo.entity.admin;

import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
import umut.banking.demo.entity.enums.UserStatus;

import java.util.List;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_USER")
public class User extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_USER_SEQ", allocationSize = 1, initialValue = 1)
	private Long id;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "RECORD_NO")
	private String recordNo;

	@Column(name = "NAME")
	private String name;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DEPARTMENT")
	private String department;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "USER_STATUS")
	private String userStatus ;

	@Transient
	private Boolean status;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "DFM_USER_ROLE",
			joinColumns =
			@JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
			inverseJoinColumns =
			@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID"))
	private List<Role> roles;

	public Boolean getStatus()
	{
		if (this.userStatus != null)
		{
			this.status = UserStatus.enabled.equals(this.userStatus) ?  Boolean.TRUE : Boolean.FALSE;
		}
		return status;
	}

	public void setStatus(Boolean status)
	{
		if (status != null)
		{
			this.userStatus = Boolean.TRUE.equals(status) ? "enabled" : "disabled";
		}
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRecordNo() {
		return recordNo;
	}

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}