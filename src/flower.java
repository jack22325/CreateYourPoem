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
        return "A perfect 19 would look like this, if the theme was for cities instead of flowers. \n The city of "
    }
}
