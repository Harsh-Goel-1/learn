package kunal_dsa;

public class String_Builder {
	
//Unlike Strings that are immutable, StringBuilder class works on a single mutable object
//We use SBs when we need to edit the String (like str+ch in a loop)
//(if we edit Strings, new object is formed and old one is de-referenced)

	public static void main(String[] args)
	{
		StringBuilder build=new StringBuilder();
		char c='a';
		for(int i=0;i<27;i++)
		{
			build.append(c);
			c++;
		}
		System.out.println(build.reverse().toString());//.toString() is used by default so no need to use it
	}

}
