import java.util.*;
public class WordCount {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		TreeMap<String,Integer> map=new TreeMap<String,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i])+1);
		}
		Comparator<String> comp=new Comparator<String>()
		{
			public int compare(String a,String b)
			{
				if((map.get(a))==(map.get(b)) || (map.get(a))<(map.get(b)))
					return 1;
				else
					return -1;
			}
		};
		TreeMap<String,Integer> m=new TreeMap<String,Integer> (comp);
		m.putAll(map);
		for(Map.Entry<String, Integer> entry: m.entrySet() )
		{
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}
}
