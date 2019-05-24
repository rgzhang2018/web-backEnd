package team.ustc.sse.blockly.util;

import javax.servlet.http.HttpServletRequest;

/**
 * description:
 * author: rgzhang
 * create time: 2019-04-13
 **/


public final class NetworkUtil {


        public final static String getIpAddress(HttpServletRequest request) {
            // 获取请求主机IP地址,如果通过代理进来，则透过防火墙获取真实IP地址

            String ip = request.getHeader("X-Forwarded-For");
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  //X-Forwarded-For获得的ip为空，考虑其他情况
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                    ip = request.getHeader("Proxy-Client-IP");
                }
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                    ip = request.getHeader("WL-Proxy-Client-IP");
                }
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                    ip = request.getHeader("HTTP_CLIENT_IP");
                }
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                    ip = request.getHeader("HTTP_X_FORWARDED_FOR");
                }
                if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                    ip = request.getRemoteAddr();   //这个就是直接获取ip，如果前面那些代理途径都为空，这个获取到的就是ip地址
                }
            } else if (ip.length() > 15) {  //通过X-Forwarded-For获得了多个ip，那么第一个非unknown就是IP
                String[] ips = ip.split(",");
                for (int index = 0; index < ips.length; index++) {
                    String strIp = (String) ips[index];
                    if (!("unknown".equalsIgnoreCase(strIp))) {
                        ip = strIp;
                        break;
                    }
                }
            }
            return ip;
        }
    }