package lamba_expression;

interface WordCount{
	abstract int count(String str);
}
public class Handsonefour  
{
	public static void main(String args[])
	{
		WordCount w=(str)->{
			String s[]=str.trim().split("\\s");
			return s.length;
		};
		System.out.println(w.count("Hi hello iam hari"));
	}

}
