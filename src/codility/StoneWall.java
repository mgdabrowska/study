package codility;

import java.util.ArrayDeque;

public class StoneWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoneWall sc = new StoneWall();
		System.out
				.println(sc.solution(new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 }) == 7);

	}

	public int solution(int[] H){
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		int stone =0;
		int N = H.length;
		for (int i = 0; i < N; i++) {
			if(stack.isEmpty()){
				stack.push(H[i]);
				stone++;
			}else
				while(!stack.isEmpty() && H[i]<stack.peek() ){
					stack.pop();
				}if(!stack.isEmpty() && stack.peek()==H[i] ){
					continue;
				}else{
					stack.push(H[i]);
					stone ++;
				}
		}
			
	return stone;
		
	}
}
