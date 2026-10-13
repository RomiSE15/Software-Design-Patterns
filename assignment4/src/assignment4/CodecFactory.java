package assignment4;

public class CodecFactory {
    public static String extractCodec(VideoFile file) {
        System.out.println("CodecFactory: Extracting codec from " + file.getName());
        return file.getCodecType();
    }
}