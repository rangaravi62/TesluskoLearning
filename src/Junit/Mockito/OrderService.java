package Junit.Mockito;

public class OrderService {
    private PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean processOrder(int amount) {
        return paymentGateway.charge(amount);
    }

    public void cancelOrder(int orderId, int amount) {
        paymentGateway.refund(amount);
    }
}