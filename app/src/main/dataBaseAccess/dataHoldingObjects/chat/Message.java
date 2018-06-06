//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.chat;
//Imports
//Class
public class Message implements MessageInterface {
    //Attributes:
    ///Primitive
    private String chatDateTime, chatMessage;
    private int chatId, messageId, messengerId, receiverId;
    ///Objects
    ///Arrays
    ///Collections
    //Constructor:
    public Message(int chatId, int messageId, int messengerId, int receiverId, String chatDateTime, String chatMessage) {
        ///Super Constructor
        ///Initially Used Setter
        setId(chatId);
        setMessageId(messageId);
        setMessengerId(messengerId);
        setReceiverId(receiverId);
        setTimeStamp(chatDateTime);
        setText(chatMessage);
        ///Initially Used Behavior
    }
    //Setter And Getter:
    ///Private Setter
    ///Package Setter
    ///Public Setter
    @Override
    public void setId(int chatId) {
        this.chatId = chatId;
    }
    @Override
    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
    @Override
    public void setMessengerId(int messengerId) {
        this.messengerId = messengerId;
    }
    @Override
    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }
    @Override
    public void setTimeStamp(String chatDateTime) {
        this.chatDateTime = chatDateTime;
    }
    @Override
    public void setText(String chatMessage) {
        this.chatMessage = chatMessage;
    }
    ///Private Getter
    ///Package Getter
    ///Public Getter
    @Override
    public int getId() {
        return this.chatId;
    }
    @Override
    public int getMessageId() {
        return this.messageId;
    }
    @Override
    public int getMessengerId() {
        return this.messengerId;
    }
    @Override
    public int getReceiverId() {
        return this.receiverId;
    }
    @Override
    public String getTimeStamp() {
        return this.chatDateTime;
    }
    @Override
    public String getText() {
        return this.chatMessage;
    }
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}
