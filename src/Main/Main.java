package Main;

import Main.Controllrs.UserController;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Scanner;

import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;
import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;
import static Main.Controllrs.UserController.*;
import static Main.Controllrs.UserController.updateRoleIdUser;
import static Main.Controllrs.disceplineController.getTest;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, SQLException, InvocationTargetException {
        //����� ���� �����
        // getAllRoles();
        //�������� ���� updateRole();
        //deleteRole();
        //������� ���� ������
        //  Scanner input = new Scanner(System.in);
        //Integer id = input.nextInt();
        //getOneRole(id);
        //����� ������������
        //getAllUsers();
        //����� ���� �����
        // getAllUsers();
        // updateRoleIdUser();
        //  getAllUsers();
        getTest();

    }


}
