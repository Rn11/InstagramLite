//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.basicUserRole;
//Imports
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.userRoleInterfaces.BasicUserRoleInterface;

import java.awt.*;
//Class
public abstract class BasicUserRole implements BasicUserRoleInterface {
    //Attributes:
    ///Primitive
    private String userName;
    private double userRating;
    private int userId, userNumberOfFriends, userNumberOfsSubscribers, userNumberOfsSubscriptions;
    ///Objects
    private Image userImage;
    ///Arrays
    ///Collections
    //Constructor:
    public BasicUserRole() {
        ///Super Constructor
        ///Initially Used Setter
        ///Initially Used Behavior
    }
    //Setter And Getter:
    ///Private Setter
    ///Package Setter
    ///Public Setter
    @Override
    public void setId(int userId) {
        this.userId = userId;
    }
    @Override
    public void setRating(double userRating) {
        this.userRating = userRating;
    }
    @Override
    public void setNumberOfFriends(int userFriendCount) {
        this.userNumberOfFriends = userFriendCount;
    }
    @Override
    public void setNumberOfSubscribers(int userSubscriberCount) {
        this.userNumberOfsSubscribers = userSubscriberCount;
    }
    @Override
    public void setNumberOfSubscriptions(int userSubscriptionCount) {
        this.userNumberOfsSubscriptions = userSubscriptionCount;
    }
    @Override
    public void setName(String userName) {
        this.userName = userName;
    }
    @Override
    public void setImage(Image userImage) {
        this.userImage = userImage;
    }
    ///Private Getter
    ///Package Getter
    ///Public Getter
    @Override
    public int getId() {
        return this.userId;
    }
    @Override
    public double getRating() {
        return this.userRating;
    }
    @Override
    public int getNumberOfFriends() {
        return this.userNumberOfFriends;
    }
    @Override
    public int getNumberOfSubscribers() {
        return this.userNumberOfsSubscribers;
    }
    @Override
    public int getNumberOfSubscriptions() {
        return this.userNumberOfsSubscriptions;
    }
    @Override
    public String getName() {
        return this.userName;
    }
    @Override
    public Image getImage() {
        return this.userImage;
    }
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}
