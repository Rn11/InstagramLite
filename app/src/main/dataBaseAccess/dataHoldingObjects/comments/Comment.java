//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.comments;
//Imports
//Class
public class Comment implements CommentInterface {
    //Attributes:
    ///Primitive
    private String commentAuthorName,  commentText, commentDateTime;
    private int commentId, commentAuthorId, commentPostId;
    ///Objects
    ///Arrays
    ///Collections
    //Constructor:
    public Comment (int commentId, int commentAuthorId, String commentAuthorName,int commentPostId, String commentText, String commentDateTime) {
        ///Super Constructor
        ///Initially Used Setter
        setId(commentId);
        setAuthorId(commentAuthorId);
        setAuthorName(commentAuthorName);
        setPostId(commentPostId);
        setText(commentText);
        setTimeStamp(commentDateTime);
        ///Initially Used Behavior
    }
    //Setter And Getter:
    ///Private Setter
    ///Package Setter
    ///Public Setter
    @Override
    public void setId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public void setAuthorId(int commentAuthorId) {
        this.commentAuthorId = commentAuthorId;
    }

    @Override
    public void setAuthorName(String commentAuthorName) {
        this.commentAuthorName = commentAuthorName;
    }

    @Override
    public void setPostId(int commentPostId) {
        this.commentPostId = commentPostId;
    }

    @Override
    public void setText(String commentText) {
        this.commentText = commentText;
    }

    @Override
    public void setTimeStamp(String commentDateTime) {
        this.commentDateTime = commentDateTime;
    }

    ///Private Getter
    ///Package Getter
    ///Public Getter
    @Override
    public int getId() {
        return this.commentId;
    }

    @Override
    public int getAuthorId() {
        return this.commentAuthorId;
    }

    @Override
    public String getAuthorName() {
        return this.commentAuthorName;
    }

    @Override
    public int getPostId() {
        return this.commentPostId;
    }

    @Override
    public String getText() {
        return this.commentText;
    }

    @Override
    public String getTimeStamp() {
        return this.commentDateTime;
    }
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}
