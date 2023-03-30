//Binary To Decimal
class BinaryToDecimal1{
static int i,sum=0;
public static void binToDec(StringBuilder str){
	
	System.out.println(str);
    if (i==str.length()-1){
		System.out.println("charAt(i)="+str.charAt(i));
		sum+=(Integer.parseInt(str.charAt(i)+"")*Math.pow(2,i));
		return;
	}
	System.out.println("charAt(i)="+str.charAt(i));
	sum+=(Integer.parseInt(str.charAt(i)+"")*Math.pow(2,i));
	i++;
	binToDec(str);
	return;
}
static StringBuilder reverse(StringBuilder str){
	int i=0,j=str.length()-1;
	while(i<j){
		char ch=str.charAt(j);
		str.setCharAt(j,str.charAt(i));
		str.setCharAt(i,ch);
		i++;
		j--;
	}
	return str;
}

public static void main(String[] args){
	StringBuilder str=new StringBuilder("10");
    BinaryToDecimal.binToDec(BinaryToDecimal1.reverse(str));
	System.out.println(BinaryToDecimal.sum);
	
}


}