import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class variants {
    public static void z1()
        throws IOException
    {
        String[] rows = extentions.rowsInput();
        String shortest = rows[0];
        String longest = rows[0];
        for (String row : rows){
            if (row.length() > longest.length()){
                longest = row;
            }
            if (row.length() < shortest.length()){
                shortest = row;
            }
        }
        System.out.println("Longest " + longest + " : " + longest.length());
        System.out.println("Shortest " + shortest + " : " + shortest.length());
    }

    public static void z2()
        throws IOException
    { 
        String[] strings = extentions.rowsInput();

        Comparator<String> stringLengthComparator = new StringLengthSort();

        Arrays.sort(strings, stringLengthComparator);

        for(String row : strings){
            System.out.println(row + " : " +row.length());
        }
    }

    public static void z3()
    throws IOException
    {
        String[] strings = extentions.rowsInput();

        int avrg = 0;

        for (String row : strings)
        {
            avrg += row.length();
        }
        avrg = avrg / strings.length;
        System.out.println("\n Average lenght = " + avrg + "\n");
        for (String row : strings)
        {
            if (row.length() > avrg) { System.out.println(row + " : " + row.length());}
        }
    }

    public static void z4 ()
        throws IOException
    {
        String[] strings = extentions.rowsInput();
        int s = 9999;
        String muWord ="";
        for (String word : strings){
            ArrayList<Character> uniq = new ArrayList<Character>();
            int countUniq = 0;
            for ( char letter : word.toCharArray() ) {  
                if (!uniq.contains(letter)){
                    uniq.add(letter);
                    countUniq += 1;
                }
            }
            if (countUniq < s){
                s = countUniq;
                muWord = word;
            }
        }
        System.out.println("Minimum different symbols in word : " + muWord);
    }

    public static void z5 ()
        throws IOException
    {
        String[] strings = extentions.rowsInput();
        boolean latinOnly = true;
        int latinCount = 0;
        int equalsCount = 0;
        for (String word : strings) {
            word = word.toUpperCase();
            int gCount = 0;
            int sCount = 0;
            for (char symb : word.toCharArray()){
                if ((int)symb < 65 || (int)symb > 90){
                    latinOnly = false;
                }
                if ((int)symb == 65 || (int)symb == 69 || (int)symb == 73 || (int)symb==79 || (int)symb == 85){
                    gCount++;
                } else {sCount++;}
            }
            if (gCount == sCount) {equalsCount++;}
            if (latinOnly) {latinCount++;}
            latinOnly = true;
        }
        System.out.println("Latin characters only : " + latinCount + "\nEqual number of leterr types : " + equalsCount);
    }

    public static void z6 ()
        throws IOException
    {
        String[] strings = extentions.rowsInput();
        for (String word : strings)
        {
            boolean increase = true;
            char[] letters = word.toCharArray();
            for (int i = 1; i < letters.length; i ++){
                if ((int)letters[i-1] > (int)letters[i]){
                    increase = false;
                }
            }
            if (increase)
            { 
                System.out.println("Word with increases characters codes : " + word);
                return;
            }
        }
    }

    public static void z7()
        throws IOException
    {
        String[] strings = extentions.rowsInput();
        for (String word : strings){
            boolean uniqOnly = true;
            ArrayList<Character> uniqChars = new ArrayList<Character>();
            for (char ch : word.toCharArray()){
                if (uniqChars.contains(ch))uniqOnly = false;
                else uniqChars.add(ch);
            }
            if (uniqOnly) {
                System.out.println("Word only with uniq characters : " + word);
                return;
            }
        }
    }

    public static void z8()
        throws IOException
    {
        String[] strings = extentions.rowsInput();
        boolean first = true;
        for (String word : strings){
            boolean numbersOnly = true;
            for (char ch : word.toCharArray()){
                if ((int)ch <48 || (int)ch > 57) numbersOnly = false;
            }

            if (numbersOnly){
                if (word.equals(new StringBuilder(word).reverse().toString())){
                    if (!first) System.out.println("Second palindrom number is : " + word);
                    first = false;
                }
            }
        }
    }
}
