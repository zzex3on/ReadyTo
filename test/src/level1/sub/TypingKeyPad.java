package level1.sub;

public class TypingKeyPad {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		char keyPad[][] = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#' }}; // 숫자 키패드
		
		for (int i = 0; i < numbers.length; i++) {
			char key = (char) numbers[i];
			for(int j = 0; j < keyPad.length; j++) {
				for(int k = 0; k <keyPad[j].length; k++) {
					if(key == keyPad[j][k]) {
						if(k == 0) {			// 왼손
							
						} else if(k == 2) {		// 오른손
							
						} else {				// 그 외
							// hand 고려하여 코드 작성
						}
					}
				}
			}
			  
		}
		
		
        return answer;
    }
}
