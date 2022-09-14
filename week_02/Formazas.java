package week_02;

public class Formazas {

    public static void main(String[] args) 
    {
        String name = "Kevin";
        String profession = "Hacker";
        int age = 17;

        // Kevin (hacker), 17

        System.out.println(name + " (" + profession + ") " + age);

        System.out.printf("%s (%s), %d\n", name, profession, age);

        String result = String.format("%s (%s), %d\n", name, profession, age);
        System.out.println(result);

    }
    
}
