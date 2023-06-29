package database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


public class Main {


    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("src/main/resources/sql.properties")) {
            properties.load(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;


        Connection connection = DriverManager.getConnection(properties.getProperty("database.url"), properties.getProperty("database.login"), properties.getProperty("database.pass"));
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT  * FROM mydbtest.users ");
//statement.executeUpdate("INSERT INTO mydbtest.users(id,age,name,email)VALUES ('555','51635','ldk','fgdgdf')" );

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) +
                    " " + resultSet.getString(3) + " " + resultSet.getString(4));
        }
        connection.close();
    }
}
