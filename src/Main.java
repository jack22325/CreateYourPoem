//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write an 8 line poem one line at a time and try to rhyme the last word of every other line, meaning that the last 2 or 3 letters must be the same");
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
        System.out.println("Total score: " + (Flower.poemScore()));
    }
}