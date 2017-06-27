package binary.search.tree.model;

/**
 * Created by agurgul on 27.06.2017.
 */
public class Tree<T extends Comparable> {

    private Node<T> root;

    public Tree() {
    }

    public void add(T value){
        if (root == null){
            root = new Node<>(value);
        }else{
            root.add(value);
        }
    }
    public void printInOrder(){
        root.printInOrder();
    }
    public void printPreOrder(){
        root.printPreOrder();
    }

    public T get(T value){
        return root.get(value).orElse(null);
    }

}
