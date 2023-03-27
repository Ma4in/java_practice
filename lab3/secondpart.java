import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class secondpart {
    public static void z1_1(String str){
        System.out.println(
            str.charAt(str.length()-1) + "\n" +
            str.endsWith("!!!") + "\n" +
            str.startsWith("I like")+ "\n" +
            str.contains("Java")+ "\n" +
            str.indexOf("Java")  + "\n" +
            str.replaceAll("a", "0") + "\n" +
            str.toUpperCase() + "\n" +
            str.toLowerCase() + "\n" +
            str.substring(0, 6) + str.substring(11)
        );
    }

    public static void z1_2(){
        int x = 3;
        int y = 56;
        String s = "a + b = c";
        System.out.println(
            x + " + " + y + " = " + (x+y) + "\n" +
            x + " - " + y + " = " + (x-y) + "\n" +
            x + " * " + y + " = " + (x*y) + "\n" +
            new StringBuilder(s).deleteCharAt(6).insert(6,"equals").toString() + "\n" +
            new StringBuilder(s).replace(6,7,"equals").toString()
        );
    }

    public static void z1_3(String str, String replace, String string){
        str = str.replaceAll(replace, "tempWordDraw");
        String[] words = str.split(" ");
        boolean second = false;
        for (int i = 0; i < words.length; i++){
            if (words[i].contains("tempWordDraw"))
            {
                if(second){
                    words[i] = words[i].replace("tempWordDraw", string);
                    second = false;
                }
                else {
                    words[i] = words[i].replace("tempWordDraw", replace);
                    second = true;
                }
            }
        }
        
        System.out.println(String.join(" ", words));
    }

    public static void z1_4()
        throws IOException
    {
        String[] strings = extentions.rowsInput();
        for (String word : strings){
            int lenght = word.length();
            if(lenght > 3)System.out.println(word.substring(lenght/2 -1, lenght/2+1));
            else System.out.println("Word - " + word + ", to short");
        }
    }

    public static void z1_5(String surname, String mark, String subject){
        System.out.println("Студент "+surname+" получил "+mark+" по "+subject+"");
    }

    public static void z1_6(){
        String row = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12";
        while(row.indexOf("Java") != -1){
            System.out.println(row.substring(row.indexOf("Java"), row.indexOf("Java")+ 7));
            row = row.replace(row.substring(row.indexOf("Java"), row.indexOf("Java")+ 7), "0");
        }
    }

    public static void z1_10(){
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher = pattern.matcher("ccccccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    public static boolean z1_11(String dns){
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(dns);
        return matcher.matches();
    }
}
