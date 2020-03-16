package busticketproject;

public class Main {
    /* ToDo :
     *    6.Check Project for Quality of life or Any Errors
     */
    public static void main(String[] args) {
        //Declare Objects
        Admin admin = new Admin();
        Bus bus = new Bus();
        Passenger passenger = new Passenger();
        Ticket ticket = new Ticket();

        admin.create("HopeitWorks","HopeitWorks");
        admin.login("HopeitWorks","HopeitWorks");
        admin.getAdminDetails("HopeitWorks","HopeitWorks");
        admin.changeUsername("HopeitWorks","HopeitWorks","ItWorked^^");
        admin.changePassword("ItWorked^^","HopeitWorks","ItWorked^^");

        try {
            admin.loginState();
            /*Functinos that only admin can perform should goes here*/
            bus.CreateBus("Alex", "Cairo", 311.9);
            bus.CreateBus("NewCairo", "SharmELShekh", 150);
            bus.CreateBus("ELShrok", "Manofya", 113.7);
            bus.UpdateBus("1","NewCairo","ELEenELSokhna",75.3);
            bus.RemoveBus("2");
            bus.GetBusDetails("1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        passenger.AddAccount("loveisthekey", "loveisthekey");
        passenger.PassengerLogin("loveisthekey", "loveisthekey");
        //Wrong Username
        passenger.PassengerLogin("loveisnotthekey", "loveisthekey");
        //Wrong Password
        passenger.PassengerLogin("loveisthekey", "hateisthekey");
        passenger.ChangeUsername("loveisthekey","loveisthekey","NewDayNewLife");
        passenger.ChangePassword("loveisthekey","loveisthekey","NewDayNewLife");


        ticket.CreateTicket("Alex", "Cairo", bus, passenger);
        ticket.CreateTicket("NewCairo", "ELEenELSokhna", bus, passenger);
        ticket.UpdateTicket(passenger, bus);
        ticket.ViewTicketsBooked(passenger, bus);
        ticket.printTicket("0",bus);
        ticket.ViewTicketsBooked(passenger, bus);

        admin.summary(bus,"0","00/00/00","00:00");
    }
}

