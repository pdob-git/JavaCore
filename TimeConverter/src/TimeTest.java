public class TimeTest {
    public static void main(String[] args) {
        TimeConverter timeConverter = new TimeConverter();
        int hours = 14;
        int minutes = timeConverter.hoursToMinutes(hours);
        int seconds = timeConverter.minutesToSeconds(minutes);
        int miliseconds = timeConverter.secondsToMiliSeconds(seconds);
        System.out.println("Przeliczenie "+ hours  +" godzin");
        System.out.println("Na minuty: " + minutes);
        System.out.println("Na sekundy " + seconds);
        System.out.println("Na milisekundy " + miliseconds);
    }
}
