package controller.management;

import controller.feature.PrintFunctions;
import model.Clients;

public class Login {

   public static void login() {

      Clients clients1 = new Clients("김현주", 25, "temppw1001", "경기 고양시 일산동구 경의로 573 4층", "1월3일", "A", "D");

      PrintFunctions.print_success_login(clients1);

   }

}
