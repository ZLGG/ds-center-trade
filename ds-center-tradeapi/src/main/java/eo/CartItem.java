package eo;

import lombok.Data;

import java.io.Serializable;

@Data
public class CartItem implements Serializable {
    private Integer id;
    private Long accountId;
    private Long itemId;
    private Integer itemNum;
    private String createTime;
    private String updateTime;
    private Integer dr;
}
