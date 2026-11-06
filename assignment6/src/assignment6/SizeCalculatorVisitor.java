package assignment6;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visitFile(FileElement file) {
        totalSize += file.getSize();
    }

    @Override
    public void visitDirectory(DirectoryElement directory) {
    }

    public int getTotalSize() {
        return totalSize;
    }
}