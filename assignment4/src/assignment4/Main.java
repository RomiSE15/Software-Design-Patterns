package assignment4;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        String result = converter.convertVideo("funny_cat.ogg", "mp4");
        System.out.println("Client received: " + result);
    }
}