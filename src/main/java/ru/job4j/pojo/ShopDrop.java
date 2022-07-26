package ru.job4j.pojo;

/**
 * Напишем алгоритм перемещения заполненных ячеек в начало массива.
 * Мы помним, что удалить ячейку из массива нельзя,
 * но мы можем сделать её null, то есть приравнять элемент нулевой ссылке.
 */
public class ShopDrop {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("milk", 10);
        for (Product product : products) {
            System.out.println(product.getName());
        }
        products[1] = products[2];
        products[2] = null;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println(equalTwoProducts(products[0], products[3]));

    }

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static boolean equalTwoProducts(Product p1, Product p2) {
        return p1.equals(p2);
    }
}
