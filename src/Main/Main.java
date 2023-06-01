package Main;

import Main.Controllrs.UserController;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Scanner;

import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;
import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;
import static Main.Controllrs.UserController.*;
import static Main.Controllrs.UserController.updateRoleIdUser;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, SQLException, InvocationTargetException {
        //вывод всех ролей
        // getAllRoles();
        //обновить роль updateRole();

        //deleteRole();
        //вывести одну запись
        //  Scanner input = new Scanner(System.in);
        //Integer id = input.nextInt();
        //getOneRole(id);
        //вывод пользователя
        //getAllUsers();
        //вывод всех ролей
        getAllUsers();
        updateRoleIdUser();
        getAllUsers();


    }



}
