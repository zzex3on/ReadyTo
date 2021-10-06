package level1.sub;

/**
 * �� ��ȭ Ű�е忡�� �޼հ� �������� �����հ������� �̿��ؼ� ���ڸ��� �Է��Ϸ��� �մϴ�.
 * �� ó�� �޼� �����հ����� * Ű�е忡 ������ �����հ����� # Ű�е� ��ġ���� �����ϸ�, �����հ����� ����ϴ� ��Ģ�� ������ �����ϴ�.
 * 
 * �����հ����� �����¿� 4���� �������θ� �̵��� �� ������ Ű�е� �̵� �� ĭ�� �Ÿ��� 1�� �ش��մϴ�.
 * ���� ���� 3���� ���� 1, 4, 7�� �Է��� ���� �޼� �����հ����� ����մϴ�.
 * ������ ���� 3���� ���� 3, 6, 9�� �Է��� ���� ������ �����հ����� ����մϴ�.
 * ��� ���� 4���� ���� 2, 5, 8, 0�� �Է��� ���� �� �����հ����� ���� Ű�е��� ��ġ���� �� ����� �����հ����� ����մϴ�.
 * 4-1. ���� �� �����հ����� �Ÿ��� ���ٸ�, ���������̴� ������ �����հ���, �޼����̴� �޼� �����հ����� ����մϴ�.
 * ������� ���� ��ȣ�� ��� �迭 numbers, �޼��������� ������������ ���� ��Ÿ���� ���ڿ� hand�� �Ű������� �־��� ��, 
 * �� ��ȣ�� ���� �����հ����� �޼��� �� �������� ���� ��Ÿ���� ���ӵ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ����ּ���.
 * 
 * [���ѻ���]
 * numbers �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
 * numbers �迭 ������ ���� 0 �̻� 9 ������ �����Դϴ�.
 * hand�� "left" �Ǵ� "right" �Դϴ�.
 * "left"�� �޼�����, "right"�� ���������̸� �ǹ��մϴ�.
 * �޼� �����հ����� ����� ���� L, ������ �����հ����� ����� ���� R�� ������� �̾�ٿ� ���ڿ� ���·� return ���ּ���.
 * 
 * [����� ��]
 * 
 * numbers								hand		result
 * [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"		"LRLLLRLLRRL"
 * 												  1�� LRLRRLLLRRR
 * 												  2�� LRLLLRLLLRL
 * 												  3�� LRLLLRLLRRL
 * [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"		"LRLLRRLLLRR"
 * 												  1�� LLLLLRLLLRR
 * 												  2�� LRLLRRLLLRR
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]		"right"		"LLRLLRLLRL"
 * 												  1�� LLRLLRLLRL
 *
 */

public class TypingKeyPad {
	char leftJ = '3'; // ���� �հ��� ��ġ (j�� ��ǥ��)
	char rightJ = '3'; // ������ �հ��� ��ġ (j�� ��ǥ��)
	char leftK = '0'; // ���� �հ��� ��ġ (j�� ��ǥ��)
	char rightK = '2'; // ������ �հ��� ��ġ (j�� ��ǥ��)
	String answer = "";
	public String solution(int[] numbers, String hand) {
		
		String handSub = hand.substring(0, 1).toUpperCase();
		char keyPad[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#' }}; // ���� Ű�е�
		
		int gapLeft, gapRight;
		
		for (int i = 0; i < numbers.length; i++) {
			char key = Character.forDigit(numbers[i], 10);
			for(int j = 0; j < keyPad.length; j++) {
				for(int k = 0; k <keyPad[j].length; k++) {
					if(Character.compare(key, keyPad[j][k]) == 0) {
						switch(k) {
						case 0:
							insert2Answer("L", j, k);
							break;
						case 2:
							insert2Answer("R", j, k);
							break;
						default:
							// LRLLLRLLRRL
							gapLeft = Math.abs(j - Character.getNumericValue(leftJ)) + Math.abs(k - Character.getNumericValue(leftK)); 
							gapRight = Math.abs(j - Character.getNumericValue(rightJ)) + Math.abs(k - Character.getNumericValue(rightK)); 
							
							if(gapLeft == gapRight) {
								insert2Answer(handSub, j, k);
								break;
							} else if (gapLeft < gapRight) {
								insert2Answer("L", j, k);
							} else {
								insert2Answer("R", j, k);
							}
						}
					}
				}
			}
			System.out.println("answer : " + answer);
		}
		
		// ��/�� ����
		// ��� �� ���������� ���� �����ϵ��� ���� �����ϱ�
		// LRLLLRLLRRL
		// LRLLRLLLRRL
		/*if((Math.abs(j - Character.getNumericValue(leftJ)) - Math.abs(j - Character.getNumericValue(rightJ))) < 0
				&& (Math.abs(k - Character.getNumericValue(leftK)) - Math.abs(k - Character.getNumericValue(rightK)) > 0)) {
			answer += "L";
			break;
		} else if((Math.abs(j - Character.getNumericValue(leftJ)) - Math.abs(j - Character.getNumericValue(rightJ))) > 0
				&& (Math.abs(k - Character.getNumericValue(leftK)) - Math.abs(k - Character.getNumericValue(rightK))) < 0) {
			answer += "R";
			break;
		} else {
			int a = Math.abs(j - Character.getNumericValue(leftJ)) - Math.abs(j - Character.getNumericValue(rightJ));
			int b = Math.abs(k - Character.getNumericValue(leftK)) - Math.abs(k - Character.getNumericValue(rightK));
			if(!(a > b)) {
				answer += hand.substring(0, 1).toUpperCase();
				break;
			}
		}*/
		
		
        return answer;
    }
	
	public void insert2Answer(String hand, int j, int k) {
		if(hand.equals("L")) {
			leftJ = Character.forDigit(j, 10);
			leftK = Character.forDigit(k, 10);
		} else {
			rightJ = Character.forDigit(j, 10);
			rightK = Character.forDigit(k, 10);
		}
		answer += hand;
	}
}
