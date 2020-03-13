package busticketproject;

import java.util.ArrayList;

public class Admin{
    private ArrayList<String[]> AdminAccArr = new ArrayList<>();
    private String[] AdminAccPolyfill = new String[4];
    public Admin() {

    }

    public void addAccount(String AdminUsrName, String AdminPass) {
        AdminAccPolyfill[0] = AdminUsrName;
        AdminAccPolyfill[1] = AdminPass;
        AdminAccArr.add(AdminAccPolyfill);
        System.out.println("Account created!");
    }

    public boolean AdminAccountCheck(String AdminUsrName, String AdminPass) {

        for (String[] strings : AdminAccArr) {

            if (AdminUsrName.equals(strings[0])) {
                if (AdminPass.equals(strings[1])) {
                    return true;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong User Name");

        }
        return false;
    }


    public void changePassword(String username, String password, String newPassword){
        for (String[] strings : AdminAccArr) {

            if (username.equals(strings[0])) {
                if (password.equals(strings[1])) {
                    strings[1] = newPassword;
                    System.out.println("Password Changed");
                    break;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong UserName");

        }
    }
    public void changeUsername(String username, String password, String newUsername){
        for (String[] strings : AdminAccArr) {

            if (username.equals(strings[0])) {
                if (password.equals(strings[1])) {
                    strings[0] = newUsername;
                    System.out.println("Username Changed");
                    break;
                } else System.out.print("Wrong Password");
            } else System.out.print("Wrong UserName");

        }
    }
}