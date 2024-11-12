
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

    public int poemScore()
    {
        String entirePoem = (lineOne + " " + lineTwo + " " + lineThree + " " + lineFour + " " + lineFive + " " + lineSix + " " + lineSeven + " " + lineEight);
        if (lineOne.substring(lineOne.length()-3).equals(lineThree.substring(lineThree.length()-3)))
        {
            score +=3;
        }
        else if (lineOne.substring(lineOne.length()-2).equals(lineThree.substring(lineThree.length()-2)))
        {
            score +=2;
        }
        if (lineTwo.substring(lineTwo.length()-3).equals(lineFour.substring(lineFour.length()-3)))
        {
            score +=3;
        }
        else if (lineTwo.substring(lineTwo.length()-2).equals(lineFour.substring(lineFour.length()-2)))
        {
            score +=2;
        }
        if (lineThree.substring(lineThree.length()-3).equals(lineFive.substring(lineFive.length()-3)))
        {
            score +=3;
        }
        else if (lineThree.substring(lineThree.length()-2).equals(lineFive.substring(lineFive.length()-2)))
        {
            score +=2;
        }
        if (lineFour.substring(lineFour.length()-3).equals(lineSix.substring(lineSix.length()-3)))
        {
            score +=3;
        }
        else if (lineFour.substring(lineFour.length()-2).equals(lineSix.substring(lineSix.length()-2)))
        {
            score +=2;
        }
        if (lineFive.substring(lineFive.length()-3).equals(lineSeven.substring(lineSeven.length()-3)))
        {
            score +=3;
        }
        else if (lineFive.substring(lineFive.length()-2).equals(lineSeven.substring(lineSeven.length()-2)))
        {
            score +=2;
        }
        if (lineSix.substring(lineSix.length()-3).equals(lineEight.substring(lineEight.length()-3)))
        {
            score +=3;
        }
        else if (lineSix.substring(lineSix.length()-2).equals(lineEight.substring(lineEight.length()-2)))
        {
            score +=2;
        }
        if (entirePoem.contains(flower))
        {
            score++;
        }
        return score;
    }

    }
