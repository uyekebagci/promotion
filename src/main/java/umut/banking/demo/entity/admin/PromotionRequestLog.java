package umut.banking.demo.entity.admin;


import jakarta.persistence.*;
import umut.banking.demo.utils.StringUtils;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;



@Entity
@Table(name = "DFM_REQUEST_LOG",schema = "PROMOTIONWS_CORE")
public class PromotionRequestLog implements Serializable
{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "PROMOTIONWS_CORE.rq_rs_log_seq", allocationSize = 1, initialValue = 1)
	private Long id;

	@Column(name = "OPERATION")
	private String operation;

    @Column(name = "CLIENT_TRANSACTION_ID", length = 50)
    private String clientTransactionId;

    @Column(name = "CHANNEL")
    private String channel;

    @Lob
    @Column(name = "REQUEST")
    private String request;

    @Column(name = "REQUEST_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;

    @Transient
    private String shortRequest;

    public Date getRequestDateWithTimeZone()
    {
        if (this.requestDate != null)
        {
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(this.requestDate);
            TimeZone timeZone = TimeZone.getTimeZone("Europe/Istanbul");
            calendar.setTimeZone(timeZone);
            return calendar.getTime();
        }
        return this.getRequestDate();
    }

    public String getShortRequest()
    {
        if (StringUtils.isNotBlank(this.request))
        {
            return request.substring(0, 100);
        }
        return shortRequest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(String clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public void setShortRequest(String shortRequest) {
        this.shortRequest = shortRequest;
    }
}