import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main 
{
    public static void main(String[] args)
        throws IOException
    {
        System.out.print("Select variant : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int stdin = Integer.parseInt(reader.readLine());
        switch (stdin) {
            case 1 : System.out.println(variants.varOne(Data.massOne, Data.massTwo)); break;
            case 6 : System.out.println(variants.varSix(Data.massOne, Data.massTwo, Data.massThree)); break;
            case 11 : variants.varEleven(); break; 
            case 16 : 
                for (double num : variants.varSixteen(Data.massOfPairs)) {
                    System.out.print(num + " ");
                }
            break;
            case 21 : 
                System.out.print("Input X : ");
                System.out.print(variants.var21(Integer.parseInt(reader.readLine())));
            break;
            default : System.out.println("No such variant"); 
        }
    }
}