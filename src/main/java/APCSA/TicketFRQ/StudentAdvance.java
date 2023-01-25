package APCSA.TicketFRQ;

import java.util.Date;

public class StudentAdvance extends Advance {
    public StudentAdvance(Date purchase, Date show, boolean hasID) throws TicketException {
        super(purchase, show, 20, 15);
        if(!hasID) throw new TicketException("Invalid Ticket");
    }
}
