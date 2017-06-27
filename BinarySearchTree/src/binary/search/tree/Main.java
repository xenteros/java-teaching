package binary.search.tree;

import binary.search.tree.model.Tree;

/**
 * Created by agurgul on 27.06.2017.
 */
public class Main {

    public static void main(String[] args) {

        Tree <Integer> tree = new Tree<>();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(2);
        tree.add(5);
        tree.add(1);
        tree.add(7);
        tree.add(9);

        tree.printInOrder();
        System.out.println();
        tree.printPreOrder();
        System.out.println();
        System.out.println(tree.get(5));
        System.out.println(tree.get(12));


    }
}
