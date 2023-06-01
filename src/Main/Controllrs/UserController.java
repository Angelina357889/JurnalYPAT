package Main.Controllrs;

import Main.Models.Roles;
import Main.Models.User;

import java.sql.SQLException;
import java.util.Scanner;

public class UserController extends User{
    private static User user;

    public static void getAllUsers() throws SQLException, ClassNotFoundException {
        User user = new User();
        System.out.println("Все пользователи");
        System.out.println("№ | Роль | Имя | Логин |  Пароль |");
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

        System.out.println("Введите Имя пользователя");
        String name = input.nextLine();
        System.out.println("Введите ЛОГИН пользователя");
        String login = input.nextLine();
        System.out.println("Введите Пароль пользователя");
        String password = input.nextLine();
        System.out.println("Введите Роль пользователя");
        Integer roleId = input.nextInt();

        user.add(roleId, name, login, password);
    }

    public static void updateNameUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите новое название имени пользователя");
        String newNameUser = input.nextLine();
        System.out.println("Выберите № ID имени");
        Integer id = input.nextInt();

        user.updateUserName(newNameUser, id);
    }
    public static void updateRoleIdUser() {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите новую роль id пользователя");
        Integer newRoleIdUser = input.nextInt();
        System.out.println("Выберите № ID имени");
        Integer id = input.nextInt();

        user.updateRoleId(newRoleIdUser,id);
    }
    public static void updateLoginUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите новую роль id пользователя");
        String newNameUser = input.nextLine();
        System.out.println("Выберите № ID имени");
        Integer id = input.nextInt();

        user.updateUserName(newNameUser, id);
    }

    public static void updatePasswordUser() throws SQLException, ClassNotFoundException {
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите новое название имени пользователя");
        String newNameUser = input.nextLine();
        System.out.println("Выберите № ID имени");
        Integer id = input.nextInt();

        user.updateUserName(newNameUser, id);
    }
}
