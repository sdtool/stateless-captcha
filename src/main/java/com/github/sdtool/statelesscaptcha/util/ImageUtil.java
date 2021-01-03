package com.github.sdtool.statelesscaptcha.util;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

/**
 * Image Util
 * Filters image with given bufferedImageOp
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class ImageUtil {
    public static void applyFilter(BufferedImage img, BufferedImageOp filter) {
        BufferedImage newImage = filter.filter(img, null);
        img.setData(newImage.getRaster());
    }
}
