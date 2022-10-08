package lab_10;

import lab_09.Settings;

import java.util.Arrays;
import java.util.List;

import static lab_10.Animal.Builder;

public class RacingTest {
    public static void main(String[] args) {
        /*List<Animal> animalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number animals join competitor: ");
        int numberAnimals = scanner.nextInt();

        for(int index = 0; index < numberAnimals; ++index){
            Builder builder = new Builder();
            System.out.println("Enter animal name: ");
            String animalName = scanner.nextLine();
            builder.setAnimalName(animalName);
            System.out.println("Can animal fly?");
            Boolean isFly = scanner.nextBoolean();
            builder.setFly(isFly);
            System.out.println("Enter animal speed: ");
            int animalSpeed = scanner.nextInt();
            builder.setAnimalSpeed(animalSpeed);

            Animal animalName = builder.build();
        }*/

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
        List<Animal> racerAnimalList = animalController.getRacerAnimals(animalList);
        String winner = animalController.getTheWinner(racerAnimalList);
        System.out.println("Winner is: " + winner);

    }
}
