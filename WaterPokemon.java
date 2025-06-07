public class WaterPokemon extends Pokemon {
    private int amountOfBlasters;
    private int strengthOfBlasters;
    private int strengthOfShield;

    public WaterPokemon(String type, String name, int hp,int amountOfBlasters, int strengthOfBlasters){
        super(type, name, hp);
        this.amountOfBlasters = amountOfBlasters;
        this.strengthOfBlasters = strengthOfBlasters;
    }

    @Override
    public void specialAttack(){
        System.out.println("Water pokemon have blasters.");
    }

    @Override
    public void specialShield(){
        System.out.println("Water pokemon use shells for defence.");
    }

    public void hydroCanon(int amountOfBlasters,int strengthOfBlasters){
        System.out.println(getName() + " uses " + amountOfBlasters + " blasters with " + strengthOfBlasters + " xp." );
    }

    public void shellShield(int strengthOfShield){
        System.out.println(getName() + " defends with " + strengthOfShield + " xp.");
    }


//    getters
    public int getStrengthOfBlasters(){
        return strengthOfBlasters;
    }

    public int getAmountOfBlasters(){
        return amountOfBlasters;
    }

    public int getStrengthOfShield(){
        return strengthOfShield;
    }

//    setters
    public void setAmountOfBlasters(int amountOfBlasters){
        this.amountOfBlasters = amountOfBlasters;
    }

    public void setStrengthOfBlasters(int strengthOfBlasters){
        this.strengthOfBlasters = strengthOfBlasters;
    }

    public void setStrengthOfShield(int strengthOfShield){
        this.strengthOfShield = strengthOfShield;
    }



}
