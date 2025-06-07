public abstract class Pokemon {
    private String type;
    private String name;
    private int hp;


    public Pokemon(String type, String name, int hp){

        this.type = type;
        this.name = name;
        this.hp = hp;
    }

    public abstract void specialAttack();
    public abstract void specialShield();

    public void printType(String type){
        System.out.println("Dit is een " + type + " pokemon.");
    }

    public void printName(String name){
        System.out.println("Deze pokemon heet " + name + ".");
    }

    public void printHp(int hp){
        System.out.println("Deze pokemion heeft " + hp + " health points.");
    }



//    getters

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

//    setters

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
