package controller.clients;

import java.io.IOException;
import java.util.Scanner;

import controller.management.Login;
import controller.management.SearchClient;
import controller.management.SignIn;

public class ClientsMangement {
    Scanner s = new Scanner(System.in);

    public void reqResClients(int reqNo) throws IOException {
        /**
         * 로그인 로직
         */
        if (reqNo == 1) { // 로그인
            Login.login();

        } else if (reqNo == 2) { // 회원가입
            SignIn.signIn(false);
        } else if (reqNo == 3) { // 아이디 비밀번호 찾기
            SearchClient.FindClients();

        } else if (reqNo == 4) { // return home
            System.out.println("go back home.");

        } else { // 그 외의 번호가 입력되었을 때 출력할 문
            System.out.println("*** invalid option *****\n");
            System.out.println("please try again \n");
            System.out.println("*****************************\n");
        }

    }

}