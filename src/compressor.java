import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class compressor {
//    public static void main(String[] args) throws IOException {
//
//        File path = new File("C:\\Users\\mrahm\\OneDrive\\Desktop\\CODECProject\\testFile");
//        method(path);
//
//    }

    public static void method(File file) throws IOException{
        String fileDirectory = file.getParent();

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(fileDirectory + "\\CompFile.gz");
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream);

        byte[] buffer;
        buffer = new byte[1024];
        int len;

        while ((len = fileInputStream.read(buffer)) != -1){
            gzipOutputStream.write(buffer , 0 , len);
        }


        gzipOutputStream.close();
        fileOutputStream.close();
        fileInputStream.close();



    }
}
