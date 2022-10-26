package lab_10;

import lab_09.Settings;

import java.util.Arrays;
import java.util.List;

import static lab_10.Animal.Builder;

public class RacingTest {
    public static void main(String[] args) {

        //Form up data
        Builder builder = new Builder();
        builder.setAnimalName("Horse").setFly(false).setAnimalSpeed(Settings.horseMaxSpeed);

        Animal horse = builder.build();

        builder = new Builder();
        builder.setAnimalName("Tiger").setFly(false).setAnimalSpeed(Settings.tigerMaxSpeed);

        Animal tiger = builder.build();

        builder = new Builder();
        builder.setAnimalName("Dog").setFly(false).setAnimalSpeed(Settings.dogMaxSpeed);

        Animal dog = builder.build();

        builder = new Builder();
        builder.setAnimalName("Eagle").setFly(true).setAnimalSpeed(Settings.eagleMaxSpeed);

        Animal eagle = builder.build();

        builder = new Builder();
        builder.setAnimalName("Squirrel").setFly(false).setAnimalSpeed(Settings.squirrelMaxSpeed);

        Animal squirrel = builder.build();

        AnimalController animalController = new AnimalController();
        List<Animal> animalList = Arrays.asList(horse, tiger, dog, eagle, squirrel);
        String winner = animalController.getTheWinner(animalList);
        System.out.println("Winner is: " + winner);

    }
}
