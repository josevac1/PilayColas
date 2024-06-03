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


    }
}
