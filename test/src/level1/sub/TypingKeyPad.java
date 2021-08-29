package level1.sub;

public class TypingKeyPad {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		char keyPad[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#' }}; // ���� Ű�е�
		char leftJ = '*'; // ���� �հ��� ��ġ (j�� ��ǥ��)
		char rightJ = '#'; // ������ �հ��� ��ġ (j�� ��ǥ��)
		
		for (int i = 0; i < numbers.length; i++) {
			char key = Character.forDigit(numbers[i], 10);
			for(int j = 0; j < keyPad.length; j++) {
				for(int k = 0; k <keyPad[j].length; k++) {
					if(Character.compare(key, keyPad[j][k]) == 0) {
						switch(k) {
						case 0:
							answer += "L";
							leftJ = Character.forDigit(j, 10);
							break;
						case 2:
							answer += "R";
							rightJ = Character.forDigit(j, 10);
							break;
						default:
							// ��/�� ����
							// ��� �� ���������� ���� �����ϵ��� ���� �����ϱ�
							if((Math.abs(j - Character.getNumericValue(leftJ)) - Math.abs(j - Character.getNumericValue(rightJ))) < 0) {
								answer += "L";
								break;
							} else if((Math.abs(j - Character.getNumericValue(leftJ)) - Math.abs(j - Character.getNumericValue(rightJ))) > 0) {
								answer += "R";
								break;
							} else {
								answer += hand.substring(1).toUpperCase();
								break;
							}
						}
					}
				}
				System.out.println("answer : " + answer);
			}
		}
		
		
        return answer;
    }
}
