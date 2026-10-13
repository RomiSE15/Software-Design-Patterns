package assignment4;

public class BitrateReader {
    public static String read(VideoFile file, String codec) {
        System.out.println("BitrateReader: Reading stream with codec " + codec);
        return "buffer[" + file.getName() + "]";
    }

    public static String convert(String buffer, String targetFormat) {
        System.out.println("BitrateReader: Converting buffer to format " + targetFormat);
        return buffer + " -> " + targetFormat;
    }
}