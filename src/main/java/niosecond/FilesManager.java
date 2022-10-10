package niosecond;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesManager {
    public List<String> getContents() {
        List<String> contents = new ArrayList<String>();
        contents.add("이 책은 김상민 저자의 6번째 책입니다.");
        contents.add("저자의 다른 책으로는 자바 성능 튜닝이야기가 있습니다.");
        contents.add("많은 분들에게 도움이 되길..");
        contents.add("책에 대한 질문은 하지마세욤");
        contents.add("Current Date = " + new Date());
        return contents;
    }

    public Path writeFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        List<String> contents = getContents();
        StandardOpenOption openOption = StandardOpenOption.CREATE;
        return Files.write(path, contents, charset, openOption);
    }

    public void readFile(Path path) throws Exception {
        Charset charset = Charset.forName("EUC-KR");
        System.out.println("Path = " + path);
        List<String> fileContents = Files.readAllLines(path, charset);
        for (String fileContent : fileContents) {
            System.out.println(fileContent);
        }
        System.out.println();
    }

    public Path writeAndRead(String fileName) {
        Path returnPath = null;
        try {
            Path path = Paths.get(fileName);
            returnPath = writeFile(path);
            System.out.println("**** Created file contents ****");
            readFile(returnPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnPath;
    }

    public void copyMoveDelete(Path fromPath, String fileName) {
        try{
            Path toPath = fromPath.toAbsolutePath().getParent();

            Path copyPath = toPath.resolve("copied");
            if (!Files.exists(copyPath)) {
                Files.createDirectories(copyPath);
            }
            Path copiedFilePath = copyPath.resolve(fileName);
            StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
            Files.copy(fromPath, copiedFilePath, copyOption);

            System.out.println("***** Copied file contents *****");
            readFile(copiedFilePath);

            Path movedFilePath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"), copyOption);

            Files.delete(movedFilePath);
            Files.delete(copyPath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FilesManager sample = new FilesManager();
        String fileName = "AboutThisBook.txt";
        Path fromPath = sample.writeAndRead(fileName);
        sample.copyMoveDelete(fromPath,fileName);
    }
}
