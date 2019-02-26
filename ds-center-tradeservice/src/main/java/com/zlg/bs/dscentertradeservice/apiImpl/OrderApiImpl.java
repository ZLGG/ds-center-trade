package com.zlg.bs.dscentertradeservice.apiImpl;

import api.OrderApi;
import com.alibaba.dubbo.config.annotation.Service;
import com.zlg.bs.dscentertradeservice.service.OrderService;
import eo.CartItem;
import eo.Order;
import eo.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service(group = "zlg",version = "0.0.1")
public class OrderApiImpl implements OrderApi {
    @Autowired
    OrderService orderService;
    public List<CartItem> selectCartItem(int accountId) {
        List<CartItem> cartItems = orderService.selectCartItem(accountId);
        return cartItems;
    }

    public void addCartItem(CartItem cartItem) {
        orderService.addCartItem(cartItem);
    }

    public void deleteCartItem(CartItem cartItem) {
        orderService.deleteCartItem(cartItem);
    }

    public void addCartItemNum(CartItem cartItem) {
        orderService.addCartItemNum(cartItem);
    }

    public void addOrder(Order order) {
        orderService.addOrder(order);
    }

    public List<Order> selectOrder(Order order) {
        List<Order> orders = orderService.selectOrder(order);
        return orders;
    }

    public void updateOrder(Order order) {
        orderService.updateOrder(order);
    }

    public List<OrderItem> selectOrderItem(OrderItem orderItem) {
        List<OrderItem> orderItems = orderService.selectOrderItem(orderItem);
        return orderItems;
    }
}
