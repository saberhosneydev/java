package busticketproject;

import java.util.ArrayList;

public class Admin {
    //Instance variables
    private ArrayList<String[]> AdminAccArr = new ArrayList<>();
    private String[] AdminAccPolyfill = new String[2];

    public Admin() {
    }

    //Add Account
    public void AddAccount(String Username, String Password) {
        AdminAccPolyfill[0] = Username;
        AdminAccPolyfill[1] = Password;
        AdminAccArr.add(AdminAccPolyfill);
        System.out.println("Account created!");
    }

    //Admin Login
    public boolean AdminLogin(String Username, String Password) {
        for (String[] strings : AdminAccArr) {
            if (Username.equals(strings[0])) {
                if (Password.equals(strings[1])) {
                    return true;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong User Name");
        }
        return false;
    }

    //Change Username
    public void ChangeUsername(String Username, String Password, String NewUsername) {
        for (String[] strings : AdminAccArr) {
            if (Username.equals(strings[0])) {
                if (Password.equals(strings[1])) {
                    strings[0] = NewUsername;
                    System.out.println("Username Changed");
                    break;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong UserName");
        }
    }

    //Change Password
    public void ChangePassword(String Username, String Password, String NewPassword) {
        for (String[] strings : AdminAccArr) {
            if (Username.equals(strings[0])) {
                if (Password.equals(strings[1])) {
                    strings[1] = NewPassword;
                    System.out.println("Password Changed");
                    break;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong UserName");
        }
    }
}