package Materia.Stacks;

import java.util.EmptyStackException;
import Materia.Models.NodeGeneric;

public class StackGeneric<T> {

    private NodeGeneric<T> top; // Nodo Generico
    private int size; // Variable tamaño O(1)

    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    
    public void push(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }


    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public NodeGeneric<T> popNode() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodeGeneric<T> poppedNode = top;
        top = top.getNext();
        size--;
        return poppedNode;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        NodeGeneric<T> current = top; 
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println(); 
    }

    public int getSize() { 
        return size;
    }
}
