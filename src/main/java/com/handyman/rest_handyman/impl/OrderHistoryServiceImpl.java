package com.handyman.rest_handyman.impl;

import com.handyman.rest_handyman.model.OrderHistory;
import com.handyman.rest_handyman.repository.OrderHistoryRepository;
import com.handyman.rest_handyman.service.OrderHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {
    OrderHistoryRepository orderHistoryRepository;

    public OrderHistoryServiceImpl(OrderHistoryRepository orderHistoryRepository) {
        this.orderHistoryRepository = orderHistoryRepository;
    }

    @Override
    public String createOrderHistory(OrderHistory orderHistory) {
        orderHistoryRepository.save(orderHistory);
        return "Success to create Order History";
    }

    @Override
    public String updateOrderHistory(OrderHistory orderHistory) {
        orderHistoryRepository.save(orderHistory);
        return "Success to update Order History";
    }

    @Override
    public String deleteOrderHistory(String orderHistoryId) {
        orderHistoryRepository.deleteById(orderHistoryId);
        return "Success to delete order History";
    }

    @Override
    public OrderHistory getOrderHistory(String orderHistoryId) {
        return orderHistoryRepository.findById(orderHistoryId).get();
    }

    @Override
    public List<OrderHistory> getAllOrderHistory() {
        return orderHistoryRepository.findAll();
    }

    @Override
    public List<OrderHistory> getOrderHistoryByCustomerId(String userId) {
        return orderHistoryRepository.getOrderHistoriesByCustomerId(userId);
    }
}
