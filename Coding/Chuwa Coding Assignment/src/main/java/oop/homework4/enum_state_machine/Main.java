package oop.homework4.enum_state_machine;

public class Main {
    public static void main(String[] args) {
        Package pkg = new Package("T100");
        System.out.println("Initial status: " + pkg.getStatus());

        pkg.updateStatus(DeliveryStatus.PICKED_UP);
        pkg.updateStatus(DeliveryStatus.IN_TRANSIT);
        pkg.updateStatus(DeliveryStatus.DELIVERED);
        System.out.println("Final status: " + pkg.getStatus());

        try {
            pkg.updateStatus(DeliveryStatus.CANCELLED);
        } catch (RuntimeException e) {
            System.out.println("Invalid transition caught: " + e.getMessage());
        }

        DeliveryStatus fromCode = DeliveryStatus.fromCode(2);
        System.out.println("fromCode(2): " + fromCode + " - " + fromCode.getDescription());
    }
}


