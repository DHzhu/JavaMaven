package com.arithmetic;

/**
 * @desc  : TODO
 * @author: Zhu
 * @date  : 2017年1月11日
 */
public class Search { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{0,4,6,6,16,20,34,35,42,45,46,50,56,66,69,70,70,71,75,78};
		
		int location = -1;
		
		location = Search.binarySearch(arr.clone(), 34);
		
		System.out.println(location + 1);
	}
	
	/**
	 * @desc  : 二分查找
	 * @date  : 2017年1月11日
	 * @param arr
	 * @param des
	 * @return
	 */
	public static int binarySearch (int arr[], int des){
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high){
			int middle = (low + high) / 2;
			if(des == arr[middle]){
				return middle;
			}else if(des < arr[middle]){
				high = middle - 1;
			}else{
				low = middle + 1;
			}
		}
		
		return -1;
	}

}
