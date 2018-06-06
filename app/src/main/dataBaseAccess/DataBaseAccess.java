//Package Dependency
package instaReplicaBackEnd.dataBaseAccess;
//Imports
import instaReplicaBackEnd.dataBaseAccess.logic.generics.Generics;
import instaReplicaBackEnd.dataBaseAccess.logic.externalDatabaseConnection.UpdateHandler;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.User;
import instaReplicaBackEnd.dataBaseAccess.logic.internalDataBaseConnection.DataBaseHandler;

//Class
public class DataBaseAccess implements DataBaseAccessInterface {
    //Attributes:
    ///Primitive
    ///Objects
    private Generics generics;
    private UpdateHandler phpConnection;
    private DataBaseHandler dataBaseConnection;
    private User user;
    ///Arrays
    ///Collections
    //Constructor:
    public DataBaseAccess () {
        ///Super Constructor
        ///Initially Used Setter
        setGenerics(new Generics());
        setUpdateHandler(new UpdateHandler());
        setDataBaseHandler(new DataBaseHandler());
        setUser(new User(getGenerics()));
        ///Initially Used Behavior
    }
    //Setter And Getter:
    ///Private Setter
    ///Package Setter
    ///Public Setter
    @Override
    public void setGenerics(Generics generics) {
        this.generics = generics;
    }
    @Override
    public void setUpdateHandler(UpdateHandler phpConnection) {
        this.phpConnection = phpConnection;
    }
    @Override
    public void setDataBaseHandler(DataBaseHandler dataBaseConnection) {
        this.dataBaseConnection = dataBaseConnection;
    }
    @Override
    public void setUser(User user) {
        this.user = user;
    }
    ///Private Getter
    ///Package Getter
    ///Public Getter
    @Override
    public Generics getGenerics() {
        return this.generics;
    }
    @Override
    public UpdateHandler getUpdateHandler() {
        return this.phpConnection;
    }
    @Override
    public DataBaseHandler getDataBaseHandler() {
        return this.dataBaseConnection;
    }
    @Override
    public User getUser() {
        return this.user;
    }
    @Override
    public int checkLogin() {
        return 0;
    }
    @Override
    public void fetchUserInformation() {

    }
    @Override
    public void fetchFriends() {

    }
    @Override
    public void fetchFriendsStories() {

    }
    @Override
    public void fetchFriendStory(int friendId) {

    }
    @Override
    public void fetchSubscribers() {

    }
    @Override
    public void fetchSubscription() {

    }
    @Override
    public void fetchSubscriptionPosts() {

    }
    @Override
    public void fetchSubscriptionsPosts(int subscriptionId) {

    }
    @Override
    public void fetchAdditionalSubscriptionPosts() {

    }
    @Override
    public void fetchChats() {

    }
    @Override
    public void fetchChat(int chatId) {

    }
    @Override
    public void addFriend(int friendId) {

    }
    @Override
    public void deleteFriend(int friendId) {

    }
    @Override
    public void commitStory() {

    }
    @Override
    public void commitWallPost() {

    }
    @Override
    public void commentStory() {

    }
    @Override
    public void commentWallPost() {

    }
    @Override
    public void messageUser() {

    }
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}