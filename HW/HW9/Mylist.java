package HW9;

public class Mylist <T> {
    private Object [] user;
    private int index;
    public Mylist(){
        user = new Object[10];
        index = 0;
    }
    public void add(T element) {

        if (index == user.length) {
            Object[] newArray = new Object[user.length + 1];
            System.arraycopy(user, 0, newArray, 0, user.length);
            user = newArray;
        }


        user[index] = element;
        index++;
    }
    public T get(int size) {
        if (size >= 0 && size < index) {
            return (T) user[size];
        } else {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
    }

    public int getIndex() {
        return index;
    }
}
