package eo;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

@Table
@Data
public class Order implements Serializable {

    private Long id;
    private String orderNo;
    private Long tradeNo;
    private Long accountId;
    private Integer status;
    private Integer totalItemNum;
    private Double payAmount;
    private Double itemAmount;
    private String orderTime;
    private String payTime;
    private String shippingTime;
    private String collectTime;
    private String finishTime;
    private String cancelTime;
    private String abortTime;
    private Integer isPay;
    private String createTime;
    private String updateTime;
    private Integer dr;


}
