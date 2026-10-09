
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Storm");
        s.add("Six hundred men");
        System.out.println(s.take());
        System.out.println(s.values());

    }
}
