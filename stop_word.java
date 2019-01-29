class stop_word
{
    public static void main(String[] args)
    {
        String s1 = "i am studing DCDR in lab";
        int length=1;
        for (int i = 0; i < s1.length(); i++) 
        {
            if(s1.charAt(i)==' ')
            {
                length++;
            }    
        }
        String s[] = {"is","are","at","the","in"};
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<=length+1;i++)
        {
            if(s1.toLowerCase().contains(s[i].toLowerCase()))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}