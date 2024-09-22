package umut.banking.demo.entity.base;

public interface Entity
{
    public abstract Long getId();
    public abstract boolean isNull();
    public abstract boolean isNew();
}
