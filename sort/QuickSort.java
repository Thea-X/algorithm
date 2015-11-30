package algorithm.sort;

import java.util.Arrays;

/**
 *快速排序算法的学习 by studying ahalei
 *@author Thea
 *快速排序算法的核心思想是： 使用一个基准数，进行两端的比较交换，使基准数归位
 *快速排序的时间复杂度是O(NlogN)。
 */
public class QuickSort {
	public static void main(String[] args){
		int[] array = {6,5,8,4,7,3,2,0,1,9};
		int base = 0;//第一次的基准数
		int i = base + 1;
		int j = array.length - 1;
		while(i < j){
			while(array[j] >= array[base] && i<j){
				j --;
			}
			
			while(array[i] <= array[base] && i<j){
				i ++;
			}
			
			if(i <j){
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;}
			
			
		}

		
		int temp2 = array[i];
		array[i] = array[base];
		array[base] = temp2;				
		
		
		printArray(array);
	}
	
	private static void printArray(int[] array){
		for(int i : array){
			System.out.print(i+" ");
		
		}
		System.out.println();
	}
}
