import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println(fullPathName(new File("/Users/george/test.txt")));
    }

    public static String fullPathName(File f) {
        if (f.getParentFile() == null) {
            // base case
            return f.getName();
        } else {
            // recursive step
            return fullPathName(f.getParentFile()) + "/" + f.getName();
        }
    }
}
