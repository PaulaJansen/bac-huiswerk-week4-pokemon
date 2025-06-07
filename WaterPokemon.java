public class WaterPokemon extends Pokemon {
    private int amountOfBlasters;
    private int strengthOfWater;
    private int strengthOfShield;

    public WaterPokemon(String type, String name, int hp, int strengthOfWater){
        super(type, name, hp);
        this.strengthOfWater = strengthOfWater;
    }

    @Override
    public void specialAttack(){
        System.out.println("Water pokemon have blasters.");
    }

    @Override
    public void specialShield(){
        System.out.println("Water pokemon use shells for defence.");
    }

    public void hydroCanon(int amountOfBlasters,int strengthOfWater){
        System.out.println(getName() + " uses " + amountOfBlasters + " blasters with " + strengthOfWater + " xp." );
    }

    public void tackle(int strengthOfWater){
        System.out.println(getName() + " tackles with strength " + strengthOfWater + " xp." );
    }

    public void shellShield(int strengthOfShield){
        System.out.println(getName() + " defends with " + strengthOfShield + " xp.");
    }


//    getters
    public int getStrengthOfWater(){
        return strengthOfWater;
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

    public void setStrengthOfWater(int strengthOfWater){
        this.strengthOfWater = strengthOfWater;
    }

    public void setStrengthOfShield(int strengthOfShield){
        this.strengthOfShield = strengthOfShield;
    }



}
