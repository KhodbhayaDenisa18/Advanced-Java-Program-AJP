import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class chatclient
{
        public static void main(String[] args) throws Exception
        {
                  Socket sock = new Socket("127.0.0.1", 3000);
                    System.out.println("Connected to the server");

                 BufferedReader keyRead = new BufferedReader
(new InputStreamReader(System.in));

OutputStream ostream = sock.getOutputStream();
PrintWriter pwrite = new PrintWriter(ostream, true);

InputStream istream = sock.getInputStream();
BufferedReader receiveRead = new             BufferedReader(new InputStreamReader(istream));

System.out.println("Start the chitchat, type and press Enter key");

String receiveMessage, sendMessage;
                while(true)
                {
                        System.out.print("Enter message: ");
                        sendMessage = keyRead.readLine();  // keyboard reading
                        pwrite.println(sendMessage);       // sending to server
                        pwrite.flush();                    // flush the data
if((receiveMessage = receiveRead.readLine()) != null) 
                        {
                                System.out.println("SERVER Say: "+receiveMessage); 
                        }
                }
        }
}

