package busticketproject;

import java.util.Scanner;

public class Main {
    /* ToDo :
     *    1.Ticket Class
     *    2.Test Ticket in main (using the same format of other tests)
     *    3.Admins can see a summary of a status (number of passengers booked, total fare collected,...) of a certain trip
     *    4.Get Bus Data Needs Naming
     *    5.Create a menu of test in main (Instead of running them all together)
     *    6.Check Project for Quality of life or Any Errors
     */
    public static void main(String[] args) {
        Bus bus=new Bus();
        Passenger passenger=new Passenger();
        Ticket ticket=new Ticket();

        bus.CreateBus("blshLand","fkLand",99.9);
        passenger.AddAccount("fklife","fkcolege");
        passenger.PassengerLogin("fklife","fkcolege");
        ticket.CreateTicket("blshLand","fkLand",bus,passenger);

    }
}

