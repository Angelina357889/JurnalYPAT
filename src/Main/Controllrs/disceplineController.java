package Main.Controllrs;

import Main.Models.Discipline;

import java.sql.SQLException;
import java.util.ArrayList;

public class disceplineController extends Discipline {

    public static void getTest() {

        Discipline discipline = new Discipline();

        System.out.println("№   | Дисциплинa");
        System.out.println("---------------------");

        ArrayList<Discipline> array = discipline.getTestDisciplines();

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getId() + " | " + array.get(i).getName());
        }

    }
    public static void getAllDisciplines() throws SQLException, ClassNotFoundException{
        Discipline discipline = new Discipline();

        System.out.println("№   | Дисциплинa");
        System.out.println("---------------------");

        ArrayList<Discipline> array = discipline.getAll();

        for (int i = 0; i< array.size(); i++){
            System.out.println(array.get(i).getId()+ " | " + array.get(i).getName());
        }
    }
}
