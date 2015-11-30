package algorithm.sort;
/**
 *冒泡算法的学习 by studying ahalei
 *@author Thea
 *冒泡排序的基本思想是：每次比较两个相邻的元素，如果他们的顺序错误就把他们交换过来。
 *冒泡排序的时间复杂度是O(N2)。
 */
public class BubbleSort {
	public static void main(String[] args){
		int[] array = {0,35,35,76,12};
		
		for(int i = 0; i < array.length - 1; i ++){
			for(int j = 0; j < array.length - 1 - i; j ++){
				if(array[j] < array[j + 1]){
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		for(int i = 0 ; i < array.length; i ++){
			System.out.println(array[i]);
		}
	}
}
