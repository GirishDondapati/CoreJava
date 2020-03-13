package com.girish.zoho;

public class PayPal_SortedArrayFindIndexInOptimalCode {
	
	// Simple binary search algorithm 
    static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r>=l) 
        { 
            int mid = l + (r - l)/2; 
            if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid-1, x); 
            return binarySearch(arr, mid+1, r, x); 
        } 
        return -1; 
    } 
    public static int normalFind(int arr[], int l, int r, int x)
    {
    	int resultIndex = -1;
    	for(int i = 0; i < r; i++)
    	{
    		if(x == arr[i])
    		{
    			resultIndex = i;
    			break;
    		}
    	}
    		
    	return resultIndex;
    }
    
  
    // Driver method to test the above function 
    public static void main(String[] args)  
    { 
    	long startTime = System.currentTimeMillis();
        //int arr[] = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140}; 
        
       int size = 20000000;
    	int arr[] = new int[size];
    	
    	for(int i = 0; i < size; i++)
        	arr[i] = i+1;
    	
        //int ans = findPos(arr,10); 
        int ans = binarySearch(arr, 0, arr.length, 18090000); 
       // int ans = normalFind(arr, 0, arr.length, 18090000); 
          
        if (ans==-1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element found at index " + ans); 
        System.out.println(System.currentTimeMillis() - startTime);
    } 
	
   
	
	
	
    
    
    
    
    
	
 // Method takes an infinite size array and a key to be 
    // searched and returns its position if found else -1. 
    // We don't know size of arr[] and we can assume size to be 
    // infinite in this function. 
    // NOTE THAT THIS FUNCTION ASSUMES arr[] TO BE OF INFINITE SIZE 
    // THEREFORE, THERE IS NO INDEX OUT OF BOUND CHECKING 
    static int findPos(int arr[],int key)  
    { 
        int l = 0, h = 1; 
        int val = arr[0]; 
  
        // Find h to do binary search 
        while (val < key) 
        { 
            l = h;     // store previous high 
            //check that 2*h doesn't exceeds array  
            //length to prevent ArrayOutOfBoundException 
            if(2*h < arr.length-1) 
               h = 2*h;              
            else
               h = arr.length-1; 
              
            val = arr[h]; // update new val 
        } 
  
        // at this point we have updated low 
        // and high indices, thus use binary  
        // search between them 
        return binarySearch(arr, l, h, key); 
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	/*static boolean isFound = false;
	static int result = 0;
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(2);al.add(5);al.add(8);
		al.add(10);al.add(14);al.add(19);
		al.add(23);al.add(26);al.add(30);
		
		int findIndexValue = 2;
		setIndexOfGivenVal(al,findIndexValue,0,al.size());
		
		System.out.println(result);
		
	}
	
	private static void setIndexOfGivenVal(ArrayList al,int searchVal, int startIndex, int lastIndex)
	{
		int checkVal = lastIndex/2;
		if(checkVal > 2)
		{
			int currValue = (int) al.get(checkVal);
			if(!isFound)
			{
				if(currValue == searchVal)
				{
					result = checkVal;
					isFound = true;
				}
				else if(currValue > searchVal)
				{
					setIndexOfGivenVal(al,searchVal,0,checkVal);
				}
				else
				{
					setIndexOfGivenVal(al,searchVal,checkVal,lastIndex);
				}
			}
		}
		else
		{
			for(int t = startIndex; t < lastIndex; t++)
			{
				int currValue = (int) al.get(t);
				if(currValue == searchVal)
				{
					result = checkVal;
					isFound = true;
				}
			}		
		}
			
			
	}*/

}