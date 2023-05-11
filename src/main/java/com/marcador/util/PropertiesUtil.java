package com.marcador.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesUtil {

    public static final String properties = "config.properties";

    public static Properties getProperties() throws Exception {
        FileInputStream fileProp = new FileInputStream(properties);
        Properties props = new Properties();
        props.load(fileProp);

        return props;
    }

    public static File getFile() throws Exception {
        String caminho = getCaminho() + File.separator + getFileName() + ".txt";
        File file = new File(caminho);
        return file;
    }

    public static boolean existeConfig() throws Exception {
        return !(getCaminho().equals("") || getFileName().equals("") || getPIS().equals(""));
    }

    public static String getCaminho() {
        return getFull("CAMINHO");
    }

    public static String getFileName() {
        return getFull("MES");
    }

    public static String getPIS() {
        return getFull("PIS");
    }

    public static void setCaminho(String value) {
        setFull("CAMINHO", value);
    }

    public static void setFileName(String value) {
        setFull("MES", value);
    }

    public static  void setPIS(String value) {
        setFull("PIS", value);
    }
    
    public static String getAtualizacao() {
        return getFull("ATUALIZACAO");
    }

    public static void setAtualizacao(String value) {
        setFull("ATUALIZACAO", value);
    }
    
    

    private static String getFull(String key) {
       try {
            return getProperties().getProperty(key);
        } catch (Exception ex) {
            Logger.getLogger(PropertiesUtil.class.getName()).log(Level.SEVERE, null, ex);
            return "ERROR";
        }
       
    }

    private static void setFull(String key, String value) {
        try {
            Properties props = getProperties();
            try (FileOutputStream fileProp = new FileOutputStream(properties)) {
                props.setProperty(key, value);
                props.store(fileProp, null);
            }
        } catch (Exception ex) {
            Logger.getLogger(PropertiesUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
