import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        checkingYear(2021);
        System.out.println("");

        System.out.println("задание 2");
        appVersion(0);
        System.out.println("");

        System.out.println("задание 3");
        calculatingDeliveryTime(95);
        System.out.println("");
    }

    // задание 1
    public static void checkingYear(int year) {
        if (year % 100 == 0 && year % 4 != 0 || year % 400 != 0) {
            System.out.println(year + " год невисокосный");
        } else {
            System.out.println(year + " год високосный");
        }
    }

    // задание 2
    public static void appVersion(int clientOS) {
        int yearNow = LocalDate.now().getYear();
        if (yearNow >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (yearNow >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (yearNow < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (yearNow < 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // задание 3
    public static void calculatingDeliveryTime(int deliveryDistance) {
        int term = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + term);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            term = term + 1;
            System.out.println("Потребуется дней: " + term);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            term = term + 1 + 1;
            System.out.println("Потребуется дней: " + term);
        } else {
            System.out.println("Доставки нет");
        }
    }
}

