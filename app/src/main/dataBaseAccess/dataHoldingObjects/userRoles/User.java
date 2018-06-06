//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles;
//Imports
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.chat.Message;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.Story;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.WallPost;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.basicUserRole.BasicUserRole;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.userRoleInterfaces.UserInterface;
import instaReplicaBackEnd.dataBaseAccess.logic.generics.Generics;

import java.util.HashMap;
import java.util.LinkedList;
//Class
public class User extends BasicUserRole implements UserInterface {
    //Attributes:
    ///Primitive
    ///Objects
    private Generics generics;
    private Story userStory;
    ///Arrays
    ///Collections
    //Constructor:
    public User (Generics generics) {
        ///Super Constructor
        ///Initially Used Setter
        setGenerics(generics);
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
    public void setStory(Story userStory) {
        this.userStory = userStory;
    }
    @SuppressWarnings("unchecked")
    @Override
    public void setFriends(LinkedList<Friend> friends) {
        getGenerics().addElementToHashMap((HashMap<Object, Object>) getGenerics().getUserInformation(), "friends", friends);
    }
    @SuppressWarnings("unchecked")
    @Override
    public void setSubscribers(LinkedList<Subscriber> subscribers) {
        getGenerics().addElementToHashMap((HashMap<Object, Object>) getGenerics().getUserInformation(), "subscribers", subscribers);
    }
    @SuppressWarnings("unchecked")
    @Override
    public void setSubscribed(LinkedList<Subscription> subscripted) {
        getGenerics().addElementToHashMap((HashMap<Object, Object>) getGenerics().getUserInformation(), "subscripted", subscripted);
    }
    @SuppressWarnings("unchecked")
    @Override
    public void setFriendStories(LinkedList<Story> friendStories) {
        getGenerics().addElementToHashMap((HashMap<Object, Object>) getGenerics().getUserInformation(), "friendStories", friendStories);
    }
    @SuppressWarnings("unchecked")
    @Override
    public void setSubscriptionWallPosts(HashMap<Integer, LinkedList<WallPost>> subscriptionWallPosts) {
        getGenerics().addElementToHashMap((HashMap<Object, Object>) getGenerics().getUserInformation(), "subscriptionWallPosts", subscriptionWallPosts);
    }
    @SuppressWarnings("unchecked")
    @Override
    public void setChats(HashMap<Integer, LinkedList<Message>> chats) {
        getGenerics().addElementToHashMap((HashMap<Object, Object>) getGenerics().getUserInformation(), "chats", chats);
    }
    ///Private Getter
    ///Package Getter
    ///Public Getter
    @Override
    public Generics getGenerics() {
        return this.generics;
    }
    @Override
    public Story getStory() {
        return this.userStory;
    }
    @SuppressWarnings("unchecked")
    @Override
    public LinkedList<Friend> getFriends() {
        return (LinkedList<Friend>) getGenerics().getUserInformation().get("friends");
    }
    @SuppressWarnings("unchecked")
    @Override
    public LinkedList<Subscriber> getSubscribers() {
        return (LinkedList<Subscriber>) getGenerics().getUserInformation().get("subscribers");
    }
    @SuppressWarnings("unchecked")
    @Override
    public LinkedList<Subscription> getSubscription() {
        return (LinkedList<Subscription>) getGenerics().getUserInformation().get("subscription");
    }
    @SuppressWarnings("unchecked")
    @Override
    public LinkedList<Story> getFriendsStories() {
        return (LinkedList<Story>) getGenerics().getUserInformation().get("friendStories");
    }
    @SuppressWarnings("unchecked")
    @Override
    public HashMap<Integer, LinkedList<WallPost>> getSubscriptionWallPosts() {
        return (HashMap<Integer, LinkedList<WallPost>>) getGenerics().getUserInformation().get("subscriptionWallPosts");
    }
    @SuppressWarnings("unchecked")
    @Override
    public HashMap<Integer, LinkedList<Message>> getChats() {
        return (HashMap<Integer, LinkedList<Message>>) getGenerics().getUserInformation().get("subscriptionWallPosts");
    }
    //Behavior:
    ///Private Behavior
    ///Package Behavior
    ///Public Behavior
}
