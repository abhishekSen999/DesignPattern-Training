package com.iteratrlearning.design_patterns.examples.optional.before;

public class NullExample {

    public static void main(String[] args) {

        // 1. call getCarInsuranceName
        // 2. Defensive checking approaches

        Insurance insurance = new Insurance("AXAUK");
        Car car = new Car(null);
        Person richard = new Person("Richard", car);

        System.out.println(getCarInsuranceName(richard));

    }

    static private String getCarInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }


    static class Person {
        private final String name;
        private final Car car;

        Person(String name, Car car) {
            this.name = name;
            this.car = car;
        }

        public Car getCar() {
            return car;
        }

        public String getName() {
            return name;
        }
    }

    static class Car {
        private final Insurance insurance;

        Car(Insurance insurance) {
            this.insurance = insurance;
        }

        public Insurance getInsurance() {
            return insurance;
        }
    }

    static class Insurance {
        private final String name;

        Insurance(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
