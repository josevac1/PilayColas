import Materia.Cola;
import Materia.ColaGenerica;
import Materia.Models.Pantallas;
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
        

    }
}
