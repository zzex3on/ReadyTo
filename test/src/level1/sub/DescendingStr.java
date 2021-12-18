package level1.sub;

/***
 * ���� ����
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
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
