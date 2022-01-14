/*
Trent Blair
1/14/22
This is the stackQueue class (queue made up of two stacks)
 */


import java.util.NoSuchElementException;
public class StackQueue <T>{

    Stack<T> s;
    Stack<T> s2;

    public StackQueue() {
        s = new Stack<>();
        s2 = new Stack<>();
    }

    void enqueue(T element){//puts an element in the queue
        s.push(element);
    }

    T dequeue(){//takes a element out of the queue
        while(!s.isEmpty()) s2.push(s.pop());


        if(s2.isEmpty()) throw new NoSuchElementException();//Kevin helped me learn about this
        T ret = s2.pop();
        while(!s2.isEmpty()) s.push(s2.pop());

        return ret;
    }

    boolean isEmpty(){//checks if the queue is empty
        return s.size() == 0;
    }

    int size(){
        return s.size();
    }

    T peek(){//checks what the first element is
        while(!s.isEmpty()) s2.push(s.pop());
        if(s2.isEmpty()) throw new NoSuchElementException();

        T ret = s2.peek();
        while(!s2.isEmpty()) s.push(s2.pop());


        return ret;
    }


}