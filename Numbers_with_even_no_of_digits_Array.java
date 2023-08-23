class Solution 
{
    static int findNumbers(int[] nums)
    {
        int count = 0;
        for(int num : nums)
            if (even(num))
             count++;
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num)
     {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0)
            return true;
        return false;
    }
    // count number of digits in a number
    static int digits(int num) {

        if (num < 0) //negative number
            num = num * -1;
        if (num == 0) 
            return 1;//1 digit
        int count = 0;
        while (num > 0)
        {
            count++;
            num = num / 10; 
        }
        return count;
    }
}
