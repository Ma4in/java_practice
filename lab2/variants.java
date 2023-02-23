import java.io.IOException;

public class variants
{
    public static void z1() // d = 3.765
        throws IOException
    {
        int a = 15;
        int b = 4;
        float c = (float)a / b; //(float)
        double d = a * 1e-3 + c;
        System.out.println(d);
    }

    public static void z2()  //b = 0
        throws IOException
    {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) (i + f);
        System.out.println((byte)b); //(byte)
    }
    
    public static void z3()  //9
        throws IOException
    {
        short number = 9;
        char zero = '0';
        int nine = (Character.getNumericValue(zero) + number); //Character.getNumericValue
        System.out.println(nine);
    }

    public static void z4()  //1000.0
        throws IOException
    {
        double d = (short) 2.50256e2d;
        char c = 'd'; // - (short)
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }

    public static void z5() //1234567
        throws IOException
    {
        long l =  1234_564_890L;  //-----------//
        int x =  0b1000_1100_1010; //--------//
        double m = (byte) 110_987_654_6299.123_34;
        float f =  l++ + 10 + ++x - (float) m; //---------//
        l = (long) f / 1000;
        System.out.println(l);
    }

    public static void z6() //2.941
        throws IOException
    {
        int a = 50;
        int b = 17;
        double d = (double) a / b; //-------//
        System.out.println(d);
    }

    public static void z7() //1.0
        throws IOException
    {
        int a = (byte)257;//-----//
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / e;
        System.out.println(d); 
    }

    public static void z8() //5.5
        throws IOException
    {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d =  a + b / c / (double)e; //---//
        System.out.println(d);
    }
}
