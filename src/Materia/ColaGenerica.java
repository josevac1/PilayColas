package Materia;

import java.util.NoSuchElementException;
import Materia.Models.NodeGenerico;

public class ColaGenerica<T> {
    private NodeGenerico<T> first;
    private NodeGenerico<T> last;
    private int size;

    public ColaGenerica() {
        this.first = null;
        this.last = null;
    }

    public void addNode(T data){
        NodeGenerico<T> nuevonode=new NodeGenerico<>(data);
        if (isEmpty()){
            first=nuevonode;
            last=nuevonode;
        }else{
            last.next=nuevonode;
            last=nuevonode;
        }
        size++;
    }

    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esat vacia");
        }
        T value=first.data;
        first=first.next;
        if (first==null){
            last=null;
        }
        size--;
        return value;

    } 
    
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first==null;
    }
    
    public int size(){
        return size;
    }
}
