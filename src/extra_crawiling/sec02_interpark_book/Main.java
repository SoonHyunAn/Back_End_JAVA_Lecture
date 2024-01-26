package extra_crawiling.sec02_interpark_book;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InterpartkBookService interpartkBookService = new InterpartkBookService();
        List<InterparkBook> list = interpartkBookService.getBestSeller();
        for (InterparkBook x : list) {
            System.out.println(x);
        }
    }
}
