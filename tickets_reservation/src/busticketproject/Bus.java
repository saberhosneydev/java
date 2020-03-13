package busticketproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    //Instance variables
    private final Integer FarePerKM = 2;
    private final int NumberOfSeatsPerBus = 45;
    private ArrayList<String[]> BusList = new ArrayList<>();
    private String[] BusDetails = new String[100];
    private Integer ID = 0;
    private Double Fare = (double) 0;

    public Bus() {
    }

    //Create New Bus
    public void CreateBus(String Origin, String Destination, double Distance) {
        Fare = FarePerKM * Distance;
        BusDetails[0] = ID.toString();
        BusDetails[1] = Origin;
        BusDetails[2] = Destination;
        BusDetails[3] = String.valueOf(Distance);
        BusDetails[4] = String.valueOf(Fare);
        BusDetails[5] = String.valueOf(NumberOfSeatsPerBus);

        //Enter Schedule Length
        System.out.println("Enter Bus" + ID + "Schedule Length");
        int ScheduleLength = new Scanner(System.in).nextInt();
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

    //Get Bus Data
    public String[] GetBusDetails(String ID) {
        String[] x = new String[100];
        for (String[] Details : BusList) {
            if (Details[0].equals(ID)) {
                x = Details;
            }
        }
        return x;
    }

    //Update Bus Data
    public void UpdateBusDetails(String ID, String Origin, String Destination, double Distance) {
        String[] Details = GetBusDetails(ID);
        Details[1] = Origin;
        Details[2] = Destination;
        Details[3] = String.valueOf(Distance);
    }

    //Remove Bus
    public void RemoveBus(String ID) {
        try {
            BusList.remove(Integer.parseInt(ID));
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    public void search(String Origin, String Destination){
        for (String[] Bus: BusList) {
            if (Origin.equals(Bus[1]) && Destination.equals(Bus[2])) {
                System.out.print("FOUND");
            }
        }
    }
}
