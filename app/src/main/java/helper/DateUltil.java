package helper;

import java.text.SimpleDateFormat;

public class DateUltil {
    public static String dataAtual(){

        long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String dataString = simpleDateFormat.format(data);
        return dataString;
    }

    public static String mesAnoDataEscolhida(String data){
        String retornodata[] = data.split("/");
        String dia = retornodata [0]; //dia
        String mes = retornodata [1]; //mes
        String ano = retornodata [2]; //ano

        String mesAno = mes + ano;
        return mesAno;
    }

}
