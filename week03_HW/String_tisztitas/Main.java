public class Main
{
    public static String tisztit(String text)
    {
        return text.replace(" ","");
    }

    public static void main(String[] args)
    {
        String text = "192.20.246.138: 6666";
        System.out.println(text);
        String text1 = tisztit(text);
        System.out.println(text1);
    }
}