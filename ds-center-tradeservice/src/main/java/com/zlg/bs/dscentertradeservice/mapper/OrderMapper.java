package com.zlg.bs.dscentertradeservice.mapper;

import eo.CartItem;
import eo.Order;
import eo.OrderItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrderMapper {
    @Select("select * from tr_cart_item t where dr = 0 and t.account_Id = #{accountId}")
    List<CartItem> selectCartItem(@Param("accountId") int accountId);

    @Insert("insert into tr_cart_item (account_id,item_id,item_num,create_time) values(#{item.accountId},#{item.itemId},#{item.itemNum},now() )")
    void insertCartItem(@Param("item") CartItem item);

    @Update("update tr_cart_item set dr = 1,update_time = now() where item_id = #{itemId} and account_id = #{accountId}")
    void deleteCartItem(@Param("itemId") Long itemId,@Param("accountId") Long accountId);

    @Update("update tr_cart_item set item_num = item_num + #{cartItem.itemNum} ,update_time = now() where item_id = #{cartItem.itemId} and account_id = #{cartItem.accountId}")
    void addItemNum(@Param("cartItem") CartItem cartItem);

    @Insert("insert into tr_order (order_no,account_id,total_item_num,pay_amount,order_time,create_time)values(#{order.orderNo},#{order.accountId},#{order.totalItemNum},#{order.payAmount},#{order.orderTime},#{order.createTime})")
    void insertOrder(@Param("order") Order order);


    @Update("<script>" +
            "update tr_order t " +
            "set " +
            "<if test = 'order.tradeNo != null'> t.trade_no = #{order.tradeNo},</if>" +
            "<if test = 'order.status != null'>t.status = #{order.status},</if>" +
            "<if test = 'order.orderTime != null'>t.order_time = #{order.orderTime},</if>" +
            "<if test = 'order.payTime != null'>t.pay_time = #{order.payTime},</if>" +
            "<if test = 'order.shippingTime !=null'>t.shipping_time = #{order.shippingTime},</if>" +
            "<if test = 'order.collectTime != null'>t.collect_time = #{order.collectTime},</if>" +
            "<if test = 'order.finishTime != null'>t.finish_time = #{order.finishTime},</if>" +
            "<if test = 'order.cancelTime != null'>t.cancel_time = #{order.cancelTime},</if>" +
            "<if test = 'order.isPay != null'>t.is_pay = #{order.isPay},</if>" +
            "<if test = 'order.dr != null'>t.dr = #{order.dr},</if>" +
            "t.update_time = now()" +
            "where" +
            "t.order_no = #{order.orderNo}" +
            "</script>")
    void updateOrder(@Param("order") Order order);

    @Select("script" +
            "select * from tr_order t" +
            "where" +
            "t.dr = #{order.dr}" +
            "<if test = 'order.orderNo != null'>and t.order_no = #{order.orderNo}</if>" +
            "<if test = 'order.tradeNo != null'>and t.trader_no = #{order.traderNo}</if>" +
            "<if test = 'order.accountId != null'>and t.account_id = #{order.accountId}</if>" +
            "<if test = 'order.status != null'>and t.status = #{order.status}</if>" +
            "<if test = 'order.isPay != null'>and t.is_pay = #{order.isPay}</if>" +
            "</script>")
    List<Order> selectOrderList(@Param("order") Order order);

    @Select("select * from tr_order_item t where" +
            "t.dr = #{order.dr}" +
            "and t.order_id = #{order.orderId}")
    List<OrderItem> selectOrderItem(@Param("order") OrderItem order);






}
