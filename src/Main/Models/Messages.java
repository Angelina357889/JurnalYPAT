package Main.Models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static Main.ConfigDataBase.ConstDB.*;

import static Main.ConfigDataBase.DateBaseConnection.getDbConnect;

public class Messages {

    private Integer id;
    private Integer dateOfCreation;
    public String pathFile;
    public String text;
    public String title;
    public Integer user_id;
    public Integer userRecipientId;

    //контролеры
    public Messages(int id, Integer dateOfCreation, Integer user_id, Integer userRecipientId, String pathFile, String text, String title) {}

    public Messages(Integer id,
                    Integer dateOfCreation,
                    Integer user_id,
                    Integer userRecipientId,
                    String pathFile,
                    String text,
                    String title
    ) {
        this.id = id;
        this.dateOfCreation = dateOfCreation;
        this.pathFile = pathFile;
        this.text = text;
        this.title = title;
        this.user_id = user_id;
        this.userRecipientId = userRecipientId;
    }

    public Messages() {

    }

    public Messages(int id, int user_id, int anInt, int anInt1, String string, String string1, String string2) {
    }


    public ArrayList<Messages> allMessages() throws SQLException, ClassNotFoundException {
        ArrayList<Messages> messages1 = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE_MESSAGES;

        Statement statement = getDbConnect().createStatement();

        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            messages1.add(new Messages(resultSet.getInt("id"),
                    resultSet.getInt("user_id"),
                    resultSet.getInt(TABLE_MESSAGES_DATE_OF_CREATION),
                    resultSet.getInt(TABLE_MESSAGES_USER_RECIPIENT_ID),
                    resultSet.getString(TABLE_MESSAGES_PATH_FILE),
                    resultSet.getString(TABLE_MESSAGES_TEXT),
                    resultSet.getString(TABLE_MESSAGES_TITLE)
            ));
        }
        return messages1;
    }
    public Integer getId() {
        return id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Integer getDateOfCreation() {
        return dateOfCreation;
    }

    public Integer getUserRecipientId() {
        return userRecipientId;
    }

    public String getPathFile() {
        return pathFile;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

}


