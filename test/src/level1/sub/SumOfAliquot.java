package level1.sub;

/***
 * ���� ����
 * ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 */

public class SumOfAliquot {
	public int solution(int n) {
		int answer = 0;
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		answer += i;
        	}
        }
        System.out.println("answer : " + answer);
        return answer;
    }
}
