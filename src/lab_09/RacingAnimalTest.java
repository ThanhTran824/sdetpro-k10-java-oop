package lab_09;

import java.util.Arrays;
import java.util.List;

public class RacingAnimalTest {
    public static void main(String[] args) {
        RacingAnimal horse = new Horse();
        horse.setName("Horse");
        horse.setRandomSpeed(Settings.horseMaxSpeed);
        RacingAnimal tiger = new Tiger();
        tiger.setName("Tiger");
        tiger.setRandomSpeed(Settings.tigerMaxSpeed);
        RacingAnimal dog = new Dog();
        dog.setName("Dog");
        dog.setRandomSpeed(Settings.dogMaxSpeed);

        List<RacingAnimal> animalList = Arrays.asList(horse, tiger, dog);

        //Calling RacingAnimalController
        String winner = new RacingAnimalController().calculateWinner(animalList);
        System.out.println("Winner is: " + winner);

    }
}
