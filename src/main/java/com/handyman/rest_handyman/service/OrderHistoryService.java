package com.handyman.rest_handyman.service;

import com.handyman.rest_handyman.model.OrderHistory;

import java.util.List;

public interface OrderHistoryService {
    public String createOrderHistory(OrderHistory orderHistory);
    public String updateOrderHistory(OrderHistory orderHistory);
    public String deleteOrderHistory(String orderHistoryId);
    public OrderHistory getOrderHistory(String orderHistoryId);
    public List<OrderHistory> getAllOrderHistory();
    public List<OrderHistory> getOrderHistoryByCustomerId(String userId);
}
