package com.zlg.bs.dscentertradeservice.serviceImpl;

import com.zlg.bs.dscentertradeservice.mapper.OrderMapper;
import com.zlg.bs.dscentertradeservice.service.OrderService;
import eo.CartItem;
import eo.Order;
import eo.OrderItem;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderMapper orderMapper;
    public List<CartItem> selectCartItem(int accountId) {
        List<CartItem> cartItems = orderMapper.selectCartItem(accountId);
        return cartItems;
    }

    public void addCartItem(CartItem cartItem) {
        orderMapper.insertCartItem(cartItem);

    }

    public void deleteCartItem(CartItem cartItem) {
        orderMapper.deleteCartItem(cartItem.getItemId(),cartItem.getAccountId());

    }

    public void addCartItemNum(CartItem cartItem) {
        orderMapper.addItemNum(cartItem);
    }

    public void addOrder(Order order) {
        orderMapper.insertOrder(order);
    }

    public List<Order> selectOrder(Order order) {
        List<Order> orders = orderMapper.selectOrderList(order);
        return orders;
    }

    public void updateOrder(Order order) {
        orderMapper.updateOrder(order);

    }

    public List<OrderItem> selectOrderItem(OrderItem orderItem) {
        List<OrderItem> orderItems = orderMapper.selectOrderItem(orderItem);
        return orderItems;
    }
}
