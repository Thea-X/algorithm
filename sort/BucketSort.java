package algorithm.sort;
/**
 * 啊哈磊的桶排序算法学习
 * @author Thea
 *问题：假设有0~10的随机的任意的数需要从大到小的打印出来
 */
public class BucketSort {
	public static void main(String[] args){
		int[] array = new int[]{5,5,2,3,8};
		int[] bucket = new int[11];
		
		for(int i = 0; i < array.length; i ++){
			int temp = array[i];
			bucket[temp] += 1;
		}
		
		for(int i = bucket.length-1 ; i >= 0; i --){
			if(bucket[i] == 0)
				continue;
			for(int j=0; j < bucket[i]; j ++){
				System.out.println(i);
			}
		}
	}
}
