package assignment4;

public class VideoConversionFacade {
    public String convertVideo(String fileName, String format) {
        System.out.println("Facade: Starting video conversion pipeline...");
        VideoFile file = new VideoFile(fileName);
        String sourceCodec = CodecFactory.extractCodec(file);
        String buffer = BitrateReader.read(file, sourceCodec);
        String converted = BitrateReader.convert(buffer, format);
        AudioMixer mixer = new AudioMixer();
        String result = mixer.fixAudio(converted);
        System.out.println("Facade: Conversion finished.");
        return "output_" + fileName.replaceFirst("\\..+$", "") + "." + format + " (" + result + ")";
    }
}