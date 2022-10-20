public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a = 2000000001;             // 10 символов
        byte b = -128;                  // 3 символа
        short c = 30000;                // 5 символа
        long d = -1000000000000000000l; // 19 символов
        float e = 5.444f;               // 7 сомволов
        double f = 6.777777777777777;   // 15 символов после запятой
        System.out.println("Значение переменной A с типом int равно " + a);
        System.out.println("Значение переменной B с типом byte  равно " + b);
        System.out.println("Значение переменной C с типом short  равно " + c);
        System.out.println("Значение переменной D с типом long равно " + d);
        System.out.println("Значение переменной E с типом float равно " + e);
        System.out.println("Значение переменной F с типом double равно " + f);
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        float a1 = 27.12f;
        long b1 = 987678965549l;
        float c1 = 2.786f;
        boolean d1 = 2 < 1;
        short e1 = 569;
        short f1 = -159;
        short g1 = 27897;
        byte h1 = 67;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
        System.out.println(h1);
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        byte Ludmila = 23;
        byte Anna = 27;
        byte Ekaterina = 30;
        int students = Ludmila + Anna + Ekaterina;
        System.out.println("На каждого ученика рассчитано "+ (480 / students) + " листов бумаги");
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        byte bottle = 16;
        int minutes20 = bottle * 10;
        int hour = minutes20 * 3;
        int day = hour * 24;
        int day3 = day * 3;
        int month = day * 31;
        System.out.println("За 20 минут машина произвела бутылок " + minutes20 + " штук ");
        System.out.println("За сутки машина произвела бутылок " + day + " штук ");
        System.out.println("За 3 сутки машина произвела бутылок " + day3 + " штук ");
        System.out.println("За 1 месяц (31 дней) машина произвела бутылок " + month + " штук ");
        System.out.println();

        // Задание 5
        System.out.println("Задание 5");
        byte paints = 120;
        byte white = 2;
        byte brown = 4;
        int totalClasses = paints / (white + brown);
        int whiteClass = totalClasses * white;
        int brownClass = totalClasses * brown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteClass + " банок белой краски и " + brownClass + " банок коричневой краски");
        System.out.println();

        // Задание 6
        System.out.println("Задание 6");
        short bananasWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        int totalWeight = bananasWeight + milkWeight + iceCreamWeight + eggWeight;
        float totalWeightkg = totalWeight / 1000f;
        System.out.println("Вес такого спорт-завтрака - " + totalWeight + " гр, а в килограммах - " + totalWeightkg + " кг");
        System.out.println();

        // Задание 7
        System.out.println("Задание 7");
        short loseWeight = 7 * 1000;
        int loseWeight250 = loseWeight / 250;
        int loseWeight500 = loseWeight / 500;
        int meanValue = (loseWeight500 + loseWeight250) / 2;
        System.out.println(loseWeight250 + " дней уйдет на похудение, если спортсмен будет терять каждый день на 250 грамм и за " + loseWeight500 + " дней, если каждый день будет худеть на 500 грамм");
        System.out.println(meanValue + " дней может потребоваться в среднем, чтобы добиться результата похудения");
        System.out.println();

        // Задание 8
        System.out.println("Задание 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        float mashaMonthlySalary = mashaSalary * 1.1f;
        float denisMonthlySalary = denisSalary * 1.1f;
        float kristinaMonthlySalary = kristinaSalary * 1.1f;

        int mashaSalaryYear = mashaSalary * 12;
        int denisSalaryYear = denisSalary * 12;
        int kristinaSalaryYear = kristinaSalary * 12;

        float mashaYearRise = mashaMonthlySalary * 12f;
        float denisYearRise = denisMonthlySalary * 12f;
        float kristinaYearRise = kristinaMonthlySalary * 12f;

        float mashaDifference = mashaYearRise - mashaSalaryYear;
        float denisDifference = denisYearRise - denisSalaryYear;
        float kristinaDifference = kristinaYearRise - kristinaSalaryYear;
        System.out.println("Маша теперь получает " + mashaMonthlySalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + denisMonthlySalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaMonthlySalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");

    }
}