package designpattern.example;

/**
 *  Entry point
 *
 */
public class StrategyPattern 
{
    public static void main( String[] args )
    {
        Rufy rufy = new Rufy();

        FightingStyle boxing = new Boxing();
        FightingStyle wrestling = new Wrestling();
        FightingStyle karate = new Karate();

        // Make a reference on an instance of an objet, make sure the methods in the class itself aren't static
        rufy.setFightingStyle(boxing);
        rufy.executeFightingStyle();
    }
}
