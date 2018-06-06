//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.basicPost;
//Imports
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.comments.Comment;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.postInterfaces.BasicPostInterface;
import instaReplicaBackEnd.dataBaseAccess.logic.generics.Generics;

import java.awt.*;
import java.util.LinkedList;
//Class
public abstract class BasicPost implements BasicPostInterface {
    //Attributes:
    ///Primitive
    private String postAuthorName, postTitle, postText, postDateTime;
    private double postRating;
    private int postId, postAuthorId, postUpVote, postDownVote;
    ///Objects
    private Generics generics;
    private Image postImage;
    ///Arrays
    ///Collections
    //Constructor:
    public BasicPost (Generics generics, int postId, int postAuthorId, String postAuthorName, String postTitle, String postText,
                      Image postImage, double postRating, int postUpVotes, int postDownVotes) {
        ///Super Constructor
        ///Initially Used Setter
        setGeneric(generics);
        setId(postId);
        setAuthorId(postAuthorId);
        setAuthorName(postAuthorName);
        setTitle(postTitle);
        setText(postText);
        setImage(postImage);
        setRating(postRating);
        setUpVotes(postUpVotes);
        setDownVotes(postDownVotes);
        ///Initially Used Behavior
    }
    //Setter And Getter:
    ///Private Setter
    ///Package Setter
    ///Public Setter
    @Override
    public void setGeneric(Generics generics) {
        this.generics = generics;
    }
    @Override
    public void setId(int postId) {
        this.postId = postId;
    }
    @Override
    public void setAuthorId(int postAuthorId) {
        this.postAuthorId = postAuthorId;
    }
    @Override
    public void setAuthorName(String postAuthorName) {
        this.postAuthorName = postAuthorName;
    }
    @Override
    public void setTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    @Override
    public void setText(String postText) {
        this.postText = postText;
    }
    @Override
    public void setImage(Image postImage) {
        this.postImage = postImage;
    }
    @Override
    public void setRating(double postRating) {
        this.postRating = postRating;
    }
    @Override
    public void setUpVotes(int postUpVotes) {
        this.postUpVote = postUpVote;
    }
    @Override
    public void setDownVotes(int postDownVotes) {
        this.postDownVote = postDownVotes;
    }
    ///Private Getter
    ///Package Getter
    ///Public Getter
    @Override
    public Generics getGenerics() {
        return this.generics;
    }
    @Override
    public int getId() {
        return this.postId;
    }
    @Override
    public String getAuthorName() {
        return this.postAuthorName;
    }
    @Override
    public int getAuthorId() {
        return this.postAuthorId;
    }
    @Override
    public String getTitle() {
        return this.postTitle;
    }
    @Override
    public String getText() {
        return postText;
    }
    @Override
    public Image getImage() {
        return postImage;
    }
    @Override
    public double getRating() {
        return postRating;
    }
    @Override
    public int getUpVotes() {
        return postUpVote;
    }
    @Override
    public int getDownVotes() {
        return postDownVote;
    }
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}
