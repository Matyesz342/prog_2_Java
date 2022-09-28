class Hamming
{
    private String S1;
    private String S2;

    public Hamming(String S1, String S2)
    {
        this.setString1(S1);
        this.setString2(S2);
    }

    public void setString1(String String1)
    {
      this.S1 = String1;
    }

    public void setString2(String String2)
    {
      this.S2 = String2;
    }

    public String distance()
    {
        int szam = 0;
        if(S1.length() != S2.length())
        {
            return "Különböző hosszúságú Stringeket adott meg";
        }
        else
        {
            for(int i = 0; i < S1.length(); i++)
            {
                if(S1.charAt(i) != S2.charAt(i))
                {
                    szam++;
                }
            }
        }

        return String.format("A két String Hamming távolsága: %d", szam);
    }
}


class Main
{
    public static void main(String[] args)
    {
        Hamming tav = new Hamming("toner", "roses");
        System.out.println(tav.distance());
    }
}