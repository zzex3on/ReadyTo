package level1.sub;

public class MiddleLetter {
	public String solution(String s) {
        String answer = "";
        int seq = s.length() / 2;
        if(s.length() % 2 == 0) { // Â¦¼ö
        	answer = s.substring(seq - 1, seq + 1);
        } else { // È¦¼ö
        	answer = s.substring(seq, seq + 1);
        }
        
        System.out.println("answer : " + answer);
        
        // return s.substring((s.length()-1) / 2, s.length()/2 + 1);
        return answer;
    }
}
