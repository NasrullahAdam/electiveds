package za.ac.cput.group2f.NasrullahAdam.Lists;

import za.ac.cput.group2f.NasrullahAdam.Security;

public class Duty {
    public static void main(String[] args) {
        Security a = new Security.Builder().age(25).name("Adam").secLevel(1).build();
        Security b = new Security.Builder().age(47).name("John").secLevel(2).build();
        Security c = new Security.Builder().age(32).name("Gray").secLevel(3).build();
        Security d = new Security.Builder().age(29).name("Kate").secLevel(4).build();

        SinglyLinkedList list = new SinglyLinkedList();
        list.addAtHead(a);
        System.out.println("Details 1:");
        list.print();
        list.addToTail(b);
        System.out.println("Details 2:");
        list.print();
        list.addSorted(c);
        System.out.println("Details 3:");
        list.print();
        list.addSorted(d);
        System.out.println("Details 4:");
        list.print();

        list.InsertNth(d, 3);
        System.out.println("Details 5:");
        list.print();
    }
}
