import java.util.*;

public class JavaCollection {
    public static void main(String[] args){
        doList();
        doStack();
        doQueue();
        doSet();
        doMap();
    }
    public static void doList(){
        System.out.println("In doList");

        // Creating List
        List<String> list = new LinkedList<>();
        //Adding object to the list
        list.add("Deepak");
        list.add("Raunak");
        list.add("Ravi");
        list.add("Ajay");

        // Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){}
    }

    public static void doStack(){
        System.out.println("\nIn doStack");
        Stack<String> stack = new Stack<>();
        stack.push("Ayush");
        stack.push("Arya");
        stack.push("Pari");
        stack.push("Bhanu");
        stack.push("Akash");
        String pop = stack.pop();
        Iterator<String > itr=stack.iterator();
        while(itr.hasNext()){}
    }

    public static void  doQueue(){
        System.out.println("\nIn doQueue");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Ashok Jaiswal");
        queue.add("Abhay Singh");
        queue.add("Amar Singh");
        queue.add("Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while (itr.hasNext()){
            queue.remove();
            queue.poll();
            System.out.println("after removing two elements:");
            Iterator<String> itr2=queue.iterator();
            while(itr2.hasNext()){}
            }
    }

    public static void doSet(){
        System.out.println("\nIn doSetDemo");
        Set<String> set = new LinkedHashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        for (String str : set){}
    }

    private static void doMap(){
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        //Elements can traverse in any order
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
