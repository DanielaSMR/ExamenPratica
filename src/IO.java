import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IO{

    public static Scanner sc = new Scanner(System.in);

    static Integer pedirEntero() throws Exception{
        Integer numero = sc.nextInt();
        return numero;
    }

    static String pedirTexto() throws Exception{
        String texto = sc.nextLine();
        return texto;
    }

    public static boolean pedirBoolean() {
        boolean readBoolean = false;
    
        try {
            String inputString = sc.nextLine();

            Map<String, Boolean> booleanMap = new HashMap<>();

            booleanMap.put("true", true);
            booleanMap.put("false", false);
            booleanMap.put("t", true);
            booleanMap.put("f", false);
            booleanMap.put("si", true);
            booleanMap.put("no", false);
            booleanMap.put("s", true);
            booleanMap.put("n", false);
    
            if (!booleanMap.containsKey(inputString.toLowerCase())) {
                throw new Exception("Introduce un valor valido para el tipo boolean. Valores validos: true, false, t, f, si, no, s, n.");
            }
    
            readBoolean = booleanMap.get(inputString.toLowerCase());
    
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            readBoolean = pedirBoolean();
        }
    
        return readBoolean;
    }

    static Double pedirDouble() throws Exception{
        Double nums = sc.nextDouble();
        return nums;
    }

    



}