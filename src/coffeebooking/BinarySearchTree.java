package coffeebooking;

import java.util.ArrayList;

public class BinarySearchTree{

    protected class Node {

        Meal element;
        Node left;
        Node right;

        public Node(Meal e) {
            this.element = e;
            this.right = null;
            this.left = null;
        }
    }

    private ArrayList<Meal> output = new ArrayList<>();

    public ArrayList<Meal> getOutput() {
        return this.output;
    }

    private Node root = null;
    private int size = 0;

    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if (size == 0) {
            return true;
        }
        return false;
    }

    public Node insert(Node p, Meal element) {
        if (p == null) {
            p = new Node(element);
            return p;
        } else {
            if (element.compareTo(p.element) < 0) {
                p.left = insert(p.left, element);
            } else {
                p.right = insert(p.right, element);
            }
        }
        return p;
    }

    public void insertNode(Meal element) {
        root = insert(root, element);

    }

    public Meal search(Node p, Meal element) {
        if (isEmpty()) {
            return null;
        }
        if (p.element == element || p == null) {
            return p.element;
        }
        if (element.compareTo(p.element) < 0) {
            search(p.left, element);
        } else {
            search(p.right, element);
        }
        return p.element;
    }

    public boolean searchNode(Meal element) {
        if (element == search(root, element)) {
            return true;
        }
        return false;
    }

    public Meal findMin(Node p) {
        Meal min = p.element;
        while (p.left != null) {
            min = p.left.element;
            p = p.left;
        }
        return min;
    }

    // public E minVal() {
    // 	return findMin(root);
    public Node delete(Node p, Meal element) {
        if (p == null) {
            return p;
        }
        if (element.compareTo(p.element) < 0) {
            p.left = delete(p.left, element);
        } else if (element.compareTo(p.element) > 0) {
            p.right = delete(p.right, element);
        } else {
            if (p.left == null) {
                return p.right;
            } else if (p.right == null) {
                return p.left;
            }

            p.element = findMin(p.right);
            p.right = delete(p.right, p.element);
        }
        return p;
    }

    public void deleteNode(Meal element) {
        root = delete(root, element);
    }

    public void inorder() {
        output = new ArrayList<>();
        inorderNode2(root);
    }

    public void inorderNode(Node p) {
        if (p == null) {
            return;
        } else {
            inorderNode(p.left);
            Meal element = p.element;
            System.out.print(element.getName() + " ");
            inorderNode(p.right);
        }
    }

    public void inorderNode2(Node p) {
        
        if (p == null) {
            return;
        } else {
            inorderNode2(p.left);
            Meal eMeal = p.element;
//            System.out.println(eMeal.toString());
            output.add(eMeal);
            inorderNode2(p.right);
        }
    }

    public void printTree(Node p, int level) {
        if (p == null) {
            return;
        }
        printTree(p.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(p.element);
        printTree(p.left, level + 1);
    }

    public void print() {
        printTree(root, 0);
    }

}
