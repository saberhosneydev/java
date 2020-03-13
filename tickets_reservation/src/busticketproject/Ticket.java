package busticketproject;

import java.util.ArrayList;

public class Ticket {
    //Instance variables
    //composition
    private Passenger passenger;
    private int ID = 0;
    private ArrayList<String[]> TicketList = new ArrayList<>();
    private String[] TicketDetails = new String[6];

    Ticket() {

    }

    //Create Ticket
    public void CreateTicket(int PassengerID, int BusID, String Origin, String Destination, String Time) {
        TicketDetails[0] = String.valueOf(ID++);
        TicketDetails[1] = String.valueOf(PassengerID);
        TicketDetails[2] = String.valueOf(BusID);
        TicketDetails[3] = Origin;
        TicketDetails[4] = Destination;
        TicketDetails[5] = Time;
        TicketList.add(TicketDetails);
        System.out.println("Ticket Booked !");
    }

    //Get Ticket Details
    public String[] GetTicketDetails(String ID) {
        String[] x = new String[6];
        for (String[] Details : TicketList) {
            if (Details[0].equals(ID)) {
                x = Details;
            }
        }
        return x;
    }

    //Edit Ticket
    /*public void UpdateTicketDetails(String ID, String Origin, String Destination, double Distance) {
        TicketDetails[2] = ID;
        TicketDetails[3] = Origin;
        TicketDetails[4] = Destination;
        TicketDetails[5] = Time;
    }*/

    //Cancel Ticket
    public void CancelTicket() {

    }
}
