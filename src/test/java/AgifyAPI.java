import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class AgifyAPI {
    public static void main(String[] args) {


        String apiUrl = "https://api.agify.io/?name=john";

        Response response = RestAssured.get(apiUrl);

        JSONObject jsonResponse = new JSONObject(response.asString());


        String name = jsonResponse.getString("name");
        int age = jsonResponse.getInt("age");


        System.out.println("Name: " + name);
        System.out.println("Predicted Age: " + age);

    }
}
