public class NewStack <T> {
    private int length;
    private Node<T> top;
    private Node<T> bottom;

    public NewStack() {
        this.length = 0;
        this.top = null;
        this.bottom = null;
    }

    public void push(T node) {
        Node<T> toAdd = new Node<>(node);
        if (isEmpty()) {
            this.bottom = toAdd;
            this.top = toAdd;
            length++;
            return;
        }

        this.top.setNext(toAdd);
        this.top = toAdd;
        length++;
    }

    public int getLength() {
        return this.length;
    }

    public Node<T> peek() {
        if (isEmpty()) {
            return null;
        }
        return this.top;
    }

    public Node<T> pop() {
        if (isEmpty()) {
            return null;
        }
        Node<T> toReturn = this.top;
        if (this.top == this.bottom) {
            this.bottom = null;
        }
        this.top = null;
        this.length--;
        Node<T> traversalNode = this.bottom;
        int counterToDeleteNextNode = 1;
        while (traversalNode != null) {
            if (counterToDeleteNextNode == this.length) {
                traversalNode.setNext(null);
            }
            if (traversalNode.getNext() == null) {
                this.top = traversalNode;
                break;
            }
            traversalNode = traversalNode.getNext();
            counterToDeleteNextNode++;
        }
        return toReturn;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }
}
