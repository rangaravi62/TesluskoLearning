package DesignPatterns.StructuralDesignPatterns.AdapterPattern;

public interface PaymentGateway {
    boolean pay(int orderId, double amount);
}
