import java.util.Random;
class  play  extends Object
  {
    Random rand = new Random(); //instance of random class
    int   upperbound =11;
    // generates numbers between 0 to 10 
    int magicRating = rand.nextInt(upperbound); 


    private   int strength ;
     private   int agility ;
     private   int armor;
     private   int healingRate;

public   play  ( int strength,int agility,int armor,int healingRate )
 {
    // validate the game attributes 
     if (strength < 0 || strength > 10 || agility<0 || agility > 10 || armor <0 || armor > 10 ||healingRate < 0 || healingRate >10 || magicRating <0|| magicRating >10)
     
         throw new  IllegalArgumentException(
             "strength,agility ,armor,healingrates are out  of range"
         );
  
     
     this.strength=strength;
     this.agility= agility;
     this.armor=armor;
     this.healingRate=healingRate;
    
}
// set strength capability

public void setStrength( int strength)
 {
    if ( strength < 0 || strength  >10)
        throw new IllegalArgumentException("strength capabiities should be between 0 to 10");


    
    this.strength=strength;

}
// return strength 
public int  getStrength(){
    return strength;

}
// set agility 
public void setAgility( int agility){
    if( agility  <0 || agility >10)
        throw new IllegalArgumentException("agility is out of bound");
    
    this.agility=agility;

}
// return agility
public int getAgility(){
    return agility;

}
// set armor level 
public void setArmor(int armor){
    if(armor <0 || armor >10)
        throw new IllegalArgumentException("Armor out of bound");

    
    this.armor=armor;
}
// return armor level
public int getArmor(){

    return armor;
}
// set healing rate
public void setHealingRate(int healingRate){
    if (healingRate  < 0|| healingRate >10)
        throw new IllegalArgumentException("HealingRate out of bound");
    
    this.healingRate=healingRate;
}
// get healingRate
public int getHealingRate(){
    return healingRate;
}
// set magicRating
public void setMagicRating(int magicRating){
    if(magicRating <0 ||magicRating >0)
        throw new  IllegalArgumentException("magic healing out of bound");
    this.magicRating=magicRating;
}
// get magic rating
public int getMagicRating(){
    return magicRating;
}
// calculating damageScore
public double damageSCore(){
    return (strength+agility+healingRate)/2;
}
// claculate healingpoints
public double Healingpoints(){
    return damageSCore()/armor;
}
// calculate normaldamage
public int HunterDamageSCore(){
    return (strength +agility+healingRate) *2;
}
// calculate healthBoost
public double healthBoost(){
    return (magicRating)/2;
}
public String toString()  {
    return String.format("%s: %d %s%n%s: %d%n%d: %s%n%s: %s",
    "strength",strength,"agility",agility,"armor",armor,"healingRate",healingRate,"magicRate",magicRating);
    
   
}
}// end class player

