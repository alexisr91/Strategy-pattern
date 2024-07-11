package designpattern.example;

public class MuayThai implements FightingStyle {
    
    @Override
    public void perform(){
        System.out.println("I can box, kick, knee and elbow");
    }
}
