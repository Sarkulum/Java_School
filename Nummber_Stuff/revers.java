package Nummber_Stuff;

import java.util.ArrayList;
import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein und drücken Sie Enter. Wenn Sie keine weiteren Zahlen hinzufügen wollen, schreiben Sie 'Stop' und drücken Sie Enter.");

        while (true) {
            String userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("Stop")) {
                break;
            }
            try {
                int number = Integer.parseInt(userInput);
                arr.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Bitte geben Sie eine gültige Zahl ein oder 'Stop', um zu beenden.");
            }
        }

        reverseOrder(arr);
    }

    public static void reverseOrder(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n / 2; i++) {
            // Swap elements
            int temp = arr.get(i);
            arr.set(i, arr.get(n - 1 - i));
            arr.set(n - 1 - i, temp);
        }
        System.out.println("Umgekehrte Reihenfolge: " + arr);
    }
}
