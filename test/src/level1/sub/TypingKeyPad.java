package level1.sub;

public class TypingKeyPad {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		char keyPad[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#' }}; // ���� Ű�е�
		
		for (int i = 0; i < numbers.length; i++) {
			char key = (char) numbers[i];
			for(int j = 0; j < keyPad.length; j++) {
				for(int k = 0; k <keyPad[j].length; k++) {
					if(key == keyPad[j][k]) {
						if(k == 0) {			// �޼�
							
						} else if(k == 2) {		// ������
							
						} else {				// �� ��
							// hand ����Ͽ� �ڵ� �ۼ�
						}
					}
				}
			}
			  
		}
		
		
        return answer;
    }
}
