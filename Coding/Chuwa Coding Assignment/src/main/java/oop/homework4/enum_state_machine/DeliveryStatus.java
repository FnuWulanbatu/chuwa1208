package oop.homework4.enum_state_machine;

public enum DeliveryStatus {
    PENDING(0, "Pending"),
    PICKED_UP(1, "Picked up"),
    IN_TRANSIT(2, "In transit"),
    DELIVERED(3, "Delivered"),
    CANCELLED(4, "Cancelled");

    private final int code;
    private final String description;

    private DeliveryStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static DeliveryStatus fromCode(int code) {
        for (DeliveryStatus status : values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown DeliveryStatus code: " + code);
    }

    public boolean canTransitionTo(DeliveryStatus newStatus) {
        if (newStatus == null) {
            return false;
        }

        switch (this) {
            case PENDING:
                return newStatus == PICKED_UP || newStatus == CANCELLED;
            case PICKED_UP:
                return newStatus == IN_TRANSIT || newStatus == CANCELLED;
            case IN_TRANSIT:
                return newStatus == DELIVERED || newStatus == CANCELLED;
            case DELIVERED:
            case CANCELLED:
            default:
                return false;
        }
    }
}


