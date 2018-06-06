//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles;

import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.basicUserRole.BasicUserRole;

import java.awt.*;

//Imports
//Class
public class Friend extends BasicUserRole{
    //Attributes:
    ///Primitive
    ///Objects
    ///Arrays
    ///Collections
    //Constructor:
    public Friend (int userId, double userRating, int userFriendCount, int userSubscriberCount, int userSubscriptionCount,
                   String userName, Image userImage) {
        ///Super Constructor
        super();
        ///Initially Used Setter
        setId(userId);
        setRating(userRating);
        setNumberOfFriends(userFriendCount);
        setNumberOfSubscribers(userSubscriberCount);
        setNumberOfSubscriptions(userSubscriptionCount);
        setName(userName);
        setImage(userImage);
        ///Initially Used Behavior
    }
    //Setter And Getter:
    ///Private Setter
    ///Package Setter
    ///Public Setter
    ///Private Getter
    ///Package Getter
    ///Public Getter
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}
