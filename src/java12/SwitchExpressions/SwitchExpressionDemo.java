package java12.SwitchExpressions;

public class SwitchExpressionDemo {
    public static void main(String[] args) {
        String day = "MONDAY";

        // 1️⃣ Régi switch statement (Java 1.0 óta)
        String resultOld;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                resultOld = "Weekday";
                break;
            case "SATURDAY":
            case "SUNDAY":
                resultOld = "Weekend";
                break;
            default:
                resultOld = "Invalid day";
        }
        System.out.println("Old switch: " + resultOld);

        // 2️⃣ Új switch expression (Java 12+, preview)
        String resultNew = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> {
                System.out.println("Unknown day: " + day);
                yield "Invalid day";
            }
        };
        System.out.println("New switch expression: " + resultNew);
    }
}
