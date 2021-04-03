import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Server{
	public static void main(String...ar) throws Exception{
		ServerSocket ss = new ServerSocket(2000);
		System.out.println("Server is ready..");
		Socket s = ss.accept();
		
		InputStreamReader is = new InputStreamReader(s.getInputStream());
		BufferedReader br = new BufferedReader(is);
		
		while(true){
			String data = br.readLine();
			if(data.length() == 0){
				break;
			}
			System.out.println(data);
		}
	}
}