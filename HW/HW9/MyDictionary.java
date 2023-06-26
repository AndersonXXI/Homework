package HW9;

public class MyDictionary <T> {
    private Object[] user;
    private int index;

    public MyDictionary() {
        user = new Object[10];
        index = 0;
    }

    public void add( Object firstElement, Object secondElement) {

        if (index == user.length) {
            Object[] newArray = new Object[user.length + 1];
            System.arraycopy(user, 0, newArray, 0, user.length);
            user = newArray;
        }

        // Додавання елемента до списку
        user[index] = firstElement;
        user[index+ 1]  = secondElement;
        index++;
    }

    public T get(int size) {
        if (index < 0 || index >= size) {
            return (T) user[size];
        } else {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
    }
    public int getIndex() {
        return index;
    }
}
