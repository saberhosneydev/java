package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    private ArrayList<String[]> BusList = new ArrayList<>();
    private ArrayList<String[]> BusesFound = null;
    private String[] BusDetails = null;
    private Integer ID = 0;
    private int ScheduleLength;
    private ArrayList<String[]> Queue = new ArrayList<>();

    public Bus() {
    }

    public ArrayList<String[]> getBusList() {
        return BusList;
    }

    public void setBusList(ArrayList<String[]> BusList) {
        this.BusList = BusList;
    }

    public String[] getBusDetails() {
        return BusDetails;
    }

    public void setBusDetails(String[] BusDetails) {
        this.BusDetails = BusDetails;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public int getScheduleLength() {
        return ScheduleLength;
    }

    public void setScheduleLength(int ScheduleLength) {
        this.ScheduleLength = ScheduleLength;
    }

    //Create New Bus
    public void CreateBus(String Origin, String Destination, double Distance) {
        System.out.println("Create New Bus: \n---------------");
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
        System.out.println("Enter Bus ( " + (ID + 1) + " ) Timetable Length");
        ScheduleLength = new Scanner(System.in).nextInt();
        BusDetails[6] = String.valueOf(ScheduleLength);

        //Enter Schedule Details
        for (int i = 1; i <= ScheduleLength; i++) {
            System.out.println("Enter Time " + i + " Details" + "\nNote: Enter Time in HH:MM 24hrs Format ");
            String ScheduleDetails = new Scanner(System.in).next();
            BusDetails[i + 6] = ScheduleDetails;
        }

        BusList.add(BusDetails);
        System.out.println("Created New Bus, it's ID is (" + ID++ + ")\n---------------------------------\n\n");
    }

    //Update Bus Data
    public void UpdateBus(String ID, String Origin, String Destination, double Distance) {
        String[] Details = GetBusDetails(ID);
        System.out.println("Edit Bus Number " + (Integer.valueOf(Details[0]) + 1) + "\n");
        Details[1] = Origin;
        Details[2] = Destination;
        Details[3] = String.valueOf(Distance);
        int y = 1;
        //Edit Schedule Details
        for (int i = 7; i <= 6 + Integer.valueOf(Details[6]); i++) {
            System.out.println("Edit Time " + y++ + " Details" + "\nNote: Enter Time in HH:MM 24hrs Format ");
            String ScheduleDetails = new Scanner(System.in).next();
            Details[i] = ScheduleDetails;
        }
        Integer x = BusList.indexOf(GetBusDetails(ID));
        BusList.set(x, Details);
    }

    //Remove Bus
    public void RemoveBus(String ID) {
        try {
            BusList.remove(GetBusDetails(ID));
            System.out.print("Bus Removed\n");
        } catch (Exception e) {
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
        if (BusesFound.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<String[]> getBusesFound() {
        return BusesFound;
    }

    public boolean selectSeat(Integer TicketID, Integer PassengerID, Integer BusID, String Date, String Time, Integer SeatNumber) {
        String[] newtripDetails = new String[7];
        if (Queue.isEmpty()) {
            newtripDetails[0] = String.valueOf(TicketID);
            newtripDetails[1] = String.valueOf(PassengerID);
            newtripDetails[2] = String.valueOf(BusID);
            newtripDetails[3] = Date;
            newtripDetails[4] = Time;
            newtripDetails[5] = String.valueOf(SeatNumber);
            Queue.add(newtripDetails);
            return true;
        } else {
            for (String[] trip : Queue) {
                if (!trip[2].equals(String.valueOf(BusID)) || !trip[3].equals(Date) || !trip[4].equals(Time) || !trip[5].equals(String.valueOf(SeatNumber))) {
                    newtripDetails[0] = String.valueOf(TicketID);
                    newtripDetails[1] = String.valueOf(PassengerID);
                    newtripDetails[2] = String.valueOf(BusID);
                    newtripDetails[3] = Date;
                    newtripDetails[4] = Time;
                    newtripDetails[5] = String.valueOf(SeatNumber);
                    Queue.add(newtripDetails);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkSeatIfAvailable(Integer BusID, String Date, String Time, Integer SeatNumber) {
        if (Queue.isEmpty()) {
            return true;
        } else {
            for (String[] trip : Queue) {
                return !trip[2].equals(String.valueOf(BusID)) || !trip[3].equals(Date) || !trip[4].equals(Time) || !trip[5].equals(String.valueOf(SeatNumber));
            }
        }
        return false;
    }

    public ArrayList<String[]> getQueue() {
        return Queue;
    }

}


