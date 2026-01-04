package oop.homework4.exception_system;

public class OrderService {
    public void processOrder(String orderId, int quantity) {
        if (orderId == null || orderId.isBlank()) {
            throw new OrderException(OrderErrorCode.ORDER_NOT_FOUND);
        }
        if ("cancelled".equalsIgnoreCase(orderId)) {
            throw new OrderException(OrderErrorCode.ORDER_CANCELLED);
        }
        if (quantity > 10) {
            throw new OrderException(OrderErrorCode.INSUFFICIENT_STOCK);
        }

        System.out.println("Order processed: orderId=" + orderId + ", quantity=" + quantity);
    }
}



