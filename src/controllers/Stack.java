package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Stack {
    private Node top;

    public Stack(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

     public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        return value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void printStack(){
        Node aux = top;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public int size(){
        Node aux = top;
        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.getNext();
        }
        return cont;
    }

}
