// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Fan F1 = new Fan();
        Fan F2 = new Fan();
        F1.setColor("yellow");
        F1.setSpeed(Fan.FAST);
        F1.setRadius(10);
        F1.setOn(true);
        F2.setOn(false);
        F2.setRadius(5);
        F2.setSpeed(Fan.MEDIUM);
        F2.setColor("blue");

        System.out.println(F1.toString());
        System.out.println(F2.toString());
    }
}