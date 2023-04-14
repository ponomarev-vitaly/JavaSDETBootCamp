package week10.Enum;

public class Main {
    public static void main(String[] args) {
        Colors red = Colors.RED; // We created the variable red.
        Colors green = Colors.GREEN;
        System.out.println(red);
        System.out.println(Colors.RED);

        System.out.println(red.ordinal()); // --> ordinal() method brings us the index number of value.

        System.out.println(green.ordinal());
        System.out.println(green);

        Days monday = Days.MONDAY;
        Days tuesday = Days.TUESDAY;
        Days wednesday = Days.WEDNESDAY;
        Days thursday = Days.THURSDAY;
        Days friday = Days.FRIDAY;
        Days saturday = Days.SATURDAY;
        Days sunday = Days.SUNDAY;
    }

    enum Days{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
