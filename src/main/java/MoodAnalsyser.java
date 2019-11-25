public class MoodAnalsyser
{
    public String analyseMood(String message)
    {
        try
        {
            if(message.contains("SAD"))
            {
                return "Sad";
            }
            else
            {
                return "Happy";
            }
        }
        catch (NullPointerException e)
        {
            return "Happy";
        }
    }
}
