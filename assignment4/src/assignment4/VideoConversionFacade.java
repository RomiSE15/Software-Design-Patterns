package assignment4;

public class VideoConversionFacade {
    public String convertVideo(String fileName, String format) {
        if (fileName == null || fileName.isBlank() || format == null || format.isBlank()) {
            throw new VideoConversionException("File name and format must not be null or blank");
        }

        VideoFile file = new VideoFile(fileName);
        String sourceCodec = CodecFactory.extractCodec(file);
        String buffer = BitrateReader.read(file, sourceCodec);
        String converted = BitrateReader.convert(buffer, format);
        AudioMixer mixer = new AudioMixer();
        String result = mixer.fixAudio(converted);

        return "output_" + fileName.replaceFirst("\\..+$", "") + "." + format + " (" + result + ")";
    }
}