//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package keeper.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionManager {
    static connectionManager instance;

    public connectionManager() {

        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException var3) {
            System.out.println("Not found driver class:org.postgresql.Driver");
            var3.printStackTrace();
        }

    }

    public static connectionManager getInstance() {
        if (instance == null) {
            instance = new connectionManager();
        }

        return instance;
    }

    private Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/keeper", "postgres", "postgres");
    }

    public void insert(String sql) throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        statement.execute(sql);
        statement.close();
        connection.close();
    }
}
