import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        identifyLeap_Year(2024);
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        int clientDeviceYear = 2021;
        installApp(clientOS, clientDeviceYear);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int distance = 102;
        deliverInDays(distance);
    }

    public static void identifyLeap_Year(int year) {
        if((year % 100 == 0 && year % 400 != 0) || year % 4 != 0) {
            System.out.println(year + " год - невисокосный год");
        } else {
            System.out.println(year + " год - високосный год");
        }
    }

    public static void installApp(byte clientOS, int clientDeviceYear ) {
        if(clientOS !=0 && clientOS !=1) {
            System.out.println("Введен неправильный номер " + clientOS + ". Введите правильный номер: 0 — iOS, 1 — Android");
            return;
        }
        int currentYear = LocalDate.now().getYear();
        if(clientDeviceYear < currentYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if(clientOS == 0) {
            System.out.println("iOS по ссылке");
        } else {
                System.out.println("Android по ссылке");
            }
    }

    public static void deliverInDays(int deliveryDistance) {
        if(deliveryDistance <= 0) {
            System.out.println("Расстояние введено неправильно:" + deliveryDistance);
            return;
        }
        int daysToDeliver;
        if(deliveryDistance > 0 && deliveryDistance < 20) {
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
    }
}