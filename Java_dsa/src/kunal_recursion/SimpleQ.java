package kunal_recursion;


public class SimpleQ
{
	public static void main(String[] args)
	{
		String str="abacadc";
		//System.out.println(skip_no_argument(str));
	}
	public static StringBuilder skip(String str)
	{
		StringBuilder sb=new StringBuilder();
		return helper(sb,str);
	}
	private static StringBuilder helper(StringBuilder sb,String str)
	{
		if(str.isEmpty())
		{
			return sb;
		}
		char ch=str.charAt(0);
		if(ch=='a')
		{
			return helper(sb,str.substring(1));
		}
		else
		{
			return helper(sb.append(ch),str.substring(1));
		}
	}}
//	public static String skip_no_argument(String str)
//	{
//		if(str.isEmpty())
//		{
//			return "";
//		}
//		char ch=str.charAt(0);
//		if(ch=='a')
//		{
//
//		}
//	}
//}