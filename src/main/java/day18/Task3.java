package day18;

public class Task3 {
    public static void main(String[] args) {
        Node rootNode = new Node(20);
        insert(rootNode, 14);
        insert(rootNode, 23);
        insert(rootNode, 11);
        insert(rootNode, 5);
        insert(rootNode, 16);
        insert(rootNode, 8);
        insert(rootNode, 15);
        insert(rootNode, 18);
        insert(rootNode, 22);
        insert(rootNode, 27);
        insert(rootNode, 24);
        insert(rootNode, 150);

        dfs(rootNode);
    }


    public static Node insert(Node rootNode, int x) {
        if (rootNode == null)
            return new Node(x);
        else if (x > rootNode.getValue())
            rootNode.setRightChild(insert(rootNode.getRightChild(), x));
        else
            rootNode.setLefrChild(insert(rootNode.getLefrChild(), x));
        return rootNode;
    }

    public static void print(int value, Node rootNode) {
        if (rootNode.getValue() < value) {
            System.out.println("Value = " + value);
            System.out.println(rootNode.getRightChild());
        }
    }

    public static void dfs(Node rootNode) {
        if (rootNode == null)
            return;

        dfs(rootNode.getLefrChild());
        System.out.print(rootNode.getValue() + " ");

        dfs(rootNode.getRightChild());

    }
}