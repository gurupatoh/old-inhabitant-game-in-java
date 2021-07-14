
public class human  extends  play  {

    // class constructor
public  human(int strength,int agility,int armor,int healingRate) {
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
      System.out.println("human is alive!");

    else if  (healingpoints==0 && strength ==0)
          System.out.println("human is dead!");


        return healingpoints;
}
public double healthBoost(){
    return super.healthBoost();
}

public static void main(String[] args) {

    human man = new human(10,10,10,10);

    System.out.printf("%n%s %s%n", "The human healing point  level is:",man.defend());
    System.out.printf("%n%s %s%n", "The human damageScore   level is:",man.attack());
    System.out.printf("%n%s %s%n", "The human healthboost  point  level is:",man.healthBoost());


}
     
}

