import java.lang.Math;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class variants //1, 6, 11, 16, 21
{
    public static double varOne(double[] x, double[] y)
    {
        double mx = Extensions.maxvalue(x);
        double my = Extensions.maxvalue(y);
        double z = (Math.exp(Math.abs(mx))-Math.exp(Math.abs(my)))/(Math.sqrt(Math.abs(mx-my)));

        return z;
    }

    public static double varSix(double[] massA, double[] massB, double[] massC)
    {
        double minA = Extensions.minvalue(massA);
        double minB = Extensions.minvalue(massB);
        double minC = Extensions.minvalue(massC);

        if (Math.abs(minA) > 10)
        {
            return minB + minC;
        } else {
            return 1 + Math.abs(minC);
        }
    }

    public static void varEleven() throws IOException
    {
        double[] mass = Data.massOne;
        System.out.println("Origin : ");
        for (double num : mass) {
            System.out.print(num + " ");
        }
        Arrays.sort(mass);
        System.out.println("Sorted : ");
        for (double num : mass) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < mass.length; i++)
        {
            double sum = 0;
            double n = mass[i];
            while(n != 0){
                 sum += (n % 10);
                 n/=10;
            }  
            mass[i] = sum;
        }
        System.out.println("Sum of Digits of a Numbers : ");
        for (double num : mass) {
            System.out.print((int)num + " ");
        }
    }

    public static double[] varSixteen(double[][] mass)
    {
        List<Double> list = new ArrayList<>();
        for (int i=0; i < mass[0].length; i++){
            list.add(Extensions.gcd((int)mass[1][i], (int)mass[0][i]));
        }

        double[] res = new double[list.size()];

        for (int n = 0; n < list.size(); n ++){
            res[n] = list.get(n);
        }

        return res;
    }

    public static int var21(int x)
    {
        if (x < -5){
            return 2*Math.abs(x)-1;
        }else if (x > 5) {
            return 2*x;
        }else { return x*x;}
    }
}