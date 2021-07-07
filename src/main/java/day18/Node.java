package day18;

public class Node {
    int value;
    Node LefrChild;
    Node RightChild;


    public Node(int value) {
        this.value = value;
        LefrChild = null;
        RightChild = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLefrChild() {
        return LefrChild;
    }

    public void setLefrChild(Node node) {
        LefrChild = node;
    }

    public Node getRightChild() {
        return RightChild;
    }

    public void setRightChild(Node node) {
        RightChild = node;
    }

    @Override
    public String toString() {
        return "value=" + value;

    }
}

