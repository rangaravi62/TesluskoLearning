package com.java8.predefinedfuncint;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierFI {
    public static void main(String[] args) {
        Supplier<LocalDate> supplier = () -> LocalDate.now();
        System.out.println(supplier.get());
    }
}
