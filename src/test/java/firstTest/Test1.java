package firstTest;

import java.math.BigInteger;

import static java.lang.Math.decrementExact;
import static java.lang.Math.pow;

public class Test1 {
    public static void main(String[] args) {
         /*
    1) Если а – четное посчитать а*б/с,
    если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
    иначе посчитать  а+б-с
     */

         System.out.println(doWhileFact(5));
         System.out.println(task1(0, -1, 1));

         /*
        2) Определить какой области принадлежит точка с координатами (х,у,z)
          */
         //зеркальное число 321 123


    }

    /*./
    1) Если а – четное посчитать а*б/с,
    если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
    иначе посчитать  а+б-с
     */
    public static int task1(int a, int b, int c) {
        if (a % 2 == 0) {
            return a * b / c;
        } else if ((a + c | b + c) % 2 == 0) {
            return (int) pow(a, c);
        } else {
            return a + b - c;
        }
    }
        public static int factForFirst( int number)
        {
            int mult = 1;
            for(int i = 1; number >= 1; number--)
            {
                mult *= number;
            }
            return mult;
        }

        public static int factForSecond( int number)
        {
            int mult = 1;
            for(int i = 1; i <= number; i++)
            {
                mult *= i;
            }
            return mult;
        }

        public static int whileFact(int number)
        {
            int i = 1;
            int mult = 1;
            while (i <= number)
            {
                mult *= i;
                i++;
            }
            return mult;
        }

        public static int doWhileFact(int number)
        {
            int i = 1;
            int mult = 1;
            do{
                mult *= i;
                i++;
            }while(i <= number);
            return mult;
        }

        //если на выход получим огроменное число
    public static BigInteger factorialBig(int number)
    {
        BigInteger big = BigInteger.ONE;
        for(int i = 1; i <= number; i++)
        {
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }

    //2) Вывести число, которое является зеркальным отображением последовательности цифр заданного числа,
    // например, задано число 123, вывести 321
    public static int mirrorPrint(int number)
    {
        while (number != 0)
        {
            System.out.print(number % 10);
            number /= 10;
        }
        return number;
    }

    //3.1) Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2
    public static int[] replaceArray(int[] array)
    {
        int half = array.length / 2;
        int div = half + array.length % 2;
        for(int i = 0; i < div; i++)
        {
            int temp = array[i];
            array[i] = array[div + i];
            array[div + i] = temp;
        }
        return array;
    }
    //сортировка пузырьком
    public static int[] bubbleSort(int[] array)
    {
        int l = array.length;
        for(int i = 0; i < l-1; i++)
        {
            for(int j = 0; j < l-1-i; j++)
            {
                if(array[j] > array[j + 1])
                {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }


}

