import java.util.*;
public class Countfreq {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string:");
		String s=sc.nextLine();
		int a[]=new int[256];
		for(int i=0;i<256;i++)
			a[i]=0;
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]++;
		}
		for(int i=0;i<256;i++)
		{
			if(a[i]!=0)
				System.out.println((char)i+" "+a[i]);
		}	
	}
}
