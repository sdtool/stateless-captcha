package com.github.sdtool.statelesscaptcha.audio.noise;

import com.github.sdtool.statelesscaptcha.audio.Sample;

import java.util.List;

public interface NoiseProducer {
    Sample addNoise(List<Sample> target);
}
