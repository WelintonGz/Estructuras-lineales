package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Queque {
    private Node primero;
    private Node ultimo;
    private int size;
    

    public Queque() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            primero = newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int aux = primero.getValue();
        primero=primero.getNext();
        return aux;

    }

    public boolean isEmpty(){
        return primero == null;
    }
}
