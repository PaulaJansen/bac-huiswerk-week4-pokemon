package Opdracht;

public class PokemonTrainer {
    private String nameOfTrainer;

    public PokemonTrainer(){
    }

    public PokemonTrainer(String nameOfTrainer){
        this.nameOfTrainer = nameOfTrainer;
    }

    public void choosePokemon(String nameOfTrainer){
        System.out.print(getNameOfTrainer() + " chooses ");
    }

//    getters
    public String getNameOfTrainer() {
        return nameOfTrainer;
    }


//    setters
    public void setNameOfTrainer(String nameOfTrainer) {
        this.nameOfTrainer = nameOfTrainer;
    }

}
