package com.javaoops.objectCloning.shallowCloning;


// Address class
class Address {
    String city;

    // Constructor
    Address(String city) {
        this.city = city;
    }
}

// Person class (which is clonable)
class Person implements Cloneable {
    String name; // Primitive field
    Address address; // Reference-type field

    // Constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // clone() method is inherited from Object class and must be Overriden
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }
}

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Mumbai");
        Person person = new Person("Rahul", address);

        Person clonedPerson = (Person) person.clone(); // Cloning person

        // Modifying the address in the cloned object
        clonedPerson.address.city = "New Delhi";

        // Output to check if changes are reflected in the original
        System.out.println(person.name + " lives in " + person.address.city);
        System.out.println(clonedPerson.name + " lives in " + clonedPerson.address.city);
    }
}
