import java.util.Scanner;

/**
 * Created by i on 30.06.2019.
 */
public class Client {
    private String clientName;

    Client(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя(номер клиента) : ");
        setClientName(sc.next());
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}