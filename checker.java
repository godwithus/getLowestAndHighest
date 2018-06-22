public class checker{
	public static void main(String[] args){
		int[] array = {84, 76, 90, 76, 34, 23, 12, 9, 76, 89, 99, 34, 76, 231, 56, 765, 98, 9, 8, 9, 23, 88};
		int lowest = Integer.MAX_VALUE;
		int highest = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++){
			if(lowest > array[i]){
				lowest = array[i];
			}
			if(highest < array[i]){
				highest = array[i];
			}
		}
		System.out.println(highest + " Is the Highest Number");
		System.out.println(lowest + " Is the Lowest Number");
	}
}