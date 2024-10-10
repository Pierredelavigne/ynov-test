package service;

import dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(Long id);
    OrderDTO saveOrder(OrderDTO orderDTO);
    OrderDTO updateOrder(Long id,OrderDTO orderDTO);
    OrderDTO deleteOrder(Long id);
}
