import com.github.sdtool.statelesscaptcha.core.audio.AudioCaptcha;
import com.github.sdtool.statelesscaptcha.core.text.Captcha;
import com.github.sdtool.statelesscaptcha.exception.VerificationException;
import com.github.sdtool.statelesscaptcha.token.CaptchaToken;
import com.github.sdtool.statelesscaptcha.token.CaptchaVerificationToken;
import com.github.sdtool.statelesscaptcha.token.Creator;
import com.github.sdtool.statelesscaptcha.token.Verifier;
import com.github.sdtool.statelesscaptcha.util.Base64Util;
import org.junit.jupiter.api.Assertions;
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
        Base64Util.encodeAudio(captcha.getChallenge().getAudioInputStream(),
                AudioFileFormat.Type.WAVE);
    }

    @Test
    public void testCaptchaTokenCreation() {
        Captcha captcha = new Captcha.Builder(200, 100)
                .addText()
                .addNoise()
                .addBorder()
                .build();
        new Creator().create(captcha);
    }

    @Test
    public void testAudioCaptchaTokenCreation() {
        AudioCaptcha captcha = new AudioCaptcha.Builder()
                .addAnswer()
                .addNoise()
                .addVoice()
                .build();
        new Creator().create(captcha);
    }

    @Test
    public void testAudioTokenValidation() {
        String ANSWER = "12345";
        AudioCaptcha captcha = new AudioCaptcha.Builder()
                .addAnswer(() -> ANSWER)
                .addNoise()
                .addVoice()
                .build();
        CaptchaToken token = new Creator().create(captcha);
        new Verifier().verifyToken(new CaptchaVerificationToken(token.getToken(), ANSWER));
    }

    @Test
    public void testAudioTokenValidationFail() {
        String ANSWER = "12345";
        AudioCaptcha captcha = new AudioCaptcha.Builder()
                .addAnswer(() -> ANSWER)
                .addNoise()
                .addVoice()
                .build();
        CaptchaToken token = new Creator().create(captcha);
        Assertions.assertThrows(VerificationException.class,
                () -> new Verifier().verifyToken(new CaptchaVerificationToken(token.getToken(), ANSWER + "2")));
    }

}
