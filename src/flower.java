public class flower {

    // This is the constructor.//
    public flower()
    {}

    // This method determines the flower that the user must use in their poem based on a number 1-3 that they select. They won't know which number correlates to which flower beforehand.
    public String randomFlower(int num)
    {
        String flower;
        if (num==1)
        {
            flower = "rose";
        }
        else if (num==2)
        {
            flower = "poppy";
        }
        else
        {
            flower = "daisy";
        }
        return flower;
    }

    // This method returns a perfect score of 19 for a different theme. 19 is the highest score that you can get in the game.//
    public String perfectNineteen()
    {
        return "A perfect 19 would look like this, if the theme was for fruit instead of flowers and the selected word was durian. \n\n Everyday at the store, an apple is bought. \n But other fruits like durians sit on the shelf unbothered. \n An apple can be thrown and caught, \n But a durian will leave you injured. \n The apple knows that it is sought, \n But the durian lives its life bored. \n Maybe we will make it right \n And give the durian the attention it has always deserved.";
    }
}
