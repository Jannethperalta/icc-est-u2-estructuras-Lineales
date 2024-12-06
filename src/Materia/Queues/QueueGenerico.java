package Materia.Queues;
import java.util.NoSuchElementException;
import Materia.Models.NodeGeneric;

public class QueueGenerico<T> {
    private NodeGeneric<T> front; // Nodo al frente de la cola
    private NodeGeneric<T> rear;  // Nodo al final de la cola
    private int size;             // Tamaño de la cola

    // Constructor: Inicializar cola vacía
    public QueueGenerico() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Método para encolar nodos
    public void enqueue(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    // Método para desencolar nodos
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T value = front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    // Devuelve el valor del nodo al frente de la cola sin quitarlo
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return front.getValue();
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return size;
    }

    // Método para imprimir todos los elementos de la cola
    public void printQueue() {
        NodeGeneric<T> current = front;
        System.out.print("Cola: ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}


