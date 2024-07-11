package designpattern.example;

public class Rufy {
    
    private FightingStyle fightingStyle;

    public  void setFightingStyle(FightingStyle fightingStyle){
        this.fightingStyle = fightingStyle;
    }


    public void  executeFightingStyle(){
        if(fightingStyle != null){
            fightingStyle.perform();
        }else{
            System.out.println("Le combattant est une merde");
        }
    }
}
