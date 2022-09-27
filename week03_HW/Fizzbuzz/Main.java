class FizzBuzz
{
    private int limit;

    public FizzBuzz(int limit)
    {
        this.setLimit(limit);;
    }

    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    public void start()
    {
        for(int i = 0; i <= limit ; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        FizzBuzz fb = new FizzBuzz(100);
        fb.start();
    }
}