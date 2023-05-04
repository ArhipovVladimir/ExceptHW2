import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task3 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[2];
            //test(); не понятно зачем?
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (Throwable e) {
            e.printStackTrace();
        } catch (StackOverflowError e) {
            e.printStackTrace ("Что-то сломалось" e.getMessage() );
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }
}

// вообще не понял алглритм

//    private static void test() throws IOException {
//        File file = new File("1");
//        file.createNewFile();
//        FileReader reader = new FileReader(file);
//        reader.read();
//        test();
//    }
//}
