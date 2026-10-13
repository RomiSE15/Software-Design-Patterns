package assignment4;

public class VideoFile {
    private final String name;
    private final String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.endsWith(".mp4") ? "mp4" : "ogg";
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}