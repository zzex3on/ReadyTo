package level1.sub;

public class CoveringNumber {
	public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length()-4; i++) {
        	answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        
        return answer;
    }
	
	public String otherSolution(String phone_number) {
		char ch[] = phone_number.toCharArray();
		for(int i = 0; i < ch.length-4; i++) {
			 ch[i] = '*';
		}
		
		return String.valueOf(ch);
	}
}
