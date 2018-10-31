import javax.xml.soap.Node;

public class MyLinkedList<E> {

    private Node head;
    private int numNodes;


    MyLinkedList(){}

    public class Node {
        private Node next;
        private Object data;

        Node(Object data){
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Object getData(){
            return data;

        }
    }

    public void add(int index, E element){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        holder = temp.getNext();
        temp.setNext(new Node(element));
        temp.getNext().setNext(holder);
        numNodes++;
    }

    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.setNext(temp);
        numNodes++;
    }

    public void addLast(E element){
        Node temp = head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(new Node(element));
        numNodes++;
    }

    public E remove(int index){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        holder = temp.getNext();
        temp.setNext(holder.getNext());
        numNodes--;
        return (E) this;
    }
    public boolean remove(E element) {
        Node temp = head;
        if (temp.getData() == element) {
            head = temp.getNext();
            numNodes--;
        } else {
            while (temp.getNext() != null) {
                if (temp.getNext().getData() == element) {
                    temp.setNext(temp.getNext().getNext());
                    numNodes--;
                    return true;
                } else {
                    temp = temp.getNext();
                }
            }
        }
        return false;
    }
    public int size(){
        return numNodes;
    }

    public E clone(){
        return (E) this;
    }

    public boolean contains(E element){
        Node temp = head;
        if(temp.getData() == element){
            return true;
        }else {
            while (temp.getNext() != null) {
                if (temp.getNext().getData() == element) {
                    return true;
                } else {
                    temp = temp.getNext();
                }
            }
            return false;
        }
    }

    public int indexOf(E element){
        Node temp = head;
        int i = 0;
        if(head.getData() == element){
            return 0;
        }else {
            if (head != null) {
                while (temp.getNext() != null) {
                    i++;
                    if (temp.getNext().getData() == element) {
                        return i;
                    } else {
                        temp = temp.getNext();
                    }
                }
            }
            return i;
        }
    }

    public boolean add(E element){
        Node temp = head;
        if(head == null){
            head = new Node(element);
        }else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(element));
        }
        numNodes++;
        return true;
    }

    public void ensureCapacity(int minCapacity){

    }

    public E get(int i){
        Node temp = head;
        int count = 0;
        if(i == 0){
            return (E) head.getData();
        }else{
            while(temp.getNext() != null){
                count ++;
                if(count == i){
                    return (E) temp.getNext().getData();
                }else{
                    temp = temp.getNext();
                }
            }
        }
        return null;
    }

    public E getFirst(){
        return (E) head.getData();
    }

    public E getLast(){
        Node temp = head;
        while(temp.getNext()!= null){
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }

    public void clear(){
        head = null;
        numNodes = 0;
    }
}