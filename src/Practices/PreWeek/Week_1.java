package Practices.PreWeek;

public class Week_1 {
    public static void main(String[] args) {
        //System.out.println("Hello Hafta 1"); TODO
        System.out.println("Hello Hafta 2");
        System.out.println("Hello Hafta 3");


        String name = "Merhaba dünya";
        System.out.println(name);

        int lenght= name.length();
        System.out.println(lenght);

        System.out.println( name.toUpperCase());

        System.out.println(name.charAt(5));
        System.out.println("Merhaba Patika".substring(8));
        String hi = "Merhaba";
        System.out.println(hi + " Patika");

        boolean isStringsEquals =hi.equals(name);
        System.out.println(isStringsEquals);
        boolean isStringsEquals1 ="hi".equals("patika");
        System.out.println(isStringsEquals1);

        String s1 = "Java";
        String s2 = new String ("Java");
        String s3 = "java";
        String s4 = "Java";

        System.out.println("s1 esit mi s2:" + s1.equals(s2));
        System.out.println("s1 esit mi s3:" + s1.equals(s3));



    }
}


