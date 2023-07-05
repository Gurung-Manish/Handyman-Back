package com.handyman.rest_handyman.controller;

import com.handyman.rest_handyman.model.OrderHistory;
import com.handyman.rest_handyman.service.OrderHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderHistory")
public class OrderHistoryController {
    OrderHistoryService orderHistoryService;

    public OrderHistoryController(OrderHistoryService orderHistoryService) {
        this.orderHistoryService = orderHistoryService;
    }

    @GetMapping("{orderHistoryId}")
    public OrderHistory getOrderHistoryDetails(@PathVariable("orderHistoryId") String orderHistoryId){
        return orderHistoryService.getOrderHistory(orderHistoryId);
    }

    @GetMapping
    public List<OrderHistory> getAllOrderHistory(){
        return orderHistoryService.getAllOrderHistory();
    }

    @GetMapping("customer/{userId}")
    public List<OrderHistory> getOrderDetailsByCustomerId
            (@PathVariable("userId") String userId){
        return orderHistoryService.getOrderHistoryByCustomerId(userId);
    }

    @PostMapping
    public String createOrderHistory(@RequestBody OrderHistory orderHistory){
        orderHistoryService.createOrderHistory(orderHistory);
        return "Order History Created Successfully";
    }

    @PutMapping
    public String updateOrderHistory(@RequestBody OrderHistory orderHistory){
        orderHistoryService.updateOrderHistory(orderHistory);
        return "Order History Update Successfully";
    }

    @DeleteMapping("{orderHistoryId")
    public String deleteOrderHistory(@PathVariable("orderHistoryId") String orderHistoryId){
        orderHistoryService.deleteOrderHistory(orderHistoryId);
        return "Order History Deleted Successfully";
    }
}


