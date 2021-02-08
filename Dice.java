
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random; 
import java.lang.*; 

public class Dice
{
    // instance variables - replace the example below with your own
    private int num;
    /**
     * Constructor for objects of class person
     */
    public Dice()
    {
        // initialise instance variables
        num=0;
    }
         

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public void roll(){
       num=new Random().nextInt(7);
    }
   public int show(){
       return num;
    }
       
         
}
