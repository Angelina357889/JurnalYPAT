package Main.ConfigDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DateBaseConnection extends Connect {
    //��������� ���������� ��� ������ � ������ ������ CONNECTION
    static Connection dbConnect; //������� ��������� ������ Connection �� ����� dbConnect

    //��������� �������
    //����� ������ ��������� ����������� � ���� ������
    public static Connection getDbConnect() throws ClassNotFoundException, SQLException {
        String connectorString = "jdbc:mysql://192.168.3.211/rybin1_jurYPAT";
        //���������� �������
        Class.forName("com.mysql.cj.jdbc.Driver");
        //���� ����������� ����� �����
        dbConnect = DriverManager.getConnection(connectorString, userNameDB, passwordDB);
        System.out.println(connectorString);
        return dbConnect;
    }

}
