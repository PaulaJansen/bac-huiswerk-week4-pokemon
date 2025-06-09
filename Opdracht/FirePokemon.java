package Opdracht;

public class FirePokemon extends Pokemon {
    private int heatOfFire;
    private int amountOfFlameThrowers;



    public FirePokemon(String type, String name, int hp, int heatOfFire) {
        super(type, name, hp);
        this.heatOfFire = heatOfFire;

    }

    @Override
    public void specialAttack(){
        System.out.println("Fire pokemon have flame throwers.");
    }

    @Override
    public void specialShield() {
        System.out.println("Fire pokemon use their strength to withstand for defence.");
    }

    public void inferno(int heathOfFire){
        System.out.println(getName() + " uses inferno with strength " + heatOfFire + " xp.");
    }

    public void throwFlames(int amountOfFlameThrowers){
        System.out.println(getName() + " uses " + amountOfFlameThrowers + " flame throwers with strenght" + heatOfFire + " xp." );
    }



//    getters
    public int getHeatOfFire(){
        return heatOfFire;
    }

    public int getAmountOfFlameThrowers(){
        return amountOfFlameThrowers;
    }

//    setters
    public void setHeatOfFire(int heatOfFire) {
        this.heatOfFire = heatOfFire;
    }

    public void setAmountOfFlameThrowers(int amountOfFlameThrowers) {
        this.amountOfFlameThrowers = amountOfFlameThrowers;
    }


}