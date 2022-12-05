public class Tester {

    public static void main(String[] args) {
        SmartphonePrice smartphonePrice1 = new SmartphonePrice("retail", 600.50);
        SmartphonePrice smartphonePrice1_1 = new SmartphonePrice("producer", 300.50);
        Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy", 3000, smartphonePrice1, smartphonePrice1_1);

        SmartphonePrice smartphonePrice2 = new SmartphonePrice("retail", 900.50);
        SmartphonePrice smartphonePrice2_2 = new SmartphonePrice("producer", 500.50);
        Smartphone smartphone2 = new Smartphone("iPhone", "Pro", 2000, smartphonePrice2, smartphonePrice2_2);

        System.out.println(smartphone1);
        System.out.println(smartphone2);


        boolean out = smartphone1 == smartphone2;
        System.out.println("Is smartphone 1 equals to smartphone 2? " + out);

        try {
            Smartphone smartphone3 = smartphone1.clone();
            System.out.println(smartphone3);
            boolean out1 = smartphone1 == smartphone3;
            System.out.println("Is smartphone 1 equals to smartphone 3? " + out1);
        } catch (CloneNotSupportedException error){
            error.printStackTrace();
            System.out.println("Error!");
        } catch (Exception exception){ //qualsiasi errore
            exception.printStackTrace();
            System.out.println("Generic error!");
        }




    }



}
