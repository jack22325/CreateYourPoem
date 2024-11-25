
public class poem {
    private int score;
    private int adjustedScore;
    public String lineOne;
    public String lineTwo;
    public String lineThree;
    public String lineFour;
    public String lineFive;
    public String lineSix;
    public String lineSeven;
    public String lineEight;
    public String flower;

    // This is the constructor containing each individual line of the poem and the type of flower.//
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

    //This returns the raw score based on rhymes and if the selected flower was used at least once. It doesn't account for any other rules.//
    public int rawPoemScore()
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

    // Returns the adjusted score based on if the user rhymed any words with itself.//
    public int checkForDuplicates()
    {
        adjustedScore = score;
        if (lineOne.substring(lineOne.lastIndexOf(" ")).equals(lineThree.substring(lineThree.lastIndexOf(" "))))
        {
            adjustedScore = adjustedScore - 5;
        }
        if (lineTwo.substring(lineTwo.lastIndexOf(" ")).equals(lineFour.substring(lineFour.lastIndexOf(" "))))
        {
            adjustedScore = adjustedScore - 5;
        }
        if (lineThree.substring(lineThree.lastIndexOf(" ")).equals(lineFive.substring(lineFive.lastIndexOf(" "))))
        {
            adjustedScore = adjustedScore - 5;
        }
        if (lineFour.substring(lineFour.lastIndexOf(" ")).equals(lineSix.substring(lineSix.lastIndexOf(" "))))
        {
            adjustedScore = adjustedScore - 5;
        }
        if (lineFive.substring(lineFive.lastIndexOf(" ")).equals(lineSeven.substring(lineSeven.lastIndexOf(" "))))
        {
            adjustedScore = adjustedScore - 5;
        }
        if (lineSix.substring(lineSix.lastIndexOf(" ")).equals(lineEight.substring(lineEight.lastIndexOf(" "))))
        {
            adjustedScore = adjustedScore - 5;
        }
        return adjustedScore;
    }

    // Returns true if the user cheated.//
    public boolean didCheat()
    {
        return score != adjustedScore;
    }

    // Returns true if the user got a perfect score.//
    public boolean perfectScore()
    {
        return adjustedScore == 19;
    }
}
