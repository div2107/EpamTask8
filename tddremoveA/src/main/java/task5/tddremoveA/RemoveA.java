package task5.tddremoveA;

public class RemoveA {
	public String remove(String string)
	{
		char firstChar=string.charAt(0);
		if(string.length()==1)
		{
			if(firstChar=='A')
			{
				string="";
			}
		}
		else
		{
			char secondChar=string.charAt(1);
			if(firstChar=='A' && secondChar=='A')
			{
				string=string.substring(2,string.length());
			}
			else
			{
				if(firstChar=='A')
				{
					string=string.substring(1,string.length());
				}
				else if(secondChar=='A')
				{
					string=string.substring(0,1)+string.substring(2,string.length());
				}
				else
				{
					string="";
				}
			}
		}
		return string;

	}

}
