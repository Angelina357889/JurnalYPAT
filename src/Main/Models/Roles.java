package Main.Models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import static Main.ConfigDataBase.ConstDB.*;
import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;

public class Roles {

    private Integer id;
    private String name;

    public Roles() {
    }

    public Roles(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //����� ������ ���� ������� �������
    //�������� ��� - ������� ����� �������������� �������
    public HashMap<Integer, String> allRoles() throws SQLException, ClassNotFoundException {
        //������ � �������� �� ����� ���� ������ �� �������
        String query = "SELECT * FROM Roles";
        // ��� �������� �������� � �� ������������ ����� Statement
        Statement statement = getDbConnect().createStatement();
        //��������� ���������� �������
        ResultSet result = statement.executeQuery(query);

        //������ ������������� ������ � ������� ������ �� �� ��� ���������
        HashMap<Integer, String> array = new HashMap<>();
        // ���� while ��� �������� ���������� ������� �� ��
        while (result.next()) {
            array.put(result.getInt("id"), result.getString("name"));
        }
        return array;
    }

    //����� ������ ��������� ������
    public Roles oneRole() throws SQLException, ClassNotFoundException {

        Roles role = new Roles();
        String query = "SELECT * FROM " + ROLE_TABLE + " WHERE " + ROLE_TABLE_ID + " = " + id;
        Statement statement = getDbConnect().createStatement();
        ResultSet result = statement.executeQuery(query);
        while (result.next()) {
            role = new Roles(result.getInt("id"), result.getString("name"));
        }
        return role;
    }

    //����� ���������� ������
    public void add(String name) throws SQLException, ClassNotFoundException {
        // ������ � ������� ������� �������� ������
        String query = "INSERT INTO " + ROLE_TABLE + " (" + ROLE_TABLE_NAME + ") VALUES ('" + name + "')";

        Statement statement = getDbConnect().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);

    }

    //����� ���������� ����� ������
    public void update(Integer id, String name) throws SQLException, ClassNotFoundException {
        if (id != 1) {
            String query = "UPDATE " + ROLE_TABLE + " SET " + ROLE_TABLE_NAME + " = '" + name + "' WHERE " + ROLE_TABLE_ID + " = " + id + "";
            Statement statement = getDbConnect().createStatement();
            System.out.println(query);
            statement.executeUpdate(query);
        } else {
            System.out.println("����� ������������ ��������� ������");
        }
    }

    //����� �������� ����� ������
    public void delete(Integer id) throws SQLException, ClassNotFoundException {
        if (id != 1) {
            String query = "DELETE FROM " + ROLE_TABLE + " WHERE " + ROLE_TABLE_ID + " = " + id;
            Statement statement = getDbConnect().createStatement();
            System.out.println(query);
            statement.executeUpdate(query);
        } else {
            System.out.println("����� ������������ ������� ������");
        }
    }
    //

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
