
public class Driver 
{
	public static void main(String[] args) 
	{
		int[] ar = {7,8,1,3,4,2};
		Driver.display(ar);
		Driver.mergerSort(ar);
		Driver.display(ar);
	}
	static void display(int [] ar)
	{
		System.out.println("*****");
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
		System.out.println("*****");
	}
	static void mergerSort(int[] ar)
	{
		Driver.mergeSortHelper(ar, 0, ar.length-1);
	}
	static void mergeSortHelper(int[] ar, int begin, int end)
	{
		Driver.display(ar, begin, end);
		if(begin != end)
		{
			int leftBegin = begin;
			int leftEnd = ((end-begin)/2 + begin);
			int rightBegin = ((end-begin)/2 + begin) + 1;
			int rightEnd = end;
			Driver.mergeSortHelper(ar, leftBegin, leftEnd);
			Driver.mergeSortHelper(ar, rightBegin, rightEnd);			
		int[] temp = new int[rightEnd - leftBegin + 1];
		int currLeft = leftBegin;
		int currRight = rightBegin;
		for(int tempPos = 0; tempPos < temp.length; tempPos++)
		{
			if(currLeft > leftEnd)
			{
				temp[tempPos] = ar[currRight];
				currRight++;
			}
			else if(currRight > rightEnd)
			{
				temp[tempPos] = ar [currLeft];
				currLeft++;
			}
			else
			{
				if(ar[currLeft] < ar[currRight])
				{
					temp[tempPos] = ar[currLeft];
					currLeft++;
				}
				else
				{
					temp[tempPos] = ar[currRight];
					currRight++;
				}
			}
		}
		int tempPos = 0;
		for(int i = leftBegin; i <= rightEnd; i++)
		{
			ar[i] = temp[tempPos];
			tempPos++;
		}
		}
		}
	static void display(int[] ar, int begin, int end)
	{
		for(int i = begin; i <= end; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println("");
	}
}