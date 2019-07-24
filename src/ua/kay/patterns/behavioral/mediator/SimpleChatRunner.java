package ua.kay.patterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User_1");
        User user2 = new SimpleUser(chat, "User_2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello! I am User_1.");
        admin.sendMessage("I am ADMINISTRATOR.");
    }
}
