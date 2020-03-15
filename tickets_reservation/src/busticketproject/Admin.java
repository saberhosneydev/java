package busticketproject;

import java.util.ArrayList;

public class Admin {
    //Instance variables
    private ArrayList<String[]> AdminAccArr = new ArrayList<>();
    private String[] AdminAccPolyfill = new String[2];
    private boolean LoginStateVar = false;
    private boolean CheckTrue = false;

    public Admin() {
    }

    //Add Account
    public void create(String Username, String Password) {
        AdminAccPolyfill[0] = Username;
        AdminAccPolyfill[1] = Password;
        AdminAccArr.add(AdminAccPolyfill);
        System.out.println("Account created!");
    }

    //Admin Login
    public boolean login(String Username, String Password) {
        for (String[] strings : AdminAccArr) {
            if (Username.equals(strings[0])) {
                if (Password.equals(strings[1])) {
                    LoginStateVar = true;
                    return true;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong Username");
        }
        return false;
    }

    public String[] getAdminDetails(String Username, String Password) {
        String[] x = new String[100];
        for (String[] strings : AdminAccArr) {
            if (Username.equals(strings[0])) {
                if (Password.equals(strings[1])) {
                    x = strings;
                    CheckTrue = true;
                    break;
                } else System.out.print("Wrong Password\n");
            } else System.out.print("Wrong Username\n");
        }
        return x;
    }

    //Change Username
    public void changeUsername(String Username, String Password, String NewUsername) {
        String[] Details = getAdminDetails(Username, Password);
        if (CheckTrue) {
            Details[0] = NewUsername;
            System.out.println("Username changed Successfully \n");
            CheckTrue = false;
        }
    }

    //Change Password
    public void changePassword(String Username, String Password, String NewPassword) {
        String[] Details = getAdminDetails(Username, Password);
        if (CheckTrue) {
            Details[1] = NewPassword;
            System.out.println("Username changed Successfully \n");
            CheckTrue = false;
        }
    }

    public boolean loginState() throws Exception {
        if (LoginStateVar) {
            return true;
        } else {
            throw new Exception("Insufficient permissions!");
        }
    }
}