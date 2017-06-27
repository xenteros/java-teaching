package custom.list.model;

/**
 * Created by agurgul on 27.06.2017.
 */
public class MyGenericList<T> {

    private T value;
    private MyGenericList<T> nextElement;

    public MyGenericList(T value) {
        this.value = value;
    }

    public void addRecursive(T element) {
        if (nextElement == null) {
            nextElement = new MyGenericList<>(element);
        } else {
            nextElement.addRecursive(element);
        }
    }

    public void addInterative(T element) {
        if (nextElement == null) {
            nextElement = new MyGenericList<>(element);
        } else {
            MyGenericList<T> curentlyWatched = nextElement;
            while (curentlyWatched.nextElement != null) {
                curentlyWatched = curentlyWatched.nextElement;
            }
            curentlyWatched.nextElement = new MyGenericList<>(element);
        }
    }

    public void print() {
        System.out.println(value.toString());
        if (nextElement != null) {
            nextElement.print();
        }
    }

}
