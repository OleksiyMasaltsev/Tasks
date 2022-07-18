package ua.masaltsev.codewars;

import java.util.stream.IntStream;

public class GpsSpeed {

    public static int gps(int s, double[] x) {

        int maxSpeed = 0;

        if (x.length <= 1) {
            return maxSpeed;
        }

        for (int i = 1; i < x.length; i++) {
            double delta_distance = x[i] - x[i-1];
            int speed = (int)(3600 * delta_distance) / s;
            if (speed > maxSpeed) {
                maxSpeed = speed;
            }
        }

        return maxSpeed;

//        double maxSpeed = IntStream
//                .range(0, x.length - 1)
//                .mapToDouble(i -> (x[i+1] - x[i]) * 3600.0 / (double) s )
//                .max().orElse(0.0);
//        return (int) Math.floor(maxSpeed);
    }

}
