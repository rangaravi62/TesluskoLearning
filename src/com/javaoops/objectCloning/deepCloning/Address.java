package com.javaoops.objectCloning.deepCloning;

// Address class (which is cloneable)
class Address implements Cloneable {
    String city;

    // Constructor
    Address(String city) {
        this.city = city;
    }

    // Overriding default clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city);  // Creating a new object
    }
}


// Person class which is cloneable
class Person implements Cloneable {
    String name; // Primitive field
    Address address; // Reference-type field

    // Constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Overriding
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone(); // Shallow copy

        // Cloning nested object for Deep Cloning
        clonedPerson.address = (Address) address.clone();
        return clonedPerson;
    }
}

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Mumbai");
        Person person = new Person("Rahul", address);

        Person clonedPerson = (Person) person.clone(); // Deep Cloning

        // Modifying the address in the cloned object
        clonedPerson.address.city = "New Delhi";

        // Output to check if changes are reflected in the original
        System.out.println(person.name + " lives in " + person.address.city);  // Mumbai
        System.out.println(clonedPerson.name + " lives in " + clonedPerson.address.city);  // New Delhi
    }
}

