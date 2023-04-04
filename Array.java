package com.k7it;

public class Array{


static int GetLargestSum(int[] array, int n)
{
    int largestSum = 0;
    int previousSum = 0;

    for (int i = 0; i <= array.length - n; i++)
    {
        if (i == 0)
        {
            for (int j = 0; j < n; j++)
            {
                largestSum += array[j];
            }

            previousSum = largestSum;
        }
        else
        {
            int currentSum = previousSum - array[i - 1] + array[i + n - 1];
            if (currentSum > largestSum)
            {
                largestSum = currentSum;
            }
            previousSum = currentSum;
        }
    }

    return largestSum;
}
}
