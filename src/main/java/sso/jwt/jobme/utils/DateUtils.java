package sso.jwt.jobme.utils;

import com.google.common.base.Strings;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class DateUtils {
    public static boolean isGreaterBigDecimal(BigDecimal a, BigDecimal b) {
        if(a.compareTo(b) == 1) return true;
        return false;
    }

    public static boolean isLessBigDecimal(BigDecimal a, BigDecimal b) {
        if(a.compareTo(b) == -1) return true;
        return false;
    }

    public static BigDecimal convertBigDecimalNull(BigDecimal a){
        if(Objects.isNull(a)) return new BigDecimal("0");
        return a;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String getValueByTagName(String xml, String tagName, String root) throws ParserConfigurationException, SAXException, IOException {
        Document doc = parseXmlFromString(xml);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName(root);
        Element eElement = (Element) nodeList.item(0);
        NodeList nodeEle = eElement.getElementsByTagName(tagName);
        Node node = nodeEle.item(0);
        if(Objects.isNull(node)) return null;
        String tagValue = node.getTextContent();
        return tagValue;
    }

    public static Document parseXmlFromString(String xmlString) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputStream inputStream = new ByteArrayInputStream(xmlString.getBytes());
        org.w3c.dom.Document document = builder.parse(inputStream);
        return document;
    }

    public static void disableSslVerification() {
        try {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                @Override
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }

                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {
                }
            }
            };
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HostnameVerifier allHostsValid = (hostname, session) -> {
                return true;
            };
            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

    public static boolean isEqualBigDecimal(BigDecimal a, BigDecimal b) {
        if(a.compareTo(b) == 0) return true;
        return false;
    }

    public static BigDecimal phepNhanBigDecimal(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static BigDecimal phepChiaBigDecimal(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }

    public static BigDecimal phepCongBigDecimal(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public static BigDecimal phepTruBigDecimal(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public static boolean isDateValid(int year, int month, int day) {
        boolean dateIsValid = true;
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            dateIsValid = false;
        }
        return dateIsValid;
    }

    private static String replaceSeperator(String value) {
        if (value != null && !"".equals(value)) {
            value = value.replace("/", "");
        }
        return value;
    }

    public static Long replaceAllSeperator(String value, String seperator) {
        if (value != null && !"".equals(value)) {
            value = value.replace(seperator, "");
        }
        return Long.valueOf(value);
    }

    public static String replaceAllNumToStr(Long val, String seperator) {
        String value = val.toString();
        if (value != null && !"".equals(value)) {
            value = value.replace(seperator, "");
        }
        return value;
    }

    public static Long convertLocalMonthYearToServerDate(String monthYear) {
        if (monthYear == null || "".equals(monthYear)) {
            return null;
        }

        if (monthYear.contains("/")) {
            monthYear = monthYear.replace("/", "");
            if ("".equals(monthYear)) {
                return null;
            }
        }
        monthYear = replaceSeperator(monthYear);
        String month = "";
        String year = "";
        if (monthYear.length() == 6) {
            month = monthYear.substring(0, 2);
            year = monthYear.substring(2, 6);
        }
        String dateTemp = year + month;
        return Long.parseLong(dateTemp);
    }

    public static Long convertLocalDayMonthYearToServerDate(String dayMonthYear) {
        if (dayMonthYear == null || "".equals(dayMonthYear)) {
            return null;
        }

        if (dayMonthYear.contains("/")) {
            dayMonthYear = dayMonthYear.replace("/", "");
            if ("".equals(dayMonthYear)) {
                return null;
            }
        }
        dayMonthYear = replaceSeperator(dayMonthYear);
        String month = "";
        String year = "";
        String day = "";
        if (dayMonthYear.length() == 6) {
            month = dayMonthYear.substring(0, 2);
            year = dayMonthYear.substring(2, 6);
        }
        String dateTemp = year + month;
        return Long.parseLong(dateTemp);
    }

    public static String EncryptionFromBytes(String strToEncrypt) {
        try {
            //Create SecretKey object from common secret key string mentioned in constants class
            byte[] encoded = new BigInteger("728faf34b64cd55c8d1d500268026ffb", 16).toByteArray();
            SecretKey secretKey = new SecretKeySpec(encoded, "AES");

            //Cipher class object using AES as transformation
            Cipher cipher = Cipher.getInstance("AES");

            //Initialize cipher in Encrypt mode along with secret key object created above.
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            //Encrypt input byte array
            byte[] encryptedByte = cipher.doFinal(strToEncrypt.getBytes("UTF-8"));

            //return Encrypt input bytes as string
            return (new String(Base64.getEncoder().encode(encryptedByte)));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return empty string if any error
        return "";
    }

    public static String getCurrentDate() {
        return new SimpleDateFormat("dd/MM/YYYY").format(new Date());

    }

    public static String getCurrentDate(String format) {
        return new SimpleDateFormat(format).format(new Date());

    }

    public static String getCurrentDateAddMonths(String format, Integer months) {
        Date date = new Date();
        date = addMonths(date, months);
        return new SimpleDateFormat(format).format(date);
    }


    public static List<Map<String, Object>> funcTachNamOmDaiNgay(String tuNgay, String denNgay) {
        /*format tuNgay, denNgay: yyyyMMdd*/
        List<Map<String, Object>> listResult = new ArrayList<>();
        Map<String, Object> mapResult = new HashMap<>();
        Integer namTu = Integer.parseInt(tuNgay.substring(0, 4));
        Integer namDen = Integer.parseInt(denNgay.substring(0, 4));
        Integer namCl = namDen - namTu;
        Integer count = 0;
        try {
            DateFormat df = new SimpleDateFormat("yyyyMMdd");
            Date d_tuNgay = df.parse(tuNgay);
            Date d_denNgay = df.parse(denNgay);
            if (namCl == 0) {
                mapResult.put("tuNgay", tuNgay);
                mapResult.put("denNgay", denNgay);
                Long soNgay = (d_denNgay.getTime() - d_tuNgay.getTime()) / (3600 * 24 * 1000) + 1L;
                mapResult.put("soNgay", soNgay);
                listResult.add(mapResult);
            } else {
                mapResult = new HashMap<>();
                mapResult.put("tuNgay", tuNgay);
                mapResult.put("denNgay", namTu + "1231");
                Date d_denNgayTmp = df.parse(namTu + "1231");
                Long soNgay = (d_denNgayTmp.getTime() - d_tuNgay.getTime()) / (3600 * 24 * 1000) + 1L;
                mapResult.put("soNgay", soNgay);
                listResult.add(mapResult);

                while (count < namCl - 1) {
                    count++;
                    mapResult = new HashMap<>();
                    mapResult.put("tuNgay", namTu + count + "0101");
                    mapResult.put("denNgay", namTu + count + "1231");
                    Date d_denNgayTmp2 = df.parse(namTu + count + "1231");
                    Date d_tuNgayTmp2 = df.parse(namTu + count + "0101");
                    Long soNgay2 = (d_denNgayTmp2.getTime() - d_tuNgayTmp2.getTime()) / (3600 * 24 * 1000) + 1L;
                    mapResult.put("soNgay", soNgay2);
                    listResult.add(mapResult);
                }

                mapResult = new HashMap<>();
                mapResult.put("tuNgay", namDen + "0101");
                mapResult.put("denNgay", denNgay);
                Date d_tuNgayTmp = df.parse(namDen + "0101");
                Long soNgay2 = (d_denNgay.getTime() - d_tuNgayTmp.getTime()) / (3600 * 24 * 1000) + 1L;
                mapResult.put("soNgay", soNgay2);
                listResult.add(mapResult);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return listResult;
    }

    public static Long ConvertLocalDateToServerDate(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }

        if (str.contains("/")) {
            str = str.replace("/", "");
            if ("".equals(str)) {
                return null;
            }
        }
        str = replaceSeperator(str);
        if (str.length() == 1) {
            str = "0000000" + str;
        }
        if (str.length() == 2) {
            str = "000000" + str;
        }
        if (str.length() == 4) {
            str = "0000" + str;
        }
        if (str.length() == 6) {
            str = "00" + str;
        }

        String day = str.substring(0, 2);
        String month = str.substring(2, 4);
        String yeah = str.substring(4, 8);
        String dateTemp = yeah + month + day;
        return Long.parseLong(dateTemp);
    }

    public static Long ConvertLocalDateToServerDate(String str, boolean isMonth) {
        if (str == null || "".equals(str)) {
            return null;
        }

        if (str.contains("/")) {
            str = str.replace("/", "");
            if ("".equals(str)) {
                return null;
            }
        }
        str = replaceSeperator(str);
        if (str.length() == 4) {
            str = "0000" + str;
        }
        if (str.length() == 6) {
            str = "00" + str;
        }

        String day = str.substring(0, 2);
        String month = str.substring(2, 4);
        String yeah = str.substring(4, 8);
        String dateTemp = yeah + month + day;
        if (isMonth) {
            dateTemp = yeah + month;
        }
        return Long.parseLong(dateTemp);
    }

    public static Long convertDayMonthYearToMonthYear(String lDate) {
        if (lDate == null || "".equals(lDate)) {
            return null;
        }
        String str = lDate.toString();
        if (str == null || "".equals(str)) {
            return null;
        }

        if (str.contains("/")) {
            str = str.replace("/", "");
            if ("".equals(str)) {
                return null;
            }
        }
        str = replaceSeperator(str);
        /*
         * if (str.length() == 4) { str = "00" + str; }
         */

        String month = str.substring(0, 2);
        String year = str.substring(2, 6);
        return Long.parseLong(year + month);
    }

    public static String ConvertYYYYMMDDtoYYYYMM(String str) {
        String yearMonth = "";
        if (str == null || "".equals(str)) {
            return "";
        } else {
            yearMonth = str.substring(0, 6);
        }

        return yearMonth;
    }

    public static String ConvertDDMMYYYYtoYYYYMM(String lDate) {
        String yearMonth = "";
        if (lDate == null || "".equals(lDate)) {
            return null;
        }
        String str = lDate.toString();
        if (str == null || "".equals(str)) {
            return null;
        }

        if (str.contains("/")) {
            str = str.replace("/", "");
            if ("".equals(str)) {
                return null;
            }
        }
        str = replaceSeperator(str);
        if (str.trim().length() == 8) {
            yearMonth = str.substring(4, 8) + str.substring(2, 4);
        } else {
            return null;
        }

        return yearMonth;
    }

    public static Long ConvertDateStrToMonthYear(String str) {
        String dateTemp = null;
        if (str == null || "".equals(str)) {
            return null;
        }
        str = replaceSeperator(str);
        if (str.length() >= 6) {
            String month = str.substring(0, 2);
            String yeah = str.substring(2, 6);
            dateTemp = yeah + month;
        }

        return Long.parseLong(dateTemp);
    }

    public static String convertMonthYearToDateStr(Long lDate) {
        if (lDate == null)
            return "";
        String str = lDate.toString();
        if (str == null || "".equals(str)) {
            return "";
        }
        String yeah = str.substring(0, 4);
        String month = str.substring(4, 6);
        String date = month + "/" + yeah;
        return date;
    }

    public static String convertServerDateToLocalDate(Long lDate) {
        if (lDate == null || lDate == 0)
            return "";
        String str = lDate.toString();
        if ("".equals(str)) {
            return "";
        }

        String yeah = str.substring(0, 4);
        String month = "00";
        if (str.length() >= 6) {
            month = str.substring(4, 6);
        }
        String day = "00";
        if (str.length() >= 8) {
            day = str.substring(6, 8);
        }

        if ("00".equals(day) && "00".equals(month)) {
            return yeah;
        }

        if ("00".equals(day)) {
            return month + "/" + yeah;
        }

        String date = day + "/" + month + "/" + yeah;
        return date;
    }

    public static String convertServerDateToLocalDate(Long lDate, boolean isMonth) {
        if (lDate == null)
            return "";
        String str = lDate.toString();
        if ("".equals(str)) {
            return "";
        }

        String yeah = str.substring(0, 4);
        String month = "00";
        if (str.length() >= 6) {
            month = str.substring(4, 6);
        }
        String day = "00";
        if (str.length() >= 8) {
            day = str.substring(6, 8);
        }

        if ("00".equals(day) && "00".equals(month)) {
            return yeah;
        }

        if ("00".equals(day)) {
            return month + "/" + yeah;
        }

        if (isMonth) {
            return month + "/" + yeah;
        }

        String date = day + "/" + month + "/" + yeah;
        return date;
    }

    public static Long convertDateToNumber(Date date) {
        Long numDate = null;
        if (date != null) {
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            String strDate = df.format(date);
            String str = strDate.replace("/", "");
            numDate = Long.valueOf(str);
        }
        return numDate;
    }

    public static Long convertDateToYYYYMM(Date date) {
        Long numDate = null;
        if (date != null) {
            DateFormat df = new SimpleDateFormat("yyyyMM");
            String strDate = df.format(date);
            numDate = Long.valueOf(strDate);
        }
        return numDate;
    }

    public static String convertYYYYMMToDateMMYYYY(Long date) {
        String dateDff = null;
        if (date != null) {
            try {
                DateFormat df = new SimpleDateFormat("yyyyMM");
                DateFormat dff = new SimpleDateFormat("MM/yyyy");
                Date dateDf = df.parse(String.valueOf(date));
                dateDff = dff.format(dateDf);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return dateDff;
    }

    public static LocalDate convertLongToDate(Long date) {
        if (!Objects.isNull(date)) {// Manhpt -- && Util.isObjectLong(date)
            if (String.valueOf(date).length() == 8) {
                String dateNew = String.valueOf(date);
                String year = dateNew.substring(0, 4);
                String month = dateNew.substring(4, 6);
                Integer day = Integer.parseInt(dateNew.substring(6, 8));
                LocalDate localDate = LocalDate.of(Integer.parseInt(year), getMonthName(Integer.parseInt(month)),
                    (day == 0 ? 1 : day));
                return localDate;
            }
        }
        return LocalDate.ofYearDay(1900, 01);
    }

    public static Date convertLongToTypeDate(long aLong) {
        String dateNew = String.valueOf(aLong);
        String year = dateNew.substring(0, 4);
        String month = dateNew.substring(4, 6);
        Integer day = Integer.parseInt(dateNew.substring(6, 8));
        LocalDate localDate = LocalDate.of(Integer.parseInt(year), getMonthName(Integer.parseInt(month)),
            (day == 0 ? 1 : day));
        Date date = java.sql.Date.valueOf(localDate);
        return date;
    }

    public static String getMonth(String strDate) {
        if (strDate == null || "".equals(strDate)) {
            return "";
        }
        String str = strDate.replace("/", "");
        if (str.length() == 4) {
            str = "0101" + str;
        }
        if (str.length() == 6) {
            str = "01" + str;
        }
        String month = str.substring(2, 4);
        if (month == "00") {
            month = "01";
        }
        return month;
    }

    public static String getDay(String strDate) {
        if (strDate == null || "".equals(strDate)) {
            return "";
        }
        String str = strDate.replace("/", "");
        if (str.length() == 4) {
            str = "0101" + str;
        }
        if (str.length() == 6) {
            str = "01" + str;
        }
        String day = str.substring(0, 2);
        if (day == "00") {
            day = "01";
        }
        return day;
    }

    public static String getYear(String strDate) {
        if (strDate == null || "".equals(strDate)) {
            return "";
        }
        String str = strDate.replace("/", "");
        if (str.length() == 4) {
            str = "0101" + str;
        }
        if (str.length() == 6) {
            str = "01" + str;
        }
        String yeah = str.substring(4, 8);
        return yeah;
    }

    public static Long tinhSoThang(String tuThang, String denThang) {
        Long soThang = 0L;
        Long tTu = Long.valueOf(getMonth(tuThang));
        Long nTu = Long.valueOf(getYear(tuThang));
        Long tDen = Long.valueOf(getMonth(denThang));
        Long nDen = Long.valueOf(getYear(denThang));

        soThang = nDen * 12 + tDen - nTu * 12 - tTu + 1;

        return soThang;
    }

    public static byte[] unzipBytes(byte[] input) throws IOException {
        ByteArrayInputStream baos = new ByteArrayInputStream(input);
        ZipInputStream zos = new ZipInputStream(baos);

        ZipEntry entry = zos.getNextEntry();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[input.length];
        while (entry != null) {
            int len;
            while ((len = zos.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len);
            }
            outputStream.close();
            entry = zos.getNextEntry();
        }
        zos.closeEntry();
        zos.close();
        return outputStream.toByteArray();
    }

    public static byte[] zipBytes(String filename, byte[] input) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zos = new ZipOutputStream(baos);
        ZipEntry entry = new ZipEntry(filename);
        entry.setSize(input.length);
        zos.putNextEntry(entry);
        zos.write(input);
        zos.closeEntry();
        zos.close();
        return baos.toByteArray();
    }

    public static String RomanNumerals(int Int) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for(Map.Entry<String, Integer> entry : roman_numerals.entrySet()){
            int matches = Int/entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }

    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String trim(String s) {
        if(!Strings.isNullOrEmpty(s)) return s.trim().replaceAll("/ /g","").replaceAll("/\\s /g","");
        else return s;
    }

    public static void main(String args[]) {

    }

    public static String getDsNgayBetweenTwoDay(String tuNgay, String denNgay){
        String result = "";
        DateFormat dff = new SimpleDateFormat("yyyyMMdd");
        try {
            while (Long.valueOf(tuNgay) <= Long.valueOf(denNgay)) {
                if (Strings.isNullOrEmpty(result)) {
                    result += tuNgay;
                } else {
                    result += "," + tuNgay;
                }
                tuNgay = dff.format(DateUtils.addDays(dff.parse(tuNgay), 1));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    public static String removeAccentXoaCach(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").toUpperCase().replaceAll(" ", "_").replace("Đ", "D").replaceAll("[^_a-zA-Z0-9]", "");
    }

    public static String removeAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").toUpperCase().replace("Đ", "D").replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String converterHotenToHotenW(String s) {
//        if (StringUtils.isBlank(s)) {
//            return "";
//        }
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replace(" ", "_").toUpperCase().replace("Đ", "D")
            .replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String DecryptionFromBytes(byte[] base64Data)
    {
        try {
            //Create SecretKey object from common secret key string mentioned in constants class
            byte[] encoded = new BigInteger("728faf34b64cd55c8d1d500268026ffb", 16).toByteArray();
            SecretKey secretKey = new SecretKeySpec(encoded, "AES");

            //Cipher class object using AES as transformation
            Cipher cipher = Cipher.getInstance("AES");

            //Initialize cipher in decrypt mode along with secret key object created above.
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            //Decrypt input byte array
            byte[] decryptedByte = cipher.doFinal(base64Data);

            //return decrypted input bytes as string
            return (new String(decryptedByte));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return empty string if any error
        return "";
    }

    public static Double round(Double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    public static Long tinhSoThang(Long tuThang, Long denThang) {
        String strTuThang = convertServerDateToLocalDate(tuThang);
        String strDenThang = convertServerDateToLocalDate(denThang);
        return tinhSoThang(strTuThang, strDenThang);
    }


    public static Map<String, Long> getTuNgayDenNgay(String strDate, Long val) {
        Map<String, Long> result = new HashMap<>();
        String month = getMonth(strDate);
        String year = getYear(strDate);
        Long tuNgay = Long.valueOf(year + month + "01");
        Long nextMonth = Long.valueOf(month) + val;
        Long nextYear = Long.valueOf(year);
        if (nextMonth >= 12) {
            nextYear = nextYear + 1;
            nextMonth = 12 - nextMonth;
        }
        String strNextMonth;
        if (nextMonth.toString().length() == 1) {
            strNextMonth = "0" + nextMonth.toString();
        } else {
            strNextMonth = nextMonth.toString();
        }
        Long denNgay = Long.valueOf(String.valueOf(nextYear) + strNextMonth + "01");
        result.put("TU_NGAY", tuNgay);
        result.put("DEN_NGAY", denNgay);
        return result;

    }

    public static Long addMonths(Long localDate, Integer soThang) {
        LocalDate simp = null;
        if (localDate != null && localDate.toString().length() == 8) {
            int nam = Integer.parseInt(localDate.toString().substring(0, 4));
            int thang = Integer.parseInt(localDate.toString().substring(4, 6));
            int ngay = Integer.parseInt(localDate.toString().substring(6, 8));
            LocalDate superBowlXLV = LocalDate.of(nam, getMonthName(thang), ngay);
            simp = superBowlXLV.plusMonths(soThang);
            return Long.parseLong(simp.toString().replace("-", ""));
        }
        return null;
    }

    public String addDays(Long localDate, Integer soNgay) {
        if (localDate != null) {
            if (localDate.toString().length() >= 8) {
                int nam = Integer.parseInt(localDate.toString().substring(0, 4));
                int thang = Integer.parseInt(localDate.toString().substring(4, 6));
                int ngay = Integer.parseInt(localDate.toString().substring(6, 8));
                LocalDate superBowlXLV = LocalDate.of(nam, getMonthName(thang), ngay);
                LocalDate simp = superBowlXLV.plusDays(soNgay);
                return simp.toString().replace("-", "");
            }
        }
        return null;
    }

    public static Month getMonthName(int thang) {
        Month month = null;
        switch (thang) {
            case 1:
                month = Month.JANUARY;
                break;
            case 2:
                month = Month.FEBRUARY;
                break;
            case 3:
                month = Month.MARCH;
                break;
            case 4:
                month = Month.APRIL;
                break;
            case 5:
                month = Month.MAY;
                break;
            case 6:
                month = Month.JUNE;
                break;
            case 7:
                month = Month.JULY;
                break;
            case 8:
                month = Month.AUGUST;
                break;
            case 9:
                month = Month.SEPTEMBER;
                break;
            case 10:
                month = Month.OCTOBER;
                break;
            case 11:
                month = Month.NOVEMBER;
                break;
            case 12:
                month = Month.DECEMBER;
                break;
        }
        return month;
    }

    public static Long addMonth(Long monthAdd, String date, Boolean isFirstMonth) {
        Long returnValue = 0L;
        Long year = Long.valueOf(getYear(date));
        Long month = Long.valueOf(getMonth(date));
        String day = getDay(date);
        Long monthTemp = (month + monthAdd) / 12;
        String monthStr = "";

        year = year + monthTemp;
        month = month + monthAdd - monthTemp * 12;
        if (month.toString().length() == 1) {
            monthStr = "0" + month.toString();
        } else {
            monthStr = month.toString();
        }
        if ("00".equals(monthStr)) {
            monthStr = "12";
            year = year - 1;
        }

        if (isFirstMonth) {
            returnValue = Long.valueOf(year.toString() + monthStr + "01");
        } else {
            returnValue = Long.valueOf(year.toString() + monthStr + day);
        }
        return returnValue;
    }

    public static String getLastDayOfMonth(String date) {
        try {
            if (date == null || "".equals(date)) {
                return "";
            }
            if (date.length() == 7) {
                date = "01/" + date;
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date convertedDate = dateFormat.parse(date);
            Calendar c = Calendar.getInstance();
            c.setTime(convertedDate);
            c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
            return dateFormat.format(c.getTime());
        } catch (Exception e) {
            return "";
        }
    }

    // date format dd/MM/yyyy
    public static Date convertStringtoDate(String Date) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return df.parse(Date);
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }

    public static int mapngaynghi(String ngaynghi) {
        int value = 8;
        switch (ngaynghi) {
            case "chủ nhật":
                value = Calendar.SUNDAY;
                break;
            case "thứ bảy":
                value = Calendar.SATURDAY;
                break;
            case "thứ sáu":
                value = Calendar.FRIDAY;
                break;
            case "thứ năm":
                value = Calendar.THURSDAY;
                break;
            case "thứ tư":
                value = Calendar.WEDNESDAY;
                break;
            case "thứ ba":
                value = Calendar.TUESDAY;
                break;
            case "thứ hai":
                value = Calendar.MONDAY;
                break;
        }
        return value;
    }

    public static Date addDays(Date date, int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);

        return cal.getTime();
    }

    public static Date subtractDays(Date date, int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, -days);

        return cal.getTime();
    }

    public static Date addMonths(Date date, int months) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.MONTH, months);

        return cal.getTime();
    }

    public static Date addMonthsCntt(Date date, int months) {
//        GregorianCalendar cal = new GregorianCalendar();
//        cal.setTime(date);
//        cal.add(Calendar.DAY_OF_MONTH, -1);
//        cal.add(Calendar.MONTH, months);
//
//        return cal.getTime();

        GregorianCalendar cal1 = new GregorianCalendar();
        cal1.setTime(date);
        cal1.add(Calendar.DAY_OF_MONTH, -1);
        int lastDay1 = cal1.getActualMaximum(Calendar.DAY_OF_MONTH);
        int n1 = cal1.get(Calendar.DATE);
        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.setTime(cal1.getTime());
        cal2.add(Calendar.MONTH, months);
        int lastDay2 = cal2.getActualMaximum(Calendar.DAY_OF_MONTH);
        int n2 = cal2.get(Calendar.DATE);
        if (n1 == lastDay1 || n2 < n1) {
            cal2.set(Calendar.DAY_OF_MONTH, lastDay2);
        }
        return cal2.getTime();
    }

    public static Date subtractMonths(Date date, int months) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.MONTH, -months);

        return cal.getTime();
    }

    public static Date subtractMonthsCntt(Date date, int months) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
//        int n = cal.get(Calendar.DATE);
//        cal.add(Calendar.DAY_OF_MONTH, 1);
//        cal.add(Calendar.MONTH, - months);
//        int d = Math.min(cal.getActualMaximum(Calendar.DAY_OF_MONTH), n);
//        cal.set(Calendar.DATE, d);
        cal.add(Calendar.MONTH, -months);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    public static String convertDateToStringDate(Date indate) {
        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateString = sdfr.format(indate);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return dateString;
    }

    // ManhPT
    public static Date stringToDate(Long l_date) {
        // l_date = 20170101
        String s_date = String.valueOf(l_date);
        String DATE_FORMAT = "yyyyMMdd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        Date date = null;
        try {
            date = sdf.parse(s_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    // tuoicon

    public static int tinhtuoicon(Date tuoicon, Date nbs) {

        int age = 0;
        int factor = 0;

        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        /* Date date2 = new Date(); */

        cal1.setTime(tuoicon);
        cal2.setTime(nbs);

        if (cal2.get(Calendar.DAY_OF_YEAR) < cal1.get(Calendar.DAY_OF_YEAR)) {

            factor = -1;
        }

        age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;

        // System.out.println("Date current is: " + date2.toLocaleString());
        System.out.println("Your age is: " + age);

        return age;

    }

    public static Map<String, Object> checkdenNgayBsCon7tuoi(Date ngaySinhcon, Date denNgayBs) {
        Map<String, Object> map = new HashMap<>();
        Calendar c = Calendar.getInstance();
        c.setTime(ngaySinhcon);
        c.add(Calendar.YEAR, 7);
        Date ngaycon7tuoi = c.getTime();
        if (ngaycon7tuoi.getTime() <= denNgayBs.getTime()) {
            map.put("dnbacsi7tuoi", true);
            Date ngayhuongcon7tuoi = subtractDays(ngaycon7tuoi, 1);
            map.put("ngayhuongcon7tuoi", ngayhuongcon7tuoi);
        } else {
            map.put("dnbacsi7tuoi", false);
        }
        return map;
    }

    public static int tinhthangtrong(Date tuNgay, Date denNgay) {

        Calendar tngay = new GregorianCalendar();
        Calendar dNgay = new GregorianCalendar();
        Calendar dNgaytemp = new GregorianCalendar();
        Date dngayTemp = tuNgay;
        tngay.setTime(tuNgay);
        dNgay.setTime(denNgay);
        dNgaytemp.setTime(dngayTemp);
        int sothangtrong = dNgay.get(Calendar.MONTH) - tngay.get(Calendar.MONTH);
        int st = 0;
        for (int i = 1; i <= sothangtrong; i++) {
            tngay.add(Calendar.MONTH, 1);
            tngay.setTime(tngay.getTime());
            // Date tdate=tngay.getTime();
            if (tngay.getTimeInMillis() > dNgay.getTimeInMillis()) {
                break;
            } else {
                st++;
            }

        }

        return st;
    }

    public static String convertStringTuNgayDenNgay(Long tuNgay, Long denNgay) {
        if (tuNgay == null) {
            return "";
        }
        return "Từ " + tuNgay.toString().substring(6, 8) + "/" + tuNgay.toString().substring(4, 6) + "/"
            + tuNgay.toString().substring(0, 4) + " Đến " + denNgay.toString().substring(6, 8) + "/"
            + denNgay.toString().substring(4, 6) + "/" + denNgay.toString().substring(0, 4);
    }

    public static String convertDateToNgayThangNam(LocalDate localDate) {
        if (localDate == null) {
            return "";
        }
        return "Ngày " + localDate.format(DateTimeFormatter.ofPattern("dd")) + " tháng "
            + localDate.format(DateTimeFormatter.ofPattern("MM")) + " năm " + localDate.getYear();
    }

    public static Long currentDateToServer() {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        String thang = "" + month;
        String days = "" + day;
        return Long.parseLong(year + "" + (thang.length() == 1 ? "0" + thang : thang) + ""
            + (days.length() == 1 ? "0" + days : days));
    }

    public static String dotThangNam(String maQt) {
        if (maQt == null || "".equals(maQt))
            return "";
        else {
            return "Đợt " + maQt.substring(6) + " tháng " + maQt.substring(4, 6) + " năm " + maQt.substring(0, 4);
        }
    }

    public static String thangNam(Long thangNam) {
        String thangNams = Long.toString(thangNam);
        if (thangNams == null || "".equals(thangNams))
            return "";
        else {
            return "Tháng " + thangNams.substring(4, 6) + " năm " + thangNams.substring(0, 4);
        }
    }

    public static String ngayThangNam(Long ngay) {
        if (ngay == null || ngay == 0) {
            LocalDate localDate = LocalDate.now();
            return "ngày " + localDate.format(DateTimeFormatter.ofPattern("dd")) + " tháng "
                + localDate.format(DateTimeFormatter.ofPattern("MM")) + " năm " + localDate.getYear();
        } else {
            return "ngày " + ngay.toString().substring(6) + " tháng " + ngay.toString().substring(4, 6) + " năm "
                + ngay.toString().substring(0, 4);
        }
    }

    public static String ngayThangNamVietHoa(Long ngay) {
        if (ngay == null || ngay == 0) {
            LocalDate localDate = LocalDate.now();
            return "Ngày " + localDate.format(DateTimeFormatter.ofPattern("dd")) + " Tháng "
                + localDate.format(DateTimeFormatter.ofPattern("MM")) + " Năm " + localDate.getYear();
        } else {
            return "Ngày " + ngay.toString().substring(6) + " Tháng " + ngay.toString().substring(4, 6) + " Năm "
                + ngay.toString().substring(0, 4);
        }
    }
    public static String getSubDay(Long ngay) {
        try {
            String day = ngay.toString().substring(6);
            String months = ngay.toString().substring(4, 6);
            String year =  ngay.toString().substring(0, 4);

            Calendar cal = Calendar.getInstance();

            cal.set(Calendar.DAY_OF_MONTH, Integer.valueOf(day) -1 );
            cal.set(Calendar.MONTH, Integer.valueOf(months)-1);
            cal.set(Calendar.YEAR, Integer.valueOf(year));

            System.out.println(cal.getTime());
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            return df.format(cal.getTime());

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "";
    }


    public static String tuNgayDenNgay(String tuNgay, String denNgay) {
        String tuNg = tuNgay.substring(6, 8);
        String tuTh = tuNgay.substring(4, 6);
        String tuNa = tuNgay.substring(0, 4);

        String denNg = denNgay.substring(6, 8);
        String denTh = denNgay.substring(4, 6);
        String denNa = denNgay.substring(0, 4);

        return "từ ngày " + tuNg + "/" + tuTh + "/" + tuNa + " đến ngày " + denNg + "/" + denTh + "/" + denNa;
    }

    public static boolean checkngaylientuc(Long tuNgayh, Long denNgayh) {
        if (DateUtils.convertStringtoDate(DateUtils.convertServerDateToLocalDate(denNgayh))
            .getTime() == (DateUtils.convertStringtoDate(DateUtils.convertServerDateToLocalDate(tuNgayh)).getTime()
            - 24 * 60 * 60 * 1000)) {
            return true;
        }
        return false;
    }

    public static boolean checkThangLienTuc(String tuThang, String denThang) {
        boolean result = false;
        try {
            Calendar tuNgay = Calendar.getInstance();
            tuNgay.setTime(DateUtils.convertStringtoDate("01/" + tuThang));
            tuNgay.add(Calendar.MONTH, 1);
            if (DateUtils.convertDateToStringDate(tuNgay.getTime()).equals("01/" + denThang)) {
                result = true;
            }
        } catch (Exception ex) {
            result = false;
        }
        return result;
    }

    public static boolean checkThangLienTuc(Long tuThang, Long denThang) {
        boolean result = false;
        if (tuThang == null || tuThang == 0 || denThang == null || denThang == 0) {
            return result;
        }
        try {
            Calendar tuNgay = Calendar.getInstance();
            String monthFrom = tuThang.toString().substring(4, 6);
            String yearFrom = tuThang.toString().substring(0, 4);

            String monthTo = denThang.toString().substring(4, 6);
            String yearTo = denThang.toString().substring(0, 4);

            tuNgay.setTime(DateUtils.convertStringtoDate("01/" + monthFrom + "/" + yearFrom));
            tuNgay.add(Calendar.MONTH, 1);
            if (DateUtils.convertDateToStringDate(tuNgay.getTime()).equals("01/" + monthTo + "/" + yearTo)) {
                result = true;
            }
        } catch (Exception ex) {
            result = false;
        }
        return result;
    }

    public static String thoiGianInBaoCao(Integer thoiGian, Integer thoiDiem, Long tuNgay, Long denNgay, Long nam) {
        String thoiGianIn = "";
        if (thoiGian == 1) {
            thoiGianIn = convertStringTuNgayDenNgay(tuNgay, denNgay);
        } else if (thoiGian == 2) {
            thoiGianIn = "Tháng " + (thoiDiem < 10 ? "0" + thoiDiem : thoiDiem) + " Năm " + nam;
        } else if (thoiGian == 3) {
            if (thoiDiem == 1) {
                thoiGianIn = "Qúy I năm " + nam;
            } else if (thoiDiem == 2) {
                thoiGianIn = "Qúy II năm " + nam;
            } else if (thoiDiem == 3) {
                thoiGianIn = "Qúy III năm " + nam;
            } else {
                thoiGianIn = "Qúy IV năm " + nam;
            }
        } else if (thoiGian == 4) {
            if (thoiDiem == 1) {
                thoiGianIn = "Từ 01/01/" + nam + " Đến 30/06/" + nam;
            } else {
                thoiGianIn = "Từ 01/07/" + nam + " Đến 31/12/" + nam;
            }
        } else {
            thoiGianIn = "Năm " + nam;
        }
        return thoiGianIn;
    }

    public static Integer tinhSongayTrong(Long l_date1, Long l_date2) {
        try {
            LocalDate date1 = convertLongToDate(l_date1);
            LocalDate date2 = convertLongToDate(l_date2);
            Long soNgay = ChronoUnit.DAYS.between(date1, date2);
            return soNgay.intValue();
        } catch (Exception e) {
            return 0;
        }
    }

    public Integer[] tinhSoThangVaSongayTu(Long l_dateTu, Long l_dateDen) {
        Integer[] ngaythangnam = new Integer[3];
        try {
            LocalDate firstDate = convertLongToDate(l_dateTu);
            LocalDate secondDate = convertLongToDate(l_dateDen);
            Period period = Period.between(firstDate, secondDate);
            ngaythangnam[0] = period.getDays(); // so ngay
            ngaythangnam[1] = period.getMonths(); // so thang
            ngaythangnam[2] = period.getYears(); // so nam
            return ngaythangnam;
        } catch (Exception e) {
            ngaythangnam[0] = 0; // so ngay
            ngaythangnam[1] = 0; // so thang
            ngaythangnam[2] = 0; // so nam
            return ngaythangnam;
        }
    }

    // Tính só ngày chế độ trong chế độ T12-nam nghỉ vợ sinh
    public static Integer getSoNgayNamNghiVoSinh(String dk_phauThuat, String soCon) {
        if (Strings.isNullOrEmpty(soCon)) {
            soCon = "1";
        }
        Integer i_soCon = Integer.parseInt(soCon);
        if (Strings.isNullOrEmpty(dk_phauThuat)) {
            if (i_soCon == 1) {
                return 5;
            } else if (i_soCon == 2) {
                return 10;
            } else {
                return (10 + (i_soCon - 2) * 3);
            }
        } else {
            if (i_soCon == 1) {
                return 7;
            } else {
                return 14;
            }
        }
    }

    // TÍnh ngày hưởng max
    public static Long getNgayHuongMax(Date ngaySinhCon) {
        // + 29 vì tính cả ngày sinh con
        Date denNgay = new Date(ngaySinhCon.getYear(), ngaySinhCon.getMonth(), ngaySinhCon.getDate() + 29);
        String s_denNgay = new SimpleDateFormat("yyyyMMdd").format(denNgay);
        return Long.parseLong(s_denNgay);
    }

    // can satic nen viet lai
    public static Integer[] tinhSoThangVaSongayFrom(Long l_dateTu, Long l_dateDen) {
        Integer[] ngaythangnam = new Integer[3];
        LocalDate firstDate = convertLongToDate(l_dateTu);
        LocalDate secondDate = convertLongToDate(l_dateDen);
        Period period = Period.between(firstDate, secondDate);
        ngaythangnam[0] = period.getDays(); // so ngay
        ngaythangnam[1] = period.getMonths(); // so thang
        ngaythangnam[2] = period.getYears(); // so nam
        return ngaythangnam;
    }

    public static Float tinhTuoiDtHuong(Long tungayH, Long ngaySinh, Long ngayDuyet) {
        Float tuoidoiTuong = 0F;
        if (!Objects.isNull(tungayH) && !Objects.isNull(ngaySinh)) {
            Long l_thang = DateUtils.tinhSoThang(ngaySinh, tungayH) - 1l;
            Float f_tuoi = Float.parseFloat(String.valueOf(l_thang)) / 12;
            Float tuoi = Float.parseFloat(String.valueOf(Math.round(f_tuoi * 100f))) / 100;
            tuoidoiTuong = (tuoi);
        } else if (Objects.isNull(tungayH) && !Objects.isNull(ngaySinh)) {
            if (!Objects.isNull(ngayDuyet)) {
                Long l_thang = DateUtils.tinhSoThang(ngaySinh, ngayDuyet) - 1l;
                Float f_tuoi = Float.parseFloat(String.valueOf(l_thang)) / 12;
                Float tuoi = Float.parseFloat(String.valueOf(Math.round(f_tuoi * 100f))) / 100;
                tuoidoiTuong = (tuoi);
            }
        }
        return tuoidoiTuong;
    }

    public static boolean checkFormatNgaySinh(String value) {

        if (!Strings.isNullOrEmpty(value)) {
            if (value.trim().length() == 4) {
                return true;
            } else if (value.trim().contains("/")) {
                value = value.replaceAll("/", "");
                if (value.length() == 6) {
                    return true;
                } else if (value.length() == 8) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean checkFormatFullDate(String value) {

        if (!Strings.isNullOrEmpty(value)) {
            if (value.trim().contains("/")) {
                if (value.trim().length() == 10) {
                    value = value.replaceAll("/", "");
                    if (value.length() == 8 && value.matches(ImportConstant.NUMBER_REGEX)) {
                        return true;
                    } else {
                        return false;
                    }
                } else return false;

            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean checkFormatMonth(String value) {

        if (!Strings.isNullOrEmpty(value)) {
            if (value.trim().contains("/")) {
                if (value.trim().length() == 7) {
                    value = value.replaceAll("/", "");
                    if (value.length() == 6 && value.matches(ImportConstant.NUMBER_REGEX)) {
                        return true;
                    } else {
                        return false;
                    }
                } else return false;

            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getYearFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
	/*	int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);*/
        return year;
    }


    public static <T> void removeKeysObjects(T item)
        throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        if (Objects.isNull(item) || item.getClass().isPrimitive() || isWrapperType(item.getClass()))
            return;
        if (item instanceof String) {
            runString((String) item);
        } else if (item instanceof List || item instanceof ArrayList<?>) {
            item = (T) runList(item);
        } else {
            for (Field field : item.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(item);
                if (value != null) {
                    if (value.getClass().equals(String.class)) {
                        runString((String) value);
                    } else if (value instanceof List || value instanceof ArrayList<?>) {
                        List<Object> listOs = runList(value);
                        field.set(item, listOs);
                    } else {
                        removeKeysObjects(value);
                    }
                }

            }
        }
    }

    public static void runString(String a) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        Field f = String.class.getDeclaredField("value");
        f.setAccessible(true);
        String b = (String) stripNonValidXMLCharacters(a);
        f.set(a, b.toCharArray());
    }

    public static List<Object> runList(Object list){
        List<Object> objs = new ArrayList<Object>();
        objs.addAll((Collection<? extends Object>) list);
        for(Object o : objs){
            try {
                removeKeysObjects(o);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
        return objs;
    }

    public static boolean isWrapperType(Class<?> clazz) {
        return clazz.equals(Boolean.class) ||
            clazz.equals(Integer.class) ||
            clazz.equals(Character.class) ||
            clazz.equals(Byte.class) ||
            clazz.equals(Short.class) ||
            clazz.equals(Double.class) ||
            clazz.equals(Long.class) ||
            clazz.equals(Float.class) ||
            clazz.equals(BigDecimal.class) ||
            clazz.equals(BigInteger.class) ||
            clazz.equals(Date.class) ||
            clazz.equals(java.sql.Date.class) ||
            clazz.equals(Void.class) ;
    }

    public static String stripNonValidXMLCharacters(String in) {
        if (in == null || ("".equals(in))) return ""; // vacancy test.
        StringBuilder out = new StringBuilder(); // Used to hold the output.
        char current; // Used to reference the current character.
        for (int i = 0; i < in.length(); i++) {
            current = in.charAt(i); // NOTE: No IndexOutOfBoundsException caught here; it should not happen.
//            System.out.println(current);
            if ((current == 0x9) ||
                //(current == 0xA) ||
                (current == 0xD) ||
                ((current >= 0x20) && (current <= 0xD7FF)) ||
                ((current >= 0xE000) && (current <= 0xFFFD)) ||
                ((current >= 0x10000) && (current <= 0x10FFFF)))
                out.append(current);
        }
        return out.toString();
    }

}
