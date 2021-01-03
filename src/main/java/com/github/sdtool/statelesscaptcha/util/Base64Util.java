package com.github.sdtool.statelesscaptcha.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Utility to convert to base64
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class Base64Util {

    private static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    /**
     * Convert BufferedImage to Base64 image
     *
     * @param image  BufferedImage to convert
     * @param format image format. eg. "png"
     * @return the encoded image string
     * @throws IOException if exception converting image
     */
    public static String encodeBufferedImageToString(BufferedImage image, String format) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, format, outputStream);
        return encodeToString(outputStream.toByteArray());
    }

    /**
     * Base64-encode the given byte array to a String.
     *
     * @param src the original byte array
     * @return the encoded byte array as a UTF-8 String
     */
    public static String encodeToString(byte[] src) {
        if (src.length == 0) {
            return "";
        }
        return new String(encode(src), DEFAULT_CHARSET);
    }

    /**
     * Base64-encode the given byte array.
     *
     * @param src the original byte array
     * @return the encoded byte array
     */
    public static byte[] encode(byte[] src) {
        if (src.length == 0) {
            return src;
        }
        return Base64.getEncoder().encode(src);
    }

}
