//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.userRoleInterfaces;
//Imports
import java.awt.*;
//Interface
public interface BasicUserRoleInterface {
    //Setter
    void setId(int userId);
    void setRating(double userRating);
    void setNumberOfFriends(int userFriendCount);
    void setNumberOfSubscribers(int userSubscriberCount);
    void setNumberOfSubscriptions(int userSubscriptionCount);
    void setName(String userName);
    void setImage(Image userImage);
    //Getter
    int getId();
    double getRating();
    int getNumberOfFriends();
    int getNumberOfSubscribers();
    int getNumberOfSubscriptions();
    String getName();
    Image getImage();
}
