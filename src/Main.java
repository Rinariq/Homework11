public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        checkYear(2021);
        System.out.println("");

        System.out.println("задание 2");
        printAppVersion(0, 2020);
        System.out.println("");

        System.out.println("задание 3");
        int days = calculateDeliveryTime(95);
        System.out.println("Потребуется дней: " + days);
        System.out.println("");
    }

    // задание 1
    public static void checkYear(int year) {
        if (year % 100 == 0 && year % 4 != 0 || year % 400 != 0) {
            System.out.println(year + " год невисокосный");
        } else {
            System.out.println(year + " год високосный");
        }
    }

    // задание 2
    public static void printAppVersion(int clientOS, int yearNow) {
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
    public static int calculateDeliveryTime(int deliveryDistance) {
        int term = 1;
        if (deliveryDistance <= 20) {
            return term;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            term = term + 1;
            return term;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            term = term + 1 + 1;
            return term;
        } else {
            return 0;
        }
    }
}

