package brokenFloorBinarySearchExceptionHW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallBrokenFloorTest {
	private static final int N_FLOORS=100000;

	@Test
	void test() {
		BallBrokenFloor ballBrokenFloor=new BallBrokenFloor(N_FLOORS);
		assertEquals(ballBrokenFloor.getBrokenFloor(),getBrokenFloor(ballBrokenFloor));
	}
	
	private static int getBrokenFloor(BallBrokenFloor ballBrokenFloor) {
		int left=1;
		int right=N_FLOORS;
		while(left<=right) {
			int mid=(left+right)/2;
		 try {
			 ballBrokenFloor.checkFloor(mid);
			 left=mid+1;
		 }
		 catch(Exception exception) {
			 right=mid-1;
		 }
		}
		return left;
	}

}
