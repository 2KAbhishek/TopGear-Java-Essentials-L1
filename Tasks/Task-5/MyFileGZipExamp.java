import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class MyFileGZipExamp {
    public void doGzip(String filePath) {
        try {
            FileInputStream fin = new FileInputStream(filePath);
            FileOutputStream fout = new FileOutputStream("./test.gzip");
            GZIPOutputStream gzip = new GZIPOutputStream(fout);

            int i;
            while ((i = fin.read()) != -1) {
                gzip.write((byte) i);
                gzip.flush();
            }
            fin.close();
            gzip.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("Please make sure that the " + filePath + " exists.");
            System.out.println(e.getMessage());
        }
    }

    public void doUnGzipFile(String filePath) {
        try {
            FileInputStream fin = new FileInputStream(filePath);
            GZIPInputStream in = new GZIPInputStream(fin);
            FileOutputStream fout = new FileOutputStream("test2.txt");

            int i;
            while ((i = in.read()) != -1) {
                fout.write((byte) i);
                fout.flush();
            }
            fin.close();
            fout.close();
            in.close();
        } catch (Exception e) {
            System.out.println("Please make sure that the " + filePath + " exists.");
            System.out.println(e);
        }
    }

    public static void main(String a[]) {
        MyFileGZipExamp mfg = new MyFileGZipExamp();
        mfg.doGzip("./test.txt");
        mfg.doUnGzipFile("./test.gzip");
    }
}
