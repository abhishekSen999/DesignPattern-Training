package com.iteratrlearning.design_patterns.answers.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AirlineTicketTest
{

    @Test
    public void shouldSupportUncomfortablePriorityTickets()
    {
        final AirlineTicket airlineTicket =
                new WithPriorityBoarding(new BasicTicket());

        assertEquals(150, airlineTicket.getCost(), 0.0);
        assertTrue(airlineTicket.hasPriorityBoarding());
        assertFalse(airlineTicket.hasComfySeat());
    }

    @Test
    public void shouldSupportComfortableLowPriorityTickets()
    {
        final AirlineTicket airlineTicket =
                new WithComfySeating(new BasicTicket());

        assertEquals(150, airlineTicket.getCost(), 0.0);
        assertFalse(airlineTicket.hasPriorityBoarding());
        assertTrue(airlineTicket.hasComfySeat());
    }

    @Test
    public void shouldSupportEconomyClassTickets()
    {
        final AirlineTicket airlineTicket =
                new BasicTicket();

        assertEquals(50, airlineTicket.getCost(), 0.0);
        assertFalse(airlineTicket.hasPriorityBoarding());
        assertFalse(airlineTicket.hasComfySeat());
    }

    @Test
    public void shouldSupportBusinessClassTickets()
    {
        final AirlineTicket airlineTicket =
                new WithComfySeating(new WithPriorityBoarding(new BasicTicket()));

        assertEquals(250, airlineTicket.getCost(), 0.0);
        assertTrue(airlineTicket.hasPriorityBoarding());
        assertTrue(airlineTicket.hasComfySeat());
    }
}
