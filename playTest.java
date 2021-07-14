public class playTest {
    public  static void main(String[] args) {
        play player = new  play(10, 10, 10, 10);

        System.out.printf("%n%s %s%n", "The initial strenght  level is:",player.getStrength());
        System.out.printf("%n%s %s%n", "The initial agility  level is:",player.getAgility());
        System.out.printf("%n%s %s%n", "The initial armor  level is:",player.getArmor());
        System.out.printf("%n%s %s%n", "The initial healingRate  level is:",player.getHealingRate());
        System.out.printf("%n%s %s%n", "The initial magicRate  level is:",player.getMagicRating());

        System.out.printf("%n%s %s%n", "The initial damageScore  level is:",player.damageSCore());
        System.out.printf("%n%s %s%n", "The initial healingpoints  level is:",player.Healingpoints());
        System.out.printf("%n%s %s%n", "The initial healingboost  level is:",player.healthBoost());
        System.out.printf("%n%s %s%n", "The initial hunterdamagescore  level is:",player.HunterDamageSCore());



    }
}
