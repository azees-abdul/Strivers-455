def fibi(n):
  if n==1 || n ==2:
    return 1
    prev1 =1, prev2 =1, current = 0;
    for i in range (3,n+1):
      current = prev1+ prev2
      prev2 = prev1
      prev1 = current
    return current


if __name__ == "__main__":
    n = int(input("Enter the value of n: "))
    print(f"The {n}-th Fibonacci number is: {find_nth_fibonacci(n)}")


      
      
    
