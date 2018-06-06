//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.postInterfaces;
//Imports

import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.comments.Comment;
import instaReplicaBackEnd.dataBaseAccess.logic.generics.Generics;

import java.awt.*;
import java.util.LinkedList;

//Interface
public interface BasicPostInterface {
    //Setter
    void setGeneric(Generics generics);
    void setId(int postId);
    void setAuthorId(int postAuthorId);
    void setAuthorName(String postAuthorName);
    void setTitle(String postTitle);
    void setText(String postText);
    void setImage(Image postImage);
    void setRating(double postRating);
    void setUpVotes(int postUpVotes);
    void setDownVotes(int postDownVotes);
    void setComments(LinkedList<Comment> postComments);
    //Getter
    Generics getGenerics();
    int getId();
    int getAuthorId();
    String getAuthorName();
    String getTitle();
    String getText();
    Image getImage();
    double getRating();
    int getUpVotes();
    int getDownVotes();
    LinkedList<Comment> getComments();
}
