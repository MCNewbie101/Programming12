package Database;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;

public class DirectoryDump {
    private File dir;
    private ArrayList<File> files;

    public DirectoryDump(String dirName) {
        dir = new File(dirName);
    }

    public void dump() {
        try {
            files = (ArrayList<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
        } catch (UncheckedIOException e) {
            System.out.println(e.getCause());
        }
    }

    public ArrayList<File> getFiles() {
        return files;
    }
}
