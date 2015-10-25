package io_streams;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IO_Streams 
{    
    public static void main(String[] args) 
    {
        
       
            //<editor-fold defaultstate="collapsed" desc="ByteArrayInputStream BAIS">

            
//        byte[] A = new byte[256];
//        for(int i=0; i<A.length;i++)
//        {
//            A[i] = (byte) i;
//        }
//        
//        ByteArrayInputStream BAIS = new ByteArrayInputStream(A);
//        byte[] buf = new byte[5];                // kratno 4 , 8 , 16 , 32 , 64 , 128 , ... 
//        try
//        {
//            while(BAIS.available() > 0)
//            {
//                int cnt = BAIS.read(buf, 0 , buf.length);
//                if(cnt == -1)
//                {
//                    break;
//                }
//                for(int i=0; i<cnt;i++)
//                {
//                    System.out.println(buf[i]);
//                }
//                System.out.println("===========");
//            }
//            BAIS.close();
//        }
//       
//        catch(IOException | NullPointerException | IndexOutOfBoundsException ioe)
//        {
//            System.out.println(ioe.getMessage());
//        }
            
//      Правильная запись Закрытия ФАЙЛОВОГО потока
//        finally                                                               
//        {
//            try
//            {
//                BAIS.close();
//            }
//            catch(IOException ioe)
//            {
//
//            }            
//        }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="ByteArrayOutputStream BAOS">
            
            
//        ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
//        byte [] buf = new byte[] {1,2,3,4,5,6,7,8,9,10,11,12};
//        byte [] buf2 = new byte[] {10,20,30,40,50,60,70,80,90,100,110,120};
//        try
//        {
//            BAOS.write(buf, 0 , buf.length);
//            BAOS.write(buf2, 0 , buf2.length);
//            
//            byte[] result = BAOS.toByteArray();
//            BAOS.close();
//            
//            for(int i = 0; i<result.length; i++)
//            {
//                System.out.println(result[i]);
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("Error : " + e.getMessage());
//        }
            
            
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="DataOutputStream & DataInputStream">
        
//        ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
//        DataOutputStream DOS = new DataOutputStream(BAOS);
//        
//        try
//        {
//            DOS.writeInt(17);
//            DOS.writeDouble(14.98);
//            DOS.writeUTF("Hello World");
//            DOS.writeBoolean(true);
//            byte[] result = BAOS.toByteArray();
//            DOS.close();
//            
//            for(int i=0; i<result.length; i++)
//            {
//                System.out.println(result[i]);
//            }
//            
//            System.out.println("======================");
//            
//            ByteArrayInputStream BAIS = new ByteArrayInputStream(result);
//            DataInputStream DIS = new DataInputStream(BAIS);
//            
//            int a = DIS.readInt();
//            double b = DIS.readDouble();
//            String s = DIS.readUTF();
//            boolean bol = DIS.readBoolean();
//            
//            DIS.close();
//            
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(s);
//            System.out.println(bol);
//        
//        }      
//        
//        catch(Exception e)
//        {
//            System.out.println("Error : " + e.getMessage());
//        }
//        
                    
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="FileInputStream & FileOutputStream">
        

        try 
        {
            FileOutputStream FOS = new FileOutputStream("text.txt");
            byte [] buf  = {(byte) 65 ,(byte)66 ,(byte) 67, (byte)68,(byte)69,(byte)70 };
            FOS.write(buf, 0 , buf.length);
            FOS.close();
            
            FileInputStream FIS = new FileInputStream("text.txt");
            ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
            byte [] b = new byte[4];
            while(FIS.available()>0)
            {
                int cnt = FIS.read(b , 0 , b.length);
                if (cnt == -1)
                {
                    break;
                }
                BAOS.write(b, 0, cnt);
            }
            FIS.close();
            
            byte[] result = BAOS.toByteArray();
            BAOS.close();
            
//            DataOutputStream DOS = new DataOutputStream(new FileOutputStream(" ... "));
//            int v;
//            DOS.writeInt(v);
            
// =============================================================================            
//            FileInputStream FIS = new FileInputStream("text.txt");
//            byte[] b = new byte[4];
//            
//            while (FIS.available() > 0)
//            {
//                int cnt = FIS.read(b , 0 , b.length);
//                if(cnt == -1)
//                {
//                    break;
//                }
//                for (int i = 0; i<cnt;i++)
//                {
//                    System.out.println(b[i]);
//                }                
//            
//            }
//            FIS.close();                    
//==============================================================================            
        }
        catch (Exception ex) 
        {
            System.out.println("Error : " + ex.getMessage());
        }
        
        
        
//</editor-fold>  
            //<editor-fold defaultstate="collapsed" desc="StringReader">
//        String S = "Hello World";
//        StringReader SR = new StringReader(S);
//        char[] buf = new char[4];
//        CharArrayWriter CAW = new CharArrayWriter();
//        try
//        {
//        while(true)
//        {
//            int cnt = SR.read(buf,0,buf.length);
//            if(cnt == -1)
//            {
//                break;
//            }
//            CAW.write(buf , 0 , cnt);
//        }
//        SR.close();
//        
//        char[] result = CAW.toCharArray();
//        CAW.close();
//        for(int i = 0 ; i<result.length;i++)
//        {
//            System.out.println(result[i]);
//        }
//        }
//        catch(Exception e)
//        {
//            System.out.println("Error : " + e.getMessage());
//        }
        
        
//</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="StringWriter">
        

//        try
//        {
//        char[] c = {'J','a','v','a',' ','f','o','r','e','v','e','r'};
//        StringWriter SW = new StringWriter();
//        SW.write(c, 0, c.length);
//        String result = SW.toString();
//        
//        System.out.println(result);
//        
//        SW.close();
//        
//        }
//        catch (Exception e) 
//        {
//            System.out.println("Error : " + e.getMessage());
//        }
        
        //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="FileWriter">

 //        try
//        {
//            FileWriter FW = new FileWriter("hello.txt");
//            FW.write("hello world");
//            FW.write("android forever");
//            FW.write("java rules! \r\n");
//            FW.close();
//        }
//        
//        catch (Exception e) 
//        {
//            System.out.println("Error : " + e.getMessage());
//        }
      
        
//</editor-fold>
        
        
    }  
}
