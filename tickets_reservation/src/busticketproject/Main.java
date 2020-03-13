package busticketproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Test Admin
        Admin log = new Admin();
        //Create Account
        System.out.println("Create Admin Account");
        System.out.println("Enter Username");
        String CreateAdminUserName = new Scanner(System.in).next();
        System.out.println("Enter Password");
        String CreateAdminPassword = new Scanner(System.in).next();
        log.AddAccount(CreateAdminUserName, CreateAdminPassword);

        System.out.println("----------------------------------------");

        //Login
        System.out.println("Login Admin Account");
        System.out.println("Enter Username");
        String LoginAdminUserName = new Scanner(System.in).next();
        System.out.println("Enter Password");
        String LoginAdminPassword = new Scanner(System.in).next();
        log.AdminLogin(LoginAdminUserName, LoginAdminPassword);

        System.out.println("----------------------------------------");

        //Change Admin Username
        System.out.println("Change Admin Username");
        System.out.println("Enter Username");
        String LogAdminUserName = new Scanner(System.in).next();
        System.out.println("Enter Password");
        String LogAdminPassword = new Scanner(System.in).next();
        System.out.println("Enter New Username");
        String NewAdminUsername = new Scanner(System.in).next();
        log.ChangeUsername(LogAdminUserName, LogAdminPassword, NewAdminUsername);

        System.out.println("----------------------------------------");

        //Change Admin Password
        System.out.println("Change Admin Password");
        System.out.println("Enter Username");
        String LogAdminUserName1 = new Scanner(System.in).next();
        System.out.println("Enter Password");
        String LogAdminPassword1 = new Scanner(System.in).next();
        System.out.println("Enter New Password");
        String NewAdminPassword = new Scanner(System.in).next();
        log.ChangeUsername(LogAdminUserName1, LogAdminPassword1, NewAdminPassword);

        ////////////////////////////////////////////////////////////////////////////////////

        //Test Bus
        Bus bus1 = new Bus();

        bus1.CreateBus("Cairo", "NewYork", 1180.5);
        bus1.CreateBus("Cairo", "Paris", 1180.5);
        String[] tests = bus1.GetBusDetails("0");
        System.out.println("The bus from: " + tests[1] + " to: " + tests[2] +
                "will take around: " + (Double.valueOf(tests[3]) / 100) + "hr(" + tests[3] + "km)"
                + " You will pay: " + tests[4]);
        System.out.println("The bus will run on this times below each day.");
        for (int i = 7; i < tests.length; i++) {
            if (tests[i] != null) {
                System.out.print(tests[i]);
            }
        }
    }

    /* ToDo admins can also see a summary of a status (number of passengers booked, total fare collected,...) of a certain trip */

}
