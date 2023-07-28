public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        //task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.printf("Ты можешь водить");
        } else {
            System.out.printf("Ты не можещь водить");
        }
        System.out.println();
        System.out.println();
    }


    public static void task2() {
        System.out.println("Задача 2");
        int tenperature = 7;
        if (tenperature >= 5) {
            System.out.printf("На улице " + tenperature + " градусов, можно идти без шапки");
        } else {
            System.out.printf("На улице " + tenperature + " градусов, нужно надеть шапку");
        }
        System.out.println();
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 40;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 45;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        }
        else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else if (age >=24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        else if ( age >= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора отдохнуть");
        }
        System.out.println();
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");

        int seat = 102;
        if (seat <= 60) {
            System.out.println("Место №" + seat + " сидячее, в вагоне остались свободные места");
        }
        else if (seat > 60 && seat <= 101) {
            System.out.println("Место №" + seat + " стоячее, в вагоне остались свободные места");
        }
        else if (seat == 102) {
            System.out.println("Место №" + seat + " стоячее, это  последнее свободное место в вагоне");
        }
        else if (seat > 102) {
            System.out.println("В вагоне отсутствуют свободные места");
        }
        System.out.println();
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 20;
        int two = 428;
        int three = 55;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше чем " + two + " и " + three);
        }
        else if (two > one && two > three) {
            System.out.println("Число " + two + " больше чем " + one + " и " + three);
        }
        else if (three > one && three > two) {
            System.out.println("Число " + three + " больше чем " + two + " и " + one);
        }
    }
}