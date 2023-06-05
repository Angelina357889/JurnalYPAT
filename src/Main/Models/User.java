package Main.Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static Main.ConfigDataBase.ConstDB.*;
import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;


public class User {

    //Поля данных
    private Integer idUser;
    private Integer roleId;
    private String nameUser;
    private String lofinUser;
    private String passwordUser;

    //Конструкторы
    public User() {
    }

    public User(Integer idUser,
                Integer roleId,
                int user_id,
                String nameUser,
                String lofinUser,
                String passwordUser,
                String title) {
        this.idUser = idUser;
        this.roleId = roleId;
        this.nameUser = nameUser;
        this.lofinUser = lofinUser;
        this.passwordUser = passwordUser;
    }

    //Методы ввывода всех записей
    //Массив объекта\ массив Экземпляра класса User
    public User[] getAll() throws SQLException, ClassNotFoundException {

        //запрос на получения кол-во записей (строк) Таблицы - длинна массива
        String sql = "SELECT COUNT(*) AS count FROM " + TABLE_USERS;

        Statement statement = getDbConnect().createStatement();
        ResultSet countDB = statement.executeQuery(sql);
        Integer countUsers = 0;
        while (countDB.next()) {
            countUsers = countDB.getInt("count");
        }
        User[] users = new User[countUsers];
        //запрос на получение записей таблицы
        String query = "SELECT * FROM " + TABLE_USERS;
        ResultSet result = statement.executeQuery(query);
        int i = 0;
        while (result.next()) {
            users[i] = new User(
                    result.getInt("id"),
                    result.getInt("role_id"),
                    result.getInt("user_id"),
                    result.getString("name"),
                    result.getString("login"),
                    result.getString("password"),
                    result.getString("title"));

            i++;
        }
        return users;
    }

    //Методы ввывода одной записей

    //Методы добавления одной записи
    public void add(Integer role_Id, String nameUser, String loginUser, String passwordUser) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO " + TABLE_USERS + " (" + TABLE_USERS_ROLE_ID + ", "
                + TABLE_USERS_NAME + ", "
                + TABLE_USERS_LOGIN + ", "
                + TABLE_USERS_PASSWORD + ")   VALUES  ("
                + role_Id + ",'" + nameUser + "', '" + loginUser + "', '" + passwordUser + "')";
        System.out.println(query);

        Statement statement = getDbConnect().createStatement();

        statement.executeUpdate(query);
    }

    //Методы обновления одной записей
    public void updateUserName(String nameUser, Integer id) throws SQLException, ClassNotFoundException {
        String query = "UPDATE " + TABLE_USERS + " SET " + TABLE_USERS_NAME + " = '" + nameUser + "' WHERE " + ROLE_TABLE_ID + " = " + id + "";
        Statement statement = getDbConnect().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);
    }

    public void updateRoleId(Integer sword, Integer id) throws SQLException, ClassNotFoundException {
        String query = "UPDATE " + TABLE_USERS + " SET " +  ROLE_TABLE_ID  + " = " + sword + " WHERE " + TABLE_USERS_ROLE_ID + " = " + id + "";
        Statement statement = getDbConnect().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);
    }

    public void updateUserLogin(String lofinUser, Integer id) throws SQLException, ClassNotFoundException {
        String query = "UPDATE " + TABLE_USERS + " SET " + TABLE_USERS_LOGIN + " = '" + lofinUser + "' WHERE " + ROLE_TABLE_ID + " = " + id + "";
        Statement statement = getDbConnect().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);
    }

    public void updateUserPassword(String passwordUser, Integer id) throws SQLException, ClassNotFoundException {
        String query = "UPDATE " + TABLE_USERS + " SET " + TABLE_USERS_PASSWORD + " = '" + passwordUser + "' WHERE " + ROLE_TABLE_ID + " = " + id + "";
        Statement statement = getDbConnect().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);
    }

    //Методы удаления одной записей
public void delete(Integer userId) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM " + TABLE_USERS + "WHERE " + TABLE_USERS_ID + "=" + userId;
    Statement statement = getDbConnect().createStatement();
    System.out.println(query);
    statement.executeUpdate(query);
}

    //Геттеры


    public Integer getIdUser() {
        return idUser;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public String getLofinUser() {
        return lofinUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }
}
