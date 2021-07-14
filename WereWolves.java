public class WereWolves  extends  play  {

    // class constructor
public  WereWolves(int strength,int agility,int armor,int healingRate) {
    // explicitly call the super class constructor
    super(strength, agility, armor, healingRate);
    
}    
public double  attack() {
    return super.damageSCore();
}
public  double  defend(){
     double healingpoints = super.Healingpoints();
     int strength = super.getStrength();

     if (healingpoints<1)
        healingpoints = healingpoints -1;
        else if (healingpoints>0 && strength>0)
        System.out.println("were wolf is alive!");
  
      else if  (healingpoints==0 && strength ==0)
            System.out.println("were wolf is dead!");
        return healingpoints;
}
public double healthBoost(){
    return super.healthBoost();
}

public static void main(String[] args) {

    WereWolves woffie = new WereWolves(10,10,10,10);
    System.out.printf("%n%s %s%n", "The werewolves healing point  level is:",woffie.defend());
    System.out.printf("%n%s %s%n", "The werewolves damageScore   level is:",woffie.attack());
    System.out.printf("%n%s %s%n", "The werewolves healthboost  point  level is:",woffie.healthBoost());


}
     
}

