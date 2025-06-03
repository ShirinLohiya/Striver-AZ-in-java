// count the digits 
class Solution {
    public int countDigit(int n) {
         int count=0;
        while(n>0){
            count=count+1;
            n = n/10;

        } 
        return count;

    }
}

// reverse the number
class Solution {
    public int reverseNumber(int n) {
        int revnum=0;
        while(n>0){
             int ld = n % 10;
                    revnum = (revnum * 10) + ld;
                    n = n / 10;
        }
           return revnum; 
        
    }
}

// check if the number is palindrome
class Solution {
    public boolean isPalindrome(int n) {
        int revnum=0;
        int original = n;
        while(n>0){
             int ld = n % 10;
                    revnum = (revnum * 10) + ld;
                    n = n / 10;
        }
        if(original == revnum){
            return true;
        }else{
            return false;
        }
        
    }
}
//Armstrong number
class Solution {
    public boolean isArmstrong(int n) {
       int sum=0;
   int original = n;
       while(n>0){
        int ld=n%10;
        n=n/10;
        sum=sum+(ld*ld*ld);
       }
      return sum == original;

    }
}

// print all divisors of a number

class Solution {
    public int[] divisors(int n) {
       
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

    }
}

// check if a number is prime
class Solution {
    public boolean isPrime(int n) {
        int count = 0;
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true; // n is prime
        } else {
            return false; // n is not prime
        }
    }
}

//gcd of two numbers
class Solution {
    public int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
