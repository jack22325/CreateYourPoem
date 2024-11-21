//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Write an 8 line poem one line at a time and try to rhyme the last word of every other line (ABAB rhyme scheme), meaning that the last 2 or 3 letters must be the same to earn the respective amount of points.");
        System.out.println("Each line must contain more than one word, and you can't rhyme a word with itself or else your score will decrease.");
        flower plant = new flower();
        Scanner s = new Scanner(System.in);
        System.out.println("Type a number 1-3");
        int num = s.nextInt();
        String randomFlower = plant.randomFlower(num);
        System.out.println("Your poem must contain this flower: " + randomFlower);
        Scanner a = new Scanner(System.in);
        System.out.println("Write line 1");
        String firstLine = a.nextLine();
        System.out.println("Write line 2");
        Scanner b = new Scanner(System.in);
        String secondLine = b.nextLine();
        System.out.println("Write line 3");
        Scanner c = new Scanner(System.in);
        String thirdLine = c.nextLine();
        System.out.println("Write line 4");
        Scanner d = new Scanner(System.in);
        String fourthLine = d.nextLine();
        System.out.println("Write line 5");
        Scanner e = new Scanner(System.in);
        String fifthLine = e.nextLine();
        System.out.println("Write line 6");
        Scanner f = new Scanner(System.in);
        String sixthLine = f.nextLine();
        System.out.println("Write line 7");
        Scanner g = new Scanner(System.in);
        String seventhLine = g.nextLine();
        System.out.println("Write line 8");
        Scanner h = new Scanner(System.in);
        String eighthLine = h.nextLine();
        poem Flower = new poem(firstLine, secondLine, thirdLine, fourthLine, fifthLine, sixthLine, seventhLine, eighthLine, randomFlower);
        int rawScore = Flower.rawPoemScore();
        int adjustedScore = Flower.checkForDuplicates();
        System.out.println("Raw score: " + rawScore);
        Thread.sleep(1000);
        System.out.println("Did you cheat? Let's see");
        Thread.sleep(1000);
        System.out.print("Scanning each line.");
        Thread.sleep(400);
        System.out.print(".");
        Thread.sleep(400);
        System.out.println(".");
        Thread.sleep(800);
        System.out.print("Checking for duplicate words.");
        Thread.sleep(400);
        System.out.print(".");
        Thread.sleep(400);
        System.out.println(".");
        Thread.sleep(800);
        if (Flower.didCheat())
        {
            System.out.println("You did cheat! Your real score is: " + adjustedScore);
        }
        else
        {
            System.out.println("You didn't cheat. Your real score is: " + rawScore);
        }
        if (Flower.perfectScore())
        {
            System.out.println("Your score was a perfect 19! Thanks for playing.");
        }
        else
        {
            Thread.sleep(800);
            System.out.println("Try again to get a perfect score of 19.");
            Thread.sleep(800);
            System.out.println("Would you like to see an example of a perfect 19? Y or N.");
            Scanner i = new Scanner(System.in);
            String example = i.nextLine();
            if (example.equals("Y")||(example.equals("y")))
            {
                System.out.println(plant.perfectNineteen());
            }
            else
            {
                System.out.println("Good luck.");
            }
        }
    }
}