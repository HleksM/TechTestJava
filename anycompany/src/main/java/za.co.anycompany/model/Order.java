package za.co.anycompany.model;

import java.util.Objects;

public class Order extends GenericEntity {
    private int orderId;
    private double amount;
    // Caps reserved for static final (constants)
    private double VAT;
    private Long customerId;

    public Order() {
    }

    public Order(int orderId, double amount, double VAT, Long customerId) {
        this.orderId = orderId;
        this.amount = amount;
        this.VAT = VAT;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getOrderId() == order.getOrderId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId());
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + getId() +
                ", orderId=" + orderId +
                ", amount=" + amount +
                ", VAT=" + VAT +
                ", customerId=" + customerId +
                '}';
    }
}
