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

        int clientDeviceYear = 2014;

        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Некоректные данные."); /// так как переменная указана выше делаем проверку что введена 1 или 0
            return;
        }
        String operationSystem; //вводим переменную String для проверки к какой ОС относимя

        if (clientOS == 0) {
            operationSystem = "iOS";  ///делаем проверку на к какой оперционной системе отнестись
        } else {
            operationSystem = "Android";
        }

        ///String message; ///можно использовать string, можно просто через println

        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для " + operationSystem + " по ссылке");
            ///message = "Установите облегченную версию приложения для " + operationSystem +  " по ссылке";
        } else {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке");
            ///message = "Установите версию приложения для " + operationSystem +  " по ссылке";
        }

        /// Задача 3
        System.out.println();
        System.out.println("Задача 3");

        int year = 1684;
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; //создаем логическую переменную


        if (year < 1584) { /// Проверка что бв не был введен год меньше 1584 согласно условию задачи
            System.out.println("Введен н коректный год");
        } else if (leapYear) { /// проверка на високосность, если условие выполнено выводим сообщение
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }

        /// Задача 4
        System.out.println();
        System.out.println("Задача 4");


    }
}