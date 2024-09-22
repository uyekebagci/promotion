package umut.banking.demo.entity.base;

/**
 * Created by INNGKISAKOL on 8/2/2017.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
import java.util.Date;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class AbstractSimpleModel implements IModel {
    private static final long serialVersionUID = 1L;

    public AbstractSimpleModel() {
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final Date getCreateDate() {
        return null;
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final String getCreateUser() {
        return null;
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final String getUpdateUser() {
        return null;
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final boolean isCreateUserManually() {
        return false;
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final boolean isUpdateUserManually() {
        return false;
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final void setCreateDate(Date createDate) {
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final void setCreateUser(String createUser) {
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final void setUpdateDate(Date updateDate) {
    }

    /** @deprecated */
    @Transient
    @Deprecated
    public final void setUpdateUser(String updateUser) {
    }

    public int hashCode() {
        int hash = 0;
        hash = hash + (this.getId() != null?this.getId().hashCode():0);
        return hash;
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null && obj instanceof IModel && this.getClass().equals(obj.getClass())) {
            IModel model = (IModel)obj;
            result = model.getId() != null && this.getId() != null && model.getId() == this.getId();
        }

        return result;
    }
}
