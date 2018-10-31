public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("=====TEST========");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(1, 4);
        myLinkedList.addFirst(5);
        myLinkedList.addLast(6);
        myLinkedList.remove(1);
        Integer a = 6;
        myLinkedList.remove(a);
        System.out.println(myLinkedList.size());
        Integer b = 4;
        System.out.println(myLinkedList.contains(b));
        Integer c = 3;
        System.out.println(myLinkedList.indexOf(c));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        myLinkedList.clear();
        System.out.println();
    }
}
