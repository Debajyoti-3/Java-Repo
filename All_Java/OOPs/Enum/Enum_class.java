package OOPs.Enum;

enum Laptop{
    Asus(30000), Macbook(800000), hp(50000), Dell, Lenovo(60000);
    private int price;
    private Laptop(){
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
        System.out.println("in Laptop"+" "+this.name());
    }
    public int getPrice(){
        return price ;
    }
    public void setPrice(){
        this.price = price;
    }
}

public class Enum_class {
    public static void main(String[] args) {
        for(Laptop lap : Laptop.values()){
            System.out.println(lap +":"+ lap.getPrice());
        }
    }
}
