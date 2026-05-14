public class Practice {
    public static void main(String[] args) {
        Node myNode = new Node('w', null);
        Node otherNode = new Node('x', null);
        Node coolNode = new Node('e', null);
        Node helloNode = new Node('f', null);

        myNode.next = otherNode;
        otherNode.next = coolNode;
        coolNode.next = helloNode;

        // int numNodes = length(myNode);
        // int numNodes2 = myNode.length();

        Node newHead = removeAt(myNode, 2);
        
        //System.out.println(numNodes);

        Node current = newHead;

        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        System.out.println(myNode.value);
        System.out.println(myNode.next.value);
        System.out.println(myNode.next.next.value);
    }

    public static int length(Node head) {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public static Node removeAt(Node head, int index) {

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index must be 0 or higher.");
        }

        if (index == 0) {
            return head.next;
        }

        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index must not exceed length of list");
            }
            current = current.next;
        }

        current.next = current.next.next;

        return head;

    }
}
