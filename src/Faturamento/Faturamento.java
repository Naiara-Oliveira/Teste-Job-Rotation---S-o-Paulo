//package Faturamento;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//    public class Faturamento {
//
//        public static void main(String[] args) {
//
//            JSONParser parser = new JSONParser();
//            double[] faturamentoDiario = null;
//
//            try {
//                Object obj = parser.parse(new FileReader("faturamento.json"));
//                JSONObject jsonObject = (JSONObject) obj;
//                JSONArray jsonArray = (JSONArray) jsonObject.get("faturamento_diario");
//
//                // Cria um array com os valores de faturamento diário
//                faturamentoDiario = new double[jsonArray.size()];
//                for (int i = 0; i < jsonArray.size(); i++) {
//                    faturamentoDiario[i] = (double) jsonArray.get(i);
//                }
//
//            } catch (IOException | ParseException e) {
//                e.printStackTrace();
//            }
//
//            if (faturamentoDiario != null) {
//
//                // Calcula o menor valor de faturamento
//                double menorFaturamento = faturamentoDiario[0];
//                for (int i = 1; i < faturamentoDiario.length; i++) {
//                    if (faturamentoDiario[i] < menorFaturamento) {
//                        menorFaturamento = faturamentoDiario[i];
//                    }
//                }
//                System.out.println("Menor valor de faturamento: " + menorFaturamento);
//
//                // Calcula o maior valor de faturamento
//                double maiorFaturamento = faturamentoDiario[0];
//                for (int i = 1; i < faturamentoDiario.length; i++) {
//                    if (faturamentoDiario[i] > maiorFaturamento) {
//                        maiorFaturamento = faturamentoDiario[i];
//                    }
//                }
//                System.out.println("Maior valor de faturamento: " + maiorFaturamento);
//
//                // Calcula a média mensal de faturamento, ignorando os dias sem faturamento
//                double somaFaturamento = 0;
//                int diasComFaturamento = 0;
//                for (int i = 0; i < faturamentoDiario.length; i++) {
//                    if (faturamentoDiario[i] > 0) {
//                        somaFaturamento += faturamentoDiario[i];
//                        diasComFaturamento++;
//                    }
//                }
//                double mediaMensal = somaFaturamento / diasComFaturamento;
//
//                // Conta o número de dias em que o faturamento foi superior à média mensal
//                int diasAcimaDaMedia = 0;
//                for (int i = 0; i < faturamentoDiario.length; i++) {
//                    if (faturamentoDiario[i] > mediaMensal) {
//                        diasAcimaDaMedia++;
//                    }
//                }
//                System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
//
//            }
//
//        }
//
//    }