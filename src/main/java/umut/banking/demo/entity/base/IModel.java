package umut.banking.demo.entity.base;

import java.io.Serializable;
import java.util.Date;

public interface IModel extends Serializable
{
    <I extends Serializable> I getId();

    String getCreateUser();

    void setCreateUser(String var1);

    Date getCreateDate();

    void setCreateDate(Date var1);

    String getUpdateUser();

    void setUpdateUser(String var1);

    void setUpdateDate(Date var1);

    boolean isCreateUserManually();

    boolean isUpdateUserManually();

    boolean isNew();
}