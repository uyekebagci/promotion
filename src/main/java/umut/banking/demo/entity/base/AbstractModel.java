package umut.banking.demo.entity.base;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;


/**
 * Genel model soyut sinifi, tum modellerde bulunmasi gereken genel alanlari icerir
 *
 * @author ebitik
 * @author mdpinar
 *
 */

@MappedSuperclass
public abstract class AbstractModel implements IModel
{
    private static final long serialVersionUID = 1L;

    @Column(name = "CREATE_USER", length = 30)
    //@Size(max = 30)
    //:TODO size eklenecek
    protected String createUser;

    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createDate;

    @Column(name = "UPDATE_USER", length = 30)
    @Size(max = 30)
    protected String updateUser;

    @Column(name = "UPDATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date updateDate;

    /**
     * Olusturan user bilgisi manuel setlenmis mi
     */
    @Transient
    private boolean createUserManually = false;

    /**
     * Duzenleyen user bilgisi manuel setlenmis mi
     */
    @Transient
    private boolean updateUserManually = false;

    @Override
    public String getCreateUser()
    {
        return (createUser != null ? createUser : "N/A");
    }

    @Override
    public void setCreateUser(String createUser)
    {
        createUserManually = true;
        this.createUser = createUser;
    }

    @Override
    public String getUpdateUser()
    {
        return (updateUser != null ? updateUser : "N/A");
    }

    @Override
    public void setUpdateUser(String updateUser)
    {
        updateUserManually = true;
        this.updateUser = updateUser;
    }

    @Override
    @Transient
    public boolean isNew()
    {
        return getId() == null || new Long("0").equals(getId());
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj != null && obj instanceof IModel) {
            if (getClass().equals(obj.getClass())) {
                IModel model = (IModel) obj;
                result = (model.getId() != null && getId() != null && model.getId().equals(getId()));
            }
        }

        return result;
    }

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    @Override
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean isCreateUserManually() {
        return createUserManually;
    }

    public void setCreateUserManually(boolean createUserManually) {
        this.createUserManually = createUserManually;
    }

    @Override
    public boolean isUpdateUserManually() {
        return updateUserManually;
    }

    public void setUpdateUserManually(boolean updateUserManually) {
        this.updateUserManually = updateUserManually;
    }
}
