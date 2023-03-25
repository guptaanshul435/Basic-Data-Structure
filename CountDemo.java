// print counting using recurtion
class CountDemo
{
	static int i=1;
  public static void counting(int star,int end)
  {
	  if(star==end){
		  return;
	  }
	  	  
	  System.out.println(star);
	  counting(star+1,end);
  }
public static void main(String[] args){

CountDemo.counting(1,100);


}


}