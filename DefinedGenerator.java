/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

/**
 *
 * @author jackc20
 */
public class DefinedGenerator extends Generator
{
    int [] m_rolls;
    int m_cur=0;
    public DefinedGenerator(int...rolls)
    {
        m_rolls = new int [rolls.length];
        for (int i=0;i<rolls.length;i++)
        {
            m_rolls[i]=rolls[i];
        }
    }
    
    @Override
    public int nextInt(int sides)
    {
        if (m_cur>=m_rolls.length)
        {
            m_cur = 0;
        }
        
        return m_rolls[m_cur++];
    }
}
    
