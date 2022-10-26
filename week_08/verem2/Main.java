public class Main {
    public static void main(String[] args) {
        Verem v = new Verem();

        System.out.println(v.ures());

        v.betesz(1);
        v.betesz(2);
        v.betesz(3);

        System.out.println(v);

        System.out.println(v.meret());

        System.out.println(v.ures());

        v.kivesz();

        System.out.println(v);

        int x = v.kivesz();

        System.out.println(x);

        

    }
}