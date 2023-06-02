package Main.Models;

import java.util.ArrayList;

public class Discipline {
    // ���� ������
    private Integer id;
    private String name;

    //����������
    public Discipline() {
    }

    public Discipline(
            Integer id,
            String name
    ) {
        this.id = id;
        this.name = name;
    }

    //������
    //����� ������ � ������� ArrayList<>
    //������
    //������ �������� ArrayList<>
    public ArrayList<Discipline> getTestDisciplines() {
        Discipline disc1 = new Discipline(1, "����������");
        Discipline disc2 = new Discipline(2, "������");
        Discipline disc3 = new Discipline(3, "����������");
        ArrayList<Discipline> disciplines = new ArrayList<>();
        disciplines.add(disc1);
        disciplines.add(disc2);
        disciplines.add(disc3);
        disciplines.add(new Discipline(4, "�����������"));
        disciplines.add(new Discipline(5, "���������� ����"));

        return disciplines;
    }

    //�������


    public Integer getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}
