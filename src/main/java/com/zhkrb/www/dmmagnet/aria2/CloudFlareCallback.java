package com.zhkrb.www.dmmagnet.aria2;
import java.net.HttpCookie;
import java.util.List;


interface CloudFlareCallback {
    void onSuccess(List<HttpCookie> cookieList);
    void onFail();
}