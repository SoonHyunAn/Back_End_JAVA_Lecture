package extra_crawiling.sec02_interpark_book;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InterparkBookService interparkBookService = new InterparkBookService();
        List<InterparkBook> list = interparkBookService.getBestSeller();
        for (InterparkBook x : list) {
            System.out.println(x);
        }
    }
}
