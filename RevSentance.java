// Revers a sentance


class RevSentance{
	static StringBuffer str;
	public static void revSen(StringBuffer sen){
		int blank,i=0,j=0;
		while(i<sen.length()){
			if (sen.charAt(i)==' '){
				blank=i;
				while(j<i){
					char ch=sen.charAt(i);
					sen.setCharAt(i,sen.charAt(j));
					sen.setCharAt(j,ch);
					j++;
					i--;
				}
				j=blank;
				i=blank;
			}
			i++;
		}
		str=sen;
	}
	public static void revstr(){
		int i=str.length()-1,j=0;
		while(i>j)
			{
			char ch=str.charAt(i);
			str.setCharAt(i,str.charAt(j));
			str.setCharAt(j,ch);
			i--;
			j++;
		}
		System.out.println(str);
	}
	
	
	
	public static void main(String[] args){
		StringBuffer sen=new StringBuffer(" pen my is     this ");
		RevSentance.revSen(sen);
		RevSentance.revstr();
		
	}
	
	
}