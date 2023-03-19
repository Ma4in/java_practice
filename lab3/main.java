import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) 
        throws IOException
    {
        if(args != null){
            for (String word : args) System.out.println(word);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("select var : ");
        int var = scan.nextInt();
        switch (var){
            case 1 : variants.z1(); break;
            case 2 : variants.z2();break;
            case 3 : variants.z3();break;
            case 4 : variants.z4();break;
            case 5 : variants.z5();break;
            case 6 : variants.z6();break;
            case 7 : variants.z7();break;
            case 8 : variants.z8();break;
            case 100 :  break;
            default: System.out.println("No such variant.");
        }
        scan.close();
    }
}