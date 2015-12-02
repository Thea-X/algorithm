package algorithm.sort;
/**
 *快速排序算法的学习 by studying ahalei
 *@author Thea
 *快速排序算法的核心思想是： 使用一个基准数，进行两端的比较交换，使基准数归位
 *快速排序的时间复杂度是O(NlogN)。
 */
public class QuickSort {
	private static int[] array = {6,5,8,4,7,3,2,0,1,9};

	public static void main(String[] args){
		
		quiksort(0, array.length-1);
			
		printArray(array);
	}
	
	private static void printArray(int[] array){
		for(int i : array){
			System.out.print(i+" ");
		
		}
		System.out.println();
	}
	
	private static void quiksort(int left,int right){
		int i = 0, j = 0, t = 0,temp = 0;
		if(left > right){
			return;
		}
		
		temp = array[left];
		i = left;
		j= right;
		while(i != j){
			while(array[j]>=temp&&i<j){
				j --;
			}
			
			while(array[i]<temp&&i<j)
				i ++;
			
			if(i<j){
				t = array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
		
		array[left] = array[i];
		array[i] = temp;
		
		quiksort(left,i - 1);
		quiksort(i + 1, right);
	}
}
