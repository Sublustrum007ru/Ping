package controller;

import view.Application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Ping {

    public Ping() throws IOException {
        String addres = "yandex.ru";
        Process ping = Runtime.getRuntime().exec("ping " + addres + " -t");
        BufferedReader br = new BufferedReader(new InputStreamReader(ping.getInputStream(), Charset.forName("CP866")));
        String line;
        while ((line = br.readLine()) != null) {
            Application.promt(line);
        }
        br.close();
    }
}
