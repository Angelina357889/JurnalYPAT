package Main.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static Main.ConfigDataBase.ConstDB.*;
import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;

public class Discipline {
    // поля данных
    private Integer id;
    protected static String name;

    //контролеры
    public Discipline() {
    }

    public Discipline(
            Integer id,
            String name
    ) {
        this.id = id;
        this.name = name;
    }

    //методы
    //вывод данных с помощью ArrayList<>
    //ПРИМЕР
    //Создам колекция ArrayList<>
    public ArrayList<Discipline> getTestDisciplines() {
        Discipline disc1 = new Discipline(1, "Математика");
        Discipline disc2 = new Discipline(2, "Физика");
        Discipline disc3 = new Discipline(3, "Астраномия");
        ArrayList<Discipline> disciplines = new ArrayList<>();
        disciplines.add(disc1);
        disciplines.add(disc2);
        disciplines.add(disc3);
        disciplines.add(new Discipline(4, "Информатика"));
        disciplines.add(new Discipline(5, "Английский язык"));

        return disciplines;
    }

    public ArrayList<Discipline> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Discipline> disciplines = new ArrayList<>();

        String query = "SELECT * FROM " + TABLE_DIST;

        Statement statement = getDbConnect().createStatement();

        ResultSet result = statement.executeQuery(query);

        while (result.next()) {
            disciplines.add(new Discipline(result.getInt("id"), result.getString("name")));

        }
        return disciplines;
    }

    public void add(String nameDisc) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO " + TABLE_DIST + " (" + TABLE_DIST_NAME + ") " + " VALUE " + " (" + nameDisc + ")";

        Statement statement = getDbConnect().createStatement();

        statement.executeUpdate(query);

    }

    public void update(Integer id, String newName) throws SQLException, ClassNotFoundException {
        statement("UPDATE " + TABLE_DIST + " SET " + TABLE_DIST_NAME + " = " +
        "'" + newName + "' WHERE " + TABLE_DIST_ID + " = " + id);
    }

    //метод подключения к бд и отправки запроса
    private int statement (String query) throws SQLException, ClassNotFoundException {
        Statement statement = getDbConnect().createStatement();

        return statement.executeUpdate(query);
    }
public void delete(Integer id) throws SQLException, ClassNotFoundException {
        statement("DELETE FROM " + TABLE_DIST + " WHERE " + TABLE_DIST_ID + " = " + id);
}

    public Discipline show (Integer id) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM " + TABLE_DIST + " WHERE " + TABLE_DIST_ID + " = " + id;
        Statement statement = getDbConnect().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        Discipline discipline = new Discipline();

        while (resultSet.next()) {
            discipline = new Discipline(resultSet.getInt("id"), resultSet.getString("name"));
        }
        return discipline;
    }
    //геттеры
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }



}
