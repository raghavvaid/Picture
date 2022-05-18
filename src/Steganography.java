import java.awt.*;

public class Steganography {


    public static Picture revealPicture(Picture hidden){
        Picture copy = new Picture(hidden);
        Pixel[][] pixels = copy.getPixels2D();
        for (int r = 0; r < pixels.length; r++){
            for (int c = 0; c < pixels[0].length; c++){
                Color col = pixels[r][c].getColor();
            }
        }
        return copy;
    }

    public static void clearLow (Pixel P){
        P.setRed();
        Color.getColor()
    }

}
