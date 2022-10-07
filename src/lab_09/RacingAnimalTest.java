package lab_09;

import java.util.Arrays;
import java.util.List;

public class RacingAnimalTest {
    public static void main(String[] args) {
        RacingAnimal horse = new Horse();
        horse.setRandomSpeed();
        horse.setName("Horse");
        RacingAnimal tiger = new Tiger();
        tiger.setRandomSpeed();
        tiger.setName("Tiger");
        RacingAnimal dog = new Dog();
        dog.setRandomSpeed();
        dog.setName("Dog");

        List<RacingAnimal> animalList = Arrays.asList(horse, tiger, dog);

        //Calling RacingAnimalController
        String winner = new RacingAnimalController().calculateWinner(animalList);
        System.out.println("Winner is: " + winner);

    }
}
