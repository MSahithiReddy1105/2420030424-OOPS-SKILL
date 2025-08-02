package codes;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append()
        sb.append(" World");

        // 2. insert()
        sb.insert(6, "Java ");

        // 3. replace()
        sb.replace(0, 5, "Hi");

        // 4. delete()
        sb.delete(3, 7);

        // 5. reverse()
        sb.reverse();

        // 6. capacity()
        int cap = sb.capacity();

        System.out.println("Final StringBuffer: " + sb);
        System.out.println("Current Capacity: " + cap);
    }
}