package busticketproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Ticket {
    //Instance variables
    //composition
    private int ID = 0;
    private ArrayList<String[]> TicketList = new ArrayList<>();
    private String[] TicketDetails = null;

    Ticket() {

    }

    //Create Ticket
    public void CreateTicket(String Origin, String Destination, Bus Bus, Passenger Passenger) {
         TicketDetails = new String[6];
        if (Bus.SearchBus(Origin, Destination)) {
            for (String[] bus : Bus.getBusesFound()) {
                System.out.println("Bus number ( " + (Integer.parseInt(bus[0])+1) + " ) Timetable:\n");
                for (int i = 7; i < (7 + Integer.parseInt(bus[6])); i++) {
                    System.out.println((Arrays.asList(bus).indexOf(bus[i]) - 6) + " ) " + bus[i]);
                }
                System.out.println("---------------------------------------------");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Select Bus");
            Integer selectedBus = sc.nextInt() - 1;
            String[] bus1 = Bus.GetBusDetails(String.valueOf(selectedBus));
            System.out.println("Select Time");
            Integer selectedTime = sc.nextInt() + 6;
            System.out.println("Select Date");
            System.out.println("Enter Day");
            int d = sc.nextInt();
            System.out.println("Enter Month");
            int m = sc.nextInt();
            System.out.println("Enter Year");
            int y = sc.nextInt();
            Date date = new Date(d, m, y);
            TicketDetails[0] = String.valueOf(ID++);
            TicketDetails[1] = String.valueOf(Passenger.getUserID());
            TicketDetails[2] = String.valueOf(selectedBus);
            TicketDetails[3] = date.toString();
            TicketDetails[4] = bus1[selectedTime];
            System.out.println("Select Seat\n");
            while (true) {
                Integer SeatNumber = sc.nextInt();
                if(Bus.selectSeat(ID,Integer.parseInt(Passenger.getUserID()),selectedBus,TicketDetails[3], TicketDetails[4], SeatNumber)){
                    break;
                }else {
                    System.out.println("Fucker, pick another seat, you fuckin DickHead, What a douchbag!!!,sry he is just mad of makin u this peace of sht app");
                }
            }
            TicketList.add(TicketDetails);
            System.out.println("Ticket Booked !\n");
        } else System.out.println("No available bus for this origin and destination!");
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
//
//        //Edit Ticket
//    /*public void UpdateTicketDetails(String ID, String Origin, String Destination, double Distance) {
//        TicketDetails[2] = ID;
//        TicketDetails[3] = Origin;
//        TicketDetails[4] = Destination;
//        TicketDetails[5] = Time;
//    }*/
//
//        //Cancel Ticket
//        public void CancelTicket () {
//
//        }
}
