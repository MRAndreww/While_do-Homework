public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " сумма накопений равна " + total + " рублей!");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (num = 10; num >= 1; num--) {
            System.out.print(num + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = (population / 1000 * 17);
        //System.out.println(birth);
        int death = (population / 1000 * 8);
        int years = 1;
        while (years < 10) {
            population = population + birth - death;
            years++;
            System.out.println("Год " + years + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int money = 15_000;
        int deposit = 0;
        int month = 1;
        for (; deposit <= 12_000_000; month++) {
            deposit = deposit + deposit * 7 / 100;
            deposit = deposit + money;
            System.out.println("Месяц " + month + " сумма накоплений равно " + deposit);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int money = 15_000;
        int deposit = 0;
        int month = 1;
        for (; deposit <= 12_000_000; month++) {
            deposit = deposit + deposit * 7 / 100;
            deposit = deposit + money;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " сумма накоплений равно " + deposit);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int money = 15_000;
        int deposit = 0;
        int month = 1;
        for (; month <= 108; month++) {
            deposit = deposit + deposit * 7 / 100;
            deposit = deposit + money;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " сумма накоплений равно " + deposit);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int days = 5;
        for (; days <= 31; days = days + 7) {
            System.out.println("Сегодня пятница, " + days + " -е число. Необходимо подготовить отчет");
            }
        }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2022;
        int lastYear = year - 200;
        int futureYear = year + 100;
        for (;lastYear <=2022 ; lastYear++)
        { if (lastYear % 79 ==0)
            System.out.println("В "  + lastYear + " год прилетала комета");
        }
        for (;futureYear >= 2022; futureYear--){
            if (futureYear % 79 == 0)
                System.out.println("В " + futureYear + " год прилетит комета");
        }
    }
    }

