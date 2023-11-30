// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final MyLinkedList<Integer> list = new MyLinkedList<>();
    public static void main(String[] args) {

    }
    private static void testMyLinkedList() {
        System.out.println("LIST\n" + list);

        System.out.println("ADD");
        list.add(1, 2);
        System.out.println(list);

        list.addLast(9);
        list.addFirst(7);
        System.out.println(list);

        System.out.println("REMOVE");
        list.remove(3);
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println("OTHER");
        System.out.println(list.size());
        System.out.println(list.indexOf(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.set(2, 3);
        System.out.println(list);
    }

    private static void testMyQueue(){
        MyQueue<Integer> queue = new MyQueue<>(list);
        System.out.println("QUEUE\n" + queue);

        System.out.println("OFFER");
        queue.offer(4);
        System.out.println(queue);

        System.out.println("PEEK");
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println("POLL");
        System.out.println(queue.poll());
        System.out.println(queue);
    }

    private static void testMyStack(){
        MyStack<Integer> stack = new MyStack<>(list);
        System.out.println("STACK\n" + stack);

        System.out.println("PUSH");
        stack.push(4);
        System.out.println(stack);

        System.out.println("POP");
        stack.pop();
        System.out.println(stack);
    }
}