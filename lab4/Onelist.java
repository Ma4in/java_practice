import java.util.ArrayList;
import java.util.Collections;

public class Onelist
{
    private Node head;

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public void printLinkedList(){
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.print("NULL");
    }

    public void clearList(){
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        head = current;
    }

    public int lenght(){
        Node current = head;
        int lenght = 0;
        while (current != null) {
            lenght++;
            current = current.next;
        }
        return lenght;
    }

    public boolean isEmpty(){
        if (head == null){return true;}
        return false;
    }

    public void deleteFirst(){
        head = head.next;
    }

    public void deleteLast(){
        Node current = head;
        Node temp = head;
        while (current.next != null){
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
    }

    public boolean include(int value){
        Node current = head;
        while (current != null){
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public int max(){
        Node current = head;
        int max = current.data;
        while(current != null){
            if (current.data > max) max = current.data;
            current = current.next;
        }
        return max;
    }

    public int min(){
        Node current = head;
        int min = current.data;
        while(current != null){
            if (current.data < min) min = current.data;
            current = current.next;
        }
        return min;
    }


    public void deleteValue(int value){
        Node current = head;
        Node temp = head;
        while (current != null){
            if(current.next.data == value){
                System.out.println("Find");
                temp = current.next;
                current.next = null;
                current.next = temp.next;
                return;
            }
            current = current.next;
        }
    }

    public void deleteAllValue(int value){
        Node current = head;
        Node temp = head;
        while (current != null){
            if(current.next.data == value){
                System.out.println("Find");
                temp = current.next;
                current.next = null;
                current.next = temp.next;
            }
            current = current.next;
        }
    }

    public void replaceAll(int oldValue, int newValue){
        Node current = head;
        while (current != null){
            if (current.data == oldValue) current.data = newValue;
            current = current.next;
        }
    }

    public boolean isSymetric(){
        ArrayList<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null){
            list.add(current.data);
            current = current.next;
        }

        String str = list.toString();
        Collections.reverse(list);
        String revStr = list.toString();
        if(str.equals(revStr)) return true;

        return false;
    }

    public boolean deleteTwo(){
        
        ArrayList<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null){
            list.add(current.data);
            current = current.next;
        }

        int k = 0;

        for (int i=1; i<list.size(); i++){
            if (k >= 2) return false;
            if (list.get(i-1) > list.get(i) ){
                list.remove(i);
                k++;
            }
        }

        return true;
    }
    
    public int uniqCount(){
        ArrayList<Integer> uniqList = new ArrayList<>();

        Node current = head;
        while (current != null){
            if(!uniqList.contains(current.data)){
                uniqList.add(current.data);
            }
            current = current.next;
        }

        return uniqList.size();
    }

    public void deleteDoubles(){
        ArrayList<Integer> uniqList = new ArrayList<>();

        Node current = head;
        while (current != null){
            if(!uniqList.contains(current.data)){
                uniqList.add(current.data);
            }
            current = current.next;
        }
        head = null;
        current = head;
        for (int i = uniqList.size(); i > 0; i-- ){
            Node newNode = new Node();
            newNode.data = uniqList.get(i-1);
            newNode.next = head;
            head = newNode;
        }
    }

    public void reverse(){
        ArrayList<Integer> uniqList = new ArrayList<>();

        Node current = head;
        while (current != null){
            uniqList.add(current.data);
            current = current.next;
        }
        head = null;
        current = head;
        for (int i = 0; i < uniqList.size(); i++ ){
            Node newNode = new Node();
            newNode.data = uniqList.get(i);
            newNode.next = head;
            head = newNode;
        }
    }

    public void sort(){
        ArrayList<Integer> uniqList = new ArrayList<>();

        Node current = head;
        while (current != null){
            uniqList.add(current.data);
            current = current.next;
        }
        head = null;
        current = head;

        uniqList.sort(null);

        for (int i = uniqList.size(); i > 0; i-- ){
            Node newNode = new Node();
            newNode.data = uniqList.get(i-1);
            newNode.next = head;
            head = newNode;
        }
    }
}