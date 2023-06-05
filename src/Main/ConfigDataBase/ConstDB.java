package Main.ConfigDataBase;

public class ConstDB {
    //константы обозначающие имя таблицы Roles и её столбцы(поля)
    public static final String ROLE_TABLE = "Roles";
    public static final String ROLE_TABLE_ID = "id";
    public static final String ROLE_TABLE_NAME = "name";

    public static final String TABLE_USERS = "Users";
    public static final String TABLE_USERS_NAME = "name";
    public static final String TABLE_USERS_ID = "id";
    public static final String TABLE_USERS_ROLE_ID = "role_id";
    public static final String TABLE_USERS_PASSWORD = "password";
    public static final String TABLE_USERS_LOGIN = "login";

    public static final String TABLE_DIST = "Disciplines";
    public static final String TABLE_DIST_ID = "id";
    public static final String TABLE_DIST_NAME = "name";


    public static final String TABLE_MESSAGES = "messages";
    public static final String TABLE_MESSAGES_ID = "id";
    public static final String TABLE_MESSAGES_USER_ID = "user_id";
    public static final String TABLE_MESSAGES_TITLE = "title";
    public static final String TABLE_MESSAGES_PATH_FILE = "path_file";
    public static final String TABLE_MESSAGES_DATE_OF_CREATION = "dateOfCreation";
    public static final String TABLE_MESSAGES_TEXT = "text";
    public static final String TABLE_MESSAGES_USER_RECIPIENT_ID = "userRecipientId";

}
