 class Hamming
{
    public static int distance(String S1, String S2)
    {
        int szam = 0;
        if(S1.length() != S2.length())
        {
            return 0;
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
        return szam;
    }
}


class Main
{
    public static void main(String[] args)
    {
        //Hamming tav = new Hamming("tone", "roses");
        int diff = Hamming.distance("toned", "roses");
        System.out.println("A két String Hamming távolsága: " + diff);
    }
}