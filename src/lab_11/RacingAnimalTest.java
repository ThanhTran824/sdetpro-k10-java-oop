package lab_11;

import java.util.Arrays;
import java.util.List;

public class RacingAnimalTest {
    public static void main(String[] args) {

        AnimalAbstract horse = new Horse();
        horse.setName("Horse");
        horse.setRaceSpeed(75);

        AnimalAbstract dog = new Dog();
        dog.setName("Dog");
        dog.setRaceSpeed(60);

        AnimalAbstract tiger = new Tiger();
        tiger.setName("Tiger");
        tiger.setRaceSpeed(90);

        List<AnimalAbstract> animalList = Arrays.asList(horse, tiger, dog);

        //Calling RacingAnimalController
        List<String> winner = new RacingAnimalController().run(animalList);

        if(winner.size() == 1) {
            System.out.print("Winner is: " + winner.get(0));
        }
        else {
            System.out.print("Winners are: ");
            for (String animal : winner) {
                System.out.print(animal + " ");
            }
        }

    }
}
