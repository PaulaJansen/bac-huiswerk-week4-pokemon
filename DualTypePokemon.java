public class DualTypePokemon extends Pokemon {
    private String type2;

    public DualTypePokemon(String type, String type2, String name, int hp) {
        super(type, name, hp);
        this.type2 = type2;
    }

    @Override
    public void specialAttack(){
        System.out.println("Water/grass pokemon have blaster and wind gusts.");
    }

    @Override
    public void specialShield(){
        System.out.println("Water/grass pokemon use shells and leaves for defence.");
    }

//    getter
    public String getType2(){
        return type2;
    }

}
