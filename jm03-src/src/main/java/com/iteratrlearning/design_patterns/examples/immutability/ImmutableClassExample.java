package com.iteratrlearning.design_patterns.examples.immutability;

import java.time.LocalDate;
import java.util.Date;

public class ImmutableClassExample
{
    public static void main(String[] args)
    {
        // TODO: instantiate MeetingMutable, modify fields
        // TODO: instantiate MeetingImmutable, attempt modification
        // TODO: introduce withName/withDate pattern
        // TODO: shallow immutability - the Date is still mutable.
    }
}

class MeetingMutable
{
    private String name;
    private Date date;

    MeetingMutable(String name, Date date)
    {
        this.name = name;
        this.date = date;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(final Date date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "MeetingMutable{" +
            "name='" + name + '\'' +
            ", date=" + date +
            '}';
    }
}

final class MeetingImmutable
{
    private final String name;
    private final LocalDate date;

    MeetingImmutable(String name, LocalDate date)
    {
        this.name = name;
        this.date = date;
    }

    public MeetingImmutable withName(String newName)
    {
        return new MeetingImmutable(newName, this.date);
    }

    public MeetingImmutable withDate(LocalDate newDate)
    {
        return new MeetingImmutable(name, newDate);
    }

    @Override
    public String toString()
    {
        return "MeetingImmutable{" +
            "name='" + name + '\'' +
            ", date=" + date +
            '}';
    }
}