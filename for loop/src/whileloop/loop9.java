package whileloop;

public class loop9
{
    public static void main(String args[])
    {
        int n=110011,r,rev=0;
		int o=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        
        if(rev==o)
        {
            System.out.print("110011 is a Palindrome Number");
        }
        else
        {
            System.out.print("110011 is not a Palindrome Number");
        }
    }
}