//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.userRoleInterfaces;
//Imports
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.chat.Message;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.WallPost;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.Friend;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.posts.Story;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.Subscription;
import instaReplicaBackEnd.dataBaseAccess.dataHoldingObjects.userRoles.Subscriber;
import instaReplicaBackEnd.dataBaseAccess.logic.generics.Generics;

import java.util.HashMap;
import java.util.LinkedList;
//Interface
public interface UserInterface {
    //Setter
    void setGenerics(Generics generics);
    void setStory(Story userStory);
    void setFriends(LinkedList<Friend> friends);
    void setSubscribers(LinkedList<Subscriber> subscriber);
    void setSubscribed(LinkedList<Subscription> subscripted);
    void setFriendStories(LinkedList<Story> friendStories);
    void setSubscriptionWallPosts(HashMap<Integer, LinkedList<WallPost>> subscriptionWallPosts);
    void setChats(HashMap<Integer, LinkedList<Message>> chats);
    //Getter
    Generics getGenerics();
    Story getStory();
    LinkedList<Friend> getFriends();
    LinkedList<Subscriber> getSubscribers();
    LinkedList<Subscription> getSubscription();
    LinkedList<Story> getFriendsStories();
    HashMap<Integer, LinkedList<WallPost>> getSubscriptionWallPosts();
    HashMap<Integer, LinkedList<Message>> getChats();
}
