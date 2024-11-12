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
}
