package com.cdp.common.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xiaohu on 2017/1/6.
 */
public final class PubFunction {

    //SHA-1
    public static String getSha1(String str){
        if(str == null || str.length() == 0){
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for(int i =0;i<j;i++){
                byte byteO = md[i];
                buf[k++] = hexDigits[byteO >>> 4 & 0xf];
                buf[k++] = hexDigits[byteO & 0xf];
            }
            return new String(buf);
        } catch (NoSuchAlgorithmException e) {
            return null;
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    //SHA-1 160为算法
    public static String getSHA(String spara) {
        String sRtn = null;
        try {
            byte[] plainText = spara.getBytes("UTF8");

            // 使用getInstance("算法")来获得消息摘要,这里使用SHA-1的160位算法
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            // 开始使用算法
            messageDigest.update(plainText);
            // 输出算法运算结果
            sRtn = new BASE64Encoder().encode(messageDigest.digest());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sRtn;
    }

    //DES加密

    public static String enPass(String password){

        try {
            SecretKey key = readKey();

            Cipher cip = Cipher.getInstance("DES");
            cip.init(Cipher.ENCRYPT_MODE, key);
            byte[] cipBytes = cip.doFinal(password.getBytes());
            String sblob = new BASE64Encoder().encode(cipBytes);

            return sblob;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //DES解密
    public static String dePass(String password){

        try {

            byte[] keyBuffer = new BASE64Decoder().decodeBuffer(password);

            SecretKey key = readKey();

            Cipher cip = Cipher.getInstance("DES");
            cip.init(Cipher.DECRYPT_MODE, key);

            String stmp =  new String(cip.doFinal(keyBuffer),"UTF8");

            return stmp;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static SecretKey readKey(){

        try {
            String skey = "chen_xiao_hu_2017";
            byte[] bs = skey.getBytes("UTF8");

            //创建DESKeySpec对象
            DESKeySpec dks = new DESKeySpec(bs);

            //转换DESKeySpec为SecretKey对象
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyFactory.generateSecret(dks);

            return key;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println(getSha1("Init1234"));
    }
}
