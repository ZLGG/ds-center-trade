package com.zlg.bs.dscentertradeservice.service;

import eo.CartItem;
import eo.Order;
import eo.OrderItem;

import java.util.List;

public interface OrderService {
    //查询购物车
    List<CartItem> selectCartItem(int accountId);

    //购物车添加商品
    void addCartItem(CartItem cartItem);

    //删除购物车商品
    void deleteCartItem(CartItem cartItem);

    //购物车商品添加数目
    void addCartItemNum(CartItem cartItem);

    //添加订单
    void addOrder(Order order);

    //根据条件查询订单
    List<Order> selectOrder(Order order);

    //修改订单
    void updateOrder(Order order);

    //查询订单商品
    List<OrderItem> selectOrderItem(OrderItem orderItem);



}
