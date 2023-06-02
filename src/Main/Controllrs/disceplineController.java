package Main.Controllrs;

import Main.Models.Discipline;

import java.util.ArrayList;

public class disceplineController extends Discipline {

    public static void getTest() {

        Discipline discipline = new Discipline();

        System.out.println("№   | Дисциплинa");

        ArrayList<Discipline> array = discipline.getTestDisciplines();

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i) + " | " + array.get(i).getName());
        }

    }
}
