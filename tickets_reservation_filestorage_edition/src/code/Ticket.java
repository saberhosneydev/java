package code;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ticket extends Bus {
    //Instance variables
    private int ID = 0;
    private ArrayList<String[]> TicketList = new ArrayList<>();
    private ArrayList<Integer[]> BookedTicketList = new ArrayList<>();
    private String[] TicketDetails = null;
    private Passenger passenger;
    private Bus bus;
    private Scanner sc = new Scanner(System.in);

    public Ticket() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<String[]> getTicketList() {
        return TicketList;
    }

    public void setTicketList(ArrayList<String[]> TicketList) {
        this.TicketList = TicketList;
    }

    public ArrayList<Integer[]> getBookedTicketList() {
        return BookedTicketList;
    }

    public void setBookedTicketList(ArrayList<Integer[]> BookedTicketList) {
        this.BookedTicketList = BookedTicketList;
    }

    public String[] getTicketDetails() {
        return TicketDetails;
    }

    public void setTicketDetails(String[] TicketDetails) {
        this.TicketDetails = TicketDetails;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    //Create Ticket
    public void CreateTicket(String Origin, String Destination, Bus bus, Passenger passenger) {
        System.out.println("-------------------------------------------\nCreate Ticket:\n");
        TicketDetails = new String[6];
        if (bus.SearchBus(Origin, Destination)) {
            for (String[] BUS : bus.getBusesFound()) {
                System.out.println("Bus number\n" + (Integer.parseInt(BUS[0]) + 1) + " ) \nTimetable:");
                for (int i = 7; i < (7 + Integer.parseInt(BUS[6])); i++) {
                    System.out.println("    " + (i - 6) + " ) " + BUS[i]);
                }
                System.out.println("----------------------------------");
            }
            System.out.println("Select Bus");
            Integer selectedBus = sc.nextInt() - 1;
            String[] bus1 = bus.GetBusDetails(String.valueOf(selectedBus));
            System.out.println("Select Time");
            Integer selectedTime = sc.nextInt() + 6;
            System.out.println("Select Date\n");
            System.out.println("Enter Day");
            sc.nextLine();
            String d = sc.nextLine();
            System.out.println("Enter Month");
            String m = sc.nextLine();
            System.out.println("Enter Year");
            String y = sc.nextLine();
            String date = d + "/" + m + "/" + y;
            TicketDetails[0] = String.valueOf(ID++);
            TicketDetails[1] = String.valueOf(passenger.getUserID());
            TicketDetails[2] = String.valueOf(selectedBus);
            TicketDetails[3] = date;
            TicketDetails[4] = bus1[selectedTime];
            System.out.println("Select Seat");
            Integer selectedSeatNumber = null;
            while (true) {
                Integer SeatNumber = sc.nextInt();
                if (bus.checkSeatIfAvailable(selectedBus, TicketDetails[3], TicketDetails[4], SeatNumber)) {
                    System.out.println("You selected seat no. " + SeatNumber + " to confirm write seat no. again");
                    Integer xx = new Scanner(System.in).nextInt();
                    if (Objects.equals(xx, SeatNumber)) {
                        selectedSeatNumber = SeatNumber;
                        break;
                    }
                } else {
                    System.out.println("Seat is taken, pick another to continue or type 0 to exit");
                    if (SeatNumber == 0) {
                        break;
                    }
                }
            }
            System.out.println("---------------------------------------------");
            System.out.println("Summary of ticket details :");
            System.out.println("Origin : " + Origin + " || " + "Destination : " + Destination);
            System.out.println("You will be on BUS no." + selectedBus + " On : " + date);
            System.out.println("Your trip will take around " + (BigDecimal.valueOf(Double.parseDouble((bus1[3])) / 100).setScale(2, RoundingMode.HALF_UP).doubleValue()) + " you will pay : " + bus1[4] + "$");
            System.out.println("Type confirm to confirm the payment");
            System.out.println("---------------------------------------------");
            String confirm = sc.next();
            if (confirm.equals("Confirm") || confirm.equals("confirm")) {
                bus.selectSeat(ID - 1, passenger.getUserID(), selectedBus, TicketDetails[3], TicketDetails[4], selectedSeatNumber);
                TicketDetails[5] = String.valueOf(selectedSeatNumber);
                TicketList.add(TicketDetails);
                System.out.println("Ticket Booked !\n");
            } else {
                System.out.println("Canceled");
            }

        } else System.out.println("No available bus for this origin and destination!");
    }

    public void ViewTicketsBooked(Passenger passenger, Bus bus) {
        ArrayList<Integer[]> TicketsBooked = new ArrayList<>();
        int i = 1;
        for (String[] TicketsBookedPerUser : bus.getQueue()) {
            Integer[] SelectTicket = new Integer[2];
            SelectTicket[0] = i;
            String[] BusDetails = bus.GetBusDetails(TicketsBookedPerUser[2]);
            if (TicketsBookedPerUser[1].equals(String.valueOf(passenger.getUserID()))) {
                SelectTicket[1] = Integer.valueOf(TicketsBookedPerUser[0]);
                System.out.println(((SelectTicket[0])) + ") Ticket ID: " + TicketsBookedPerUser[0] + "\n  Bus Number: " + TicketsBookedPerUser[2] + "\n  Seat Number: "
                        + TicketsBookedPerUser[5] + "\n  Origin: " + BusDetails[1] + "\n  Date: " + TicketsBookedPerUser[3] + "\n  Time: " + TicketsBookedPerUser[4]
                        + "\n  Destination " + BusDetails[2] + "\n  Distance: " + BusDetails[3]
                        + "\n  Money Paid " + BusDetails[4]);
                TicketsBooked.add(SelectTicket);
                i++;
            }
        }
        BookedTicketList = TicketsBooked;
    }

    public void UpdateTicket(Passenger passenger, Bus bus) {
        ViewTicketsBooked(passenger, bus);
        System.out.println("\n-------------------------------\n");
        System.out.println("Select a Ticket from the list:");
        int selectedNumber = new Scanner(System.in).nextInt();
        int x = selectedNumber;
        System.out.println(BookedTicketList.get(--x)[0] + BookedTicketList.get(x)[1]);
        if (selectedNumber == BookedTicketList.get(x)[0]) {
            for (String[] updateSelectedTicket : TicketList) {
                if (updateSelectedTicket[0].equals(String.valueOf(BookedTicketList.get(x)[1]))) {
                    // int z = TicketList.get(BookedTicketList.get(x)[1])[0]);
                    int z = TicketList.indexOf(updateSelectedTicket);
                    System.out.println("Update:\n  1) Origin Or Destination\n  2) Date\n  3) Time\n  4) Seat\n  5) Exit\n");
                    System.out.println("Select Number to Continue");
                    int selectUpdate = new Scanner(System.in).nextInt();
                    if (selectUpdate == 1) {
                        System.out.println("Enter New Origin:");
                        String newOrigin = new Scanner(System.in).nextLine();
                        System.out.println("Enter New Destination:");
                        String newDestination = new Scanner(System.in).nextLine();
                        CreateTicket(newOrigin, newDestination, bus, passenger);
                        cancelTicket(updateSelectedTicket[0]);
                        bus.getQueue().set(z, updateSelectedTicket);
                        break;
                    }
                    if (selectUpdate == 2) {
                        System.out.println("Update Date");
                        System.out.println("Enter Day");
                        int d = sc.nextInt();
                        System.out.println("Enter Month");
                        int m = sc.nextInt();
                        System.out.println("Enter Year");
                        int y = sc.nextInt();
                        String date = d + "/" + m + "/" + y;
                        updateSelectedTicket[3] = date;
                        bus.getQueue().set(z, updateSelectedTicket);
                        System.out.println("Ticket Updated");
                        break;
                    }
                    if (selectUpdate == 3) {
                        System.out.println("Update Time");
                        Integer updateTime = sc.nextInt();
                        updateSelectedTicket[4] = String.valueOf(updateTime);
                        bus.getQueue().set(z, updateSelectedTicket);
                        System.out.println("Ticket Updated");
                        break;
                    }
                    if (selectUpdate == 4) {
                        System.out.println("Update Seat");
                        Integer selectedSeatNumber = null;
                        while (true) {
                            Integer SeatNumber = sc.nextInt();
                            if (bus.checkSeatIfAvailable(Integer.parseInt(updateSelectedTicket[2]), updateSelectedTicket[3],
                                    updateSelectedTicket[4], selectedSeatNumber)) {
                                System.out.println("You selected seat no. " + SeatNumber + " to confirm write seat no. again");
                                Integer xx = new Scanner(System.in).nextInt();
                                if (Objects.equals(xx, SeatNumber)) {
                                    selectedSeatNumber = SeatNumber;
                                    break;
                                }
                            } else {
                                System.out.println("Seat is taken, pick another to continue or type 0 to exit");
                                if (SeatNumber == 0) {
                                    break;
                                }
                            }
                        }
                        updateSelectedTicket[5] = String.valueOf(selectedSeatNumber);
                        bus.getQueue().set(z, updateSelectedTicket);
                        System.out.println("Ticket Updated");
                        break;
                    }
                    if (selectUpdate == 5) {
                        System.out.println("Update Canceled");
                        break;
                    }
                }
            }
        }
    }


    public void cancelTicket(String id) {
        for (String[] strings : TicketList) {
            if (strings[0].equals(id)) {
                TicketList.remove(TicketList.indexOf(strings));
                break;
            }
        }
    }

    public void printTicket(String id, Bus bus) {
        for (String[] ticket : TicketList) {
            String[] BusDetails = bus.GetBusDetails(ticket[2]);
            if (ticket[0].equals(id)) {
                System.out.println(") Ticket ID: " + ticket[0] + "\n  Bus Number: " + ticket[2] + "\n  Seat Number: "
                        + ticket[5] + "\n  Origin: " + BusDetails[1] + "\n  Date: " + ticket[3] + "\n  Time: " + ticket[4]
                        + "\n  Destination " + BusDetails[2] + "\n  Distance: " + BusDetails[3]
                        + "\n  Money Paid " + BusDetails[4]);
            }
        }
    }
}
