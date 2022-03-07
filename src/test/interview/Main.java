package test.interview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannerIn = scanner.nextLine();
        String[] cars = scannerIn.split(",");
        int carCount = 0;
        for (int i = 0; i < cars.length; ) {
            if (cars.length == 3) {
                if (Integer.valueOf(cars[0]) == 1 && Integer.valueOf(cars[1]) == 0 && Integer.valueOf(cars[2]) == 1) {
                    carCount = carCount + 2;
                    i = cars.length;
                    continue;
                } else if (Integer.valueOf(cars[0]) == 0 && Integer.valueOf(cars[1]) == 0 && Integer.valueOf(cars[2]) == 0) {
                    i = cars.length;
                    continue;
                } else {
                    carCount = carCount + 1;
                    i = cars.length;
                    continue;
                }
            }
            if (Integer.valueOf(cars[i]) == 1) {
                if (cars.length - 1 - i >= 2) {
                    if (Integer.valueOf(cars[i]) == 1 || Integer.valueOf(cars[i + 1]) == 1 || Integer.valueOf(cars[i + 2]) == 1) {
                        carCount = carCount + 1;
                    }
                    i = i + 3;
                    continue;
                } else if (cars.length - 1 - i == 1) {
                    if (Integer.valueOf(cars[i]) == 1 || Integer.valueOf(cars[i + 1]) == 1) {
                        carCount = carCount + 1;
                    }
                    i = cars.length;
                    continue;
                } else {
                    if (Integer.valueOf(cars[i]) == 1) {
                        carCount = carCount + 1;
                    }
                    i = cars.length;
                    continue;
                }
            } else {
                i = i + 1;
            }
        }
        System.out.println(carCount);
    }
}
