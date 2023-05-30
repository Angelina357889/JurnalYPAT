package Main.ConfigDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DateBaseConnection extends Connect {
    //использую библиотеку дл€ работы с Ѕазами данных CONNECTION
    static Connection dbConnect; //объ€вил экземпл€р класса Connection по имени dbConnect

    //подключаю драйвер
    //ћетод вывода результат подключени€ к Ѕазе данных
    public static Connection getDbConnect() throws ClassNotFoundException, SQLException {
        String connectorString = "jdbc:mysql://192.168.3.211/rybin1_jurYPAT";
        //подключить драйвер
        Class.forName("com.mysql.cj.jdbc.Driver");
        //—амо подключение через метод
        dbConnect = DriverManager.getConnection(connectorString, userNameDB, passwordDB);
        System.out.println(connectorString);
        return dbConnect;
    }

}
