package lab_12;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public List<FlyAble> eligibleList(List<FlyAble> animalList) {
        List<FlyAble> eligibleList = new ArrayList<>();
        for (FlyAble animal : animalList) {
            if (!animal.flyAble()) {
                eligibleList.add(animal);
            }
        }

        return eligibleList;
    }

    public List<MoveAble> getWinner(List<MoveAble> animalList) {
        List<MoveAble> winners = new ArrayList<>();
        int winnerSpeed = 0;
        for (MoveAble animal : animalList) {
            if (animal.speed() > winnerSpeed) {
                winners.clear();
                winners.add((animal));
                winnerSpeed = animal.speed();
            } else if (animal.speed() == winnerSpeed) {
                winners.add(animal);
            }
        }

        return winners;
    }
}
