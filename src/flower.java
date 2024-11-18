public class flower {
    public flower()
    {}

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

    public String perfectNineteen()
    {
        return "A perfect 19 would look like this, if the theme was for fruit instead of flowers. \n Everyday at the store, an apple is bought. \n But other fruits like durians sit on the shelf unbothered. \n An apple can be thrown and caught, \n But a durian will leave you injured. \n The apple knows that it is sought, \n But the durian lives its life bored. \n Maybe we will make it right \n And give the durian the attention it has always deserved.";
    }
}
