package busticketproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    private ArrayList<String[]> BusList = new ArrayList<>();
    private ArrayList<String[]> BusesFound = null;
    private String[] BusDetails = null;
    private Integer ID = 0;
    private int ScheduleLength;
    private ArrayList<String[]> Queue = new ArrayList<>();
    private String[] tripDetails = new String[7];
    public Bus() {
    }

    //Create New Bus
    public void CreateBus(String Origin, String Destination, double Distance) {
        //Instance variables
        int farePerKM = 2;
        Double fare = farePerKM * Distance;
        BusDetails = new String[100];
        BusDetails[0] = String.valueOf(ID);
        BusDetails[1] = Origin;
        BusDetails[2] = Destination;
        BusDetails[3] = String.valueOf(Distance);
        BusDetails[4] = String.valueOf(fare);
        BusDetails[5] = String.valueOf(30);

        //Enter Schedule Length
        System.out.println("Enter Bus ( " + (ID + 1) + " ) Schedule Length");
        ScheduleLength = new Scanner(System.in).nextInt();
        BusDetails[6] = String.valueOf(ScheduleLength);

        //Enter Schedule Details
        for (int i = 1; i <= ScheduleLength; i++) {
            System.out.println("Enter Time " + i + " Details" + "\nNote: Enter Time in HH:MM 24hrs Format ");
            String ScheduleDetails = new Scanner(System.in).next();
            BusDetails[i + 6] = ScheduleDetails;
        }

        BusList.add(BusDetails);
        System.out.println("Created New Bus, ID :" + ID++);
    }

    //Update Bus Data
    public void UpdateBus(String ID, String Origin, String Destination, double Distance) {
        String[] Details = GetBusDetails(ID);
        Details[1] = Origin;
        Details[2] = Destination;
        Details[3] = String.valueOf(Distance);
        //Edit Schedule Details
        for (int i = 1; i <= ScheduleLength; i++) {
            System.out.println("Edit Time " + i + " Details" + "\nNote: Enter Time in HH:MM 24hrs Format ");
            String ScheduleDetails = new Scanner(System.in).next();
            BusDetails[i + 6] = ScheduleDetails;
        }
    }

    //Remove Bus
    public void RemoveBus(String ID) {
        try {
            BusList.remove(Integer.parseInt(ID));
            System.out.print("Bus Removed");
        } catch (Exception ignored) {

        }
    }

    //Get Bus Data
    public String[] GetBusDetails(String ID) {
        String[] x = new String[100];
        for (String[] Details : BusList) {
            if (ID.equals(Details[0])) {
                x = Details;
                break;
            }
        }
        return x;
    }

    //Search Buses
    public boolean SearchBus(String Origin, String Destination) {
        BusesFound = new ArrayList<>();
        for (String[] Bus : BusList) {
            if (Origin.equals(Bus[1]) && Destination.equals(Bus[2])) {
                BusesFound.add(Bus);
            }
        }
        return BusesFound.get(0) != null;
    }

    public ArrayList<String[]> getBusesFound() {
        return BusesFound;
    }

    public boolean selectSeat(Integer TicketID, Integer PassengerID, Integer BusID,String Date, String Time, Integer SeatNumber){
        if (tripDetails[0].equals(BusID) && tripDetails[4].equals(Date) && tripDetails[5].equals(Time) && tripDetails[6].equals(SeatNumber)){
                return false;
        }else {
            tripDetails[0] = String.valueOf(TicketID);
            tripDetails[1] = String.valueOf(PassengerID);
            tripDetails[2] = String.valueOf(BusID);
            tripDetails[3] = Date;
            tripDetails[4] = Time;
            tripDetails[5] = String.valueOf(SeatNumber);
            return true;
        }
    }
}