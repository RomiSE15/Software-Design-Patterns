package assignment6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileSystemVisitorTest {

    @Test
    public void testSizeCalculatorVisitor() {
        DirectoryElement root = new DirectoryElement("root");
        root.addElement(new FileElement("a.txt", 100));
        root.addElement(new FileElement("b.txt", 200));

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);

        assertEquals(300, sizeVisitor.getTotalSize());
    }

    @Test
    public void testSearchVisitor() {
        DirectoryElement root = new DirectoryElement("root");
        root.addElement(new FileElement("photo.png", 500));
        root.addElement(new FileElement("notes.txt", 20));

        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);

        assertEquals(1, searchVisitor.getFoundFiles().size());
        assertTrue(searchVisitor.getFoundFiles().contains("notes.txt"));
    }
}