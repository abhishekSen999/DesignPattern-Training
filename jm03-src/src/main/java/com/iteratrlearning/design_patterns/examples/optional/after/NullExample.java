package com.iteratrlearning.design_patterns.examples.optional.after;

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
        final Car car = person.getCar();
        if (car != null)
        {
            final Insurance insurance = car.getInsurance();
            if (insurance != null)
            {
                return insurance.getName();
            }
        }
        return "Unknown";
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
