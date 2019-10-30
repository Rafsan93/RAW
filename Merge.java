/**
 *  Rafsan Ahmed | EMPLID: 14031514
 *  Assignment 2 - Objective 2
 *  CISC 3130 - Data Structure
 *  Prof. Katherine Chuang
 *  Section - MY9
 *  FALL 2019
 **/
 
import java.util.*; //import  utility pakages

/**
 * 
 * Following program take two sorted linkedList
 * then merge them into one sorted singly linkList  
 * 
 **/

public class Merge //main method
{
 public static void main(String[] args) 
 {
  // List1 with sorted values
  List<Integer> list1 = new LinkedList<>();
  list1.add(1);
  list1.add(3);
  list1.add(5);

  // List2 with sorted values
  List<Integer> list2 = new LinkedList<>();
  list2.add(2);
  list2.add(4);
  list2.add(5);
  list2.add(6);

  // method return sorted valus
  Queue<Integer> result = merge(list1, list2);

  // print the result
  System.out.println(result);
 }

/**
 * Queue return the sorted value of list1 and list2 
 * 
 *  @param List1 List2
 *
 **/
 
 private static Queue<Integer> merge(List<Integer> list1, List<Integer> list2) 
 {
  Queue<Integer> queue = new LinkedList<>();

  // index for iterating the list1
  int index1 = 0;

  // index for iterating the list2
  int index2 = 0;

  // loop as until one of the given lists is empty, check for the smaller item from the list and add to the queue
  while (index1 < list1.size() && index2 < list2.size()) 
  {
   if (list1.get(index1) < list2.get(index2)) 
   {
    queue.add(list1.get(index1));
      index1++;
   } 
    else 
    {
     queue.add(list2.get(index2));
      index2++;
    }
   }

   // in case if list1 is not empty, add all the remaining items which are already sorted to the queue
   while (index1 < list1.size()) 
   {
     queue.add(list1.get(index1));
      index1++;
   }

   // in case list2 is not empty, add all the remaining items which are already sorted to the queue
   while (index2 < list2.size()) 
   {
    queue.add(list2.get(index2));
      index2++;
   } 
   return queue; //return the queue
 }
}