package com.github.sdtool.statelesscaptcha.gimpy;

import java.awt.image.BufferedImage;

/**
 * @author <a href="mailto:james.childers@gmail.com">James Childers</a>
 */

public interface GimpyRenderer {
    void gimp(BufferedImage image);
}
