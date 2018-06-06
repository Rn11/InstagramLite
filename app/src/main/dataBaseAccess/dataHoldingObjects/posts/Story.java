//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts;
//Imports
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.comments.Comment;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.basicPost.BasicPost;
import instaReplicaBackEnd.dataBaseAccess.logic.generics.Generics;

import java.awt.*;
import java.util.HashMap;
import java.util.LinkedList;
//Class
public class Story extends BasicPost {
    //Attributes:
    ///Primitive
    ///Objects
    ///Arrays
    ///Collections
    //Constructor:
    public Story (Generics generics, int postId, int postAuthorId, String postAuthorName, String postTitle, String postText,
                  Image postImage, double postRating, int postUpVotes, int postDownVotes, LinkedList<Comment> comments) {
        ///Super Constructor
        super(generics, postId, postAuthorId, postAuthorName, postTitle ,postText, postImage, postRating, postUpVotes, postDownVotes);
        ///Initially Used Setter
        setComments(comments);
        ///Initially Used Behavior
    }
    //Setter And Getter:
    ///Private Setter
    ///Package Setter
    ///Public Setter
    @SuppressWarnings("unchecked")
    @Override
    public void setComments(LinkedList<Comment> storyComments) {
        getGenerics().addElementToHashMap((HashMap<Object, Object>) getGenerics().getUserInformation().get("storyComments"), getId(), storyComments);
    }
    ///Private Getter
    ///Package Getter
    ///Public Getter
    @SuppressWarnings("unchecked")
    @Override
    public LinkedList<Comment> getComments() {
        HashMap<Object, Object> returnList = (HashMap<Object, Object>) getGenerics().getUserInformation().get("storyComments");
        return (LinkedList<Comment>) returnList.get(getId());
    }
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}
