package Main.Controllrs;

import Main.Models.Roles;
import Main.Models.User;

import java.sql.SQLException;
import java.util.Scanner;

public class UserController extends User{
    private static User user;

    public static void getAllUsers() throws SQLException, ClassNotFoundException {
        User user = new User();
        System.out.println("��� ������������");
        System.out.println("� | ���� | ��� | ����� |  ������ |");
        System.out.println("------------------------------------");
        for (int i = 0; i < user.getAll().length; i++) {
            System.out.println(user.getAll()[i].getIdUser() + " | "
                    + user.getAll()[i].getRoleId() + " | "
                    + user.getAll()[i].getLofinUser() + " | "
                    + user.getAll()[i].getNameUser() + " | "
                    + user.getAll()[i].getPasswordUser());
        }
    }

    public static void addUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        Scanner input = new Scanner(System.in);

        System.out.println("������� ��� ������������");
        String name = input.nextLine();
        System.out.println("������� ����� ������������");
        String login = input.nextLine();
        System.out.println("������� ������ ������������");
        String password = input.nextLine();
        System.out.println("������� ���� ������������");
        Integer roleId = input.nextInt();

        user.add(roleId, name, login, password);
    }

    public static void updateNameUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� �������� ����� ������������");
        String newNameUser = input.nextLine();
        System.out.println("�������� � ID �����");
        Integer id = input.nextInt();

        user.updateUserName(newNameUser, id);
    }
    public static void updateRoleIdUser() {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� ���� id ������������");
        Integer newRoleIdUser = input.nextInt();
        System.out.println("�������� � ID �����");
        Integer id = input.nextInt();

        user.updateRoleId(newRoleIdUser,id);
    }
    public static void updateLoginUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� ���� id ������������");
        String newNameUser = input.nextLine();
        System.out.println("�������� � ID �����");
        Integer id = input.nextInt();

        user.updateUserName(newNameUser, id);
    }

    public static void updatePasswordUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� �������� ����� ������������");
        String newNameUser = input.nextLine();
        System.out.println("�������� � ID �����");
        Integer id = input.nextInt();

        user.updateUserName(newNameUser, id);
    }
}
