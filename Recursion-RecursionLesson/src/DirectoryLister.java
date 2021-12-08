import java.io.File;

class DirectoryLister {
    public static void main(String[] args) {
        //user.dir current folder
        File file = new File(System.getProperty("user.dir"));
//        File file = new File("/home/synkmint/Pulpit");
        showDirectories(file);
    }

    static void showDirectories(File file) {
        File[] files = file.listFiles();

        if (files != null)
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("folder " + f.getAbsolutePath());
                    showDirectories(f);
                } else {
                    System.out.println("  plik " + f.getAbsolutePath());
                }
            }
    }
}