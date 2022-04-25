import java.util.Scanner;
class StringManip
{
public static void main(String[] args)
{
System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
System.out.println("length of string="+str1.length());
System.out.println("character at first position="+str1.charAt(1));
System.out.println("String contains 'cokl'sequence:"+str1.contains("Col"));
System.out.println("String ends with e:"+str1.endsWith("e"));
System.out.println("replace 'col' with 'kol':"+str1.replaceAll("Col","kol"));
System.out.println("LOWERCASE:"+str1.toLowerCase());
System.out.println("UPPERCASE:"+str1.toUpperCase());
sc.close();
}
}
 