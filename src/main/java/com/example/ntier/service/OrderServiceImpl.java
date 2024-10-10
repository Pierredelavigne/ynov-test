package com.example.ntier.service;

import com.example.ntier.dto.OrderDTO;
import com.example.ntier.repository.OrderRepository;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<OrderDTO> getAllOrders() {
        return List.of();
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        Or

        return ;
    }

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO deleteOrder(Long id) {
        return null;
    }
}
