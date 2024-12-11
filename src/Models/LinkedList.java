package Models;


import Materia.Models.NodeGeneric;

public class LinkedList <T>{
    private NodeGeneric<T> head; //Referencia al primer nodo
    private int size = 0; //Contador del numero de nodos 

    public void appendTotail(T value) {
        if(head == null) {
            head = new NodeGeneric<>(value);
        }else{
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new NodeGeneric<>(value));
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;   
        }
        NodeGeneric<T> current = head;
        while (current.getNext() != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
    }

    
    System.out.println(current.getValue() + " -> END");

    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}


