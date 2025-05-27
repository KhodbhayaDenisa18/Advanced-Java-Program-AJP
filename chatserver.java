import java.io.*;
import java.net.*;


public class chatserver 
{

    public static void main(String[] args) throws Exception
    {
        ServerSocket socket = new ServerSocket(3000);
        System.out.println("Server is listening on port 9876...");
        System.out.println("Server  ready for chatting");
        Socket sock = socket.accept( );

        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        OutputStream ostream = sock.getOutputStream();

        PrintWriter pwrite = new PrintWriter(ostream, true);

        InputStream istream = sock.getInputStream();

        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

        String receiveMessage, sendMessage;
        while(true)
        {
            if((receiveMessage = receiveRead.readLine()) != null)
            {
                System.out.println(("CLIENT Say: ") +  receiveMessage);
            }
            System.out.print("Enter your reply: ");
            sendMessage = keyRead.readLine();
            pwrite.println(sendMessage);
            pwrite.flush();
        }
    }
}

