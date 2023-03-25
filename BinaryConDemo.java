//Desimal to binary
class BinaryConDemo{
static StringBuilder str=new StringBuilder();

public static void binaryConvesion(long n){
	if (n==0)
	{
		return;
	}
	str.append(n%2);
	//System.out.println(n%2);
	binaryConvesion(n/2);	
}
public static void revString(){
	   int i=0,j;
	   j=str.length()-1;
	   while(i<=j){
		    char ch=str.charAt(i);
		    str.setCharAt(i,str.charAt(j));
		    str.setCharAt(j,ch);
		   i++;
		   j--;
	   }
   }
   public static void display(){
	   System.out.println(str);
   }
public static void main(String[] args){

BinaryConDemo.binaryConvesion(943589);
BinaryConDemo.revString();
BinaryConDemo.display();



}

}