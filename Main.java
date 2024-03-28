import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] massiv = new Product[4];
        massiv[0] = new Product("Milka","Sokoladka", 79, "90 дней", 4);
        massiv[1] = new Product("Moxito","Nefteqaz", 25, "60 дней",1);
        massiv[2] = new Product("Stul", "Mebel", 1555, "3 месяца",2);
        massiv[3] = new Product("Kurkuma", "Turkiya", 15, "12 суток", 1);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите наименование продукта");
        String name = input.nextLine();
        for(int i = 0;i < massiv.length;i++){
            if(massiv[i].name.equals(name)){
                System.out.println("Название продукта:" + massiv[i].name);
                System.out.println("Производитель продукта:" + massiv[i].proiz);
                System.out.println("Цена продукта:" + massiv[i].price);
                System.out.println("Срок хранения:" + massiv[i].data);
                System.out.println("Количество продукта:" + massiv[i].count);
            }
        }
    }
}

class Product{
    String name;
    String proiz;
    int price;
    String data;
    int count;
    Product(String name, String proiz, int price, String data, int count){
        this.name = name;
        this.proiz = proiz;
        this.price = price;
        this.data = data;
        this.count = count;
    }
}
