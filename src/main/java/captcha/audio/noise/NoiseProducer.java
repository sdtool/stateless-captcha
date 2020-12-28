package captcha.audio.noise;

import captcha.audio.Sample;

import java.util.List;

public interface NoiseProducer {
    Sample addNoise(List<Sample> target);
}
