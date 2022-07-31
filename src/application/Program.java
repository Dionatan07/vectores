package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = key.nextInt();

        String[] people = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];
        double heightSum = 0.0;
        int contPeople = 0;

        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.println("Person #" + (i+1) + " details: ");

            key.nextLine();
            System.out.print("Name: ");
            people[i] = key.nextLine();

            System.out.print("Age: ");
            age[i] = key.nextInt();

            System.out.print("Height: ");
            height[i] = key.nextDouble();

            heightSum += height[i];

            if (age[i] < 16){
                contPeople++;
            }
        }

        double percentageAge = ((double)contPeople / n) * 100;

        System.out.println();
        System.out.println("Average height: " + String.format("%.2f", heightSum / height.length));

        System.out.println("People under 16 years old: " + String.format("%.1f", percentageAge ) + "%");

        for (int i = 0; i<n;i++){
            if (age[i] < 16){
                System.out.println(people[i]);
            }
        }


    }
}
