package helper;

import java.text.SimpleDateFormat;

public class DateUltil {
    public static String dataAtual(){

        long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String dataString = simpleDateFormat.format(data);
        return dataString;
    }
}
