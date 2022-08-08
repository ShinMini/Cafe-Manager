package controller;

public class OptionChecker {

      public static int Check(String case1_option) { // 정상적인 숫자가 아닌경우 -1반환
      char check_option = case1_option.charAt(0); // 문자열 첫번째 글자 가져옴

      if (Character.isDigit(check_option)) { // 해당 input text가 숫자로 변환 가능한 경우.
         return check_option - '0'; // return 선택한 입력값
      } else
         return -1;
   }
}
