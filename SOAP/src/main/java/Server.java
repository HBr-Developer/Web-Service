import tp1.WebService.StudentService;
import javax.xml.ws.Endpoint;

public class Server {
    public static void main(String[] args) {
        String url = "http://localhost:9092/";
        Endpoint.publish(url, new StudentService());
        System.out.println("Server Running ...");
    }
}
