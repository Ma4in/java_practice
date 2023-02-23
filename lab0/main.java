import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) 
        throws IOException
    {
        System.out.print("Kto ty voin : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String consoleRead = reader.readLine();
        Data.name = Extensions.helloWorld(consoleRead);;

        Extensions.fiveRows(Data.name);

        System.out.print("Starship damaged!\n\nSend astrodroids? [Y/N] \n"); 
        String acceptance = reader.readLine();
        if (acceptance.equals("Y"))                                
        { 
            System.out.print("How many astrodroids to send?\nSet count : ");
            String count = reader.readLine();
            Extensions.astrodroidsAtack(Integer.parseInt(count));
        }

        int x = 2;
        int y = 12;

        //y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

        System.out.print("The");
        //System.out.print("Starship");
        //System.out.println(" car ");
        System.out.print(" car");
        System.out.print(" is ");
        //System.out.print("ready ");
        System.out.print(" ready ");
        System.out.print("for");
        //System.out.println(" the");
        System.out.print(" the");
        System.out.println(" race");


    } 
}