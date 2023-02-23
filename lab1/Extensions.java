public class Extensions 
{
    public static double maxvalue(double[] mass)
    {
        double max = mass[0];
        for (int i = 1; i < mass.length; i++)
            if (mass[i] > max)
                max = mass[i];
        return max;
    }

    public static double minvalue(double[] mass)
    {
        double min = mass[0];
        for (int i = 1; i < mass.length; i++)
            if (mass[i] < min)
                min = mass[i];
        return min;
    }

    public static double gcd(int a, int b){
        double gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
