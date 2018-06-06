package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles;

import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.basicUserRole.BasicUserRole;

import java.awt.*;

public class Subscriber extends BasicUserRole{
    //Attributes:
    ///Primitive
    ///Objects
    ///Arrays
    ///Collections
    //Constructor:
    public Subscriber (int userId, double userRating, int userFriendCount, int userSubscriberCount, int userSubscriptionCount,
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
