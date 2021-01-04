package com.github.sdtool.statelesscaptcha.audio.producer;

import com.github.sdtool.statelesscaptcha.audio.Sample;

/**
 * Generates a vocalization for a single character.
 *
 * @author <a href="mailto:james.childers@gmail.com">James Childers</a>
 */
public interface VoiceProducer {
    Sample getVocalization(char letter);
}
