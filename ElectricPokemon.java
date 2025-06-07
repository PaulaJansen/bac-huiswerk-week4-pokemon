public class ElectricPokemon extends Pokemon {
    private int volts;
    private int amountOfBolts;



    public ElectricPokemon(String type, String name, int hp, int volts) {
        super(type, name, hp);
        this.volts = volts;
    }

    @Override
    public void specialAttack(){
        System.out.println("Electric pokemon have lightning bolts.");
    }

    @Override
    public void specialShield() {
        System.out.println("Electric pokemon use their speed for defence.");
    }

    public void electroBall(int amountOfBolts, int volts){
        System.out.println(getName() + " uses electro ball with " + amountOfBolts + " bolts and strenght " + volts + " xp.");
    }

    public void voltTackle(int volts){
        System.out.println(getName() + " uses volt tackle with strenght " + getVolts() + " xp.");
    }


//    getters
    public int getVolts(){
        return volts;
    }

    public int getAmountOfBolts(){
        return amountOfBolts;
    }

//    setters
    public void setVolts(int volts){
        this.volts = volts;
    }

    public void setAmountOfBolts(int amountOfBolts){
        this.amountOfBolts = amountOfBolts;
    }

}