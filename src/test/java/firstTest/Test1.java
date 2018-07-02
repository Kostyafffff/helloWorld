package firstTest;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Math.decrementExact;
import static java.lang.Math.pow;

public class Test1 {
    public static void main(String[] args) {
        //удаление последнего слова
        String word = "sadas dsadasdsa sad";
        word.substring(0, word.lastIndexOf(" "));

        //Строка в целое число
        try {
            Integer i1 = new Integer("20349");
            System.out.println(i1);
        }catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        //строка в вещественное число
        try {
            Double d1 = new Double("4.4e10");
            System.out.println(d1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        //преобразование вещественного числа в строку
        //String str = Double.toString(i);

        //преобразование целого числа в строку
        int number = 5;
        System.out.println(Integer.toString(number));


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

    // 1 плоскость (x > 0, y > 0, z > 0)
    // 2 плоскость (x > 0, y > 0, z < 0
    // 3 плоскость (x < 0, y > 0, z < 0)
    // 4 плоскость (x < 0, y > 0, z > 0)
    // 5 плоскость (x > 0, y < 0, z < 0)
    // 6 плоскость (x > 0, y < 0, z < 0)
    // 7 плоскость (x < 0, y < 0, z < 0)
    // 8 плоскость (x < 0, y < 0, z > 0)
    public static void greatFunctionn(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("Точка приндлежит первой плоскости");
        } else if (x > 0 && y > 0 && z < 0) {
            System.out.println("Точка приндлежит второй плоскости");
        } else if (x < 0 && y > 0 && z < 0) {
            System.out.println("Точка принадлежит третей плоскости");
        } else if (x < 0 && y > 0 && z > 0) {
            System.out.println("Точка приндлежит четвертой плоскости");
        } else if (x > 0 && y < 0 && z < 0) {
            System.out.println("Точка приндлежит пятой плоскости");
        } else if (x > 0 && y < 0 && z < 0) {
            System.out.println("Точка принадлежит шестой плоскости");
        } else if (x < 0 && y < 0 && z < 0) {
            System.out.println("Точка принадлежит седьмой плоскости");
        } else if (x < 0 && y < 0 && z > 0) {
            System.out.println("Точка принадлежит восьмой плоскости");
        } else {
            System.out.println("Точка не принадлежит никакой плоскости");
        }
    }


        //факториал
        public static int factForFirst( int number)
        {
            int mult = 1;
            for(int i = 1; number >= 1; number--)
            {
                mult *= number;
            }
            return mult;
        }

    //факториал
        public static int factForSecond( int number)
        {
            int mult = 1;
            for(int i = 1; i <= number; i++)
            {
                mult *= i;
            }
            return mult;
        }

    //факториал
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

    //факториал
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

    //Подсчитать количество слов во введенной пользователем строке
    public static void wordCounter(String s)
    {
        String temp = new String();
        temp = s.trim();
        String[] awords = temp.split("\\s+");

        if(temp.isEmpty())
        {
            System.out.println("Строка пустая");
        }
        else{
            System.out.println(awords.length);
        }
    }
    public static String convertToString(int number)
    {
        int a;
        int b;
        StringBuilder build = new StringBuilder();

        while (number > 0)
        {
            a = number % 10;
            number /= 10;
            b = (char)('0' + a);
            build.append(b);
        }
        return build.reverse().toString();
    }

    public static String doubleToString(double number)
    {
        String str = Double.toString(number);
        return str;
    }

    //)Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого слова
    public static String shortestWord(String word)
    {
        String [] splitArray = word.split("[\\p{Punct}\\s]+");
        //System.out.println(Arrays.toString(splitArray));
        Set set = new TreeSet<String>((o1, o2) -> o1.length() - o2.length());
        set.addAll(Arrays.asList(splitArray));

        String shortest = (String) set.toArray()[0];
        return shortest;
    }
}

