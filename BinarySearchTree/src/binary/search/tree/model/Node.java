package binary.search.tree.model;

import java.util.Optional;

import static java.util.Optional.empty;

/**
 * Created by agurgul on 27.06.2017.
 */
public class Node<T extends Comparable> {

    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value) {
        this.value = value;
    }

    public void add(T value) {
        if (this.value.equals(value)) {
            throw new RuntimeException("Duplicates not allowed");
        }
        if (this.value.compareTo(value) > 0) {
            if (left == null) {
                left = new Node<>(value);
            } else {
                left.add(value);
            }
        } else {
            if (right == null) {
                right = new Node<>(value);
            } else {
                right.add(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(value.toString());
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {

        System.out.println(value.toString());
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public Optional<T> get(T value) {
        if (this.value.equals(value)) {
            return Optional.of(this.value);
        }
        if (this.value.compareTo(value) > 0) {
            return left == null ? empty() : left.get(value);
        }
        return right == null ? empty() : right.get(value);
    }

    public void remove(T node, Node<T> parent) {
        if (value.equals(node)) {
            //TODO

            //I'm a leaf
            if (this.left == null && this.right == null) {
                if (parent != null && parent.left.equals(this)) {
                    parent.left = null;
                } else
                    parent.right = null;
                return;
            }
            //has one child
            if (left == null) {
                if (parent != null && parent.left.equals(this)) {
                    parent.left = right;
                } else {
                    parent.right = right;
                }
                return;
            }
            if (right == null) {
                if (parent!= null && parent.right.equals(this)){
                    parent.right =left;
                } else {
                    parent.right = left;
                }
                return;
            }
            //have two children http://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
            //TODO - Make sure that root deletion works

            return;

            //
        }
        if (value.compareTo(node) > 0) {
            if (left == null) {
                throw new RuntimeException("Value not found");
            }
            left.remove(node, this);
            return;
        }
        if (right == null) {
            throw new RuntimeException("Value not found");
        }
        right.remove(node, this);

    }
}
