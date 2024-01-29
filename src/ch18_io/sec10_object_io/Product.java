package ch18_io.sec10_object_io;

import java.io.Serial;
import java.io.Serializable;

public class Product implements Serializable {
    /**
     * Serializable I/F를 구현해야 직렬화가 가능해서, 파일에 읽고 쓰기가 가능해짐

     */
    @Serial
    private static final long serialVersionUID = -468084458168381772L;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
