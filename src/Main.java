import java.time.LocalDate;

public class Main {
    // Домашнее задание 8. Методы.
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapYearOrNotLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private final static int CURRENTYEAR = LocalDate.now().getYear();

    public static boolean isNowYear(int year) {
        return year == CURRENTYEAR;
    }

    public static String getVersionOs(int versionOS) {
        if (versionOS == 0) {
            return "iOS";
        } else if (versionOS == 1) {
            return "Android";
        }
        return "Операционная система не найдена";
    }
    public static void printVersionOS(int year, int versionOS) {
        if (isNowYear(year)) {
            System.out.println("Установите полную версию приложения для " + getVersionOs(versionOS));
        } else {
            System.out.println("Установите облегченную версию приложения для " + getVersionOs(versionOS));
        }

    }
    public static void printCalculateTimeDelivery(int distance) {
        if (distance > 0 && distance < 2000) {
            System.out.println("Потребуется дней: " + ((distance + 19) / 40 + 1));
            return;
        }
        System.out.println("Доставка не доступна.");
    }
    public static void main(String[] args) {
        printLeapYearOrNotLeapYear(2022);
        printLeapYearOrNotLeapYear(2024);
        printVersionOS(2022, 0);
        printVersionOS(2020, 1);
        printCalculateTimeDelivery(15);
        printCalculateTimeDelivery(500);
        printCalculateTimeDelivery(2500);
    }
}



