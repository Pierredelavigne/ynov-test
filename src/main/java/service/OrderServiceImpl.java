package service;

import dto.OrderDTO;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDTO> getAllOrders() {
        return List.of();
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        return null;
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
