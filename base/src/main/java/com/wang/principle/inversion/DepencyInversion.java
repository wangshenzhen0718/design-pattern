package com.wang.principle.inversion;

public class DepencyInversion {
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.receive(new Email());

    }
}

class Email{
    public String getInfo(){
        return "Email 方法 hello world!!!";

    }

}
class Persion{
    public void receive(Email email){
        System.out.println(email.getInfo());

    }


}
