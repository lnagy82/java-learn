package java13.TextBlocks;

public class JsonTextBlockDemo {
    public static void main(String[] args) {
        // Régi mód
        String jsonOld = "{\n" +
                         "  \"name\": \"Alice\",\n" +
                         "  \"age\": 25,\n" +
                         "  \"active\": true\n" +
                         "}";

        // Text Block (Java 13+)
        String jsonNew = """
            {
              "name": "Alice",
              "age": 25,
              "active": true
            }
            """;

        System.out.println("Old JSON:\n" + jsonOld);
        System.out.println("\nText Block JSON:\n" + jsonNew);
    }
}
