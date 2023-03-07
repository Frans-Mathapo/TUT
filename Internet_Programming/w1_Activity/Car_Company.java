import java.text.DecimalFormat;

class Car_Company{
	
	public static void main(String args[])
	{
		String name[] = {"James Boyd", "Mpho Baloyi", "Timothy Ryan", "Daniel Ramogotshi", "William Seimela", "Harold Xaba", "Miller Bentley", "Sam Sithole", "Richard Frey", "Peter Sebata"};
		double totalSales[] = {40000.00,54321.00,12345.60,60444.40,23457.80,43222.30,12444.00,12444.00,23555.00,45666.00,18982.30};
		double[] commission = new double[name.length];

		//formart to 2 desiaml decimal
		DecimalFormat df = new DecimalFormat("##.00");
		
		//Generate the commission and store into array
		for(int y = 0; y < name.length; y++)
		{
			//Condition statement 
			if(totalSales[y] >= 50000){
				// >= R20 000.00 5% of sales
				commission[y] = totalSales[y]*0.09;
			}else if(totalSales[y] >= 20000){
				// >= R50 000.00 9% of sales
				commission[y] = totalSales[y]*0.05;
			}
			else{
				// < R20 000.00 3% of sales
				commission[y] = totalSales[y]*0.03;
			}
			
		}
		
		//Display the result before sort
		System.out.println("======================Before Sorting======================");
		System.out.printf("%-20s	%10s		%10s\n","Name", "Total Sales", "Commission");
		System.out.println("==========================================================");
		beforeSort(name, totalSales, commission, df);

		//Create a space betweeen table
		System.out.println();
		System.out.println();

		//Display the result before sort
		System.out.println("======================After Sorting=======================");
		System.out.printf("%-20s	%10s		%10s\n","Name", "Total Sales", "Commission");
		System.out.println("==========================================================");
		afterSorting(name, totalSales, commission);

	}

	public static void beforeSort(String[] name, double[] totalSales, double[] commission, DecimalFormat df)
	{
		double calcTotalSales = 0, calcTotalCommission = 0;

		for(int x = 0; x < name.length; x++)
		{
			System.out.printf("%-20s	R %7s		R %7s\n",name[x], df.format(totalSales[x]), df.format(commission[x]));
			calcTotalSales = calcTotalSales + totalSales[x];
			calcTotalCommission = calcTotalCommission + commission[x];
		}
		System.out.println("==========================================================");
		//display the totalSales and totalCommission
		System.out.printf("%-20s	R %7s		R %7s\n", "Totals:", df.format(calcTotalSales), df.format(calcTotalCommission));
		System.out.println("==========================================================");
	}

	public static void afterSorting(String[] name, double[] totalSales, double[] commission)
	{
		int size = name.length;
		DecimalFormat df = new DecimalFormat("##.00");

		for(int y = 0; y < size-1; y++){
			for(int x = 0; x < size-y-1; x++){
				if(totalSales[x] > totalSales[x+1])
				{
					//swap totalSales[x] and totalSales[x+1]
					double temp = totalSales[x];
					totalSales[x] = totalSales[x+1];
					totalSales[x+1] = temp;

					//also swap name[x] and name[x+1]
					String tempName = name[x];
					name[x] = name[x+1];
					name[x+1] = tempName;

					//also swap commission[x] and commission[x+1]
					double tempComission = commission[x];
					commission[x] = commission[x+1];
					commission[x+1] = tempComission;
				}
			}
		}

		beforeSort(name, totalSales, commission, df);
	}
}