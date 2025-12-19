package oop.homework4.enum_state_machine;

public class Package {
    private final String trackingId;
    private DeliveryStatus status;

    public Package(String trackingId) {
        this.trackingId = trackingId;
        this.status = DeliveryStatus.PENDING;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public void updateStatus(DeliveryStatus newStatus) {
        if (!status.canTransitionTo(newStatus)) {
            throw new IllegalStateException("Invalid transition: " + status + " -> " + newStatus);
        }
        this.status = newStatus;
    }
}


