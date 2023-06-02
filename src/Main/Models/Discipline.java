package Main.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static Main.ConfigDataBase.ConstDB.TABLE_DIST;
import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;

public class Discipline {
    // поля данных
    private Integer id;
    private String name;

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

        while (result.next()){
            disciplines.add(new Discipline(result.getInt("id"), result.getString(name)));

        }
        return disciplines;
    }
    //геттеры


    public Integer getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}
