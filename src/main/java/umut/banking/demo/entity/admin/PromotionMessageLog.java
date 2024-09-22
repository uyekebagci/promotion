package umut.banking.demo.entity.admin;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "MESSAGE_LOG",schema = "PROMOTIONWS_CORE")

public class PromotionMessageLog implements Serializable
{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "PROMOTIONWS_CORE.seq_messagelog", allocationSize = 1, initialValue = 1)
	private Long id;

	@Column(name = "OPERATION_NAME")
	private String operationName;

    @Column(name = "CLIENT_TRANSACTION_ID")
    private String clientTransactionId;

    @Column(name = "SERVER_TRANSACTION_ID")
    private String serverTransactionId;

    @Lob
    @Column(name = "STACK_TRACE")
    private String stackTrace;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "LOG_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logDate;

    @Transient
    private String shortStackTrace;

    public String getShortStackTrace()
    {
        if ((this.stackTrace) != null && !this.stackTrace.isEmpty())
        {
            return stackTrace.substring(0, 100);
        }
        return shortStackTrace;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(String clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }

    public String getServerTransactionId() {
        return serverTransactionId;
    }

    public void setServerTransactionId(String serverTransactionId) {
        this.serverTransactionId = serverTransactionId;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public void setShortStackTrace(String shortStackTrace) {
        this.shortStackTrace = shortStackTrace;
    }
}