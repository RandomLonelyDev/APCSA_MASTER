package APCSA.TicketFRQ;

import org.jetbrains.annotations.NotNull;

public abstract class Ticket {
    private static long currentSerialNumber = 0;
    private long serialNumber;
    protected float price = 0;
    protected Ticket(float price) {
        this.price = price;
        serialNumber = getNextSerialNumber();
    }

    private Ticket(){}

    public float getPrice() {
        return price;
    }
    protected void setPrice(float price){this.price = price;}

    private static long getNextSerialNumber() {
        return currentSerialNumber++;
    }

    @Override
    public String toString() {
        return String.format("SN: %s, Price %.2f$",serialNumber,price);
    }

    public long getSerialNum() {
        return serialNumber;
    }

}
