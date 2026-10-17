package assignment4;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();

        String result = converter.convertVideo("scary_monster.ogg", "mp4");
        System.out.println("Client received: " + result);

        try {
            converter.convertVideo(null, "mp4");
        } catch (VideoConversionException e) {
            System.out.println("Handled expected error: " + e.getMessage());
        }
    }
}