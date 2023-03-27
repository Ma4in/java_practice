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

            case 1_1: secondpart.z1_1("I like Java!!!");; break;
            case 1_2: secondpart.z1_2(); break;
            case 1_3: secondpart.z1_3("Object-oriented programming is a programming language model organized around objects rather than actions and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.", "Object-oriented programming", "OOP"); ; break;
            case 1_4: secondpart.z1_4(); break;
            case 1_5: secondpart.z1_5("Hizenberg", "100", "meth"); ; break;
            case 1_6: secondpart.z1_6(); break;
            case 1_7: variants.z4(); break;
            case 1_8: variants.z5(); break;
            case 1_9: variants.z8(); break;
            case 1_10: secondpart.z1_10(); break;
            case 1_11: System.out.println(secondpart.z1_11("referense.org")); break;
            default: System.out.println("No such variant.");
        }
        scan.close();
    }
}