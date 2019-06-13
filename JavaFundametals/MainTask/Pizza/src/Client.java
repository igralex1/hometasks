import java.util.Scanner;

public class Client {
    private String clientName;

    Client(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя : ");
        setClientName(sc.next());
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}