package java22.StringTemplates;


public class StringTemplateDemo {
    public static void main(String[] args) {
        String name = "Alice";
        int x = 10, y = 20;

        //String msg = STR."Hello, ${name}! Sum: ${x + y}";
        String msg = "Hello, ${name}! Sum: ${x + y}";
        System.out.println(msg); // Hello, Alice! Sum: 30
    }
}
