package designpattern.example;

public class Wrestling implements FightingStyle {
    
    @Override
    public void perform(){
        System.out.println("I do takedowns, grapple and take the top position");
    }
}
