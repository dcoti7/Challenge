
import java.util.Map;

public record Conversor(Map<String , Double> conversion_rates) {

    public String convertirDolares(String tipoMoneda, double cantidad){
        return ("El valor: " + cantidad + " [USD] corresponde a: " + cantidad * conversion_rates.get(tipoMoneda) + " ["+tipoMoneda+"]");
    }

    public String otraMoneda(String tipoMoneda, double cantidad){
        return ("El valor: " + cantidad + " ["+tipoMoneda+"]" + " corresponde a: " + cantidad / conversion_rates.get(tipoMoneda) + "[USD]" );
    }
}
