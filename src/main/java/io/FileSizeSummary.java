package io;

import java.io.File;

import static java.io.File.separator;

public class FileSizeSummary {
    public static void main(String[] args) {
        FileSizeSummary sample = new FileSizeSummary();
        String path = "D:" + separator + "godOfJava";
        long sum = sample.printFileSize(path);
        System.out.println(path + " ' s total size = " + sum);
    }

    private String convertFileLength(long fileLength){
        if(0<fileLength && fileLength<1024){
           return (fileLength+"b");
        }else if((1024+1)<fileLength && fileLength<(1024 * 1024)){
            return (1.0 * fileLength/1024)+"kb";
        }else if((1024*1024+1)<fileLength && fileLength<(1024 * 1024* 1024)){
            return (fileLength / (1024 * 1024)) + "kb";
        }else{
           return "귀찮아..";
        }
    }

    public long printFileSize(String path) {
        File sample = new File(path);
        long result = 0L;
        if (sample.isDirectory()) {
            File[] files = sample.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    String tempFileName = file.getAbsolutePath();
                    long fileLength = file.length();
                    System.out.println(tempFileName + "" + convertFileLength(fileLength));
                    result += fileLength;
                }else{
                    String tempDirname = file.getAbsolutePath();
                    long fileLength = printFileSize(tempDirname);
                    System.out.println(tempDirname + "" + convertFileLength(fileLength));
                    result += fileLength;
                }
            }

        }
        return result;
    }
}
