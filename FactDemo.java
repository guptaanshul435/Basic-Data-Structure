// factorial Demo
class FactDemo{
public static int factDemo(int  n){
	if(n==1){
		return 1;
}
return n*factDemo(n-1);
}
public static void main(String[] args){
    System.out.println(FactDemo.factDemo(5));
}
}