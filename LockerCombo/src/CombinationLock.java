public class CombinationLock 
{
	private int code1;
	private int code2;
	private int code3;
	private int dial;

	public CombinationLock(int code1, int code2, int code3)
	{
		this.code1 = code1;
		this.code2 = code2;
		this.code3 = code3;
	}

	public void reset() 
	{
		this.dial = 0;
	}

	public void turnLeft(int ticks)
	{
		this.scroll(-ticks);
		if (this.code1 == -1) 
		{
			if (this.openLock(code2) == true) 
			{
				System.out.println("Secret 2 unlocked");
			}
		}
	}

	public void turnRight(int ticks) {
		this.scroll(ticks);
		if (this.openLock(code1) == true) 
		{
			System.out.println("Secret 1 unlocked");
			if (this.openLock(code2) == true) 
			{
				if (this.openLock(code3) == true)
				{
					System.out.println("Combo lock unlocked");
				}
			}
		}
	}

	public void scroll(int ticks)
	{
		if (this.dial + ticks > 39) 
		{
			if (ticks >= 39) 
			{
				this.dial += ticks - 39;
			} 
			else if (this.dial >= 39) 
			{

			}
		}
		else if (this.dial + ticks < 0) 
		{
			this.dial += 40 + ticks;
			this.dial += ticks - 40;
		} 
		else
		{
			this.dial += ticks;
		}
	}

	public boolean openLock(int secret)
	{
		if (this.dial == secret)
		{
			secret = -1;
			return true;
		} else 
		{
			return false;
		}
	}
}
