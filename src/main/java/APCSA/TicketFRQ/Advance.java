package APCSA.TicketFRQ;

import org.jetbrains.annotations.Contract;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Advance extends Ticket {
    public Advance(Date purchase, Date show) throws TicketException {
        super(40);
        if(!purchase.before(show)) throw new TicketException("Invalid Ticket"); else if (TimeUnit.DAYS.convert(Math.abs(show.getTime()-purchase.getTime()),TimeUnit.MILLISECONDS) >= 10) setPrice(30);
    }

    protected Advance(Date purchase, Date show, float closePrice, float farPrice) throws TicketException {
        super(closePrice);
        if(!purchase.before(show)) throw new TicketException("Invalid Ticket"); else if (TimeUnit.DAYS.convert(Math.abs(show.getTime()-purchase.getTime()),TimeUnit.MILLISECONDS) >= 10) setPrice(farPrice);
    }
}
