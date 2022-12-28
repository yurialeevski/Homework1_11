import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        identifyLeap_Year(2022);
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2021;
        installApp(clientOS, clientDeviceYear);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int distance = 21;
        deliverInDays(distance);
    }
    public static void identifyLeap_Year(int year) {
        if(year % 100 != 0) {
            if (year % 4 == 0) {
                System.out.println(year + " год - високосный год");
            } else {
                System.out.println(year + " год - невисокосный год");
            }
        } else if(year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void installApp(byte clientOS, int clientDeviceYear ) {
        int currentYear = LocalDate.now().getYear();
        //System.out.println(currentYear);
        if(clientOS == 0) {
            if(clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if(clientOS == 1) {
            if(clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        if(clientOS !=0 && clientOS !=1) {
            System.out.println("Введен неправильный номер " + clientOS + ". Введите правильный номер: 0 — iOS, 1 — Android");
        }
    }

    public static void deliverInDays(int deliveryDistance) {
        int daysToDeliver;
        if(deliveryDistance >= 0 && deliveryDistance < 20) {
            daysToDeliver = 1;
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
        if(deliveryDistance >= 20 && deliveryDistance < 60) {
            daysToDeliver = 2;
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
        if(deliveryDistance >= 60 && deliveryDistance <= 100) {
            daysToDeliver = 3;
            System.out.println("Потребуется дней: " + daysToDeliver);
        }
        if(deliveryDistance > 100) {
            System.out.println("Расстояние " + deliveryDistance + " км. На расстояние больше 100 км доставки нет");
        }
        if(deliveryDistance < 0) {
            System.out.println("Расстояние введено неправильно:" + deliveryDistance);
        }
    }
}