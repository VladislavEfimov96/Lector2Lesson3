package Lector2.lesson3;

public class lesson3 {
    Phone phone1 = new Phone("+7 (999) 124-11-78","Honor",100.0);
    Phone phone2 = new Phone("+7 (977) 787-15-42","Samsung");
    Phone phone3 = new Phone();
    Phone[] phones = {phone1, phone2, phone3};
        for (Phone p:phones){
        System.out.println("Model: " + p.model + "Number: " + p.number + "Weight: " + p.weight);
        }
        phone1.receiveCall("Vlad");
        phone2.receiveCall("Olga");
        phone3.receiveCall("Kirill");
        for(Phone p:phones){
        System.out.println(p.getNumber());
        }
        phone1.receiveCall("Vlad", "+7 (999) 124-11-78");
        phone2.receiveCall("Olga", "+7 (977) 787-15-42");
        phone3.receiveCall("Kirill", "+7 (916) 154-98-09");

        Phone.sendMessage("Privet!", "+7 (977) 787-15-42", "+7 (916) 154-98-09", "+7 (999) 124-11-78");
}
