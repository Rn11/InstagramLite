//Package Dependency
package instaReplicaBackEnd.dataBaseAccess.logic.generics;

import java.util.*;

//Imports
//Class
public class Generics implements GenericsInterface{
    //Attributes
    ///Collections
    //Attributes:
    ///Primitive
    ///Objects
    ///Arrays
    ///Collections
    private LinkedList<?> removeList;
    private HashMap<?, ?> userInformation;
    //Constructor:
    public Generics () {
        ///Super Constructor
        ///Initially Used Setter
        setUserInformation(new HashMap<>());
        ///Initially Used Behavior
    }
    //Setter
    @Override
    public void setRemoveList(LinkedList<?> removeList) { this.removeList = removeList; }
    @Override
    public void setUserInformation(HashMap<?, ?> userInformation) { this.userInformation = userInformation; }
    //Getter
    @Override
    public LinkedList<?> getRemoveList() { return this.removeList; }
    @Override
    public HashMap<?, ?> getUserInformation() { return this.userInformation; }
    //Behavior
    @Override
    public void addElementToHashMap(HashMap<Object, Object> hashMap, Object key, Object value) {
        hashMap.put(key, value);
    }
    @Override
    public void addElementToList(LinkedList<Object> list, Object element) {
        list.add(element);
    }
    @Override
    public void replaceElementInHashMap(HashMap<Object, Object> hashMap, Object key, Object value) {
        hashMap.replace(key, value);
    }
    @SuppressWarnings("unchecked")
    @Override
    public void removeElementFromList(LinkedList<?> list, Object element) {
        setRemoveList(new LinkedList<>());
        addElementToList((LinkedList<Object>) getRemoveList(), element);
        list.remove(getRemoveList());
    }
    @Override
    public void sortLinkedListByInteger(LinkedList<Object> list) {

    }
    @Override
    public void sortLinkedListByString(LinkedList<Object> list) {

    }
}
