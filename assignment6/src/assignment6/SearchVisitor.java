package assignment6;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private final String query;
    private final List<String> foundFiles = new ArrayList<>();

    public SearchVisitor(String query) {
        this.query = query;
    }

    @Override
    public void visitFile(FileElement file) {
        if (file.getName().contains(query)) {
            foundFiles.add(file.getName());
        }
    }

    @Override
    public void visitDirectory(DirectoryElement directory) {
    }

    public List<String> getFoundFiles() {
        return foundFiles;
    }
}