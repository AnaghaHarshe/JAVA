class Mobile
{
 String brand;
 int price;
 String name;

 public void show()
 {
    System.out.println("\nTne brand name of mobile is: "+ brand + "\nPrice of mobile is: " + price + " \nName of the mobile is: "+name);
 }
}
class Demo
{
    public static void main(String[] args)
    {
        Mobile m = new Mobile();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.brand="One pluse";
        m1.price=20000;
        m1.name="Smart Phone";
        m1.show();
        
        
        m.brand="Samsung";
        m.price=6000;
        m.name="Phone";
        m.show();
       
        m2.brand="Oppo";
        m2.price=30000;
        m2.name=" Smart Phone";
        m2.show();

    }
}

