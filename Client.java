import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.PrintStream;
class Client{
	public static void main(String...ar)throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter IP address to chat");
		String ipaddress =  sc.next();
		Socket soc = new Socket(ipaddress,2000);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br  = new BufferedReader(isr);
		PrintStream ps = new PrintStream(soc.getOutputStream());
		while(true){
			String data = br.readLine();
			if(data.equals("stop")){
				break;
			}
			ps.println(data);
		}
	}
}