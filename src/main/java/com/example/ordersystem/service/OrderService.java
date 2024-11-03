package com.example.ordersystem.service;

import com.example.ordersystem.model.Order;
import com.example.ordersystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    // Метод для получения заказа по ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Метод для получения всех заказов
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Метод для добавления нового заказа
    public Order addOrder(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        return orderRepository.save(order);
    }

    // Метод для удаления заказа по ID
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    // Метод для обновления существующего заказа
    public Order updateOrder(Long id, Order updatedOrder) {
        return orderRepository.findById(id).map(order -> {
            order.setTotalCost(updatedOrder.getTotalCost());
            order.setProducts(updatedOrder.getProducts());
            return orderRepository.save(order);
        }).orElse(null);
    }
}
