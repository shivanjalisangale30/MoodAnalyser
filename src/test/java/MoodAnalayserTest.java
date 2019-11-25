import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Objects;

public class MoodAnalayserTest
{
    @Test
    public void givenMessage_whenSad_shouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
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
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
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
            Assert.assertEquals("Please enter proper message." , e.getMessage());
        }
    }
    @Test
    public void giveNullPointerExceptionUsingEnum()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.analyseMood(null);
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL , e.type);
        }
    }

    @Test
    public void givenEmptyExceptionUsingEnum()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try
        {
            moodAnalyser.analyseMood("");
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenMoodAnalyser_whenProper_shouldReturnObject()
    {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalsyser("I am in Happy Mood");
        Assert.assertEquals(new MoodAnalyser("I am in Happy Mood") , moodAnalyser);
    }

    @Test
    public void givenObject_whenProper_shouldReturnObjectUsingReflector()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        ObjectReflector.dump(moodAnalyser , 3);
    }
}
