package forloop;

class Loop11 {
	   public static void main(String args[]) {
		int n = 57;
		System.out.print("Even Numbers from 24 to "+n+" are: ");
		for (int i = 23; i <= n; i++)
		{
		   if (i%2 == 0) {
			System.out.println(i);
		   }
		}
	   }
	}