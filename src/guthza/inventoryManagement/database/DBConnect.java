package guthza.inventoryManagement.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnect {

    public DBConnect() {

    }

    public List<String> connect() {

        List<String> tableNames = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcinventory", "root", "JfmcMySQL");

            //interface that represent a sql statement
            PreparedStatement statement = connection.prepareStatement("select table_name from information_schema.tables where table_schema = 'jdbcinventory'");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                tableNames.add(resultSet.getString("table_name"));
                System.out.println(resultSet.getString("table_name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tableNames;
    }
}
