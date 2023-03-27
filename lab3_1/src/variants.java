import java.util.regex.*;

public class variants {
    public static void z1(String string){
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher("abcdefghijklmnopqrstuv18340");
  
        //string.equals("abcdefghijklmnopqrstuv18340");

        System.out.println(matcher.matches());

    }

    public static void z2(String guid){
        Pattern pattern = Pattern.compile("(?i)[a-f\\d]{8}-([a-f\\d]{4}-){3}[a-f\\d]{12}");
        Matcher matcher = pattern.matcher(guid);

        System.out.println(matcher.matches());
    }

    public static void z3(String mac){
        Pattern pattern = Pattern.compile("(?i)([a-f\\d]{2}:){5}[a-f\\d]{2}");
        Matcher matcher = pattern.matcher(mac);

        System.out.println(matcher.matches());
    }

    public static void z4(String url){
        Pattern pattern = Pattern.compile("(?i)http[s]*://[w]{0,3}[.]?[a-z\\d]+[.][a-z\\d]+");
        Matcher matcher = pattern.matcher(url);

        System.out.println(matcher.matches());
    }

    public static void z5(String color){
        Pattern pattern = Pattern.compile("(?i)[#][a-f\\d]{6}");
        Matcher matcher = pattern.matcher(color);

        System.out.println(matcher.matches());
    }

    public static void z6(String date){
        Pattern pattern = Pattern.compile("[\\d]{2}/[\\d]{2}/(([1][6-9])|([2-9][0-9]))[\\d]{2}");
        Matcher matcher = pattern.matcher(date);

        System.out.println(matcher.matches());
    }

    public static void z7(String email){
        Pattern pattern = Pattern.compile("(?i)[.a-z\\d]+[@][.a-z\\d]+");
        Matcher matcher = pattern.matcher(email);

        System.out.println(matcher.matches());
    }

    public static void z8(String ip){
        Pattern pattern = Pattern.compile("((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$");
        Matcher matcher = pattern.matcher(ip);

        System.out.println(matcher.matches());
    }

    public static void z9(String password){
        Pattern pattern = Pattern.compile("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
        Matcher matcher = pattern.matcher(password);

        System.out.println(matcher.matches());
    }

    public static void z10(String number){
        Pattern pattern = Pattern.compile("[1-9][\\d]{5}");
        Matcher matcher = pattern.matcher(number);

        System.out.println(matcher.matches());
    }

    public static void z11(String price){
        Pattern pattern = Pattern.compile("([\\d]+|([\\d]+[.][\\d]{2})[\\s](USD|RUR|EU))");
        Matcher matcher = pattern.matcher(price);

        if(matcher.matches()){
            String[] ps = price.split(" ");
            System.out.println(ps[0]);
        }else System.out.println("Incorrect price");
    }
    public static void z12(String s){
        System.out.println(s.contains(" +"));
    }

    public static void z13(String r){
        Pattern pattern = Pattern.compile("([^)(]*[(][^)(]*[)][^)(]*)+");
        Matcher matcher = pattern.matcher(r);

        System.out.println(matcher.matches());
    }

}
