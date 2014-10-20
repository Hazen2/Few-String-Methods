// This program will demonstrate a few String methods
public class FewStringMethods
{
  public static void main(String[] args)
  {
   
   // Declaring variables that will be used as well as creating a String object. 
   String city = "San Francisco", upperCity, lowerCity;
   int stringLength;
   char oneChar;
   
   // Storing the length of the 'city' variable in stringLength
   stringLength = city.length();
   
   // Storing the first character in the 'city' variable in oneChar
   oneChar = city.charAt(0);
   
   // Saving the uppercase equivalent of the 'city' variable into 'upperCity'
   upperCity = city.toUpperCase();
   
   // Saving the lowercase equivalent of the 'city' variable into 'lowerCity'
   lowerCity = city.toLowerCase();
   
   // Display results
   System.out.println("The length of \"" + city + "\" is " + stringLength + " characters.");
   System.out.println("The first character in \"" + city + "\" is the letter \"" + oneChar + "\".");
   System.out.println("The uppercase equivalent of \"" + city + "\" reads as \"" + upperCity + "\".");
   System.out.println("The lowercase equivalent of \"" + city + "\" reads as \"" + lowerCity + "\".");
   
  }
}
