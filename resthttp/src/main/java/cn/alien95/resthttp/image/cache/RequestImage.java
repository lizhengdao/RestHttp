package cn.alien95.resthttp.image.cache;

import cn.alien95.resthttp.image.callback.ImageCallback;

public class RequestImage {

    public int inSimpleSize;
    public int reqWidth;
    public int reqHeight;
    public boolean isControlWidthAndHeight = false;
    public String url;
    public ImageCallback callback;

    public RequestImage(String url, ImageCallback callback) {
        this.url = url;
        this.callback = callback;
    }

    public RequestImage(String url, int inSimpleSize, ImageCallback callback) {
        this.url = url;
        this.inSimpleSize = inSimpleSize;
        this.callback = callback;
    }

    public RequestImage(String url, int reqWidth, int reqHeight, ImageCallback callback) {
        this.url = url;
        this.reqWidth = reqWidth;
        this.reqHeight = reqHeight;
        this.callback = callback;
        isControlWidthAndHeight = true;
    }
}