import java.util.Arrays;
public class Homework2 {


    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание №1. Замена в массиве 0 на 1 и 1 на 0");
        int[] array01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(chenging01(array01)));

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("");
        System.out.println("Задание №2. Массив размером 8");
        int[] arr2 = new int[8];
        System.out.println("before:" + Arrays.toString(arr2));
        createArr(arr2, 3, 0);
        System.out.println("after: " + Arrays.toString(arr2));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("");
        System.out.println("Задание №3. Умножение чисел меньше 6 на 2");
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrayes(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));

        //4. Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
        // заполнить его диагональные элементы единицами;
        System.out.println("");
        System.out.println("Задание №4. Квадратный двумерный целочисленный массив");
        createSquareArray(5);
    }



    public static int[] chenging01(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }

    public static void createArr(int[] array, int step, int shift){
        for(int i = 0; i < 8; i ++){
            array[i] = shift + i * step;
        }
    }

    public static void modifierForArrayes(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }

    public static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
}
