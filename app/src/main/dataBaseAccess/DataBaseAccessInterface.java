//Package Dependency
package instaReplicaBackEnd.dataBaseAccess;
//Imports
import instaReplicaBackEnd.dataBaseAccess.logic.generics.Generics;
import instaReplicaBackEnd.dataBaseAccess.logic.externalDatabaseConnection.UpdateHandler;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.User;
import instaReplicaBackEnd.dataBaseAccess.logic.internalDataBaseConnection.DataBaseHandler;


//Interface
public interface DataBaseAccessInterface {
    //Setter
    void setGenerics(Generics generics);
    void setUpdateHandler(UpdateHandler phpConnection);
    void setDataBaseHandler(DataBaseHandler dataBaseConnection);
    void setUser(User user);
    //Getter
    Generics getGenerics();
    UpdateHandler getUpdateHandler();
    DataBaseHandler getDataBaseHandler();
    User getUser();
    //Behavior
    int checkLogin();
    //Retrieving Data From Data Base
    void fetchUserInformation();
    void fetchFriends();
    void fetchFriendsStories();
    void fetchFriendStory(int friendId);
    void fetchSubscribers();
    void fetchSubscription();
    void fetchSubscriptionPosts();
    void fetchSubscriptionsPosts(int subscriptionId);
    void fetchAdditionalSubscriptionPosts();
    void fetchChats();
    void fetchChat(int chatId);
    //Uploading Data To Data Base
    void addFriend(int friendId);
    void deleteFriend(int friendId);
    void commitStory();
    void commitWallPost();
    void commentStory();
    void commentWallPost();
    void messageUser();
}
