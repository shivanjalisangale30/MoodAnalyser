public class MoodAnalsyser
{
    public String analyseMood(String message) throws MoodAnalysisException {
        try
        {
            if(message.contains("Sad"))
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
            throw new MoodAnalysisException("Please enter proper message.");
        }
    }
}
