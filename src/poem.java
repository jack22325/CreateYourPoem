
public class poem {
    private int score;
    public String lineOne;
    public String lineTwo;
    public String lineThree;
    public String lineFour;
    public String lineFive;
    public String lineSix;
    public String lineSeven;
    public String lineEight;
    public String flower;
    private int twoPointsTotal;

    public poem(String line1, String line2, String line3, String line4, String line5, String line6, String line7, String line8, String flowerType) {
        lineOne = line1;
        lineTwo = line2;
        lineThree = line3;
        lineFour = line4;
        lineFive = line5;
        lineSix = line6;
        lineSeven = line7;
        lineEight = line8;
        flower = flowerType;
    }

    public String randomFlower()
    {
        double random = Math.random()*3+1;
        int randomNum = (int) random;
        if (randomNum == 1)
        {
            flower = "rose";
        }
        else if(randomNum == 2)
        {
            flower = "daisy";
        }
        else
        {
            flower = "poppy";
        }
        return flower;
    }

    public int rhymeScoresOfThree()
    {
        if (lineOne.substring(lineOne.length()-3).equals(lineThree.substring(lineThree.length()-3)))
        {
            score+=3;
        }
        if (lineTwo.substring(lineTwo.length()-3).equals(lineFour.substring(lineFour.length()-3)))
        {
            score+=3;
        }
        if (lineThree.substring(lineThree.length()-3).equals(lineFive.substring(lineFive.length()-3)))
        {
            score+=3;
        }
        if (lineFour.substring(lineFour.length()-3).equals(lineSix.substring(lineSix.length()-3)))
        {
            score+=3;
        }
        if (lineFive.substring(lineFive.length()-3).equals(lineSeven.substring(lineSeven.length()-3)))
        {
            score+=3;
        }
        if (lineSix.substring(lineSix.length()-3).equals(lineEight.substring(lineEight.length()-3)))
        {
            score+=3;
        }
        return score;
    }

    public int rhymeScoresOfTwo()
    {
        if (lineOne.substring(lineOne.length()-2).equals(lineThree.substring(lineThree.length()-2)))
        {
            twoPointsTotal +=2;
        }
        if (lineTwo.substring(lineTwo.length()-2).equals(lineFour.substring(lineFour.length()-2)))
        {
            twoPointsTotal +=2;
        }
        if (lineThree.substring(lineThree.length()-2).equals(lineFive.substring(lineFive.length()-2)))
        {
            twoPointsTotal +=2;
        }
        if (lineFour.substring(lineFour.length()-2).equals(lineSix.substring(lineSix.length()-2)))
        {
            twoPointsTotal +=2;
        }
        if (lineFive.substring(lineFive.length()-2).equals(lineSeven.substring(lineSeven.length()-2)))
        {
            twoPointsTotal +=2;
        }
        if (lineSix.substring(lineSix.length()-2).equals(lineEight.substring(lineEight.length()-2)))
        {
            twoPointsTotal +=2;
        }
        return twoPointsTotal;
    }
}
