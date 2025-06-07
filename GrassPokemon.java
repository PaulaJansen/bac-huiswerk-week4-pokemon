import com.sun.source.doctree.EscapeTree;

public class GrassPokemon extends Pokemon {
    private int amountOfLeaves;
    private int strengthOfGust;


    public GrassPokemon(String type, String name, int hp, int amountOfLeaves) {
        super(type, name, hp);
        this.amountOfLeaves = amountOfLeaves;
    }

    @Override
    public void specialAttack(){
        System.out.println("Grass pokemon have wind gusts.");
    }
    @Override
    public void specialShield() {
        System.out.println("Grass pokemon use leaves for defence.");
    }

    public void leafStorm(int amountOfLeaves, int strengthOfGust){
        System.out.println(getName() + " uses leaf storm with " + amountOfLeaves + " leaves and strength " + strengthOfGust + " xp.");
    }

    public void gustAttack(int strengthOfGust){
        System.out.println(getName() + " uses gust with strength " + strengthOfGust + " xp.");
    }


//    getters
    public int getAmountOfLeaves(){
        return amountOfLeaves;
    }

    public int getStrengthOfGust(){
        return strengthOfGust;
    }

//    setters
    public void setAmountOfLeaves(int amountOfLeaves){
        this.amountOfLeaves = amountOfLeaves;
    }

    public void setStrengthOfGust(int strengthOfGust){
        this.strengthOfGust = strengthOfGust;
    }

}