package team.ustc.sse.blockly.util;

import team.ustc.sse.blockly.entity.Admin;
import team.ustc.sse.blockly.entity.Studentlogin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-27
 **/
public class SessionUtil {

    //----------------------------------------------------------------------
    //学生信息相关


    //学生信息写入session
    public static void setStudentLogin(Studentlogin studentlogin, boolean remember, HttpServletRequest request){
        HttpSession session = request.getSession();
        //set session
        session.setAttribute("loginFlag",true);
        session.setAttribute("studentID",studentlogin.getStudentid());
        session.setAttribute("loginAccount",studentlogin.getStudentaccount());
        session.setAttribute("studentNickname",studentlogin.getNickname());
        System.out.println("======> set session in util");
    }
    public static boolean checkStudentLogin(HttpServletRequest request){
        HttpSession session = request.getSession();
        Boolean loginFlag = (Boolean) session.getAttribute("loginFlag");
        if(loginFlag == null)return false;
        return loginFlag;
    }

    public static String getStudentAccount(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (String) session.getAttribute("loginAccount");
    }

    public static String getStudentNickname(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (String) session.getAttribute("studentNickname");
    }

    public static Integer getStudentID(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (Integer) session.getAttribute("studentID");
    }

    //------------------------------------------------------------------------------
    //admin信息相关


    //把admin信息写入session
    public static void setAdminLogin(Admin admin, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("adminFlag",true);
        session.setAttribute("adminID",admin.getAdminid());
        session.setAttribute("adminAccount",admin.getAdminaccount());
        System.out.println("======> set admin session in util");
    }

    public static boolean checkAdminLogin(HttpServletRequest request){
        HttpSession session = request.getSession();
        Boolean loginFlag = (Boolean) session.getAttribute("loginFlag");
        if(loginFlag == null)return false;
        return loginFlag;
    }

    public static String getAdminAccout(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (String) session.getAttribute("adminAccount");
    }

    public static Integer getAdminID(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (Integer) session.getAttribute("adminID");
    }

    //------------------------------------------------------------
    //共有部分



    public static void cleanSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("loginFlag");
        session.removeAttribute("studentID");
        session.removeAttribute("studentNickname");
        session.removeAttribute("loginAccount");

        session.removeAttribute("adminFlag");
        session.removeAttribute("adminID");
//        session.removeAttribute("adminName");
        session.removeAttribute("adminAccount");

    }





    //从session或者cookie中获取登录用户，先放到这里了，后面再做切面
    public static void getMessgeFromSession(HttpServletRequest request){
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

    //显示当前session和cookie的保存状态
    public static void showCookieAndSession(HttpServletRequest request){
//        System.out.println("session:======>" + session.getAttribute("loginFlag"));
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie :cookies){
            if(cookie.getName().equals("testMYService")){
                System.out.println("cookie:======>"+cookie.getName() +" | "+ cookie.getValue());
            }
        }
    }

}
