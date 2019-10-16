
public class NumToWord {
	public static void main(String[] args) {
		String[] s1= {"one","two","three","four","five","six","seven","eight",
				      "nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				      "seventeen","eighteen","nineteen"};
		String[] s2= {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String[] s3= {"hundred","thousand","lakh","crore"};
		int i=634943421;
		while(i>0) {
			if(i>=1&&i<=19)
			{
				System.out.println(s1[i-1]);
				break;
			}
			else if(i>=20&&i<=99)
			{
				int t=i%10;
				i=i-t;
				i=i/10;
				System.out.print(s2[i-1]+" "+s1[t-1]);
				break;
			}
		else if(i>=100&&i<=999)
			{
				int t=i%100;
				int k=i-t;
				    k=k/100;
				System.out.print(s1[k-1]+" "+"hundred");
				i=i-(k*100);
			}
		else if(i>=1000&&i<=9999)
			{
				int t=i%1000;
				int k=i-t;
				    k=k/1000;
				System.out.print(s1[k-1]+" "+"thousand");
				i=i-(k*1000);
			}
	  else if(i>=10000&&i<=99999)
		   {
			int t=i%10000;
			int k=i-t;
			    k=k/10000;
			System.out.print(s2[k-1]);
			i=i-(k*10000);
		}
	  else if(i>=100000&&i<=999999)
	   {
		int t=i%100000;
		int k=i-t;
		    k=k/100000;
		System.out.print(s1[k-1]+" "+"lakh");
		i=i-(k*100000);
	    }
	   else if (i>=1000000&&i<=9999999)
	   {
		int t=i%1000000;
		int k=i-t;
		    k=k/1000000;
		System.out.print(s2[k-1]);
		i=i-(k*1000000);
	    }
	   else if (i>=10000000&&i<=99999999)
	   {
		int t=i%10000000;
		int k=i-t;
		    k=k/10000000;
		System.out.print(s1[k-1]+" "+"crore");
		i=i-(k*10000000);
	    }
	   else if (i>=100000000&&i<=999999999)
	   {
		int t=i%100000000;
		int k=i-t;
		    k=k/100000000;
		System.out.print(s1[k-1]);
		i=i-(k*100000000);
	    }	
		
		
	}

}
}

