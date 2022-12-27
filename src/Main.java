import java.security.spec.RSAOtherPrimeInfo;

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

    public static void task1 () {
        var dog = 8;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);


    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);

        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
        // Пишем код для задачи 2
    }


    public static void task3 () {
        System.out.println("Задача 3");
        double dog = 8;
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
        // Пишем код для задачи 3
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);



    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


    }

    public static void task6 () {
        System.out.println("Задача 6");
        var weigtBoxerOne = 78.2;
        var weigtBoxerTwo = 82.7;
        var totalWeight = weigtBoxerOne + weigtBoxerTwo;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var difference = weigtBoxerTwo - weigtBoxerOne;
        System.out.println("Разница в весе между двумя бойцами " + difference + " кг");


    }

    public static void task7 () {
        System.out.println("Задача 7");
        var weigtBoxerOne = 78.2;
        var weigtBoxerTwo = 82.7;
        var differenceSubtraction = weigtBoxerTwo - weigtBoxerOne;
        System.out.println("Разница в весе между двумя бойцами " + differenceSubtraction + " кг");
        var differenceDivision = weigtBoxerTwo % weigtBoxerOne;
        System.out.println("Разница в весе между двумя бойцами " + differenceDivision + " кг");


    }

    public static void task8 () {
        System.out.println("Задача 8");
        var overTime = 640;
        var employee = overTime / 8;
        System.out.println("Всего работников в компании — " + employee + " человек");
        var overEmployer = employee + 94; // Новое кол-ыо работников
        var newTime = overEmployer * 8;
        System.out.println("Если в компании работает " + overEmployer + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");


    }
}