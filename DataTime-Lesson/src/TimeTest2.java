import java.time.LocalTime;

class TimeTest2 {
    public static void main(String[] args) throws InterruptedException {
        LocalTime now = LocalTime.now();

        for (int i = 0; i < 10; i++) {
            System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
            now = now.plusSeconds(1);
            Thread.sleep(1000);
        }
    }
}