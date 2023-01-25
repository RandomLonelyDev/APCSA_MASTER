package APCSA.TicketFRQ;

import java.util.Date;

public class TicketTester {
    public static void main(String[] args) throws TicketException {
        Date today = new Date();
        Date eightDaysFromNow = new Date(today.getTime() + 691200000);
        Date twelveDaysFromNow = new Date(today.getTime() + 1036800000);


        //advance tickets take two date obects to make sure tickets are purchased before the show.  lines 9-11 instantiate today's date, one eight days ahead, and one twelve days ahead.
        Advance ticket1a = new Advance(today, eightDaysFromNow);
        System.out.println(ticket1a);

        Advance ticket1b = new Advance(today, twelveDaysFromNow);
        System.out.println(ticket1b);


        //boolean at end represents id status.  setting it to false will throw a TicketException.
        StudentAdvance ticket2a = new StudentAdvance(today, eightDaysFromNow, true);
        System.out.println(ticket2a);

        StudentAdvance ticket2b = new StudentAdvance(today, twelveDaysFromNow, true);
        System.out.println(ticket2b);


        //constructor needs no arguments
        Walkup ticket3a = new Walkup();
        System.out.println(ticket3a);

        Walkup ticket3b = new Walkup();
        System.out.println(ticket3b);
    }
}
