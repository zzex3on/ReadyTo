package level1.sub;

/***
 * 문제 설명
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */

import java.util.Arrays;
import java.util.Collections;

public class DescendingStr {
	public String solution(String s) {
		String low = "", up = "";
		
        String arr[] = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String str : arr) {
        	if(Character.isLowerCase(str.charAt(0))) {
        		low += str;
        	} else {
        		up += str;
        	}
        }
        
        System.out.println(low + up);
        
        return low + up;
    }
}
