import Materia.Queues.Queues;
import Materia.Queues.QueueGenerico;
import Materia.Queues.StackGenerico;
import Models.Pantalla;

public class App {
    public static void main(String[] args) {
        // runStack();
        // runStackGeneric();
        // runQueue();
        runQueueGenerico();
    }

    public static void runStack() {
        Stack stack = new Stack();

        // Agregar elementos
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        System.out.println("\nCantidad = " + stack.getSize());

        // Operaciones con la pila
        System.out.println("Cima -> " + stack.peek());
        System.out.println("Retirar -> " + stack.pop());
        System.out.println("Cima -> " + stack.peek());
    }

    public static void runStackGeneric() {
        StackGenerico<Pantalla> router = new StackGenerico<>();

        router.push(new Pantalla(1, "Home Page", "/Home"));
        router.push(new Pantalla(2, "Menu Page", "/Home/menu"));
        router.push(new Pantalla(3, "Users Page", "/Home/menu/users"));

        System.out.println("Estoy en " + router.peek().getRuta());
        router.pop();
        System.out.println("Regreso a: " + router.peek().getRuta());
        System.out.println("Estoy en: " + router.peek().getRuta());

        router.push(new Pantalla(4, "Settings Page", "/Home/menu/settings"));
        System.out.println("Cantidad de pantallas: " + router.size());
        System.out.println("Estoy en: " + router.peek().getRuta());
        router.printStack();
    }

    public static void runQueue() {
        Queues cola = new Queues();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
    }

    public static void runQueueGenerico() {
        QueueGenerico<Pantalla> routerQueue = new QueueGenerico<>();

        // Agregar elementos a la cola
        routerQueue.enqueue(new Pantalla(1, "Home Page", "/Home"));
        routerQueue.enqueue(new Pantalla(2, "Menu Page", "/Home/menu"));
        routerQueue.enqueue(new Pantalla(3, "Users Page", "/Home/menu/users"));

        // Imprimir la cola
        System.out.println("Estado inicial de la cola:");
        routerQueue.printQueue();

        // Operaciones con la cola
        System.out.println("\nElemento al frente: " + routerQueue.peek().getRuta());
        System.out.println("Desencolar: " + routerQueue.dequeue().getRuta());
        System.out.println("Elemento al frente tras desencolar: " + routerQueue.peek().getRuta());

        // Agregar un nuevo elemento
        routerQueue.enqueue(new Pantalla(4, "Settings Page", "/Home/menu/settings"));

        // Imprimir la cola final
        System.out.println("\nEstado final de la cola:");
        routerQueue.printQueue();

        System.out.println("\nTamaño de la cola: " + routerQueue.size());
    }
}
