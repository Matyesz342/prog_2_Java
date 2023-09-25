// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";
        String s5="semmi";

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s5));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf("to"));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf("o", 15));
        System.out.println(s1.length());
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 11));
        System.out.println(s1.startsWith("Wel"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(" Welcome ".trim());
        System.out.println(s1.replace('o', 'T'));
        System.out.println(s1.replaceAll("o", "T"));
        System.out.println(s1.replaceFirst("o", "T"));
        char[] str = s1.toCharArray();
    }
}