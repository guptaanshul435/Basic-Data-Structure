// fibonacci series
class FabDemo{
public static void fabinaSer(int n[],int i)
{
	if(i==n.length){
		return;
	}
	n[i]=n[i-1]+n[i-2];
	System.out.println(n[i]);
	fabinaSer(n,i+1);
}
public static void main(String[] args)
{
	int[] a=new int[10];
	int i=2;
	a[0]=0;
	a[1]=1;
	System.out.println(a[0]);
	System.out.println(a[1]);
	FabDemo.fabinaSer(a,i);
}
}