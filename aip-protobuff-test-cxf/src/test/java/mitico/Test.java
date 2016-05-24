package mitico;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.sample.protobuff.tutorial.AddressBookProtos;

public class Test {

	public static void main(String[] args) {

		try { 
			
			AddressBookProtos.Person p = AddressBookProtos.Person.newBuilder()
            .setId(1)
            .setName("abc")
            .setEmail("abc@xyz.com")
            .addPhone(AddressBookProtos.Person.PhoneNumber.newBuilder()
                    .setNumber("555-1212")
                    .setType(AddressBookProtos.Person.PhoneType.MOBILE)
                    .build())
            .build(); 
			
			URL url = new URL("http://localhost:8181/cxf/test2");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-Type", "application/x-protobuf");
			connection.setRequestProperty("Accept", "application/x-protobuf");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			OutputStream out = connection.getOutputStream();

			p.writeTo(out);
			out.close();
			
			InputStream inputStream = null;
			BufferedReader bufferedReader = null;
			inputStream = connection.getInputStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

			String line;
			StringBuilder response = new StringBuilder();
			while ((line = bufferedReader.readLine()) !=null) {
				response.append(line);
				response.append('\r');
			}

			System.out.println(response.toString());
			
        } catch (Exception e) { 
            e.printStackTrace();
        }
	}
}
