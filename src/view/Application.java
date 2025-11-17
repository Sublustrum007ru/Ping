package view;

import controller.Ping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Application {
    public Application() throws IOException {
        String helloMSG = "Hello World!!!\nMy name is Sublustrum007";
        promt(helloMSG);
//        new Ping();
        testCommand();
    }

    private void testCommand() throws IOException {
        String addres = "tracert yandex.ru";
        Process command = Runtime.getRuntime().exec(addres);
        BufferedReader br = new BufferedReader(new InputStreamReader(command.getInputStream(), Charset.forName("CP866")));
        String line;
        while ((line = br.readLine()) != null) {
            Application.promt(line);
        }
        br.close();
    }

    public static void promt(String str) {
        System.out.println(str);
    }
} 
