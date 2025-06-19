package java13.TextBlocks;

public class TextBlockDemo {
    public static void main(String[] args) {
        String htmlOld = "<html>\n" +
                         "  <body>\n" +
                         "    <p>Hello, world!</p>\n" +
                         "  </body>\n" +
                         "</html>";

        String htmlNew = """
            <html>
              <body>
                <p>Hello, Text Blocks!</p>
              </body>
            </html>
            """;

        System.out.println("Old way:\n" + htmlOld);
        System.out.println("\nText Block:\n" + htmlNew);
    }
}
