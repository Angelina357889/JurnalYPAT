package Main.Controllrs;

import Main.Models.Roles;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Scanner;

public class RoleController extends Roles {

    public static void getAllRoles() throws SQLException, ClassNotFoundException {
        Roles role = new Roles();

        System.out.println("Все роли пользователей в журнале");
        System.out.println("№ | Имя роли");
        System.out.println("-------------------------");
        //Длина ------ находится с помощью метода size()
        role.allRoles().forEach((Integer id, String name) ->
        {
            System.out.println(id + " | " + name);
        }
        );
    }
    public static void getOneRole (Integer id) throws SQLException, ClassNotFoundException {
        Roles role = new Roles();
        System.out.println("№ | Имя РОЛИ");
        System.out.print(role.oneRole().getId() + " | " + role.oneRole().getName());
        System.out.println();
    }
    public static void addRole() throws SQLException, ClassNotFoundException, InvocationTargetException {
        Roles roleOnq = new Roles();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название РОЛИ");
        String name = input.nextLine();
        roleOnq.add(name);
    }

    public static void updateRole () throws SQLException, ClassNotFoundException {
        Roles role = new Roles();
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите № ID РОЛИ");
        Integer id = input.nextInt();
        System.out.println("Введите новое название роли");
        String newName = input.nextLine();
        role.update(id,newName);

    }

    public static void deleteRole () throws SQLException, ClassNotFoundException {
        Roles role = new Roles();
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите № ID РОЛИ, которую надо УДАЛИТЬ");
        Integer id = input.nextInt();
        role.delete(id);
    }


}
