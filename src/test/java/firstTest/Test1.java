package firstTest;

import static java.lang.Math.pow;

public class Test1 {
    public static void main(String[] args) {
         /*
    1) Если а – четное посчитать а*б/с,
    если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
    иначе посчитать  а+б-с
     */
         System.out.println(task1(0, -1, 1));

    }

    /*./
    1) Если а – четное посчитать а*б/с,
    если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
    иначе посчитать  а+б-с
     */
    public static int task1(int a, int b, int c)
    {
        if(a % 2 == 0)
        {
            return a * b / c;
        }
        else if((a + c | b + c)% 2 == 0)
        {
            return (int) pow(a, c);
        }
        else
        {
            return a + b - c;
        }
    }
}
