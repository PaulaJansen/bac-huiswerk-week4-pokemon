public class main {
   public static void main(String[] args){


       WaterPokemon contestant1 = new WaterPokemon("water", "Squirtle", 30, 20 );
       FirePokemon contestant2 = new FirePokemon("fire", "Charmander", 40, 30);
       GrassPokemon contestant3 = new GrassPokemon("grass", "Bulbasaur", 30, 30);
       ElectricPokemon contestant4 = new ElectricPokemon("electric", "Pikachu", 50, 40);

       contestant1.specialAttack();
       contestant2.specialShield();
       contestant3.specialAttack();
       contestant4.specialShield();

       PokemonTrainer trainer1 = new PokemonTrainer("Ash Ketchum");
       PokemonTrainer trainer2 = new PokemonTrainer("John Mayo");

       trainer1.choosePokemon(trainer1.getNameOfTrainer());
       System.out.println(contestant4.getName() + "!");

       trainer2.choosePokemon(trainer2.getNameOfTrainer());
       System.out.println(contestant3.getName() + "!");

       contestant4.setVolts(20);
       contestant4.voltTackle(contestant4.getVolts());

       contestant3.setAmountOfLeaves(4);
       contestant3.leafStorm(contestant3.getAmountOfLeaves(), contestant3.getStrengthOfGust());






    }
}
