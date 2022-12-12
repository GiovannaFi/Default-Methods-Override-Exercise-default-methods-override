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


        System.out.println("Is smartphone 1 equals to smartphone 2? " + smartphone2.equals(smartphone1));

        try {
            Smartphone smartphone3 = smartphone2.clone();
            System.out.println(smartphone3.toString());
            System.out.println("cloned smartphone == smartphone 2? " + smartphone3.equals(smartphone2));


        } catch (CloneNotSupportedException error){
            error.printStackTrace();
            System.out.println("Error!");
        } catch (Exception exception){ //qualsiasi errore
            exception.printStackTrace();
            System.out.println("Generic error!");
        }




    }



}
