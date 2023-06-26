package HW9;

public class main2 {
    public static void main(String[] args) {
        MyDictionary myList = new MyDictionary();
        myList.add("елемент 1", "елемент 2");
        myList.add("елемент 3", "елемент 4");

        System.out.println(myList.get(0));  // виведе "елемент 1"
        System.out.println(myList.get(1));  // виведе "елемент 2"
        System.out.println(myList.get(2));  // виведе "елемент 3"
        System.out.println(myList.get(3));
    }
}
