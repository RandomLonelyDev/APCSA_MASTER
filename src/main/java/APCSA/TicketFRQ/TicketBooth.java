package APCSA.TicketFRQ;

import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TicketBooth {
    private static LinkedHashMap<@NotNull Long, @NotNull Ticket> activeTickets = new LinkedHashMap<>();
    private static LinkedHashMap<@NotNull Long, @NotNull Ticket> closedTickets = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner scanline = new Scanner(System.in);
        boolean exit = false;
        System.out.print("Welcome to TicketMaster™ v1.0\n" +
                "1) Print Walkup Ticket\n" +
                "2) Print Advance Ticket\n" +
                "3) Print Advance Ticket [Student]\n" +
                "4) Take Ticket\n" +
                "5) Exit\n\n" +
                "> ");
        while(!exit) {
            int cmd = scanline.nextInt();
            try {
                switch(cmd) {
                    case 1:
                        Ticket walkup = new Walkup();
                        addToLedger(walkup);
                        System.out.println("\nTicket printed: number " + walkup.getSerialNum());
                        break;
                    case 2:
                        System.out.print("\nEnter Show Date: ");
                        scanline.nextLine();
                        String date = scanline.nextLine();
                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                        Ticket advance = new Advance(new Date(), format.parse(date));
                        addToLedger(advance);
                        System.out.println("\nTicket printed: number " + advance.getSerialNum());
                        break;
                    case 3:
                        System.out.print("\nEnter Show Date: ");
                        scanline.nextLine();
                        String date2 = scanline.nextLine();
                        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy");
                        System.out.print("Do they have a valid student id? (y/n): ");
                        String yn = scanline.nextLine();
                        Ticket studentAdvance;
                        switch (yn.trim().toLowerCase()) {
                            case "y" -> {
                                studentAdvance = new StudentAdvance(new Date(), format2.parse(date2), true);
                                addToLedger(studentAdvance);
                                System.out.println("\nTicket printed: number " + studentAdvance.getSerialNum());
                            }
                            case "n" -> throw new TicketException("Invalid Ticket");
                            default -> System.out.print("Invalid input.  Please try again.\n\n");
                        }
                        break;
                    case 4:
                        System.out.print("Enter ticket number: ");
                        long sernum = scanline.nextLong();
                        consume(sernum);
                        System.out.print("\nTicket is good!");
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        throw new InputMismatchException();
                }
                System.out.print("\n> ");
            } catch(InputMismatchException e) {
                System.out.print("\nIncorrect Command.\n> ");
            } catch (TicketException e) {
                if(e.getMessage().equals("Invalid Ticket")) System.out.print("\nError. Could Not Create Ticket.  Please Contact Administrator.\n\n> ");
                else if(e.getMessage().equals("No Ticket Found")) System.out.print("\nError. Invalid Ticket.  Please Try Again.\n\n> ");
            } catch (ParseException e) {
                System.out.print("\nError.  Incorrect date.\n\n>");
            }
        }
    }

    private static void addToLedger(Ticket ticket) throws TicketException {
        if(closedTickets.containsValue(ticket) || activeTickets.containsValue(ticket)) throw new TicketException("Invalid Ticket"); else activeTickets.put(ticket.getSerialNum(), ticket);
    }

    private static void consume(long serNum) throws TicketException {
        if(activeTickets.containsKey(serNum) && !closedTickets.containsKey(serNum)) {
            closedTickets.put(serNum, activeTickets.get(serNum));
            activeTickets.remove(serNum);
        } else throw new TicketException("No Ticket Found");
    }
}
