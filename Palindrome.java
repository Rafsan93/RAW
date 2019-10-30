/**
 *  Rafsan Ahmed | EMPLID: 14031514
 *  Assignment 2 - Objective 1
 *  CISC 3130 - Data Structure
 *  Prof. Katherine Chuang
 *  Section - MY9
 *  FALL 2019
 **/

import java.util.*; //import all utility packages

/**
 * 
 * Following  program take a character or number as an inputs
 * then it check if the that character or number reads same forward as it is as backward
 * if the character or number reads same forwards as it is backward then it print the boolean value true 
 * and if not then print false
 *
 **/

public class Palindrome //main method
{
 public static boolean isPalindrome(List<Object> chars)  
 {               
  Stack<Object> s = new Stack<>(); //stack object
  
  /**
   * each item is  push 
   * pops out last half and compares it to first half of list, 
   * sets isPalindrome to false if they don't match  
   * if match then return true 
   **/           
  for(Object c: chars) 
  {
   s.push(c);
  }  
  
  for(Object o: chars) 
  {
   if(!o.equals(s.pop())) 
   {
     return false;
   }
  }
  return true;
}

/**
 *
 * take the character or numbers as an input and if the character or number is Palindrome then print the boolean value
 *
 **/
 public static void main(String[] args) 
 {               
  System.out.println(isPalindrome(Arrays.asList('r', 'a', 'c', 'e', 'c', 'a', 'r')) + "\n");
  System.out.println(isPalindrome(Arrays.asList('h', 'o', 'u', 's', 'e')) + "\n");
  System.out.println(isPalindrome(Arrays.asList('1', '2', '6', '6', '2', '1')) + "\n");
  System.out.println(isPalindrome(Arrays.asList('1', '2', '6', '6', '9', '1')) + "\n");
 }
}