/*
Trent Blair
1/14/22
This is the stackQueue class
 */


import java.util.NoSuchElementException;
public class StackQueue <T>{

    Stack<T> s;
    Stack<T> s2;

    public StackQueue() {
        s = new Stack<>();
        s2 = new Stack<>();
    }

    void enqueue(T element){
        s.push(element);
    }

    T dequeue(){
        while(!s.isEmpty()) s2.push(s.pop());
        if(s2.isEmpty()) throw new NoSuchElementException();
        T ret = s2.pop();
        while(!s2.isEmpty()) s.push(s2.pop());
        return ret;
    }

    boolean isEmpty(){
        return s.size() == 0;
    }

    int size(){
        return s.size();
    }

    T peek(){
        while(!s.isEmpty()) s2.push(s.pop());
        if(s2.isEmpty()) throw new NoSuchElementException();
        T ret = s2.peek();
        while(!s2.isEmpty()) s.push(s2.pop());
        return ret;
    }

}