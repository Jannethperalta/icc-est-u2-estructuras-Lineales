package Materia.Stack;

import java.util.EmptyStackException;
import Materia.Models.NodeGeneric;

public class runStackGenerico<T> {
    private NodeGeneric<T> top; // Nodo genérico
    private int size; // Tamaño de la pila

    // Constructor
    public void StackGenerico() {
        this.top = null;
        this.size = 0;
    }
    // Método para retirar el elemento en el tope de la pila
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    // Método para agregar un elemento a la pila
    public void push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }    

    // Método para ver el elemento en el tope sin retirarlo
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para imprimir todos los elementos de la pila
    public void printStack() {
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return size;
    }
 
}
