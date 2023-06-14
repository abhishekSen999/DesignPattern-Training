package com.iteratrlearning.design_patterns.examples.immutability;

import java.util.*;

public class MutabilityProblem
{
    public static final String CLIENT_MEETING = "Client Meeting";
    public static final String CHEESECAKE_FACTORY = "Cheesecake Factory";
    public static final String RAOUL = "Raoul";
    public static final String RICHARD = "Richard";

    public static void main(String[] args)
    {
        // 1.
        Date meetingDate = new Date(117, 4, 25);
        TeamCalendar calendar = new TeamCalendar();

        System.out.println("Setting up meetings");
        calendar.addMeetingFor(RAOUL, meetingDate, CLIENT_MEETING);
        calendar.addMeetingFor(RICHARD, meetingDate, CHEESECAKE_FACTORY);

        System.out.println(calendar.retrieveMeetingsFor(RAOUL));
        System.out.println(calendar.retrieveMeetingsFor(RICHARD));

        //2.
//        System.out.println("Rescheduling Raoul's meeting");
        // Raoul needs to reschedule his meeting
        calendar.rescheduleMeetingByOneMonth(RAOUL, CLIENT_MEETING);

//        System.out.println(calendar.retrieveMeetingsFor(RAOUL));
//        System.out.println(calendar.retrieveMeetingsFor(RICHARD));
    }

    static class TeamCalendar
    {
        private final Map<String, List<Meeting>> calendar = new HashMap<>();

        public List<Meeting> retrieveMeetingsFor(String person)
        {
            return calendar.get(person);
        }

        public void addMeetingFor(String person, Date date, String meetingName)
        {
            final List<Meeting> meetings = calendar.computeIfAbsent(person, k -> new ArrayList<>());
            meetings.add(new Meeting(date, meetingName));
        }

        public void rescheduleMeetingByOneMonth(String person, String meetingName)
        {
            calendar.get(person)
                .stream()
                .filter(meeting -> meeting.getName().equals(meetingName))
                .forEach(meeting ->
                {
                    int month = meeting.getDate().getMonth();
                    meeting.getDate().setMonth(month + 1);
                });
        }
    }

    static class Meeting
    {
        private final Date date;
        private final String name;

        Meeting(Date date, String name)
        {
            this.date = date;
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "Meeting{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
        }

        public String getName()
        {
            return name;
        }

        public Date getDate()
        {
            return date;
        }
    }

}
