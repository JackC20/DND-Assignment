/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment4;

/**
 *
 * @author jackc20
 */
import java.util.Random;

public class RandomGenerator extends Generator
{
    Random m_rand;
    
    public RandomGenerator()
    {
        m_rand = new Random();
    }
    
    @Override
    public int nextInt(int sides)
    {
        return 1 + m_rand.nextInt(sides);
    }
}
