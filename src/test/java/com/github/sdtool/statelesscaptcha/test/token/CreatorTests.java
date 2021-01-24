/*
 * Copyright 2021 Subhajit Das
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.sdtool.statelesscaptcha.test.token;

import com.github.sdtool.statelesscaptcha.core.audio.AudioCaptcha;
import com.github.sdtool.statelesscaptcha.core.text.Captcha;
import com.github.sdtool.statelesscaptcha.token.Creator;
import org.junit.jupiter.api.Test;

public class CreatorTests {

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

}
