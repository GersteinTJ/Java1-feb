import java.util.Scanner;

public class Main {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void main(String[] args) {
        System.out.println("Задание №2. Переменные");
        byte bt = 95;
        short s = 29563;
        char chr = 'c';
        int i = 454545;
        long l = 1654894411L;
        float f = 3.14f;
        double dbl = 7.62;
        boolean bln = true;
        System.out.println(bt);
        System.out.println(s);
        System.out.println(chr);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(dbl);
        System.out.println(bln);

        //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println("");
        System.out.println("Задание №3. Вычисление выражения a * (b + (c / d))");
        float a = 3.14f;
        float b = 6.89f;
        float c = 5.48f;
        float d = 7.8f;
        System.out.println("a = " + a + ";\tb = " + b + ";\tc = " + c + ";\td = " + d + ";");
        System.out.println("Результат вычисления: " + calculate(a, b, c, d));

        //4. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
        System.out.println("");
        System.out.println("Задание №4. Cумма в пределах от 10 до 20");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Сумма чисел: " + (num1 + num2));
        System.out.println("Условие выполнено: " + btw10and20(num1, num2));

        //5. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
        System.out.println("");
        System.out.println("Задание №5. Положительное или отрицательное число");
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (isPositive(num)) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        };
//6. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println("");
        System.out.println("Задание №6. Отрицательное или положительное число");
        System.out.print("Введите число: ");
        int num6 = in.nextInt();
        System.out.println("Число отрицательное? " + isNegative(num6));
       // in.close();

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
// Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        System.out.println("");
        System.out.println("Задание №7. Приветствие");
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Greetings(name);

// 8. * Написать метод, который определяет, является ли год високосным,
// и выводит сообщение в консоль. Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("");
        System.out.println("Задание №8. Високосный год");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int num8 = in.nextInt();
        System.out.println("Год високосный? " + yearCheck(num8));
    }

    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean btw10and20(int x, int y) {
        int sm = x + y;
        if (sm >= 10 && sm <= 20) {
            return true;
        };
        return false;
    }

       private static boolean isPositive(int h){
        if (h >= 0) {
            return true;
        };
        return false;
    }


    private static boolean isNegative (int j) {
        if (j < 0) {
            return true;
        };
        return false;
    }

    private static void Greetings (String name) {
        System.out.println("Привет, " + name + "!");
    }

    private static boolean yearCheck (int p) {
        if (p % 4 == 0) {
            if (p % 100 == 0) {
                if (p % 400 == 0) {
                    return true;
                };
                return false;
            };
            return true;

        }

        return false;
    }

}