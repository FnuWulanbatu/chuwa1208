package oop.homework4.exception_system;

public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        runScenario(service, "A001", 2);
        runScenario(service, "cancelled", 1);
        runScenario(service, "A002", 99);
        runScenario(service, "", 1);
    }

    private static void runScenario(OrderService service, String orderId, int quantity) {
        try {
            service.processOrder(orderId, quantity);
        } catch (OrderException e) {
            IErrorCode code = e.getErrorCode();
            System.out.println("OrderException caught: code=" + code.getCode() + ", message=" + code.getMessage());
        }
    }
}


