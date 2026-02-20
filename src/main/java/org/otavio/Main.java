package org.otavio;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Digite o valor que deseja converter em reais para dolar e euro: ");
            double valorBrl = scanner.nextDouble();

            // buscar a taxa de cambio

            String urlStr = "https://open.er-api.com/v6/latest/BRL";
            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            Scanner scUrl = new Scanner(url.openStream());
            String inline = "";
            while(scUrl.hasNext()){
                inline += scUrl.nextLine();
            }
            scUrl.close();

            for (int i = 0; i<2;i++) {
                if (i == 0) {
                    String keyToFind = "\"USD\":";
                    int index = inline.indexOf(keyToFind);
                    String substring = inline.substring(index + keyToFind.length());
                    String rateStr = substring.substring(0, substring.indexOf(","));
                    double taxaUSD = Double.parseDouble(rateStr);
                    double valorFinal = valorBrl * taxaUSD;
                    System.out.println("Taxa BRL/USD: $ " + taxaUSD);
                    System.out.println("Valor final: R$ " + valorFinal);
                } else if (i == 1) {
                    String keyToFind = "\"EUR\":";
                    int index = inline.indexOf(keyToFind);
                    String substring = inline.substring(index + keyToFind.length());
                    String rateStr = substring.substring(0, substring.indexOf(","));
                    double taxaUSD = Double.parseDouble(rateStr);
                    double valorFinal = valorBrl * taxaUSD;
                    System.out.println("Taxa BRL/EURO: $ " + taxaUSD);
                    System.out.println("Valor final: R$ " + valorFinal);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}