package controller.clients;

import java.util.ArrayList;
import java.util.Scanner;

import controller.management.Login;
import controller.management.SignIn;
import model.Clients;

public class ClientsMangement {
    Scanner s = new Scanner(System.in);
    ClientsSearchModel instance = ClientsSearchModel.getInstance();
    ArrayList<Clients> allClientsList = instance.getClientsList();

    public void reqResClients(int reqNo) {
        /**
         * 로그인 로직
         */
        if (reqNo == 1) { // 로그인
            Login.login();

        } else if (reqNo == 2) { // 회원가입
            SignIn.signIn();
        } else if (reqNo == 3) { // 아이디 비밀번호 찾기
            SearchClient.FindID();

        } else if (reqNo == 4) { // return home
            System.out.println("홈으로 돌아갑니다.");

        } else { // 그 외의 번호가 입력되었을 때 출력할 문
            System.out.println("*** 무효한 검색 요청 *****\n");
            System.out.println("다시 입력해주세요 \n");
            System.out.println("*****************************\n");
        }

    }

}