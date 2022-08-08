package controller;

import java.io.IOException;

public class ConsoleController{ // 콘솔창 clear
   
   public static void ClearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

   public static void KillScreen() throws IOException {
      Runtime.getRuntime().exec("taskkill /F /IM <processname>.exe");
   }

}