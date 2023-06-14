package com.iteratrlearning.design_patterns.problems.decorator;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

// Currently our Airline only supports business and economy tickets.
// Business class tickets have comfy seats and priority boarding, economy has neither.
// But in the modern market we want to be more flexible with pricing here, and unbundle the ticket options.

// TODO: Refactor the AirlineTicket hierarchy in order to allow the airline to unbundle
// Their tickets and sell different combinations.
// The basic ticket costs £50, and each of comfy seating and priority boarding cost £100
// TODO: remove ignore when you want to run the test

// Hint: You want to delete the BusinessClassTicket class and add two new classes
// WithComfySeat and WithPriorityBoarding
@Ignore
public class AirlineTicketTest
{

    @Test
    public void shouldSupportUncomfortablePriorityTickets()
    {
        // TODO
        final AirlineTicket airlineTicket = null;

        assertEquals(150, airlineTicket.getCost(), 0.0);
        assertTrue(airlineTicket.hasPriorityBoarding());
        assertFalse(airlineTicket.hasComfySeat());
    }

    @Test
    public void shouldSupportComfortableLowPriorityTickets()
    {
        // TODO
        final AirlineTicket airlineTicket = null;

        assertEquals(150, airlineTicket.getCost(), 0.0);
        assertFalse(airlineTicket.hasPriorityBoarding());
        assertTrue(airlineTicket.hasComfySeat());
    }

    @Test
    public void shouldSupportEconomyClassTickets()
    {
        // TODO
        final AirlineTicket airlineTicket = null;

        assertEquals(50, airlineTicket.getCost(), 0.0);
        assertFalse(airlineTicket.hasPriorityBoarding());
        assertFalse(airlineTicket.hasComfySeat());
    }

    @Test
    public void shouldSupportBusinessClassTickets()
    {
        // TODO
        final AirlineTicket airlineTicket = null;

        assertEquals(250, airlineTicket.getCost(), 0.0);
        assertTrue(airlineTicket.hasPriorityBoarding());
        assertTrue(airlineTicket.hasComfySeat());
    }
}
