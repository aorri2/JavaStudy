package io;

import java.io.File;
import java.io.IOException;

public class FileManageClazz {
    public static void main(String[] args) {
        FileManageClazz sample = new FileManageClazz();
        String pathName = File.separator + "godofjava" + File.separator + "text";
        String fileName = "test.txt";

        sample.checkFile(pathName, fileName);
    }

    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Created Result = " + file.createNewFile());
            getFileInfo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getFileInfo(File file) throws IOException {
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());
        System.out.println("file.getCanonicalFile() = " + file.getCanonicalFile());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());

        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getPath() = " + file.getPath());
    }
}
