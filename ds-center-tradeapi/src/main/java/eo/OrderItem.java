package eo;


import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItem implements Serializable {
    private Long id;
    private Long accountId;
    private Long OrderId;
    private Long CatalogId;
    private Long itemId;
    private String itemCode;
    private String itemName;
    private Long itemNum;
    private Double itemPrice;
    private Double subtotalAmount;
    private Double actualSubtotalAmount;
    private Integer isNotCondition;
    private String createTime;
    private String updateTime;
    private Integer dr;

}
