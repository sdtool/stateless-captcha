# stateless-captcha for java

Simple standalone stateless captcha library for Java 8. Stateless verification implementation for custom usage (such as spring
boot stateless microservice mode).

Based on http://simplecaptcha.sourceforge.net/ version 1.2.1

## Usage

### Build captcha

```java
Captcha captcha=new Captcha.Builder(200,50)
        .addText()
        .addNoise()
        .addNoise()
        .addNoise()
        .addBackground()
        .build();
```

### Build Token and Verify

```java
CaptchaTokenManager manager=new CaptchaTokenManager("sd",300);

// build token with captcha from earlier stage
        manager.build(captcha);

// verify token
        CaptchaTokenVerification verification=<user side data>
        manager.verify(verification);
```