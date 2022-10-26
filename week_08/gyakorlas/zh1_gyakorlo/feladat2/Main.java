public class Main
{
    public static void main(String[] args) {
        if(args.length !=2)
        {
            System.out.println("Hiba! Adjon meg két számot paraméterben!");
            System.exit(1);
        }
        else
        {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if(num2 <= num1)
            {
                System.out.println("Hiba! A második megadott szám nagyobb legyen mint az első!");
                System.exit(1);
            }
            int sum = 0;
            for(int i = num1; i <= num2; i++) {
                sum += (int) Math.pow(i,i); 
            }
            System.out.println(sum);
        }
    }
}