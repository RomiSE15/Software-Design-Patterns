package assignment6;

public class FileElement implements FileSystemElement {
    private final String name;
    private final int size; // размер в КБ

    public FileElement(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() { return name; }
    public int getSize() { return size; }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitFile(this);
    }
}