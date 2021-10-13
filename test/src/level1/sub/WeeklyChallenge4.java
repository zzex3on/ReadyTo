package level1.sub;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 문제 설명
 * 개발자가 사용하는 언어와 언어 선호도를 입력하면 그에 맞는 직업군을 추천해주는 알고리즘을 개발하려고 합니다.
 * 
 * 아래 표는 5개 직업군 별로 많이 사용하는 5개 언어에 직업군 언어 점수를 부여한 표입니다.
 * 
 * 점수	SI			CONTENTS		HARDWARE		PORTAL			GAME
 * 5	JAVA		JAVASCRIPT		C				JAVA			C++
 * 4	JAVASCRIPT	JAVA			C++				JAVASCRIPT		C#
 * 3	SQL			PYTHON			PYTHON			PYTHON			JAVASCRIPT
 * 2	PYTHON		SQL				JAVA			KOTLIN			C
 * 1	C#			C++				JAVASCRIPT		PHP				JAVA
 * 
 * 예를 들면, SQL의 SI 직업군 언어 점수는 3점이지만 CONTENTS 직업군 언어 점수는 2점입니다. SQL의 HARDWARE, PORTAL, GAME 직업군 언어 점수는 0점입니다.
 * 
 * 직업군 언어 점수를 정리한 문자열 배열 table, 개발자가 사용하는 언어를 담은 문자열 배열 languages, 언어 선호도를 담은 정수 배열 preference가 매개변수로 주어집니다. 
 * 개발자가 사용하는 언어의 언어 선호도 x 직업군 언어 점수의 총합이 가장 높은 직업군을 return 하도록 solution 함수를 완성해주세요. 
 * 총합이 같은 직업군이 여러 개일 경우, 이름이 사전 순으로 가장 빠른 직업군을 return 해주세요.
 *
 * [입출력 예시]
 * 
 * table										languages					preference		result
 * ["SI JAVA JAVASCRIPT SQL PYTHON C#"			["PYTHON", "C++", "SQL"]	[7, 5, 5]		"HARDWARE"
 * ,"CONTENTS JAVASCRIPT JAVA PYTHON SQL C++"
 * ,"HARDWARE C C++ PYTHON JAVA JAVASCRIPT"
 * ,"PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP"
 * ,"GAME C++ C# JAVASCRIPT C JAVA"]	 
 * 
 * arrMap
 * SI:[JAVA, JAVASCRIPT, SQL, PYTHON, C#] 이런식으로 할거임
 * 
 */

public class WeeklyChallenge4 {
	Map<String, String[]> arrMap = new HashMap<>();
	String key = "";
	
	public String solution(String table[], String languages[], int preference[]) {
		
		for(int i = 0; i < table.length; i++) {
			key = table[i].split(" ")[0];
			for(int j = 0; j < table[i].split(" ").length; j++) {
				if(j == 0) { // 0인 값은 key
					arrMap.put(key, table[i].split(" "));
				}
			}
		}
		return null;
	}
	
}
