class FindIsPrime{
public static void isPrime(int n,int div){
	if (n%div==0){
		System.out.println("Number is not prime");
		return;
	}
	if(div==n-1){
		System.out.println("Number is prime");
	    return;
	}
	isPrime(n,div+1);
}

public static void main(String[] args){
	FindIsPrime.isPrime(12,2);    
}
}