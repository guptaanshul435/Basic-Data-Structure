// Reverse String
class RevString{
	StringBuffer str;
   public void revString(String str1){
	   StringBuffer str=new StringBuffer(str1);
	   this.str=str;
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
   public void display(){
	   System.out.println(str);
   }
   public static void main(String[] args)
   {
	   RevString revstr=new RevString();
	   revstr.revString("Anshul");
	   revstr.display();
	   
	   
	   
   }
}