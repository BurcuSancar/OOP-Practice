public class Main {
    public static void main(String[] args) {
        Sedan sedanCoupe = new Sedan ("Opel", 10000,500000, 5);
        System.out.println("Aracin modeli " + sedanCoupe.getModel() + " kullanım km " + sedanCoupe.getKullanimKm() + " fiyat " + sedanCoupe.getFiyat() + " kapi sayisi " + sedanCoupe.getKapi());

        sedanCoupe.arabayiSur(5000);
        sedanCoupe.satisFiyati(450000);
        System.out.println("Aracin modeli " + sedanCoupe.getModel() + " kullanım km " + sedanCoupe.getKullanimKm() + " fiyat " + sedanCoupe.getFiyat() + " kapi sayisi " + sedanCoupe.getKapi());

        Hatchback hatchbackVolvo = new Hatchback("Volvo", 0, 1000000, 5);
        System.out.println("Aracin modeli " + hatchbackVolvo.getModel() + " kullanım km " + hatchbackVolvo.getKullanimKm() + " fiyat " + hatchbackVolvo.getFiyat() + " kapi sayisi " + hatchbackVolvo.getKapi());

        hatchbackVolvo.arabayiSur(1000);
        hatchbackVolvo.satisFiyati(950000);

        System.out.println("Aracin modeli " + hatchbackVolvo.getModel() + " kullanım km" + hatchbackVolvo.getKullanimKm() + " fiyat " + hatchbackVolvo.getFiyat() + " kapi sayisi " + hatchbackVolvo.getKapi());

        Person berkay = new Person("Berkay", 27);
        System.out.println(berkay.returnSomething());
        System.out.println(berkay.returnPi());
        System.out.println(berkay.returnDouble(4));

        Person burcu = new Person("Burcu", 28);
        System.out.println(burcu.returnDouble(9));


        User admin = new User("burcusancar@gmail.com", 1);
        System.out.println(admin.returnEmail());
        System.out.println(admin.passwordReturner());

        Cat luna = new Cat("Luna", "tuxedo", 1);
        System.out.println(luna.namePlusType());
    }
}