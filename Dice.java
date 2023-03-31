/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

/**
 *
 * @author jackc20
 */

public class Dice
{
    Generator m_instance; 
    
    public Dice(Generator gen)
    {
        //initalizes instance variable
        m_instance = gen; 
          
    }
    
    
    public int D(int sides)
    {
       //returns value nextInt
       return m_instance.nextInt(sides);
    }
    
    
}