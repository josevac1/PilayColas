package Materia.ListasEnlazadas;

import Materia.Models.Node;

public class ListasEnlazadas {

    public Node head;

    public ListasEnlazadas(){

    }

    //Agregar Nodos a la lista 
    public void addNode(int value){
        if(head== null){
            head=new Node(value);
            return;
        }

        Node current =head;
        while (current.next !=null) {
            current=current.next;
        }

        current.next=new Node(value);
    }
    // el metodo para eliminar 

    public void deleteNode(int value){
        if (head==null) return;  //no hay elementos no haga nada

        if (head.value== value) {
            head=head.next;
            return;
        }
        Node current=head;
        while (current.next !=null) {
            if(current.next.value==value){
                current.next= current.next;
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
        Node current=head;
        while (current.next !=null) {
            System.out.println("Node->"+current.value);
            current=current.next;
            }
        System.out.println("Node->"+current.value);
        System.out.println("Fin de la lista");

    }
}
