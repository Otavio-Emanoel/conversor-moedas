package org.otavio;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final String API_URL = "https://open.er-api.com/v6/latest/BRL";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.print("Digite o valor em reais (BRL): ");
            double valorBrl = scanner.nextDouble();

            String respostaJson = buscarTaxasCambio();

            double taxaUSD = extrairTaxa(respostaJson, "USD");
            double taxaEUR = extrairTaxa(respostaJson, "EUR");

            exibirResultado("USD", taxaUSD, valorBrl);
            exibirResultado("EUR", taxaEUR, valorBrl);

        } catch (Exception e) {
            System.out.println("Erro ao converter moeda.");
            e.printStackTrace();
        }
    }

    private static String buscarTaxasCambio() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
        conexao.connect();

        StringBuilder resposta = new StringBuilder();
        try (Scanner sc = new Scanner(url.openStream())) {
            while (sc.hasNext()) {
                resposta.append(sc.nextLine());
            }
        }

        return resposta.toString();
    }

    private static double extrairTaxa(String json, String moeda) {
        String chave = "\"" + moeda + "\":";
        int index = json.indexOf(chave);

        String substring = json.substring(index + chave.length());
        String valor = substring.substring(0, substring.indexOf(","));

        return Double.parseDouble(valor);
    }

    private static void exibirResultado(String moeda, double taxa, double valorBrl) {
        double valorConvertido = valorBrl * taxa;
        System.out.println("\nTaxa BRL/" + moeda + ": " + taxa);
        System.out.println("Valor convertido: " + valorConvertido + " " + moeda);
    }
}