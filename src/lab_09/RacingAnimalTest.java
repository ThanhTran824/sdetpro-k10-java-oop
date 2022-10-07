package lab_09;

import java.util.Arrays;
import java.util.List;

public class RacingAnimalTest {
    public static void main(String[] args) {
        RacingAnimal horse = new Horse();
        horse.setSpeed();
        horse.setName("Horse");
        RacingAnimal tiger = new Tiger();
        tiger.setSpeed();
        tiger.setName("Tiger");
        RacingAnimal dog = new Dog();
        dog.setSpeed();
        dog.setName("Dog");

        List<RacingAnimal> animalList = Arrays.asList(horse, tiger, dog);

        //Calling RacingAnimalController
        String winner = new RacingAnimalController().calculateWinner(animalList);
        System.out.println("Winner is: " + winner);

    }
}
