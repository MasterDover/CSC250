public class Answer
{
    private String answerString;
    private Answer nextAnswer;
    private Answer nextAnswerIf;

	public Answer()
	{
       answerString = null;
       nextAnswer = null;
       nextAnswerIf = null;
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
