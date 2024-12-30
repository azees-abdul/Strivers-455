

Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not




class Solution {
    static int evenlyDivides(int n) {

        int num = n, count=0;
        while(num>0){
            int digit = num%10;
            if(digit !=0 && n % digit ==0){
                count++;
            }
            num /= 10;
        }
        return count++;
    }
}
