import saberhosneydev.database.MySQL;

import java.sql.*;
class Admin {
    private String account;
    private String password;

    public Admin() {

    }

    public void login(String account, String password) {
        String query = "SELECT * FROM admin WHERE account = '"  + account + "'";
        ResultSet rs =  new MySQL().selectWhere(query);
        try {
            if(rs.next()){
                if (password.equals(rs.getString("password"))){
                    System.out.println("Logged In");
                }else System.out.println("Your password is incorrect");;
            } else System.out.println("Your account is incorrect");
        } catch (SQLException ex) { }

    }

    public void create(String account, String password) {
        String query = "INSERT INTO Admin (account, password) VALUES ('"+account+"', '"+password+"')";
        new MySQL().insert(query);
    }

    public void editPassword(String account, String password) {
        String query = "update admin set password = '" + password + "' where account = '"+ account +"'";
        new MySQL().update(query);
    }
}
public class Main {
    public static void main(String[] args) {

    }
}