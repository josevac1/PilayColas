package Materia.Models;

public class NodeGenerico<T> {
    
    public T data;
    public NodeGenerico<T>next;
    public Object value;

    public NodeGenerico( T data){
        this.data =data;
    }

}
