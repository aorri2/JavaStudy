package io;

import java.io.File;
import java.io.FileFilter;

public class TXTFileFilter implements FileFilter {
    @Override
    public boolean accept(File file) {
        if (file.isFile()) {
            String fileName = file.getName();
            if (fileName.endsWith(".txt")) return true;

        }
        return false;
    }
}
