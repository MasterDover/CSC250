import java.awt.Image;
import java.util.Random;

public class Scenario
{
    private boolean isEmpty;
    private Image cellImage;
    private Answer answer1;
    private Answer answer2;
    private Answer answer3;
    private Answer answer4;
    private Scenario leftScenario;
    private Scenario rightScenario;
    private int lr;

	public Scenario()
	{
        this.cellImage = null;
        this.answer1 = null;
        this.answer2 = null;
        this.answer3 = null;
        this.answer4 = null;
        this.isEmpty = true;
        this.leftScenario = null;
        this.rightScenario = null;
        Random rnd = new Random();
        this.lr = rnd.nextInt(2);
	}

    public void add(Image i, Answer a1, Answer a2, Answer a3, Answer a4)
    {
		if(this.isEmpty)
		{
			this.cellImage = i;
			this.isEmpty = false;
            this.answer1 = a1;
            this.answer2 = a2;
            this.answer3 = a3;
            this.answer4 = a4;
		}
		else
		{
            if (lr == 0)
            {
                if (this.leftScenario == null)
                {
                    this.leftScenario = new Scenario();
                }
                this.leftScenario.add(i, a1, a2, a3, a4);
            }
            else
            {
                if (this.rightScenario == null)
                {
                    this.rightScenario = new Scenario();
                }
                this.rightScenario.add(i, a1, a2, a3, a4);
            }
		}
    }


}
