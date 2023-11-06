import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double[] array = new double[]{24, 12.10, 45.09};
        try {
            System.out.println(array[2]);
            System.out.println(10 / a);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.toString());
            System.out.println(array[2]);
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.toString());
            System.out.println(10);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
        }
        finally {
            System.out.println("Mindenkép lefut, ha volt kivétel, vagy nem.");
        }
        System.out.println("End");
    }
}
