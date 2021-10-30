package com.company;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client
{
    public static void main(String[] args)
    {
        Socket socket = null;
        Socket socket1 = null;
        DataInputStream din = null;
        DataOutputStream dout = null;
        BufferedReader br = null;

        try
        {

            socket = new Socket("localhost", 6666);
            din = new DataInputStream(socket.getInputStream());

            socket1 = new Socket("localhost", 6666);
            din = new DataInputStream(socket1.getInputStream());
            /*
             * returns the OutputStream attached with this socket.
             */
            OutputStream outputStream = socket.getOutputStream();
            dout = new DataOutputStream(outputStream);

            br = new BufferedReader(new InputStreamReader(System.in));

            String strFromServer = "", strToClient = "";
            while (!strFromServer.equals("stop"))
            {
                strFromServer = br.readLine();
                dout.writeUTF(strFromServer);
                dout.flush();
                strToClient = din.readUTF();
                System.out.println("Server says: " + strToClient);
            }

        }
        catch (Exception exe)
        {
            exe.printStackTrace();
        }
        finally
        {
            try
            {

                if (br != null)
                {
                    br.close();
                }

                if (din != null)
                {
                    din.close();
                }

                if (dout != null)
                {
                    dout.close();
                }
                if (socket != null)
                {
                    /*
                     * closes this socket
                     */
                    socket.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}