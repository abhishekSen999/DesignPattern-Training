package com.iteratrlearning.design_patterns.answers.immutability;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ImmutableMeetingTest {


    public static final String CHAMPAGNE_TASTING = "Champagne Tasting";
    public static final String WINE_TASTING = "Wine Tasting";

    @Test
    public void testShouldReturnNewMeetingWithNewName() {

        LocalDate now = LocalDate.now();
        ImmutableMeeting meeting = new ImmutableMeeting(WINE_TASTING, now);

        ImmutableMeeting updatedMeeting = meeting.withName(CHAMPAGNE_TASTING);

        Assert.assertEquals(CHAMPAGNE_TASTING, updatedMeeting.getName());
    }

    @Test
    public void testShouldNotChangeMeetingNameWhenUpdating() {

        LocalDate now = LocalDate.now();
        ImmutableMeeting meeting = new ImmutableMeeting(WINE_TASTING, now);

        ImmutableMeeting updatedMeeting = meeting.withName(CHAMPAGNE_TASTING);

        Assert.assertEquals(WINE_TASTING, meeting.getName());
    }

    @Test
    public void testShouldReturnNewMeetingWithNewDate() {

        LocalDate now = LocalDate.now();
        ImmutableMeeting meeting = new ImmutableMeeting(WINE_TASTING, now);

        LocalDate tomorrow = now.plusDays(1);
        ImmutableMeeting updatedMeeting = meeting.withDate(tomorrow);

        Assert.assertEquals(tomorrow, updatedMeeting.getDate());
    }

    @Test
    public void testShouldNotChangeMeetingDateWhenUpdating() {

        LocalDate now = LocalDate.now();
        ImmutableMeeting meeting = new ImmutableMeeting(WINE_TASTING, now);

        LocalDate tomorrow = now.plusDays(1);
        ImmutableMeeting updatedMeeting = meeting.withDate(tomorrow);

        Assert.assertEquals(now, meeting.getDate());
    }
}

