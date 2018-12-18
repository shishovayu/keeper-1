//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package keeper.client;

import java.sql.SQLException;
import keeper.api.Position;
import keeper.api.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class datamanager {
    private static datamanager instance;

    private datamanager() {
    }

    public static datamanager getInstance() {
        if (instance == null) {
            instance = new datamanager();
        }

        return instance;
    }

    public void login(String login, String password) {


        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/keeper", "postgres", "postgres");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT login, password FROM public.\"User\"");


            while (resultSet.next()) {
                if (login.equals(resultSet.getString("login"))) {
                    if (password.equals(resultSet.getString("password"))) {
                        System.out.println("вход выполнен");
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

    public void createUser(User user) throws SQLException {

        int userID = user.getUserID();
        String login = user.getLogin();
        String password = user.getPassword();
        String position = user.getPosition();

        String sql ="INSERT INTO public.\"User\"(\n" +
                "            user_id, user_type, login, password)" + "VALUES ("+userID+", '"+position+"', '"+login+"', '"+password+"');";
        connectionManager.getInstance().insert(sql);
    }

    public void updateUsers(User user) {
    }

    public void deleteUsers(User user) {
    }

    public void createPosition(Position position) throws SQLException {
        int id = position.getPosition_id();
        String name = position.getPosition_name();
        int price = position.getPrice();
    }

    public void updatePosition(Position position) {
    }

    public void deletePosition(Position position) {
    }
}
