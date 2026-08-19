package Junit.Mockito;

//Write tests for:
//
//processOrder(100) charges the gateway with 100 and returns true
//processOrder(100) returns false when the charge fails
//cancelOrder(1, 100) calls refund(100) exactly once
//processOrder throws NetworkException if the gateway is down
//processOrder never charges if the amount is 0 or negative
//
//Try writing OrderServiceTest with mocks. Focus on:
//
//Using @Mock for the gateway
//Stubbing with when().thenReturn()
//Verifying calls with verify()

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.ConnectException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.AdditionalMatchers.*;
import static org.mockito.Mockito.*;


public class OrderServiceTest {

    @Mock
    PaymentGateway paymentGateway;

    OrderService orderService;

    @BeforeEach
    void intiServices(){
        MockitoAnnotations.openMocks(this);
        orderService = new OrderService(paymentGateway);
    }

    @Test
    @DisplayName("process order with 100")
    void processOrderTrueTest(){
        when(paymentGateway.charge(100)).thenReturn(true);
        assertEquals(true, orderService.processOrder(100));
    }


    @Test
    @DisplayName("Process order fails when payment fails")
    void processOrderFailsWhenChargeFails() {
        when(paymentGateway.charge(100)).thenReturn(false);

        assertFalse(orderService.processOrder(100));
        verify(paymentGateway).charge(100);
    }

    @Test
    @DisplayName("Cancel order refunds the payment gateway")
    void cancelOrderRefundsPayment() {
        orderService.cancelOrder(1, 100);

        verify(paymentGateway).refund(100);
    }

    @Test
    @DisplayName("Process order when payment gateway is down")
    void processOrderWithPaymentGatewayDown(){
        when(paymentGateway.charge(100)).thenThrow(new ConnectException("Payment Gateway id down"));
        assertThrows(ConnectException.class,() -> orderService.processOrder(100));
    }


    // Using Argument matchers
//    anyInt(), anyString(), any() - any value
//    eq(value) — exact equality
//    gt(x), lt(x), gte(x) — greater/less than
//    argThat(predicate) — custom logic
//    times(n), never(), atLeast(n), atMost(n) — call counts

    @Test
    @DisplayName("Process order with ArgumentMatchers")
    void processOrderWithArgumentMatchers(){
        when(paymentGateway.charge(anyInt())).thenReturn(true);
        when(paymentGateway.charge(gt(500))).thenReturn(false);
        assertThrows(ConnectException.class,() -> orderService.processOrder(100));
    }

}
