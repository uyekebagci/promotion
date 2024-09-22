package umut.banking.demo.entity.admin;



import jakarta.persistence.*;
import umut.banking.demo.utils.StringUtils;

import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "DFM_RESPONSE_LOG",schema = "PROMOTIONWS_CORE")
public class PromotionResponseLog implements Serializable
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

    @Lob
    @Column(name = "RESPONSE")
    private String response;

    @Column(name = "RESPONSE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date responseDate;

    @Transient
    private String shortResponse;

    public String getShortResponse()
    {
        if (StringUtils.isNotBlank(this.response))
        {
            return response.substring(0, 100);
        }
        return shortResponse;
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

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public void setShortResponse(String shortResponse) {
        this.shortResponse = shortResponse;
    }
}