package com.girish.zoho;
/*
 * Second round written program
 * 
 * https://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
 * 
 Find the first circular tour that visits all petrol pumps
	Suppose there is a circle. There are n petrol pumps on that circle. You are given two sets of data.
		1. The amount of petrol that every petrol pump has.
		2. Distance from that petrol pump to the next petrol pump.

	Calculate the first point from where a truck will be able to complete the circle 
	(The truck will stop at each petrol pump and it has infinite capacity). Expected time complexity is O(n).
	 Assume for 1 littre petrol, the truck can go 1 unit of distance.

	For example, let there be 4 petrol pumps with amount of petrol and distance to next petrol pump
	 value pairs as {4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point from where truck can make a circular 
	 tour is 2nd petrol pump. Output should be �start = 1� (index of 2nd petrol pump).

	Recommended: Please solve it on �PRACTICE� first, before moving on to the solution.
	A Simple Solution is to consider every petrol pumps as starting point and see if there is a possible tour.
	 If we find a starting point with feasible solution, we return that starting point.
	  The worst case time complexity of this solution is O(n^2).

	We can use a Queue to store the current tour. We first enqueue first petrol pump to the queue,
	 we keep enqueueing petrol pumps till we either complete the tour, or current amount of petrol becomes
	  negative. If the amount becomes negative, then we keep dequeueing petrol pumps till the queue becomes empty.

	Instead of creating a separate queue, we use the given array itself as queue. We maintain two
	 index variables start and end that represent rear and front of queue.

 */

public class Written18May19LorryPetrolBunk
{
	// A petrol pump has petrol and distance to next petrol pump 
    static class petrolPump 
    { 
        int petrol; 
        int distance; 
          
        // constructor 
        public petrolPump(int petrol, int distance)  
        { 
            this.petrol = petrol; 
            this.distance = distance; 
        } 
    } 
      
    // The function returns starting point if there is a possible solution, 
    // otherwise returns -1 
    static int printTour(petrolPump arr[], int n) 
    {   
        int start = 0; 
        int end = 1; 
        int curr_petrol = arr[start].petrol - arr[start].distance; 
          
        // If current amount of petrol in truck becomes less than 0, then 
        // remove the starting petrol pump from tour 
        while(end != start || curr_petrol < 0) 
        { 
              
            // If current amount of petrol in truck becomes less than 0, then 
            // remove the starting petrol pump from tour 
            while(curr_petrol < 0 && start != end) 
            { 
                // Remove starting petrol pump. Change start 
                curr_petrol -= arr[start].petrol - arr[start].distance; 
                start = (start + 1) % n; 
                  
                // If 0 is being considered as start again, then there is no 
                // possible solution 
                if(start == 0) 
                    return -1; 
            } 
            // Add a petrol pump to current tour 
            curr_petrol += arr[end].petrol - arr[end].distance; 
              
            end = (end + 1)%n; 
        } 
          
        // Return starting point 
        return start; 
    } 
      
    // Driver program to test above functions 
    public static void main(String[] args)  
    { 
          
        petrolPump[] arr = {new petrolPump(6, 5), 
                            new petrolPump(4, 6), 
                            new petrolPump(7, 3),
                            new petrolPump(4, 5)}; 
          
        int start = printTour(arr, arr.length); 
          
        System.out.println(start == -1 ? "No Solution" : "Start = " + start);  
  
    } 
}
