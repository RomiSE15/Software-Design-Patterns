package assignment6;

public class Main {
    public static void main(String[] args) {
        DirectoryElement root = new DirectoryElement("root");
        DirectoryElement src = new DirectoryElement("src");

        root.addElement(new FileElement("README.md", 10));
        src.addElement(new FileElement("Main.java", 25));
        src.addElement(new FileElement("App.java", 15));
        root.addElement(src);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total file system size: " + sizeVisitor.getTotalSize() + " KB");

        SearchVisitor searchVisitor = new SearchVisitor(".java");
        root.accept(searchVisitor);
        System.out.println("Found .java files: " + searchVisitor.getFoundFiles());
    }
}