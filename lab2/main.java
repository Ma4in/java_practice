import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) 
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Select var : ");
        int variant = Integer.parseInt(reader.readLine());
        
        switch (variant){
            case 1: variants.z1(); break;
            case 2: variants.z2(); break;
            case 3: variants.z3(); break;
            case 4: variants.z4(); break;
            case 5: variants.z5(); break;
            case 6: variants.z6(); break;
            case 7: variants.z7(); break;
            case 8: variants.z8(); break;
            default: System.out.println("No such variant");
        }
    }
}