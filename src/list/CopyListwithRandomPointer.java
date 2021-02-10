package list;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {

    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if(head==null)
            return null;

        Map<Node, Node> map = new HashMap<>();

        Node currentNode=head;
        while(currentNode!=null){
            map.put(currentNode, new Node(currentNode.val));
            currentNode=currentNode.next;
        }

        currentNode=head;
        Node headCopy=map.get(currentNode);
        while(currentNode!=null){
            Node currentCopy = map.get(currentNode);
            currentCopy.next=map.get(currentNode.next);
            currentCopy.random=map.get(currentNode.random);


            currentNode=currentNode.next;
        }

        return headCopy;
    }

    private static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
