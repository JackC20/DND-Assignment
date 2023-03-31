/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

/**
 *
 * @author jackc20
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //RandomGenerator generator = new RandomGenerator();
        DefinedGenerator generator = 
                new DefinedGenerator(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6);
        Dice dice = new Dice(generator);
        ScoreRoller roller = new ScoreRoller(dice);

        System.out.println("***************************");
        System.out.println("*** Regular ScoreRoller ***");
        DnDCharacter [] characters = new DnDCharacter[3];
        characters[0] = new DnDCharacter(roller);
        characters[1] = new DnDCharacter(roller);
        characters[2] = new DnDCharacter(roller);
        
        for (var c : characters)
        {
            System.out.println(c);
        }
        System.out.println("***************************");
        System.out.println();
        
        
        PickBest3of4ScoreRoller roller2 = new PickBest3of4ScoreRoller(dice);
        System.out.println("***************************");
        System.out.println("* Best 3 of 4 ScoreRoller *");
        characters[0] = new DnDCharacter(roller2);
        characters[1] = new DnDCharacter(roller2);
        characters[2] = new DnDCharacter(roller2);
        
        for (var c : characters)
        {
            System.out.println(c);
        }
        System.out.println("***************************");

    }

    
}
