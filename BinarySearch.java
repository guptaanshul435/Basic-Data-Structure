//BinarySearch 
//We should have sorted list for binary search time complexity O(log n)
class BinarySearch{
static int mid;
static Object obj;
public static void binarySearch(Object []arr,int l,int h,Object key){
	mid=(l+h)/2;
	if(arr[mid]==key){
		System.out.println("value is present in arr value is="+key);
		return;
	}else if(l>=h){
		System.out.println("this is not in arr value is="+key);
		return;
	}
	else if((int)arr[mid]>(int)key){
		binarySearch(arr,l,mid-1,key);
	}else if((int)arr[mid]<(int)key){
		binarySearch(arr,mid+1,h,key);
	}
}
public static void main(String[] args){
	Object[] arr={10,20,30,40,50};
	BinarySearch.binarySearch(arr,0,arr.length-1,10);
}
}