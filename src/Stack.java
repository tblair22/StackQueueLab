/*
Trent Blair
1/14/22
This is the stack class used by the stack node class
 */

public class Stack<E>{

    private StackNode<E> topNode;
    private int size;

    public Stack() {}

    public void push(E element){

        if(size == 0) topNode = new StackNode<>(element);
        else topNode = new StackNode<>(element, topNode);

        size++;//adds one to size after element is pushed
    }

    public E pop(){

        E ret = topNode.getData();
        size--;

        topNode = topNode.getChild();
        return ret;
    }

    public boolean isEmpty(){//checks if queue is empty

        return size == 0;
    }

    public int size(){ //returns the size

        return size;
    }

    public E peek(){
        return topNode.getData();
    }


}