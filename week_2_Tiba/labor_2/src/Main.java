import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static boolean is_prim(int szam)
    {
        boolean valasz = true;
        for (int i = 2; i < (int)sqrt(szam); i++) {
            if(szam % i == 0)
            {
                return false;
            }
        }
        return valasz;
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        String s1 = "Jabuci";
        String s2 = s1;
        String s3 = new String("Jabuci");
        String s4 = "Jabuci";
        /*System.out.println(s1 == s2);
        System.out.println(s1 == s3);// == az objektumok referenciáját hasonlítja össze,
        System.out.println(s1 == s4);
        System.out.println(s2 == s3);
        // kapcsolt stringek este áll a kimenetek
        //mivel a stringek gyakren használtak és nem módosíthatóak,
        //ezért a hatékonyság érdekében a java virtuális gép egyetlen példányt hoz létre
        // és társít string literálhoz,
        // azaz több hivatkozás ugyanarra a stringre mutat, azt a példányt kapcsolt stringnek nevezzük.
        //az azonos stringek kapcsolása több cpu igényel
        System.out.println("Equals:"+s1.equals(s2));//equals tartalmilag hasonlítja össze
        System.out.println(s1.compareTo("Alma"));
        System.out.println(s1.compareTo(s4));
        System.out.println("Alma".compareTo(s1));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf("a"));
        System.out.println("Alma fa".lastIndexOf("a"));
        System.out.println(s1.length());
        System.out.println(s1.substring(2, 6));
        System.out.println(s1.startsWith("Jabu"));
        System.out.println(s1.endsWith("uci"));

        String s6 = s1.substring(3);

        boolean valasz = s1.endsWith("uci");
        int hossz = s1.length();
        char k1 = s1.charAt(0);

        System.out.println(s1.toUpperCase());
        System.out.println("    Welcome!      ".trim());
        System.out.println(s1.replace('a','A'));
        System.out.println(s1.replaceFirst("b","c"));*/

        /*Scanner sc = new Scanner(System.in);//standard bemenet

        String s8 = sc.nextLine();

        /*char[] str = s1.toCharArray();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        String[] s7 = s8.split(" ");
        for (int i = 0; i < s7.length; i++) {
            System.out.println(s7[i]);
        }

        String.format(s8, args);//Hf String.format működése
        */
        System.out.println("Prim-e: "+is_prim(17));//Hf 1 re működjön az függvény

    }
}