public class Main {
    public static void main(String[] args) {
       // public static void main(String[] args) {
            Bank bank = new Bank("Noida", 1.2f);
            SBI sbiBranch = new SBI("Chandigarh",1.0f,"100");
            BOI boiBranch = new BOI("Delhi",1.5f,"200");
            ICICI iciciBranch = new ICICI("Ahemdabad",2.0f,"300");
            bank.getDetails();
            sbiBranch.getDetails();
            boiBranch.getDetails();
            iciciBranch.getDetails();
        }
    }
