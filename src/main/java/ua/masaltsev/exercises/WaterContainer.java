package ua.masaltsev.exercises;

public class WaterContainer {
    public int maxArea(int[] height) {

        int leftIndex = 0;
        int rightIndex = height.length-1;
        int volume2 = checkVolume(height, leftIndex, rightIndex);

        while (leftIndex < rightIndex) {
            if (height[leftIndex+1] > height[leftIndex]) {

            }
        }

        /*int volume = 0;

        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int min = Math.min(height[i], height[j]);
                int bufferVol = min * (j - i);
                if (bufferVol > volume) {
                    volume = bufferVol;
                }
            }
        }

        return volume;*/
    }

    public int checkVolume(int[] height, int i, int j) {
        int min = Math.min(height[i], height[j]);
        return (j - i) * min;
    }
}
