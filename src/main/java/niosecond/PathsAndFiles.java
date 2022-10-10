package niosecond;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndFiles {
    public static void main(String[] args) {
        PathsAndFiles sample = new PathsAndFiles();
        String dir = "C:\\godofjava\\nio\\nio2";
//        sample.checkPath(dir);
        String dir2 = "C:\\WINDOWS";
        sample.checkPath2(dir,dir2);
    }

    public void checkPath(String dir) {
        Path path = Paths.get(dir);
        System.out.println(path.toString());
        System.out.println("path.getFileName() = " + path.getFileName());
        System.out.println("path.getNameCount() = " + path.getNameCount());
        System.out.println("path.getParent() = " + path.getParent());
        System.out.println("path.getRoot() = " + path.getRoot());
    }

    public void checkPath2(String dir1,String dir2) {
        Path path = Paths.get(dir1);
        Path path2 = Paths.get(dir2);
        Path relativized = path.relativize(path2);
        System.out.println("relativized = " + relativized);
        Path absolute = relativized.toAbsolutePath();
        System.out.println("absolute = " + absolute);
        Path normalize = absolute.normalize();
        System.out.println("normalize = " + normalize);
        Path resolved = path.resolve("godofjava");
        System.out.println("resolved = " + resolved);
    }
}
