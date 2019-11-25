import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalayserTest
{
    @Test
    public void givenMessage_whenSad_shouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood("This is Sad Mood");
            Assert.assertEquals("Sad", mood);
        }
        catch (MoodAnalysisException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_whenHappy_shouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood("This is Happy Mood");
            Assert.assertEquals("Happy" , mood);
        }
        catch (MoodAnalysisException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void giveNullPointerException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.analyseMood(null);
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals("Please enter proper message.",e.getMessage());
        }
    }

    @Test
    public void givenMoodAnalyser_whenProper_shouldReturnObject()
    {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalsyser("I am in Happy Mood");
        try
        {
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy" , mood);
        }
        catch (MoodAnalysisException e)
        {
            e.printStackTrace();
        }

    }
}
