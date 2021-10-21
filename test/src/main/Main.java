package main;
import level1.sub.CoveringNumber;
import level1.sub.NumberOfK;
import level1.sub.TypingKeyPad;
import level1.sub.WeeklyChallenge2;
import level1.sub.WeeklyChallenge4;
import level1.sub.Lotto;

public class Main {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		lotto.solution(lottos, win_nums);
	}

}

/** WeeklyChallenge4 **/

/*WeeklyChallenge4 week4 = new WeeklyChallenge4();

String table[] = {"SI JAVA JAVASCRIPT SQL PYTHON C#", 
				  "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", 
				  "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", 
				  "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", 
				  "GAME C++ C# JAVASCRIPT C JAVA"};

String languages[] = {"PYTHON", "C++", "SQL"};
int preference[] = {7, 5, 5};

week4.solution(table, languages, preference);*/
