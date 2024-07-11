package designpattern.example;

public class Boxing implements FightingStyle {
    
    @Override
    public void perform(){
        System.out.println("I only use my fists");
    }
}
