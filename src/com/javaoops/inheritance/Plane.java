package com.javaoops.inheritance;

public class Plane {
    public void fly(){
        System.out.println("palne can fly");
    }
    public void stop(){
        System.out.println("plane can stop");
    }
}

class CargoPlane extends Plane{
    //here
    // fly() -> overridden method
    // stop() -> inherited method
    // takeOff() -> specialized method
    public void fly(){
        System.out.println("cargo plane can fly");
    }
    public void takeOff(){
        System.out.println("cargo plane can take off");
    }

}

class Test1{
    public static void main(String[] args) {
        // we can use a parent class reference for a child class object
        Plane p = new CargoPlane();
        p.fly();
        p.stop();
        ((CargoPlane) p).takeOff(); // for specialized methods if we use parent class reference then it will show error , we need to access it by down-casting it
                                    // which will act as child class temporarily
    }
}
