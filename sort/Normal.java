package algorithm.sort;

public class Normal {
	public static void main(String[] args) {
		int[] array = new int[]{5,3,5,2,8};
			int count = 0;
			for(int i = array.length - 1;i > 0; i --){
				for(int j = 0; j < i ; j++){
					count ++;
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("循环的次数为："+count);
		for(int i : array){
			System.out.println(i);
		}
	}
}
