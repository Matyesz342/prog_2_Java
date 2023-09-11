// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int negy_ossz()
    {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i*i;
        }
        return sum;
    }

    static int ossz_negy()
    {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum*sum;
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int negyzet_osszeg = negy_ossz();
        int osszeg_negyzet = ossz_negy();
        int kulombseg = 0;
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        
        kulombseg = osszeg_negyzet - negyzet_osszeg;
        System.out.println(kulombseg);
    }
}