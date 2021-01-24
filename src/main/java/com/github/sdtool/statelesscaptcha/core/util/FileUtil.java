package com.github.sdtool.statelesscaptcha.core.util;

import com.github.sdtool.statelesscaptcha.core.audio.Sample;

import java.io.*;

/**
 * File handling utility
 *
 * @author <a href="mailto:subhajitdas298@gmail.com">Subhajit Das</a>
 */
public class FileUtil {

    /**
     * Get a file resource and return it as an InputStream. Intended primarily
     * to read in binary files which are contained in a jar.
     *
     * @param filename the file to read
     * @return An @{link InputStream} to the file
     */
    public static InputStream readResource(String filename) {
        InputStream inputStream = FileUtil.class.getResourceAsStream(filename);
        if (inputStream == null) {
            throw new RuntimeException(new FileNotFoundException("File '"
                    + filename + "' not found."));
        }

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        byte[] data = new byte[16384];
        int nRead;

        try {
            while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, nRead);
            }
            buffer.flush();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ByteArrayInputStream(buffer.toByteArray());
    }

    /**
     * Reads a file in to audio sample
     *
     * @param filename the file to read
     * @return the audio sample
     */
    public static Sample readSample(String filename) {
        InputStream is = readResource(filename);
        return new Sample(is);
    }

}
