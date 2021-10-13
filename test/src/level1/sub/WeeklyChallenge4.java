package level1.sub;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * ���� ����
 * �����ڰ� ����ϴ� ���� ��� ��ȣ���� �Է��ϸ� �׿� �´� �������� ��õ���ִ� �˰����� �����Ϸ��� �մϴ�.
 * 
 * �Ʒ� ǥ�� 5�� ������ ���� ���� ����ϴ� 5�� �� ������ ��� ������ �ο��� ǥ�Դϴ�.
 * 
 * ����	SI			CONTENTS		HARDWARE		PORTAL			GAME
 * 5	JAVA		JAVASCRIPT		C				JAVA			C++
 * 4	JAVASCRIPT	JAVA			C++				JAVASCRIPT		C#
 * 3	SQL			PYTHON			PYTHON			PYTHON			JAVASCRIPT
 * 2	PYTHON		SQL				JAVA			KOTLIN			C
 * 1	C#			C++				JAVASCRIPT		PHP				JAVA
 * 
 * ���� ���, SQL�� SI ������ ��� ������ 3�������� CONTENTS ������ ��� ������ 2���Դϴ�. SQL�� HARDWARE, PORTAL, GAME ������ ��� ������ 0���Դϴ�.
 * 
 * ������ ��� ������ ������ ���ڿ� �迭 table, �����ڰ� ����ϴ� �� ���� ���ڿ� �迭 languages, ��� ��ȣ���� ���� ���� �迭 preference�� �Ű������� �־����ϴ�. 
 * �����ڰ� ����ϴ� ����� ��� ��ȣ�� x ������ ��� ������ ������ ���� ���� �������� return �ϵ��� solution �Լ��� �ϼ����ּ���. 
 * ������ ���� �������� ���� ���� ���, �̸��� ���� ������ ���� ���� �������� return ���ּ���.
 *
 * [����� ����]
 * 
 * table										languages					preference		result
 * ["SI JAVA JAVASCRIPT SQL PYTHON C#"			["PYTHON", "C++", "SQL"]	[7, 5, 5]		"HARDWARE"
 * ,"CONTENTS JAVASCRIPT JAVA PYTHON SQL C++"
 * ,"HARDWARE C C++ PYTHON JAVA JAVASCRIPT"
 * ,"PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP"
 * ,"GAME C++ C# JAVASCRIPT C JAVA"]	 
 * 
 * arrMap
 * SI:[JAVA, JAVASCRIPT, SQL, PYTHON, C#] �̷������� �Ұ���
 * 
 */

public class WeeklyChallenge4 {
	Map<String, String[]> arrMap = new HashMap<>();
	String key = "";
	
	public String solution(String table[], String languages[], int preference[]) {
		
		for(int i = 0; i < table.length; i++) {
			key = table[i].split(" ")[0];
			for(int j = 0; j < table[i].split(" ").length; j++) {
				if(j == 0) { // 0�� ���� key
					arrMap.put(key, table[i].split(" "));
				}
			}
		}
		return null;
	}
	
}
