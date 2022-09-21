package week_03.movie;


class Movie
{
    private String Title;
    private int year;
    private double score;

    public static int movieCount = 0;

    public Movie(String Title, int year, double score)
    {
        this.Title = Title;
        this.year = year;
        this.score = score;
    }

    
    public String toString()
    {
        //hf return string.format();
        return Title + "," + year + "," + score;
    }

    public String getTitle()
    {
        return this.Title;
    }

    public double getScore()
    {
        return this.score;
    }

    public int getYear()
    {
        return this.year;
    }

    public void setScore(double NewScore)
    { 
        if(NewScore > 0.0 && NewScore <= 10.0)
        {
            this.score = NewScore;
        }
        else
        {
            if(NewScore > 10)
            {
                this.score = 10.0;
            }
            else if(NewScore < 0)
            {
                this.score = 0.0;
            }
        }
    }
}



public class Main {
    public static void main(String[] args)
    {
        System.out.println(Movie.movieCount);
        

        Movie m1 = new Movie("The Terminator", 1984 , 8.1);
        Movie m2 = new Movie("Star Wars V", 1980 , 8.7);
        //Movie m3 = new Movie("Bloodshot", 2020 , -2.0);

        System.out.println(m1.getTitle());
        m2.setScore(10.8);
        System.out.println(m2.getScore());
    }
}
