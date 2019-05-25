package team.ustc.sse.blockly.util;

import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * description:
 * author: rgzhang
 * create time: 2019-04-17
 **/
public class HttpUtil {


    // 字符串读取
    public static String ReadHttpServletRequestAsChars(HttpServletRequest request)
    {
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder("");
        try
        {
            br = request.getReader();
            String str;
            while ((str = br.readLine()) != null)
            {
                sb.append(str);
            }
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != br)
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    // 二进制读取
    public static byte[] ReadHttpServletRequestAsBytes(HttpServletRequest request)
    {

        int len = request.getContentLength();
        byte[] buffer = new byte[len];
        ServletInputStream in = null;

        try
        {
            in = request.getInputStream();
            in.read(buffer, 0, len);
            in.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (null != in)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return buffer;
    }


    //显示当前session和cookie的保存状态
    private void testCookieAndSession(HttpServletRequest request){
//        System.out.println("session:======>" + session.getAttribute("loginFlag"));
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie :cookies){
            if(cookie.getName().equals("testMYService")){
                System.out.println("cookie:======>"+cookie.getName() +" | "+ cookie.getValue());
            }
        }
    }

    //从session或者cookie中获取登录用户，先放到这里了，后面再做切面
    private void getMessgeFromSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        //检测session和cookie
        if(session.getAttribute("loginFlag")!=null &&  session.getAttribute("loginFlag").equals(true)){
//            System.out.println("in session , then reset session" );
            session.setAttribute("loginFlag",false);
        }

        for(Cookie cookie :cookies){
            if(cookie.getName().equals("loginAccount")){
//                System.out.println("in cookie , then reset cookie" );
            }
        }
    }
}
