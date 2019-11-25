import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalayserTest
{

    @Test
    public void givenMessage_whenSad_shouldReturnSad()
    {
        MoodAnalsyser moodAnalsyser = new MoodAnalsyser();
        String mood = null;
        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalsyser.analyseMood("This is Sad Mood");
            Assert.assertEquals("Sad", mood);

        }
        catch (MoodAnalysisException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_whenHappy_shouldReturnHappy() throws MoodAnalysisException
    {
        MoodAnalsyser moodAnalsyser = new MoodAnalsyser();
        String mood = null;

            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalsyser.analyseMood("This is Happy Mood");
            Assert.assertEquals("Happy" , mood);

    }

    @Test
    public void giveNullPointerException()
    {
        MoodAnalsyser moodAnalsyser = new MoodAnalsyser();
        try
        {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalsyser.analyseMood(null);
        }
        catch (MoodAnalysisException e)
        {
        }
    }
}
