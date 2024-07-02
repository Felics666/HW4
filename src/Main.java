//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///Задача 1

        System.out.println("Задача 1");

        int clientOS = 0; ///введите 0 или 1, где 0 это iOS, а 1 это Android


        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Неизвестная операционная система.");
        }

        ///Задача 2
        System.out.println();
        System.out.println("Задача 2");

        int clientDeviceYear = 2014; //переменная которой присвоили год устройтсва

        String msg = clientDeviceYear <= 2015 ? "облегченную " : ""; //Тернарный оператор, немного сокращает объе кода

        if (clientOS == 0 || clientOS == 1) {
            String operationSystem = clientOS == 0 ? "iOS" : "Android"; //Тернарный оператор, немного сокращает объе кода
            System.out.println("Установите " + msg + "версию приложения для " + operationSystem + "по ссылке.");
        } else {
            System.out.println("Неизвестная ошибка");
        }


        /// Задача 3
        System.out.println();
        System.out.println("Задача 3");

        int year = 2021;
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; //создаем логическую переменную


        if (year < 1584) { /// Проверка что бв не был введен год меньше 1584 согласно условию задачи
            System.out.println("в данном году еще не было введено понятие о високосном годе");
        } else if (leapYear) { /// проверка на високосность, если условие выполнено выводим сообщение
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        /// Задача 4
        System.out.println();
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

        ///Задача 5
        System.out.println();
        System.out.println("Задача 5");

        int monthNumber = 4;

        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Error"); // стрелочная форма case, использование лямбда стиля. позволяет существенно сократить код.
        }
    }
}