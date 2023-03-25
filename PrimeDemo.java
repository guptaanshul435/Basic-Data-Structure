// Prime Number

class PrimeDemo{

public static void primeNo(int n){
	int i=3;
	boolean b=true;
	while(i<=n){
		int div=2;
		while(div<i){
			if(i%div!=0)
			{
				b=true;
			}else{
				b=false;
				break;
			}
			div++;	
			}
			if(b)
			System.out.println(i);
		i++;	
		}
		
	}

public static void main(String []args){
   PrimeDemo.primeNo(10);
}
}