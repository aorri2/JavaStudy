package io;

import java.io.File;
import java.util.Date;

public class FileSample {
    static final String pathName = File.separator+"godofjava"+File.separator+"text";
    private File file;

    public static void main(String[] args) {
        FileSample sample = new FileSample();
//        sample.checkPath(pathName);
//        sample.makeDirectory(pathName);
//        sample.checkFileMethods(pathName);
//        sample.canFileMethods(pathName);
        sample.lastModified(pathName);
    }
    public void lastModified(String pathName){
        file=new File(pathName);
        System.out.println(new Date(file.lastModified()));
    }

    public void canFileMethods(String pathName){
        file = new File(pathName);
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());

    }

    public void makeDirectory(String pathName){
        File file = new File(pathName);
        System.out.println("Make "+pathName+" result = "+file.mkdir());
    }

    public void checkPath(String pathName){
        File file = new File(pathName);
        System.out.println(pathName+" is exists?"+file.exists());

    }
    public void checkFileMethods(String pathName){
        File file = new File(pathName);
        System.out.println(pathName+" is Directory? = "+file.isDirectory());
        System.out.println(pathName+" is file? = "+file.isFile());
        System.out.println(pathName+" is hidden? = "+file.isHidden());
    }
}
