import java.util.Scanner;

public class Percentage
    {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double obtainedScore= 0, totalScore = 0;
            float Percentage;

            System.out.print("Enter Obtained Score: ");
            obtainedScore = input.nextDouble();
            System.out.println("Enter Total Score: ");
            totalScore = input.nextDouble();

            Percentage = (float)((obtainedScore*100/totalScore));
            System.out.println("Percentage is : "+Percentage+"%");


        }

        }


