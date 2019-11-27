package com.moodanalyser;

public class MoodAnalyser
{
    private String message;

    public MoodAnalyser()
    {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysisException
    {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException
    {
        try
        {
            if (message.length() == 0 )
            {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please enter proper message");
            }
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
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL , "Please enter proper message.");
        }
    }

    public boolean equals(Object another)
    {
        if(this.message.equals(((MoodAnalyser)another).message))
        {
            return true;
        }
        return false;
    }
}
