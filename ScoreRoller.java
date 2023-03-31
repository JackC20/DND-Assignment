/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

/**
 *
 * @author jackc20
 */
public class ScoreRoller 
{
    Dice m_dice; 
    
    
    public ScoreRoller(Dice dice)
    {
      m_dice = dice; //initializes dice to instance variable m_dice
          
    }
    
    public int callDice()
    {
       int totalRoll = 0;
      //runs through the D function 3 times and adds value of each roll
       
       for(int i = 0; i<3; i++)
       {
           int x = m_dice.D(3); 
                   
                   
           totalRoll += x;
           
       }
       
       
       return totalRoll; 
       
      
    }
    
    
    
    
}
