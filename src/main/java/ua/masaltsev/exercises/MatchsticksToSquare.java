package ua.masaltsev.exercises;

public class MatchsticksToSquare {
    public boolean makesquare(int[] matchsticks) {

        int totalLength = 0;

        for (int length : matchsticks) {
            totalLength += length;
        }

        if (totalLength % 4 == 0) {
            int sideLength = totalLength / 4;
            for (int i = 0; i < matchsticks.length - 1; i++) {
                for (int j = i + 1; j < matchsticks.length; j++) {
                    int constructedSide;
                    if (matchsticks[i] < sideLength) {
                        constructedSide = matchsticks[i] + matchsticks[j];
                        if (constructedSide == sideLength) {
                            int buffer = matchsticks[j];
                            matchsticks[j] = matchsticks[i + 1];
                            matchsticks[i + 1] = buffer;
                            i += 1;
                            break;
                        }
                        if (constructedSide > sideLength) {
                            return false;
                        }
                    } else if (matchsticks[i] == sideLength) {
                        break;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }

    }
}
