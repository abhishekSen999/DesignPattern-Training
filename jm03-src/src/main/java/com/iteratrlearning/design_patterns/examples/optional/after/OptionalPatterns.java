package com.iteratrlearning.design_patterns.examples.optional.after;

import java.util.Optional;

public class OptionalPatterns {

    public static void main(String[] args) {
        Insurance insurance = new Insurance("AXAUK");
        Car car = new Car(null);
        Person richard = new Person("Richard", car);

        //0. Show Stream findAny()

        //1. Creating Optionals: Optional.of(), Optional.ofNullable
        final Optional<Person> optRichard = Optional.of(richard);
        System.out.println("optRichard = " + optRichard);
        System.out.println(Optional.ofNullable(null));

        //2. ifPresent
        optRichard.ifPresent(person -> System.out.println(person.getName()));

        //3. isPresent X

        //4. orElse / orElseThrow
        //5. map
        //6. getCarInsuranceName
        //7. flatMap
        //8. filter
    }

    static class Person {
        private final String name;
        private final Optional<Car> car;

        Person(String name, Car car) {
            this.name = name;
            this.car = Optional.ofNullable(car);
        }

        public String getName()
        {
            return name;
        }

        public Optional<Car> getCar() {
            return car;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
        }
    }

    static class Car {
        private final Optional<Insurance> insurance;

        Car(Insurance insurance) {
            this.insurance = Optional.ofNullable(insurance);
        }

        public Optional<Insurance> getInsurance() {
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
