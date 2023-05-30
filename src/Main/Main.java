package Main;

import java.sql.SQLException;

import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, SQLException {
        System.out.println(getDbConnect());
    }



}
