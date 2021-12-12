package com.naichuan.strategy.challenge;

import java.util.Scanner;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class PhotoWithPhone {
    public static void main(String[] args) {
        PhoneCameraApp cameraApp = new BasicCameraApp();
        String share = getSharing();
        switch (share) {
            case "t": cameraApp.setShareStrategy(new Txt()); break;
            case "e": cameraApp.setShareStrategy(new Email()); break;
            case "s": cameraApp.setShareStrategy(new Social()); break;
            default: cameraApp.setShareStrategy(new Txt()); break;
        }
    }

    private static String getSharing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social media (s)?");
        String appName = scanner.next();
        scanner.close();
        return appName;
    }
}
