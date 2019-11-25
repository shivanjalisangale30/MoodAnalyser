import org.junit.Assert;
import org.junit.Test;

public class MoodAnalayserTest
{
    @Test
    public void giveNullPointerException()
    {
        MoodAnalsyser moodAnalsyser = new MoodAnalsyser();
        String mood = moodAnalsyser.analyseMood(null);
        Assert.assertEquals("Happy",mood);
    }
}
