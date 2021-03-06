/**
 * 문제 설명
 * 
 * 카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어, 카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다. 
 * "네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 
 * 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
 * 다음은 카카오 아이디의 규칙입니다.
 * 
 * 아이디의 길이는 3자 이상 15자 이하여야 합니다.
 * 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
 * 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
 * 
 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
 * 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

 * 입출력 예 설명
 * No		new_id								result
 * 예1		"...!@BaT#*..y.abcdefghijklm"		"bat.y.abcdefghi"	O
 * 예2		"z-+.^."							"z--"				O
 * 예3		"=.="								"aaa"				O
 * 예4		"123_.def"							"123_.def"			O
 * 예5		"abcdefghijklmn.p"					"abcdefghijklmn"	O
 **/

package level1.sub;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecNewID {
    public String solution(String new_id) {
    	
    	System.out.println("입력값 : " + new_id);
    	System.out.println("=======================================");
    	
    	 // 1단계, 소문자 치환
        new_id = new_id.toLowerCase();

        // 2단계, 소문자/숫자/-/_/. 제외한 모든 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        // 3단계, 마침표 2개 이상을 1개로 치환
        new_id = new_id.replaceAll("[.]{2,}", ".");

        // 4단계, 마침표가 처음 혹은 끝에 있을 경우 제거 
        new_id = new_id.replaceAll("^[.]{1}", "");
        //new_id = new_id.replaceAll("[.]{1}$", "");

        // 5단계, 빈 문자열일 경우 a를 대입
        if(new_id.equals("")) {
            new_id += "a";
        }

        // 6단계, 16자 이상일 경우 15자까지 자름, 마지막 문자가 .일 경우 제거
        if(new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
        }
        new_id = new_id.replaceAll("[.]{1}$", "");

        // 7단계, 2자 이하일 경우 마지막 문자를 3자가 될 때까지 반복하여 붙임
        if(new_id.length() <= 2) {
            for(int i = new_id.length(); i < 3; i++){
                new_id += new_id.substring(new_id.length() - 1);
            }
        }
        System.out.println("결과값 : " + new_id);
        
    	return new_id;
    }
}
