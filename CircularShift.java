import java.util.*;
public class CircularShift {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("enter a string:");
		str=sc.nextLine();
		String s=new String();
		int i=0;
		while(i!=str.length()-1)
		{
			s+=str.substring(1, str.length());
			s+=str.substring(0,1);
			str=s;
			s="";
			System.out.println(str);
			i++;
		}
	}
}
