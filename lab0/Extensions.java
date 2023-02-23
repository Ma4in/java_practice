import java.util.Random;

public class Extensions {

    public static String helloWorld(String consoleRead)
    {
        consoleRead = consoleRead.substring(0,1).toUpperCase() + consoleRead.substring(1);

        System.out.println("\n Hello, " + consoleRead + "!\n"); 

        return consoleRead;
    }

    public static void fiveRows(String warrior)
    {
        int count = 5;
        for (int i =0 ; i < count; i ++)
        {
            System.out.print("Destroy Droidekas, " + warrior +"!\n\n");
        }
    }

    public static void astrodroidsAtack(int count)
    {
        Random rnd = new Random();
        Data.astrodroidsLeft = count - rnd.nextInt(count);
        System.out.println("Astrodroits under atack!!\n" + Data.astrodroidsLeft + " astrodroids left.");
    }
}
