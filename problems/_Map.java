package problems;

import java.util.*;

class _Map {

    static Map<String, String> _phonebookMap = new HashMap<>();

	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();

			//Store name and phone into Map
			_phonebookMap.put(name, String.valueOf(phone));
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			System.out.println(getPhone(s));
		}
	}

	static String getPhone(String nameToSearch) {

		if (_phonebookMap.containsKey(nameToSearch))
			return nameToSearch + "=" + _phonebookMap.get(nameToSearch);
		else
			return "Not found";
	}
}