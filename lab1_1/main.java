import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) 
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Select var : ");
        int variant = Integer.parseInt(reader.readLine());

        Scanner scn = new Scanner(System.in);
        
        switch (variant) {
            case 1 : Variants.z1(); break;
            case 2 : Variants.z2(); break;
            case 3 : Variants.z3(); break;
            case 4 : Variants.z4(); break;
            case 5 : Variants.z5(); break;
            case 6 :  System.out.println(Variants.z6()); break;
            case 7 :  System.out.print("Set lenght : ");
                System.out.print(Variants.z7(scn.nextInt()));
            break;
            case 8 : Variants.z8(Data.revRow); break;
            case 9 : System.out.println(Variants.z9("Хлеб булка хлЕб кирпич арбуз хлев хлеб, чурчхелла", "хлеб")); break;
            case 10 : Variants.z10("фыапвролпоарвпаааап"); break;
            case 11 : Variants.z11v2();  break;
            case 12 : Variants.z12(); break;
            case 13 : Variants.z13(); break;
            default: System.out.println("No such variant");
        }
        scn.close();
    }
}