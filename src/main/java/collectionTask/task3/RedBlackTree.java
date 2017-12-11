package collectionTask.task3;


public class RedBlackTree {
    private RedBlackNode current;
    private RedBlackNode parent;
    private RedBlackNode grand;
    private RedBlackNode great;
    private RedBlackNode header;
    private static RedBlackNode nullNode;

    static {
        nullNode = new RedBlackNode(0);
        nullNode.left = nullNode;
        nullNode.right = nullNode;
    }

    static final int BLACK = 1;
    static final int RED = 0;

    public RedBlackTree() {
        header = new RedBlackNode(Integer.MIN_VALUE);
        header.left = nullNode;
        header.right = nullNode;
    }

    public boolean isEmpty() {
        return header.right == nullNode;
    }

    public void makeEmpty() {
        header.right = nullNode;
    }

    public void insert(int value) {
        current = parent = grand = header;
        nullNode.value = value;
        while (current.value != value) {
            great = grand;
            grand = parent;
            parent = current;
            current = value < current.value ? current.left : current.right;
            if (current.left.color == RED && current.right.color == RED)
                handleReorient(value);
        }
        if (current != nullNode)
            return;
        current = new RedBlackNode(value, nullNode, nullNode);
        if (value < parent.value) parent.left = current;
        else parent.right = current;
        handleReorient(value);
        nullNode.value = 0;
    }

    private void handleReorient(int value) {
        current.color = RED;
        current.left.color = BLACK;
        current.right.color = BLACK;
        if (parent.color == RED) {
            grand.color = RED;
            if (value < grand.value != value < parent.value)
                parent = rotate(value, grand);
            current = rotate(value, great);
            current.color = BLACK;
        }
        header.right.color = BLACK;
    }

    private RedBlackNode rotate(int item, RedBlackNode parent) {
        if (item < parent.value)
            return parent.left = item < parent.left.value ? rotateWithLeftChild(parent.left) : rotateWithRightChild(parent.left);
        else
            return parent.right = item < parent.right.value ? rotateWithLeftChild(parent.right) : rotateWithRightChild(parent.right);
    }

    private RedBlackNode rotateWithLeftChild(RedBlackNode node) {
        RedBlackNode temp = node.left;
        node.left = temp.right;
        temp.right = node;
        return temp;
    }

    private RedBlackNode rotateWithRightChild(RedBlackNode node) {
        RedBlackNode temp = node.right;
        node.right = temp.left;
        temp.left = node;
        return temp;
    }

    public int countNodes() {
        return countNodes(header.right);
    }

    private int countNodes(RedBlackNode root) {
        if (root == nullNode)
            return 0;
        else {
            int size = 1;
            size += countNodes(root.left);
            size += countNodes(root.right);
            return size;
        }
    }

    public boolean search(int value) {
        return search(header.right, value);
    }

    private boolean search(RedBlackNode node, int value) {
        boolean found = false;
        while ((node != nullNode) && !found) {
            int nodeValue = node.value;
            if (value < nodeValue)
                node = node.left;
            else if (value > nodeValue)
                node = node.right;
            else {
                found = true;
                break;
            }
            found = search(node, value);
        }
        return found;
    }

    public void inorder() {
        inorder(header.right);
    }

    private void inorder(RedBlackNode node) {
        if (node != nullNode) {
            inorder(node.left);
            char c = 'B';
            if (node.color == 0)
                c = 'R';
            System.out.print(node.value + "" + c + " ");
            inorder(node.right);
        }
    }

    public void preorder() {
        preorder(header.right);
    }

    private void preorder(RedBlackNode node) {
        if (node != nullNode) {
            char c = 'B';
            if (node.color == 0)
                c = 'R';
            System.out.print(node.value + "" + c + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder() {
        postorder(header.right);
    }

    private void postorder(RedBlackNode node) {
        if (node != nullNode) {
            postorder(node.left);
            postorder(node.right);
            char c = 'B';
            if (node.color == 0)
                c = 'R';
            System.out.print(node.value + "" + c + " ");
        }
    }

    private static class RedBlackNode {
        RedBlackNode left, right;
        int value;
        int color;

        public RedBlackNode(int value) {
            this(value, null, null);
        }

        public RedBlackNode(int value, RedBlackNode left, RedBlackNode right) {
            this.left = left;
            this.right = right;
            this.value = value;
            color = 1;
        }
    }

    public void drawInConsole() {
        draw(header.right, 0, '>');
    }

    private void draw(RedBlackNode node, int shift, char leftRight) {
        if (node != nullNode) {
            draw(node.right, shift + 1, '/');

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < shift; i++) {
                str.append("      ");
                // System.out.print("      ");
            }
            // System.out.println(""+leftRight+"----"+node.data);
            str.append("" + leftRight + "----" + node.value);
            if (node.color == RED)
                System.err.println(str);
            else
                System.out.println(str);
            System.out.flush();
            System.err.flush();

            draw(node.left, shift + 1, '\\');
        }
    }
}
