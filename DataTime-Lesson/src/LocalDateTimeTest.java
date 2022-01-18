import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.of
                (2018, 12, 31, 12, 30, 45);// 31 grudnia 2018, 12:30:45

        System.out.println(now);
        System.out.println(dateTime);
    }
}
