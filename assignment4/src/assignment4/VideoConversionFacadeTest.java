package assignment4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VideoConversionFacadeTest {

    @Test
    public void testSuccessfulVideoConversion() {
        VideoConversionFacade converter = new VideoConversionFacade();

        String result = converter.convertVideo("funny_cat.ogg", "mp4");

        assertNotNull(result);
        assertTrue(result.contains(".mp4"));
    }

    @Test
    public void testNullInputThrowsException() {
        VideoConversionFacade converter = new VideoConversionFacade();
        assertThrows(VideoConversionException.class, () -> converter.convertVideo(null, "mp4"));
    }
}