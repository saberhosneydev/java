package busticketproject;

import java.util.ArrayList;

public class Bus {
    private String route,runningTimes, distance,fare;
    private Integer id = 0;
    private ArrayList<String[]> BusList;
    private String[] BusStrings = new String[4];
    public Bus() {
        BusList = new ArrayList<>();
    }
    
    public void create(String route, String runningTimes, String distance, String fare){
        BusStrings[0] = route;
        BusStrings[1] = runningTimes;
        BusStrings[2] = id.toString();
        BusStrings[3] = distance;
        BusStrings[4] = fare;
        BusList.add(BusStrings);
        System.out.println("Created id: " + id++);
    }
    
    
}
