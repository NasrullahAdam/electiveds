package za.ac.cput.group2f.NasrullahAdam.Lists;

import za.ac.cput.group2f.NasrullahAdam.Security;

public class SinglyLinkedList {

    private static class Node {
        private Security data;
        private Node nextLink;

        public Node(Security data, Node next){
            this.data = data;
            this.nextLink = next;
        }

        public Node(Security data){
            this.data = data;
            this.nextLink = null;
        }
    }

    private Node head;
    private int size;

    public int size(){ return size; }

    public boolean isEmpty(){ return size == 0; }

    public void addAtHead(Security data){
        head = new Node(data, head);
        size++;
    }

    public void addToTail(Security data){
        Node newNode = new Node (data);
        Node curr = head;

        if (head == null)
            head = newNode;

        while (curr.nextLink != null) {
            curr = curr.nextLink;
        }
        curr.nextLink = newNode;

    }

    Node InsertNth(Security data, int position) {
        Node node = head;
        if (position == 0) {
            node = new Node(data, head);
            return node;
        } else {
            while (--position > 0) {
                node = node.nextLink;
            }
            Node next = node.nextLink;
            node.nextLink = new Node(data, next);
            return head;
        }
    }

    public void addSorted(Security data){
        Node newNode = new Node (data);
        Node curr = head;

        if (curr.nextLink == null || curr.data.getSecLevel() > data.getSecLevel()){
            newNode.nextLink = head;
            return;
        }

        while(curr.nextLink != null && curr.nextLink.data.getSecLevel() < data.getSecLevel()){
            curr = curr.nextLink;
        }

        newNode.nextLink = curr.nextLink;
        curr.nextLink = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data.getName() + ", " + temp.data.getSecLevel() + ", ");
        }
    }
}
