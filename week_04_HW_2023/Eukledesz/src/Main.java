// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int Euclides(int a, int b)
    {

        int lnko = 0, r = a % b;
        while (r != 0)
        {
            r = a%b;
            a = b;
            b = r;
        }
        lnko = a;
        return lnko;
    }

    public static void main(String[] args) {
        int a = 360, b=225;
        int result = Euclides(360,225);
        System.out.println(result);
    }
}