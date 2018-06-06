//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.comments;
//Imports
//Interface
public interface CommentInterface {
    //Setter
    void setId(int commentId);
    void setAuthorId(int commentAuthorId);
    void setAuthorName(String commentAuthorName);
    void setPostId(int commentPostId);
    void setText(String commentText);
    void setTimeStamp(String dateTime);
    //Getter
    int getId();
    int getAuthorId();
    String getAuthorName();
    int getPostId();
    String getText();
    String getTimeStamp();
}
