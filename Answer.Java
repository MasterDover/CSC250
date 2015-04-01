using System;

public class Answer
{
    private String answerString;
    private String nextAnswer;
    private String nextAnswerIf;

	public Answer()
	{
        String answerString = null;
        String nextAnswer = null;
        String nextAnswerIf = null;
	}

    public void addAnswer(String s, Answer a)
    {
        answerString = s;
        nextAnswer = a;
    }
    public void addAnswerIf(String s, Answer aIf)
    {
        answerString = s;
        nextAnswerIf = aIf;
    }

}
