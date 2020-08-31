package inheritance;

public class Nokia1100 extends PreNokia1100 {


    /**
     * Make necessary changes to inherit PreNokia1100
     * Declare and assign value to a String instance variable called nameOfTheClass
     * Implement a method to add photo gallery photoGallery()
     * Create default constructor and a parameterized constructor with int x parameter
     * */

    String nameOfThePhone = "Nokia1100";
    static int x = 8;

    public Nokia1100(){
       System.out.println("Name of the phone is: Nokia1100 ");
    }

    public Nokia1100(String nameOfThePhone, int x){
       nameOfThePhone = this.nameOfThePhone;
       x = this.x;

       System.out.println(nameOfThePhone + x);

    }

   public void display(){
      System.out.println("Display......");

   }

   public void photoGallery(){
      System.out.println("View Photos......");
   }



   public static void main(String[] args) {
      Nokia1100 nokia1100 = new Nokia1100();

      nokia1100.display();
      nokia1100.makeCall();
      nokia1100.contactList();
      nokia1100.photoGallery();
      nokia1100.sendText();
      nokia1100.games();
      nokia1100.mp3Player();
      nokia1100.playRingtone();

      int x = nokia1100.x;
      System.out.println(x);




    }




}
