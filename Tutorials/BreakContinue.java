package Tutorials;

public class BreakContinue {

	
		/**
		 * break: breaks out of the loop so leaves the loop
		 * continue: jumps to the next iteration
		 * 
		 */
		
		public static void main(String[] args) {
			
			int[] nums = {1,5,3,7,8,9,2};
			
			for(int i=0;i<nums.length;i++) {
				
				if( nums[i] == 8 ) {
					continue;
				}
				
				System.out.println(nums[i]);
			}


	}

}
