package lmspractice;

public class RollNoValidate1 {
	public static long parseRollNumber(String rollNumber) throws Exception
	{
		long res = 0;
		if(rollNumber.startsWith("1") || rollNumber.startsWith("2"))
		{
			if(rollNumber.length() == 8)
			{
				if (rollNumber.matches("[0-9]+") && rollNumber.length() > 2)
				{
					 res = Long.parseLong(rollNumber);
				}
				else
				{
					throw  new InvalidRollNumberException("Roll number should only contain digits");	
				}
			}
			else
			{
				throw new InvalidRollNumberException("Roll must have 8 digits");
			}
		}else
		{
			throw new InvalidRollNumberException("RollNumber first digit starts with 1 or 2");
		}
		
		
		return res;
		
	}

	

}
