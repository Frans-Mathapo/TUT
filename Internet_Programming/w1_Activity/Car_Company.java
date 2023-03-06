class Car_Company{
	
	public static void main(String args[])
	{
		String name[] = {"James Boyd", "Mpho Baloyi", "Timothy Ryan", "Daniel Ramogotshi", "William Seimela", "Harold Xaba", "Miller Bentley", "Sam Sithole", "Richard Frey", "Peter Sebata"};
		double totalSales[] = {40000.00,54321.00,12345.60,60444.40,23457.80,43222.30,12444.00,12444.00,23555.00,45666.00,18982.30};
		double[] commission = new double[name.length];
		
		//Generate the commission and store into array
		for(int y = 0; y < name.length; y++)
		{
			//store commision after calc
			commission[y] = totalSales[y];
		}
		
		//Display the result here
		for(int x = 0; x < name.length; x++)
		{
			System.out.println(name[x] +"\t\t R " + totalSales[x] +"\t\t R " + commission[x]);
		}
	}
}