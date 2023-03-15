import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Variants
{
    public static void z1()
        throws IOException
    {
        String[] strings = Extensions.rowsInput();
        
        String shortest = strings[0];

        for (int i = 1; i < strings.length; i++)
        {
            if(strings[i].length() < shortest.length()) { shortest = strings[i]; }
        }

        System.out.println("Shortest : " + shortest.length() + " : " + shortest);
    }   
    
    public static void z2()
        throws IOException
    {
        String[] strings = Extensions.rowsInput();

        Comparator<String> stringLengthComparator = new StringLengthSort();

        Arrays.sort(strings, stringLengthComparator);

        for(String row : strings){
            System.out.println(row + " : " +row.length());
        }
    }

    public static void z3()
        throws IOException
    {
        String[] strings = Extensions.rowsInput();

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

    public static void z4()
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Row : ");
        String row = reader.readLine();
        String[] rows = row.split(" ");

        for (int i = 0; i < rows.length; i++)
        {
            char change = 'A';
            int pos = 6;
            if (pos < rows[i].length())
            {
                char[] chars = rows[i].toCharArray();
                chars[pos] = change;
                rows[i] = String.valueOf(chars);
            }
        }

        for (String word : rows){System.out.print(word + " ");}
    }

    public static void z5()
        throws IOException
    {
        char[] chars = Data.rusText.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((int)chars[i] != 32){
                System.out.print(chars[i] + " ");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < chars.length; i++) {
            if ((int)chars[i] != 32){
                System.out.print((int)chars[i]-1071 + " ");
            }
        }
    }

    public static String z6()
        throws IOException
    {
        String row = "";
        for (char ch : Data.rusText.toCharArray())
        {
            if ( Character.isLetterOrDigit(ch) || (ch == ' '))
            {
                row += ch;
            }
        }

        return row;
    }

    public static String z7(int lenght)
    {
        boolean confirm = false;
        String row = "";
        String[] words = Data.text.split(" ");
        for (String word : words){
            if (word.length() == lenght){
                char[] w = word.toLowerCase().toCharArray();
                for (int i = 0; i < Data.letters.length; i++){
                    if(w[0] == Data.letters[i]) {confirm = true;}
                }
                if (confirm) {row += word + " ";}
                confirm = false;
            } else {row += word + " ";}
        }
        return row;
    }

    public static void z8(String row)
        throws IOException
    {
        System.out.println(row);

        String[] rowsArr = row.split(" ");
        
        for (String word : rowsArr){
            if(row.contains(new StringBuilder(word).reverse().toString())){
                System.out.println(word + " : " + new StringBuilder(word).reverse().toString());
            }
        }
    }

    public static String z9(String row, String word)
        throws IOException
    {
        int counter = 0;
        String[] rowArr = row.toLowerCase().replaceAll("[-.?!)(,:]", "").split(" ");
        for (String rowi : rowArr){
            if(rowi.equals(word)){counter++;}
        }
        return (word + " : " + counter).toString();
    }

    public static void z10(String row)
        throws IOException
    {
        System.out.println(row.length());
        int glas = 0;
        int soglas = 0;
        char[] rowArr = row.toLowerCase().toCharArray();
        for (int i =0; i < rowArr.length; i++)
        {
           if (new String(Data.letters).contains(String.valueOf(rowArr[i]))){ glas++;} 
           else{soglas++;}
        }
        if (glas > soglas){System.out.println("Гласных большe : " + glas);}
        else {System.out.println("Согласных большe : " + soglas);}
    }   

    public static void z11v2()
        throws IOException
    {
        double[][] dots = Data.massOfDots;
        double perimeter = 0;
        double[] dotA = new double [2];
        double[] dotB = new double [2];
        double[] dotC = new double [2]; 

        for (int i = 0; i < dots.length; i++)
        {
            for (int j = 0; j < dots.length; j++)
            {   
                for (int l = 0; l < dots.length; l++)
                {
                    double p = Extensions.distance(dots[i], dots[j]) + Extensions.distance(dots[l], dots[j]) + Extensions.distance(dots[i], dots[l]);
                    if (p > perimeter){
                        perimeter = p;
                        dotA = dots[i];
                        dotB = dots[j];
                        dotC = dots[l];
                    }   
                }
            }
        }
        System.out.println("Max perimeter : " + perimeter);
        System.out.println("Dots : " + dotA[0] + ", " + dotA[1] + "; " + dotB[0] + ", " + dotB[1] + "; " + dotC[0] + ", " + dotC[1] + "; ");
    }

    public static void z12()
        throws IOException
    {
        double dist = 0;
        double buff = 0;
        double[] dot = {0, 0};
        double[][] dots = Data.massOfDots;
        for (int i = 0; i < dots.length; i++){
            dist += Extensions.distance(dots[0], dots[i]);
        }
        
        for (int i = 0; i < dots.length; i++){
            buff = 0;
            for (int j = 0; j < dots.length; j++){
                buff += Extensions.distance(dots[i], dots[j]);
            }
            if (buff < dist) { dist = buff; dot = dots[i];}
        }
        System.out.println(dot[0] + ";" + dot[1] + " : " + dist);
    }

    public static void z13(){
        double dist = 0;
        double[][] dots = Data.massOfDots;
        for (int i = 1; i < dots.length; i++){
            dist += Extensions.distance(dots[i-1], dots[i]);
        }
        System.out.println("Perimeter = " + dist);
    }
}