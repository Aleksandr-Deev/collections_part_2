package part_1_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product apple = new Product("яблоко", 48.98, 10);
        Product pear = new Product("Груша", 74.55, 5);
        ProductList productList = new ProductList();
        productList.addProduct(apple);
        productList.addProduct(pear);
        System.out.println(productList);
        setIntegers();

    }

    private static void setIntegers() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }

}