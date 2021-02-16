package com.cg.exception;

import java.util.Scanner;
class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class AgeDemo {
 
 public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter ur age :: ");
  int age = sc.nextInt();
  
  try {
   if(age>15) 
    throw new AgeException("Valid age");
   else
    System.out.println("Invalid age");
  }
  catch (AgeException e) {
   System.out.println(e);
  }
 }
}