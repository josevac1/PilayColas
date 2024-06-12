package Materia.ListasEnlazadas;
import Materia.Models.NodeGenerico;
public class ListasEnlazadasGenericas <T> {

    private NodeGenerico<T> head;

    public ListasEnlazadasGenericas(){

    }

   //Agregar Nodos a la lista 
public void addNode(T value){
    if(head== null){
        head=new NodeGenerico<T>(value);
        return;
    }

    NodeGenerico<T> current =head;
    while (current.next!=null) {
        current=current.next;
    }

    current.next=new NodeGenerico<T>(value);
}

// el metodo para eliminar 
public void deleteNode(T value){
    if (head==null) return;  //no hay elementos no haga nada

    if (head.data.equals(value)) {
        head=head.next;
        return;
    }
    NodeGenerico<T> current=head;
    while (current.next!=null) {
        if(current.next.data.equals(value)){
            current.next= current.next.next;
            return;
        }
        current=current.next;
    }
}

public void print(){
    if (head==null) {
        System.out.println("Lista vacia");
        return;
    }
    NodeGenerico<T> current=head;
    while (current.next!=null) {
        System.out.println("Node->"+current.data);
        current=current.next;
    }
    System.out.println("Node->"+current.data);
    System.out.println("Fin de la lista");

    }
}
    

