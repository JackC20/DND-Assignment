/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;
import java.util.Arrays; 
/**
 *
 * @author jackc20
 */
public class PickBest3of4ScoreRoller extends ScoreRoller
{
    
    //Constructor that calls the superclass ScoreRoller 
   public PickBest3of4ScoreRoller(Dice dice)
   {
       super(dice); 
           
   }
   
   //Overrides superclass callDice and now rolls 4 times
   @Override
   public int callDice()
   {
       int [] holder = new int[4]; //holds values of the 4 rolls
       int totalRoll = 0; 
       
       
        for(int i = 0; i<4; i++) // Initializes the 4 rolls in the array
       {
           int x = m_dice.D(3); 
           
           holder[i] = x; 
           
           
       } 
       
        
        
       Arrays.sort(holder); //sorts in ascending order
       
       
       for(int c = 3; c>0; c=c-1) //picks the last 3 rolls, as it is sorted in ascending order
       {
         
           totalRoll += holder[c]; 
       }
      
       return totalRoll; 
       
       
   }
}
