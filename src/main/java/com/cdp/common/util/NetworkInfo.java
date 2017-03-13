package com.cdp.common.util;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Created by xiaohu on 2017/3/13.
 */
public final class NetworkInfo {

    public final static ArrayList<String> getMacAddress() throws Exception{

        ArrayList<String> netList = new ArrayList<String>();

        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();

        for (NetworkInterface netint : Collections.list(nets))
        {
            byte[] macinfo = netint.getHardwareAddress();
            if((macinfo != null) && (macinfo.length == 6))
            {
                String sall = "";
                for (int i = 0; i < macinfo.length; i++)
                {
                    Byte bbb = new Byte(macinfo[i]);
                    int imac = bbb.intValue();
                    String smac = '0' + Integer.toHexString(imac).toUpperCase();
                    smac = smac.substring(smac.length()-2);
                    sall = sall + smac + "-";
                }
                sall = sall.substring(0, sall.length()-1);
                netList.add(sall);
            }
        }

        return netList;
    }
}
