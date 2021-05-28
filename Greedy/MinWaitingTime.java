import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    // Write your code here.
		Arrays.sort(queries);
		
		int answer = 0;
		for(int i=0; i<queries.length-1; i++){
			int sum = queries[i]*(queries.length-1-i);
			answer += sum;
		}
    return answer;
  }
}

