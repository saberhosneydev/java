package code;

import java.util.ArrayList;

public class Passenger {
    //Instance variables
    private Integer ID = 0;
    private ArrayList<String[]> PassengerAccArr = new ArrayList<>();
    private String[] PassengerAccPolyFill = new String[3];
    private Integer UserID;
    Passenger() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public ArrayList<String[]> getPassengerAccArr() {
        return PassengerAccArr;
    }

    public void setPassengerAccArr(ArrayList<String[]> PassengerAccArr) {
        this.PassengerAccArr = PassengerAccArr;
    }

    public String[] getPassengerAccPolyFill() {
        return PassengerAccPolyFill;
    }

    public void setPassengerAccPolyFill(String[] PassengerAccPolyFill) {
        this.PassengerAccPolyFill = PassengerAccPolyFill;
    }
    
    
    
    //Add Account
    public void AddAccount(String UsrName, String Pass) {
        PassengerAccPolyFill[0] = String.valueOf(ID++);
        PassengerAccPolyFill[1] = UsrName;
        PassengerAccPolyFill[2] = Pass;
        PassengerAccArr.add(PassengerAccPolyFill);
    }

    //Passenger Login
    public boolean PassengerLogin(String username, String password) {
        for (String[] strings : PassengerAccArr) {
            if (username.equals(strings[1])) {
                if (password.equals(strings[2])) {
                    System.out.println("Logged IN!");
                    UserID=Integer.parseInt(strings[0]);
                    return true;
                } else System.out.println("Wrong Password");
            } else System.out.println("Wrong Username");
        }
        return false;
    }

    //Change Username
    public void ChangeUsername(String Username, String Password, String NewUsername) {
        for (String[] strings : PassengerAccArr) {
            if (Username.equals(strings[1])) {
                if (Password.equals(strings[2])) {
                    strings[1] = NewUsername;
                    System.out.println("Username changed successfully");
                    break;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong UserName");
        }
    }

    //Change Password
    public void ChangePassword(String Username, String Password, String NewPassword) {
        for (String[] strings : PassengerAccArr) {
            if (Username.equals(strings[1])) {
                if (Password.equals(strings[2])) {
                    strings[2] = NewPassword;
                    break;
                } else System.out.println("WrongPassword");
            } else System.out.println("Wrong userName");
        }
    }

    public Integer getUserID() {
        return UserID;
    }
}
