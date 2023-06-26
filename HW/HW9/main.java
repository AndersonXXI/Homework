package HW9;

public class main {
    public static void main(String[] args) {
        Mylist<String> myList = new Mylist<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println(myList.get(1)); // Виведе "Banana"
        System.out.println(myList.getIndex()); // Виведе 3

    }
}
