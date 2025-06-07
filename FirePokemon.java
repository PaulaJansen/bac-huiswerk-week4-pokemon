public class FirePokemon extends Pokemon {
    private int heathOfFire;
    private int amountOfFlameThrowers;



    public FirePokemon(String type, String name, int hp, int heathOfFire) {
        super(type, name, hp);
        this.heathOfFire = heathOfFire;

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
        System.out.println(getName() + " uses inferno with strength " + heathOfFire + " xp.");
    }

    public void throwFlames(int amountOfFlameThrowers){
        System.out.println(getName() + " uses " + amountOfFlameThrowers + " flame throwers with strenght" + heathOfFire + " xp." );
    }



//    getters
    public int getHeathOfFire(){
        return heathOfFire;
    }

    public int getAmountOfFlameThrowers(){
        return amountOfFlameThrowers;
    }

//    setters
    public void setHeathOfFire(int heathOfFire) {
        this.heathOfFire = heathOfFire;
    }

    public void setAmountOfFlameThrowers(int amountOfFlameThrowers) {
        this.amountOfFlameThrowers = amountOfFlameThrowers;
    }


}