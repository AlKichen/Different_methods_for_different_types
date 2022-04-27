import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Different_methods_for_different_types {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while (true) {
            s = bf.readLine();
            if (s.equals("exit")) {
                break;
            }
            try {
                if (s.contains(".")) {
                    Double d = Double.parseDouble(s);
                    print(d);
                    continue;
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
            try {
                if (Short.parseShort(s) > 0 && Short.parseShort(s) < 128) {
                    print(Short.parseShort(s));
                    continue;
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
            try {
                if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) {
                    print(Integer.parseInt(s));
                    continue;
                }
            } catch (Exception e) {
                e.getStackTrace();
            }

            print(s);

        }
        bf.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}


