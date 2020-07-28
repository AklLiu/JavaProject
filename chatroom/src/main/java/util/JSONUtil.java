package util;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class JSONUtil {
    public static String readBody(HttpServletRequest req) throws UnsupportedEncodingException {
        //ContentLength()是请求body的长度。单位是字节。
        int contentLength = req.getContentLength();
        //buffer来保存读到的body内容.
        byte[] buffer = new byte[contentLength];
        try (InputStream inputStream = req.getInputStream()) {
            inputStream.read(buffer, 0, contentLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer,0,contentLength,"UTF-8");
    }
}