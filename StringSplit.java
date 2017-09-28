import java.util.*;
public class StringSplit {

	static String reverse(String s)
	{
		String b=new String();
		for(int i=s.length()-1;i>=0;i--)
			b+=s.charAt(i);
			
			return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		System.out.println( "enter a String");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String a[]=s.split("\\s");
		System.out.println("no of words in given string:"+a.length);
		for(int i=0;i<a.length;i++)
		{
			String b=reverse(a[i]);
			a[i]=b;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
