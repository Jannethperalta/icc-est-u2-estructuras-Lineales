package Controller;

import Materia.Models.NodeGeneric;
import Models.Contact;
import Models.LinkedList;

public class ContactManager {

    private LinkedList<Contact<?,?>> conctacts;

    public ContactManager() {
        conctacts = new LinkedList<>();
    }

    public void addContact(Contact<?,?> contact) {
        conctacts.appendTotail(contact);
    }

    public Contact<?,?> findContactByName(String name) {
        NodeGeneric<Contact<?,?>> current = conctacts.getHead(); //obtenemos para iterar la lista y encotrar por este nombre
        while (current != null) {
            if (( (String) current.getValue().getName()).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
            System.out.println(current);
            System.out.println(current.getNext());
        }
        return null; //no se encontro un contacto con ese nombre
    }

    public void deleteContactByName(String name) {
        NodeGeneric<Contact<?,?>> current = conctacts.getHead();

        if (current == null) 
            return; //No se encontro un contacto con ese nombre

        //Caso 1 que el contacto sea la Head o cabeza
        if (((String) current.getValue().getName()).equalsIgnoreCase(name)){
            conctacts.setHead(conctacts.getHead().getNext());
            conctacts.setSize(conctacts.getSize() - 1);
            
            return;
        }
        
        //Caso 2 en el resto iterar la lista
        while (current.getNext() != null) {
            if (((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                conctacts.setSize(conctacts.getSize() - 1);
                return;

            }
            current = current.getNext();
            
        }

    }

    public void printList() {
        conctacts.print();

    }
}
