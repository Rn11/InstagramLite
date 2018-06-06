//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.logic.generics;
//Imports

import java.util.HashMap;
import java.util.LinkedList;

//Interface
public interface GenericsInterface {
    void setRemoveList(LinkedList<?> removeList);
    void setUserInformation(HashMap<?, ?> userInformation);
    LinkedList<?> getRemoveList();
    HashMap<?, ?> getUserInformation();
    void addElementToHashMap(HashMap<Object, Object> hashMap, Object key, Object value);
    void addElementToList(LinkedList<Object> list, Object element);
    void replaceElementInHashMap(HashMap<Object, Object> hashMap, Object key, Object value);
    void removeElementFromList(LinkedList<?> list, Object element);
    void sortLinkedListByInteger(LinkedList<Object> list);
    void sortLinkedListByString(LinkedList<Object> list);
}
