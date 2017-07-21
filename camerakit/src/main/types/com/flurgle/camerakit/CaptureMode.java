package com.flurgle.camerakit;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.flurgle.camerakit.CameraKit.Constants.PICTURE_MODE;
import static com.flurgle.camerakit.CameraKit.Constants.VIDEO_MODE;

/**
 * Created by bajicdusko on 21/07/2017.
 */

@IntDef({PICTURE_MODE, VIDEO_MODE})
@Retention(RetentionPolicy.SOURCE)
public @interface CaptureMode {
}
