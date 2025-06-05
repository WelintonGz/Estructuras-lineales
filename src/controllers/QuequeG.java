package controllers;

import java.util.NoSuchElementException;
import models.NodeGeneric;
import models.Persona;

public class QuequeG<T> {
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public QuequeG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void printCola() {
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public T findByName(String name) {
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            if (aux.getValue() instanceof Persona) {
                Persona p = (Persona) aux.getValue();
                if (p.getNombre().equalsIgnoreCase(name)) {
                    return aux.getValue();
                }
            }
            aux = aux.getNext();
        }
        return null;
    }

    public T deleteByName(String name) {
        NodeGeneric<T> current = primero;
        NodeGeneric<T> previous = null;

        while (current != null) {
            if (current.getValue() instanceof Persona) {
                Persona p = (Persona) current.getValue();
                if (p.getNombre().equalsIgnoreCase(name)) {
                    if (previous == null) {
                        primero = current.getNext();
                        if (primero == null) {
                            ultimo = null;
                        }
                    } else {
                        previous.setNext(current.getNext());
                        if (current == ultimo) {
                            ultimo = previous;
                        }
                    }
                    size--;
                    return current.getValue();
                }
            }
            previous = current;
            current = current.getNext();
        }
        return null;
    }

    public int size() {
        return size;
    }
}
