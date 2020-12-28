package captcha.util;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

/**
 * Image Util
 * Filters image with given bufferedImageOp
 *
 * @author Subhajit Das
 */
public class ImageUtil {
    public static void applyFilter(BufferedImage img, BufferedImageOp filter) {
        BufferedImage newImage = filter.filter(img, null);
        img.setData(newImage.getRaster());
    }
}
