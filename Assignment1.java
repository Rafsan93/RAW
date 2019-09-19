/**
 * Rafsan Ahmed | EMPLID: 14031514
 * Assignment 1
 * CISC 3130 - Data Structure
 * FALL 2019
 * Section - MY9
 **/ 
 
import java.io.*;    //import input/output package
import java.util.*;  //import utility pakage

public class Assignment1
{
 /**
  * this section of code take string and pass it to sortWrord 
  * which then use a loop to check each charecter to see if they are equal or not
  * @param s: string
  * @return isUnique: boolean variable
 **/
 private static boolean isUniqueChar(String s)
 {
  boolean isUnique = true;
  char[] sortedS = sortWord(s);
    for(int i=0; i<sortedS.length-1; i++) 
    {
     if(sortedS[i+1] == sortedS[i])
    	 isUnique = false;
    }
  System.out.println("  " + isUnique  + "\n");
  return isUnique;
 }
    
/**
 * this section of code take string and make it lowercase
 * then convert it to an array and passes it to InsertionSort 
 *
 * @param s: string
 * @return c: array of char
 **/ 
 private static char[] sortWord(String s)
 {
  s = s.toLowerCase();
  char[] c = s.toCharArray();
  InsertionSort(c);
  return c;
 }

/**
 * this section of code take character array 
 * with a if statement it then compare each charechter 
 * 
 * @param word: char array
 **/
 public static void InsertionSort(char[] word) 
 {
  if (word == null || word.length == 0)
       return;
     for (int i=0; i<word.length; i++) 
     {
      char temp = word[i];
      int j = i;
         while (j>0 && word[j-1]>temp) 
         {
          word[j] = word[j-1];
          j--;
         }
         word[j] = temp;
      }
  System.out.print(word);
  return;
 }

public static void main(String[] args) throws FileNotFoundException //main method
{
 //scanner class to read input from text file
 Scanner scanner = new Scanner(new File("input.txt"));

 // read in words and determine whether it is composed of unique characters
 while (scanner.hasNextLine()) 
 {
   String s = scanner.nextLine();
   isUniqueChar(s);
 }

   scanner.close();
}
}