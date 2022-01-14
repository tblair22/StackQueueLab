/*
Trent Blair
1/14/22
This tests the StackQueue class
 */
public class StackQueueTester {


    public static void main(String[] args) {

        StackQueue<Integer> q = new StackQueue<>();

        q.enqueue(1);// 1
        q.enqueue(5);// 1,5
        q.enqueue(11);// 1, 5, 11

        System.out.println(q.peek());//should print: 1

        System.out.println(q.size());//should print 2

        System.out.println(q.dequeue());// should print 1

        System.out.println(q.size());// should print 1

        System.out.println(q.isEmpty());//should print false

        System.out.println(q.peek());// should print 5

        q.dequeue();

        System.out.println(q.peek());// should print 11

        q.dequeue();

        System.out.println(q.isEmpty());//should print true

    }


}
