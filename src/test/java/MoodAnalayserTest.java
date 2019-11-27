import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;


public class MoodAnalayserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood("This is Sad Mood");
            Assert.assertEquals("Sad", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_whenHappy_shouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood("This is Happy Mood");
            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void giveNullPointerException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals("Please enter proper message.", e.getMessage());
        }
    }

    @Test
    public void giveNullPointerExceptionUsingEnum() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        try {
            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenEmptyExceptionUsingEnum() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        try {
            moodAnalyser.analyseMood("");
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenMoodAnalyser_whenProper_shouldReturnObject() throws MoodAnalysisException {
        Constructor<?> constructor = MoodAnalyserReflector.getConstructor(String.class);
        Object myObject = MoodAnalyserReflector.createMoodAnalsyser(constructor, "I am in Happy Mood");
        Assert.assertEquals(new MoodAnalyser("I am in Happy Mood") , myObject );
    }

    @Test
    public void givenObject_whenProper_shouldReturnObjectUsingReflector() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        ObjectReflector.dump(moodAnalyser, 3);
    }

    @Test
    public void givenHappyMesssage_withReflection_shouldReturnHappy() {
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor(String.class);
            Object myObject = MoodAnalyserReflector.createMoodAnalsyser(constructor, "I am in Happy Mood");
            Object mood = MoodAnalyserReflector.invokeMethod(myObject, "analyseMood");
            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMoodAnalyser_OnChangedMood_shoudlReturnHappy() {
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor(String.class);
            Object myObject = MoodAnalyserReflector.createMoodAnalsyser(constructor, "I am in Happy Mood");
            MoodAnalyserReflector.setFieldValue(myObject, "message", "I am in Happy Mood");
            Object mood = MoodAnalyserReflector.invokeMethod(myObject, "analyseMood");
            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenHappyMessage_whenDefaultConstructor_shouldReturnHappy() {
        try {
            Constructor<?> constructor = MoodAnalyserReflector.getConstructor();
            Object myObject = MoodAnalyserReflector.createMoodAnalsyser(constructor);
            MoodAnalyserReflector.setFieldValue(myObject, "message", "I am in Happy Mood");
            Object mood = MoodAnalyserReflector.invokeMethod(myObject, "analyseMood");
            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

}
