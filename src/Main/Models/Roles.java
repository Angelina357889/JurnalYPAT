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

    //Метод вывода всех записей таблицы
    //колекция Мар - выводит ввиде ассоциативного массива
    public HashMap<Integer, String> allRoles() throws SQLException, ClassNotFoundException {
        //Строка с запросом на вывод всех данных из таблицы
        String query = "SELECT * FROM Roles";
        // для отправки запросов в БД используется пакет Statement
        Statement statement = getDbConnect().createStatement();
        //Результат выполнения запроса
        ResultSet result = statement.executeQuery(query);

        //создам Ассоциативный массив и присвою данные из БД его элементам
        HashMap<Integer, String> array = new HashMap<>();
        // Цикл while для перебора полученных запесей из БД
        while (result.next()) {
            array.put(result.getInt("id"), result.getString("name"));
        }
        return array;
    }

    //метод вывода указанной записи
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

    //метод дабовления записи
    public void add(String name) throws SQLException, ClassNotFoundException {
        // строка с текстом запроса Добавить запись
        String query = "INSERT INTO " + ROLE_TABLE + " (" + ROLE_TABLE_NAME + ") VALUES ('" + name + "')";

        Statement statement = getDbConnect().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);

    }

    //метод обновления одной записи
    public void update(Integer id, String name) throws SQLException, ClassNotFoundException {
        if (id != 1) {
            String query = "UPDATE " + ROLE_TABLE + " SET " + ROLE_TABLE_NAME + " = '" + name + "' WHERE " + ROLE_TABLE_ID + " = " + id + "";
            Statement statement = getDbConnect().createStatement();
            System.out.println(query);
            statement.executeUpdate(query);
        } else {
            System.out.println("Этого пользователя обнавлять нельзя");
        }
    }

    //метод удаления одной записи
    public void delete(Integer id) throws SQLException, ClassNotFoundException {
        if (id != 1) {
            String query = "DELETE FROM " + ROLE_TABLE + " WHERE " + ROLE_TABLE_ID + " = " + id;
            Statement statement = getDbConnect().createStatement();
            System.out.println(query);
            statement.executeUpdate(query);
        } else {
            System.out.println("Этого пользователя удалять нельзя");
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
