package controllers;

import java.util.EmptyStackException;

import models.Node;
import models.NodeGeneric;

public class StackG <T>{
    private NodeGeneric<T> top;
    private int size;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
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
