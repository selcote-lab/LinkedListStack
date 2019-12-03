package com.tonasolution;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee ali = new Employee("ali", "ahmed", 1223);
        Employee marie = new Employee("Marie", "Smith", 1293);
        Employee casu = new Employee("casu", "lala", 1273);

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(ali);
        linkedStack.push(marie);
        linkedStack.push(casu);

        linkedStack.print();


        System.out.println("Peek item ->");
        System.out.println(linkedStack.peek());
        linkedStack.print();

        System.out.println("Pop item ->");
        linkedStack.pop();
        linkedStack.print();
    }
}
