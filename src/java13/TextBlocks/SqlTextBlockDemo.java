package java13.TextBlocks;

public class SqlTextBlockDemo {
    public static void main(String[] args) {
        // Régi mód
        String sqlOld = "SELECT id, name, email\n" +
                        "FROM users\n" +
                        "WHERE active = 1\n" +
                        "ORDER BY name;";

        // Text Block (Java 13+)
        String sqlNew = """
            SELECT id, name, email
            FROM users
            WHERE active = 1
            ORDER BY name;
            """;

        System.out.println("Old SQL:\n" + sqlOld);
        System.out.println("\nText Block SQL:\n" + sqlNew);
    }
}
