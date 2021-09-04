package level1.sub;

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
