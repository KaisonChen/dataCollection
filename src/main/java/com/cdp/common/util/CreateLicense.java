package com.cdp.common.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.DESedeKeySpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

/**
 * Created by xiaohu on 2017/3/14.
 */
public class CreateLicense {

    public static void main(String args[]){

//        System.out.println(enpass("cdpgroupltd,shanghai,abcdefg1q2w3e43r@2019-12-31"));

        //System.out.println(dePass("r/Ef0PsQVtnwdYoyTNoj+FmQi7XhmsPMGbo1Nd2snwCAD4i8MWzh7dgH0yRJAhEeb2cvVGdeA00="));

//        try {
//            System.out.println(NetworkInfo.getMacAddress());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println(new License().checkLicense());

    }

    //加密密码
    public final static String enpass(String password){

        try {
            SecretKey key = readKey("4C-32-75-8A-D3-0B");
            Cipher cip = Cipher.getInstance("DESede");
            cip.init(Cipher.ENCRYPT_MODE, key);
            byte[] cipBytes = cip.doFinal(password.getBytes());

            String sblob = new BASE64Encoder().encode(cipBytes);

            return sblob;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }

        return "";
    }


    //解密密码
    public final static String dePass(String password){

        try {
            byte[] keyBuffer = new BASE64Decoder().decodeBuffer(password);
            SecretKey key = readKey("4C-32-75-8A-D3-0B");
            Cipher cip = Cipher.getInstance("DESede");
            cip.init(Cipher.DECRYPT_MODE, key);

            String stmp = new String(cip.update(keyBuffer));

            stmp = stmp + new String(cip.doFinal());

            return  stmp;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }

        return "";
    }


    private  final static SecretKey readKey(String keystr){

        try {
            String skey = String.format("%s_%s_%s","chen",keystr,"xiaohu");
            byte[] bs = skey.getBytes("UTF-8");
            String sblob = new BASE64Encoder().encode(bs);
            KeySpec pbe = new DESedeKeySpec(sblob.getBytes());
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DESede");

            SecretKey key = skf.generateSecret(pbe);

            return key;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }

        return null;
    }
}
