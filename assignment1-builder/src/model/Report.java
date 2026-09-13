package model;

public class Report {
    private final String title;
    private final String content;
    private final String format;

    public Report(String title, String content, String format) {
        this.title = title;
        this.content = content;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getFormat() {
        return format;
    }

    public void display() {
        System.out.println("[" + format + " REPORT] " + title);
        System.out.println(content);
        System.out.println();
    }
}