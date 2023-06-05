package Main.Controllrs;

import Main.Models.Discipline;
import Main.Models.Messages;

import java.sql.SQLException;
import java.util.ArrayList;

public class MessaggesController extends Messages {
    public static void getAllMessanges() throws SQLException, ClassNotFoundException {
        Messages messages = new Messages();

        System.out.println("Messages");
        System.out.println("-------------------------");

        ArrayList<Messages> array = messages.allMessages();

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getId() + " | " + array.get(i).getDateOfCreation()
                    + " | " + array.get(i).getUser_id() + " | " + array.get(i).getUserRecipientId()
                    + " | " + array.get(i).getText()+ " | " + array.get(i).getPathFile()
                    + " | " + array.get(i).getTitle());
        }

    }

}
