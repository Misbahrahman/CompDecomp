import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class decompressor {
//    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\mrahm\\OneDrive\\Desktop\\CODECProject\\CompFile.gz");
//        method(file);
//    }

    public static void method(File file) throws IOException {
        String fileDirectory = file.getParent();

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(fileDirectory+"\\decomp");
        GZIPInputStream gzipInputStream = new GZIPInputStream(fileInputStream);

        byte[] buffer = new byte[1024];
        int len;

        while ((len = gzipInputStream.read(buffer)) != -1){
            fileOutputStream.write(buffer , 0 , len);
        }


        fileInputStream.close();
        fileOutputStream.close();
        gzipInputStream.close();

    }
}
