/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

/**
 *
 * @author jackc20
 */
public class DnDCharacter 
{
    int m_strength; 
    int m_dexterity;
    int m_constitution;
    int m_intelligence;
    int m_wisdom;
    int m_charisma;
    
    
    public DnDCharacter(ScoreRoller roller)
    {
       //initializes instance variables
       m_strength = roller.callDice(); 
       m_dexterity = roller.callDice(); 
       m_constitution = roller.callDice();
       m_intelligence = roller.callDice();
       m_wisdom = roller.callDice();
       m_charisma = roller.callDice(); 
       
    }
    
    public DnDCharacter(PickBest3of4ScoreRoller roller)
    {
       //initializes instance variables
       m_strength = roller.callDice(); 
       m_dexterity = roller.callDice(); 
       m_constitution = roller.callDice();
       m_intelligence = roller.callDice();
       m_wisdom = roller.callDice();
       m_charisma = roller.callDice(); 
        
    }
    
    @Override
    public String toString()
    {
        //prints out object of class as a string
        return "\nClass DnDCharacter\n"+
                "Strength: "+m_strength+"\n"+
                "Dexterity: "+m_dexterity+"\n"+
                "Consitution: "+m_constitution+"\n"+
                "Intelligence: "+m_intelligence+"\n"+
                "Wisdom: "+m_wisdom+"\n"+
                "Charisma: "+m_charisma+"\n";
    }
}
