import java.util.Stack;

import Materia.Cola;
import Materia.ColaGenerica;
import Materia.ListasEnlazadas.ListasEnlazadas;
import Materia.ListasEnlazadas.ListasEnlazadasGenericas;
import Materia.Models.Pantallas;
import Materia.Models.Ejercicio_01_sing.SingValidator;
import Materia.Models.Ejercicio_02_sorting.StackSorter;
import Materia.Models.Ejercicio_03LinkedLists.LinkedListsEjr;
import Materia.Pilas.PIlaGenerica;
import Materia.Pilas.Pila;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        
        System.out.println("elemeto en la cima de la pila es:"+pila.peek());
        System.out.println("el elementoeliminado de la fila es"+pila.pop());
        System.out.println("elemeto en la cima de la pila es:"+pila.peek());

        System.out.println();
        // Implementacion de pilaGenerica

        PIlaGenerica<Pantallas> pilaGenerica=new PIlaGenerica<>();
        pilaGenerica.push(new Pantallas("Home page", "/home"));
        pilaGenerica.push(new Pantallas("Menu page", "/home/menu"));
        pilaGenerica.push(new Pantallas("Settings page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla\n\t-->"+pilaGenerica.peek().getNombre());
        System.out.println("destruir pantalla:\n\t-->"+pilaGenerica.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t-->"+pilaGenerica.peek().getNombre());
        pilaGenerica.push(new Pantallas("user Page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla:\n\t-->"+pilaGenerica.peek().getNombre());

        System.out.println("");

        Cola queue= new Cola();
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);
        queue.addNode(30);

        System.out.println("el elemento en el frente: "+ queue.peek());
        System.out.println("Elemento retirado:"+queue.remove());
        System.out.println("el elemneto al frente :"+queue.peek());
        System.out.println("Elemento retirado"+queue.remove());
        System.out.println("Elemento al frente: "+ queue.peek());
        System.out.println("¿Cola vacia?:"+(queue.isEmpty()?"si":"no"));

        System.out.println(" ");

        ColaGenerica<Pantallas> queuegenGenerica=new ColaGenerica<>();
        queuegenGenerica.addNode(new Pantallas("home","1"));
        queuegenGenerica.addNode(new Pantallas("Menu","2"));
        queuegenGenerica.addNode(new Pantallas("Settings","3"));
        System.out.println(" la cola tiene mas "+queuegenGenerica.size()+" elemento ");

        System.out.println(" Estoy en la pantalla\t"+
                    queuegenGenerica.peek().getNombre());
        System.out.println("Pantalla destruida\t"+
                    queuegenGenerica.remove().getNombre());
        queuegenGenerica.addNode(new Pantallas("user page", "4"));
        System.out.println(" Estoy en la pantalla\t"+
                    queuegenGenerica.peek().getNombre());
        System.out.println("Pantalla destruida\t"+
                    queuegenGenerica.remove().getNombre());
        System.out.println("Pantalla destruida\t"+
                    queuegenGenerica.remove().getNombre());
        System.out.println(" Estoy en la pantalla\t"+
                    queuegenGenerica.peek().getNombre());
        System.out.println(" la cola tiene mas "+queuegenGenerica.size()+" elemento ");


        System.out.println("_____________________________________________");
        // ejercicio 1 
         SingValidator validador = new SingValidator();

        String input1 = "([]){}";
        System.out.println(validador.isValid(input1));  // Output: true

        String input2 = "([)]";
        System.out.println(validador.isValid(input2));  // Output: false

        String input3 = "{[]}";
        System.out.println(validador.isValid(input3));  // Output: true

        String input4 = "([)";
        System.out.println(validador.isValid(input4));  // Output: false
        
        // ejercicio 2 

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        ListasEnlazadas lista=new ListasEnlazadas();
        lista.addNode(1);
        lista.addNode(4);
        lista.addNode(3);
        lista.addNode(6);
        System.out.println();
        lista.deleteNode(6);
        lista.print();
        lista.deleteNode(1);
        lista.print();
        lista.deleteNode(3);
        lista.print();

        System.out.println("xxxxxxxxxxxxxx");
        ListasEnlazadasGenericas<Integer> listaEnteros = new ListasEnlazadasGenericas<>();

        // Agregar nodos a la lista
        listaEnteros.addNode(1);
        listaEnteros.addNode(2);
        listaEnteros.addNode(3);
        listaEnteros.addNode(4);
        listaEnteros.addNode(5);

        // Imprimir la lista
        System.out.println("Lista original:");
        listaEnteros.print();

        // Eliminar un nodo de la lista
        listaEnteros.deleteNode(2);

        // Imprimir la lista después de eliminar un nodo
        System.out.println("Lista después de eliminar 2:");
        listaEnteros.print();
        System.out.println("------------------------------------------------------------");

        System.out.println("Ejercicio 3 ");

        LinkedListsEjr listaejer = new LinkedListsEjr();
        listaejer.addNode2(1);
        listaejer.addNode2(2);
        listaejer.addNode2(5);
        listaejer.addNode2(7);
        listaejer.addNode2(6);

        int posicion = 1;
        int resultado = listaejer.getByPoss(posicion);
        System.out.println("El nodo en la posición " + posicion + 
        " desde el final es: " + resultado);


    }
}
