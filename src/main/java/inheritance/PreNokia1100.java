package inheritance;

public abstract class PreNokia1100 implements SymbianPhone {

    /**
     *
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     *
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     *
     * */

    public void makeCall(){
        System.out.println("Calling......");
    }

    public void sendText() {
        System.out.println("Sending......");
    }

    public void contactList(){
        System.out.println("Contact List......");
    }

    public void playRingtone(){
        System.out.println("Playing......");
    }

    public void mp3Player(){
        System.out.println("Playing Music......");
    }

    public void games(){
        System.out.println("Playing Games......");
    }

    public abstract void display();




}
