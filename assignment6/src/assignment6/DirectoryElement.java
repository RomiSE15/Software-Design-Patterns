package assignment6;

import java.util.ArrayList;
import java.util.List;

public class DirectoryElement implements FileSystemElement {
    private final String name;
    private final List<FileSystemElement> children = new ArrayList<>();

    public DirectoryElement(String name) {
        this.name = name;
    }

    public void addElement(FileSystemElement element) {
        children.add(element);
    }

    public String getName() { return name; }
    public List<FileSystemElement> getChildren() { return children; }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visitDirectory(this);
        for (FileSystemElement child : children) {
            child.accept(visitor);
        }
    }
}