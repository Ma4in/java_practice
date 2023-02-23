import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Extensions {
    public static String[] rowsInput() 
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Count of rows : ");
        int rowsCount = Integer.parseInt(reader.readLine());
        String[] strings = new String[rowsCount];

        for (int i = 0; i < strings.length; i++)
        {
            System.out.print("Input row : ");
            strings[i] = reader.readLine();
        }

        return strings;
    }

    public static Double distance(double[] p1, double[] p2)
    {
        double dx2, dy2;
        dx2 = Math.pow(p1[0] - p2[0], 2);
        dy2 = Math.pow(p1[1] - p2[1], 2);
        return Math.sqrt(dx2+dy2);
    }
}
