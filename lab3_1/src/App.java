import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) 
    throws Exception 
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Select variant : ");
        int var = 0;
        try {
            var = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Input number");
        }

        switch (var) {
            case 1 : variants.z1("abcdefghijklmnopqrstuv18340"); break;
            case 2 : variants.z2("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"); break;
            case 3 : variants.z3("aE:dC:cA:56:76:54"); break;
            case 4 : variants.z4("http://www.example.com"); break;
            case 5 : variants.z5("#aa22dd"); break;
            case 6 : variants.z6("22/22/2500"); break;
            case 7 : variants.z7("mail@domain.com"); break;
            case 8 : variants.z8("255.168.0.1"); break;
            case 9 : variants.z9("C00L_pAss"); break;
            case 10 : variants.z10("163456"); break;
            case 11 : variants.z11("2.20 USD"); break;
            case 12 : variants.z12("(3 + 5) – 9 x 4"); break;
            case 13 : variants.z13("(3 + 5) – (9 x 4)"); break;
            default : System.out.println("No such variant");
        }
    }
}
