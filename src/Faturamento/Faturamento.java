import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Faturamento {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        List<Double> faturamentoDiario = new ArrayList<>();

        try {
            // Ler o arquivo JSON
            Object obj = parser.parse(new FileReader("faturamento_diario.json"));
            JSONObject jsonObject = (JSONObject) obj;

            // Obter o array com o faturamento diário
            JSONArray jsonArray = (JSONArray) jsonObject.get("faturamento_diario");

            // Adicionar os valores do array na lista
            for (Object valor : jsonArray) {
                Double faturamento = Double.parseDouble(valor.toString());
                faturamentoDiario.add(faturamento);
            }

            // Imprimir a lista de faturamento diário
            System.out.println("Faturamento diário:");
            for (Double faturamento : faturamentoDiario) {
                System.out.println(faturamento);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
