import java.io.*;
public class mp3cutter
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("D:\\Songs\\Do Din.mp3");
            FileInputStream fis=new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream("E:\\1st_half.mp3");
            FileOutputStream fos1 = new FileOutputStream("E:\\2nd_half.mp3");
            FileOutputStream fos2 = new FileOutputStream("E:\\final.mp3");
            int k = (int) f.length();
            int i=0;
            while(i!=(k/2))
            {
                fos.write(fis.read());
                i++;
            }
            System.out.println("Done 1");
            while(i!=k)
            {
                fos1.write(fis.read());
                i++;
            }
            System.out.println("Done 2");
            File f1=new File("E:\\1st_half.mp3");
            FileInputStream fis1=new FileInputStream(f1);
            File f2=new File("E:\\2nd_half.mp3");
            FileInputStream fis2=new FileInputStream(f2);
            i=0;
            while(i!=(k))
            {
                if(i<(k/2))
                {
                    fos2.write(fis2.read());
                    i++;
                }
                else
                {
                    fos2.write(fis1.read());
                    i++;
                }
            }
            System.out.println("Done 3");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}

