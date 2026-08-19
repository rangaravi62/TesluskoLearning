package Junit.Mockito;

public interface PaymentGateway {
    boolean charge(int amount);
    void refund(int amount);
}