package Materia;

import java.util.NoSuchElementException;
import Materia.Models.Node;

public class Cola {
    private Node fron;
    private Node  rear;

    public Cola() {
        this.fron = null;
        this.rear = null;
    }
    //Metodopara agregar un NOde a la agregar
    public void addNode(int value){
        Node node=new Node(value);
        if (isEmpty()){
            fron= node;
            rear=node;
        }else{
            rear.next=node;
            rear=node;
        }
    }

    public int remove(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esat vacia ");
        }
        int value=fron.value;
        fron=fron.next;
        if (fron==null){
            rear=null;
        }
        return value;

    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola est vacia");
        }
        return fron.value;
    }


    public boolean isEmpty(){
        return fron==null;
    }
    
}
