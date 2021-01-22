import com.github.sdtool.statelesscaptcha.Captcha;
import com.github.sdtool.statelesscaptcha.CaptchaTokenManager;
import com.github.sdtool.statelesscaptcha.audio.AudioCaptcha;
import com.github.sdtool.statelesscaptcha.util.Base64Util;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.AudioFileFormat;
import java.io.IOException;

public class AudioConversionTest {

    @Test
    public void testAudioConversion() throws IOException {
        AudioCaptcha captcha = new AudioCaptcha.Builder()
                .addAnswer(() -> "123")
                .addNoise()
                .addVoice()
                .build();
        Base64Util.encodeAudioInputStreamToString(captcha.getChallenge().getAudioInputStream(),
                AudioFileFormat.Type.WAVE);
    }

    @Test
    public void testCaptchaTokenCreation() {
        Captcha captcha = new Captcha.Builder(200, 100)
                .addText()
                .addNoise()
                .addBorder()
                .build();
        new CaptchaTokenManager().buildToken(captcha);
    }

    @Test
    public void testAudioCaptchaTokenCreation() {
        AudioCaptcha captcha = new AudioCaptcha.Builder()
                .addAnswer()
                .addNoise()
                .addVoice()
                .build();
        new CaptchaTokenManager().buildToken(captcha);
    }

}
