public class fairies  extends  play  {

    // class constructor
public  fairies(int strength,int agility,int armor,int healingRate) {
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
        System.out.println("fairy is alive!");
  
      else if  (healingpoints==0 && strength ==0)
            System.out.println("fairy is dead!");
        return healingpoints;
}
public double healthBoost(){
    return super.healthBoost();
}

public static void main(String[] args) {

    fairies fary = new fairies(10,10,10,10);
    System.out.printf("%n%s %s%n", "The fairy healing point  level is:",fary.defend());
    System.out.printf("%n%s %s%n", "The fairy damageScore   level is:",fary.attack());
    System.out.printf("%n%s %s%n", "The fairy healthboost  point  level is:",fary.healthBoost());


}
     
}

