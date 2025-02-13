public class Check{
//Method to use in recursive method to check whether a char is a consonant
public static boolean isConsonant(char c) { 
 c = Character.toLowerCase(c);
return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
}
//Main recursive method
public static int consonantCheck(String consonant, String s, int index){
//consonant is a string that contains "(" we will use to print the final consonants, s main string
if (s.length==0) {
System.out.print("Total Consonants" + consonant.length() + consonant + ")");
return 0;
}
Char currentChar = s.charAt(index);
Int count = 0;
if(isConsonant(currentChar)){
	consonants+=currentChar+",";
	count = 1;
}
return 1 + consonantCheck(consonant,s,index+1);
//start at beginning of s, go through indexes
	}

public static void Main (String[]args){
  String test1 = "A58*u7(($1ee&";
  String test2 = "CSC530DaTaStrc";
  consonantCheck("(",test1,0);
  consonantCheck("(",test2,0);
}

