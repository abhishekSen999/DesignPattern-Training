package com.iteratrlearning.design_patterns.examples.strategy;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class FirewallExample {

    public static void main(String[] args) {

        Email importantEmail
                = new Email(
                "Hello",
                "pm@gov.uk",
                "macro@france.fr",
                LocalDateTime.now().withHour(22));

        Email lateEmail
                = new Email(
                        "Hello",
                "richard@warburton.com",
                "raoul@urma.com",
                LocalDateTime.now());

        //1.
        Firewall firewall = new Firewall(new GovernmentFilteringStrategy());

        //2.
//        firewall.setFilteringStrategy(new NoLateEmailsFilteringStrategy());

        firewall.process(importantEmail);
        firewall.process(lateEmail);
    }

    private static class GovernmentFilteringStrategy implements FilteringStrategy {
        @Override
        public boolean accept(Email email) {
            return email.getSender().endsWith("gov.uk");
        }
    }

    private static class NoLateEmailsFilteringStrategy implements FilteringStrategy {
        public static final LocalTime LATE_TIME = LocalTime.of(21, 0);

        @Override
        public boolean accept(Email email) {
            LocalTime localTime = email.getLocalDateTime().toLocalTime();
            return localTime.isBefore(LATE_TIME);
        }
    }

}
