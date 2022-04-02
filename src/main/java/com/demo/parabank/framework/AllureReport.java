package com.demo.parabank.framework;

import io.qameta.allure.Allure;
import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;

import static com.codeborne.selenide.Screenshots.takeScreenShotAsFile;
import static org.apache.commons.io.FileUtils.readFileToByteArray;

@Slf4j
public class AllureReport {

    public static void attachScreenshot(String screenshotTitle) {
        try {
            Allure.addAttachment(screenshotTitle,
                    new ByteArrayInputStream(readFileToByteArray(Objects.requireNonNull(takeScreenShotAsFile()))));
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    public static void attachComparisonScreenAndDiffNumber(BufferedImage image, int diffNumber) {
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            ImageIO.write(image, "png", os);
            Allure.addAttachment("Differences image", new ByteArrayInputStream(os.toByteArray()));
            Allure.addAttachment("Differences number", String.valueOf(diffNumber));
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    public static void attachText(String attachmentTile, String text) {
        Allure.addAttachment(attachmentTile, text);
    }
}
