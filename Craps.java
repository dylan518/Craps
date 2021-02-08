import java.util.Scanner;
import java.util.Random; 
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*; 


public class Craps{






    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    
    public static void play()
        {
            int sum2;
            Dice D1 = new Dice();
            Dice D2 = new Dice(); 
            System.out.println("Press <Enter> to roll the dice...");
            Scanner sc1 = new Scanner(System.in); 
            String Yn1=sc1.nextLine();
            D1.roll();
            D2.roll();
            int sum=D1.show()+D2.show();
            if(sum==7 || sum==11){
                System.out.println("You won! Your rolled a "+sum);
                return;
            }
            if(sum==2 || sum==3 || sum==12){
                System.out.println("You lose! Your rolled a "+sum);
                return;
            }
            else{
                System.out.println("Your first roll is:"+sum);
                System.out.println("That's your point.");
                System.out.println("let's see if you can roll it again before you roll a 7!");
            }
            while(true){
                System.out.println("Press <Enter> to roll the dice...");
                Scanner sc3 = new Scanner(System.in); 
                String Yn3=sc3.nextLine();
                D1.roll();
                D2.roll();
                if(D1.show()+D2.show()==sum){
                    System.out.println("You won! Your rolled a "+sum);
                    System.out.println("You rolled your point! You won!");
                    break;
                }
                if(D1.show()+D2.show()==7){
                    System.out.println("You lose! Your rolled a 7");
                    break;
                }
                else{
                    sum2=D1.show()+D2.show();
                    System.out.println("You rolled:"+sum2);
                    System.out.println("Keep rolling...");
                }
    
    
    
    
    
            }
        }


    public static void main(String[] args)throws Exception
    {




        
        System.out.println("Let’s play CRAPS!");

        System.out.println("Do you need instructions?(Y/n)");
        Scanner sc5 = new Scanner(System.in); 
        String Yn=sc5.nextLine();
        if(Yn.toLowerCase().equals("y")){
            System.out.println("1. Roll two six-sided dice.");
            System.out.println("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println("2. c. Any other number you don't win or lose. The die roll becomes your 'point.'");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("3. Keep rolling the dice again until:");
            System.out.println("4. a. You roll the point again and win!");
            System.out.println("4. b. or you roll a 7 and lose.");
        
        }
        while(true)
        {



            play();

            System.out.println("Play again (Y/n)?");
            Scanner sc2 = new Scanner(System.in); 
            String playAgain=sc2.nextLine();
            if(!playAgain.toLowerCase().equals("y")){
                break;
            }



        }
    }

}





