//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.chat;
//Imports
//Interface
public interface MessageInterface {
    //Setter
    void setId(int chatId);
    void setMessageId(int messageId);
    void setMessengerId(int messengerId);
    void setReceiverId(int receiverId);
    void setTimeStamp(String chatDateTime);
    void setText(String chatMessage);
    //Getter
    int getId();
    int getMessageId();
    int getMessengerId();
    int getReceiverId();
    String getTimeStamp();
    String getText();
}
