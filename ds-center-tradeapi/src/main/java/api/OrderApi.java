package api;

import com.sun.org.apache.xpath.internal.operations.Or;
import eo.CartItem;
import eo.Order;
import eo.OrderItem;

import java.util.List;

public interface OrderApi {
    /**
     * 查询用户购物车商品
     * @param accountId
     * @return
     */
    List<CartItem> selectCartItem(int accountId);

    /**
     * 用户购物车添加商品
     * @param cartItem
     */
    void addCartItem(CartItem cartItem);

    /**
     * 用户删除购物车商品
     * @param cartItem
     */
    void deleteCartItem(CartItem cartItem);

    /**
     * 用户添加购物车商品的数量
     * @param cartItem
     */
    void addCartItemNum(CartItem cartItem);

    /**
     * 创建订单
     * @param order
     */
    void addOrder(Order order);

    /**
     * 根据条件查询订单
     * @param order
     * @return
     */
    List<Order> selectOrder(Order order);

    /**
     * 修改订单
     * @param order
     */
    void updateOrder(Order order);

    /**
     * 查询订单商品
     * @param orderItem
     * @return
     */
    List<OrderItem> selectOrderItem(OrderItem orderItem);

}
