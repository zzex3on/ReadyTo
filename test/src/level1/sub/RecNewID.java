/**
 * ���� ����
 * 
 * īī���� �Ի��� ���� ������ �׿��� "īī������������"�� ��ġ�Ǿ�, īī�� ���񽺿� �����ϴ� �������� ���̵� �����ϴ� ������ ����ϰ� �Ǿ����ϴ�. 
 * "�׿�"���� �־��� ù ������ ���� �����ϴ� �������� īī�� ���̵� ��Ģ�� ���� �ʴ� ���̵� �Է����� ��, 
 * �Էµ� ���̵�� �����ϸ鼭 ��Ģ�� �´� ���̵� ��õ���ִ� ���α׷��� �����ϴ� ���Դϴ�.
 * ������ īī�� ���̵��� ��Ģ�Դϴ�.
 * 
 * ���̵��� ���̴� 3�� �̻� 15�� ���Ͽ��� �մϴ�.
 * ���̵�� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.) ���ڸ� ����� �� �ֽ��ϴ�.
 * ��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.
 * 
 * 1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
 * 2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
 * 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
 * 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
 * 5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
 * 6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
 * ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
 * 7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.

 * ����� �� ����
 * No		new_id								result
 * ��1		"...!@BaT#*..y.abcdefghijklm"		"bat.y.abcdefghi"	O
 * ��2		"z-+.^."							"z--"				O
 * ��3		"=.="								"aaa"				O
 * ��4		"123_.def"							"123_.def"			O
 * ��5		"abcdefghijklmn.p"					"abcdefghijklmn"	O
 **/

package level1.sub;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecNewID {
    public String solution(String new_id) {
    	
    	System.out.println("0�ܰ� : " + new_id);
    	System.out.println("=======================================");
    	
    	// 1�ܰ�, �ҹ��� ġȯ
    	new_id = new_id.toLowerCase();
    	System.out.println("1�ܰ� : " + new_id);
    	
    	// 2�ܰ�, �ҹ���/����/-/_/. ������ ��� ���� ����
    	new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
    	System.out.println("2�ܰ� : " + new_id);

    	// 3�ܰ�, ��ħǥ 2�� �̻��� 1���� ġȯ
    	new_id = new_id.replaceAll("[.]{2,}", ".");
    	System.out.println("3�ܰ� : " + new_id);
    	
    	// 4�ܰ�, ��ħǥ�� ó�� Ȥ�� ���� ���� ��� ���� (���鵵 ����..)
    	new_id = new_id.replaceAll("^\\.\\s*", "");
    	new_id = new_id.replaceAll("\\.\\s*$", "");
    	System.out.println("4�ܰ� : " + new_id);
    	
    	// 5�ܰ�, �� ���ڿ��� ��� a�� ����
    	String temp = new_id.replaceAll("[a-z\\d]", ""); // ����/���ڸ� ����
    	if(temp.equals("") || new_id.equals("")) {
    		new_id = new_id.replaceAll("[^a-z\\d]*", "a");
    	}
    	System.out.println("5�ܰ� : " + new_id);
    	
    	// 6�ܰ�, 16�� �̻��� ��� 15�ڱ��� �ڸ�, ������ ���ڰ� .�� ��� ����
    	if(new_id.length() > 15) {
    		new_id = new_id.substring(0, 15);
    	}
    	if(new_id.substring(new_id.length() - 1).equals(".")) {
    		new_id = new_id.substring(0, new_id.length() - 1);
    	}
    	System.out.println("6�ܰ� : " + new_id);
    	
    	// 7�ܰ�, 2�� ������ ��� ������ ���ڸ� 3�ڰ� �� ������ �ݺ��Ͽ� ����
    	if(new_id.length() <= 2) {
    		while(new_id.length() < 3) {
    			new_id += new_id.substring(new_id.length() - 1);
    		}
    	}
    	System.out.println("7�ܰ� : " + new_id);
        
    	return new_id;
    }
}
