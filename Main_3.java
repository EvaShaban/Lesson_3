public class Main{

    public static void main(String[] args) {

        Park l1= new Park("Лодочки", "16-00 - 21-00", "5");
        l1.displayPark();
        l1.account.displayAccount();

    }
}
class Park{

    private String name;
    Account account;
    private String price;

    Park (String name, String pas, String price){
        this.name = name;
        account = new Account(pas);
        this.price = price;


    }
    public void displayPark(){
        System.out.printf(" Парк развлечений \t Атракцион: %s \t Время работы: %s \n Стоимость: %s", name, account.pas,price);
    }

    public class Account{
        private String pas;


        Account(String pas){
            this.pas = pas;
        }
        void displayAccount(){
            System.out.printf (" Парк развлечений \t Атракцион: %s \t Время работы: %s \n Стоимость: %s", Park.this.name, pas,price);
        }
    }
}