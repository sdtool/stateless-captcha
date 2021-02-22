# Stateless Captcha for Java

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.sdtool/stateless-captcha/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.sdtool/stateless-captcha)

Simple standalone stateless captcha library for Java 8 (and above). Stateless verification implementation for custom usage (such as
spring boot stateless microservice mode).

Based on http://simplecaptcha.sourceforge.net/ version 1.2.1

## Usage

### Build captcha

```java
Captcha captcha=new Captcha.Builder(200, 50)
        .addText()
        .addNoise()
        .addBackground()
        .build();
```

### Build Token and Verify

```java
TokenProperties props = new TokenProperties("sd", 300)

// Create token (creator side, can be in any microservice/application)
Creator creator = new Creator(props);
// build token with captcha from earlier stage
CaptchaToken token = creator.create(captcha);

// verify token (verifier side, can be in any other microservice/application)
CaptchaVerificationToken verification=<user side data>
Verifier verifier = Verifier(props);
// verify token. If invalid VerificationException is thrown
verifier.verify(verification);
```