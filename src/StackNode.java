/*
Trent Blair
1/14/22
This is the StackNode class that is used in stack and the Stack Queue
*/
public class StackNode<E>{

    private final E data;

    private final StackNode<E> child;

    public StackNode(){
        data = null;
        child = null;
    }

    public StackNode(E data){
        this.data = data;

        child = null;
    }
    public StackNode(E data, StackNode<E> child) {

        this.data = data;
        this.child = child;
    }
    public E getData() {

        return data;
    }

    public StackNode<E> getChild() {
        return child;
    }
}