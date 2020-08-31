package inheritance;

public class Nokia<PreNokia>  {

    public void buildDisplay() {
        System.out.println("Display...");
    }
    public void takePhoto(){
        System.out.println("Take photo...");
    }


    public void phoneBook() {
        System.out.println("phone book...");
    }

    public void games() {
        System.out.println("games...");
    }


    public void mp3Player() {
        System.out.println("music...");
    }

    public static void main(String[] args) {
        Nokia obj=new Nokia();
        obj.call();
        obj.sendText();
        obj.buildDisplay();
        obj.takePhoto();
        // int x =obj.x;
        //System.out.println(x);
    }
    private void call(){
    }
    private void sendText() {
    }
}
