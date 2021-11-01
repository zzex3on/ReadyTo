package main;
import level1.sub.CoveringNumber;
import level1.sub.NumberOfK;
import level1.sub.RecNewID;
import level1.sub.TypingKeyPad;
import level1.sub.WeeklyChallenge2;
import level1.sub.WeeklyChallenge4;
import level1.sub.Lotto;

public class Main {

	public static void main(String[] args) {
		RecNewID newID = new RecNewID();
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		newID.solution(new_id);
		
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

/** Lotto **/

/*Lotto lotto = new Lotto();

int[] lottos = {45, 4, 35, 20, 3, 9};
int[] win_nums = {20, 9, 3, 45, 4, 35};

lotto.solution(lottos, win_nums);*/
