
package Utilitarios;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;


public class Data {
    
    public String mes, dia, ano, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm");
    
    public void le_hora(){
        Date data = new Date();
        hora = horaformatada.format(data);
    }
    
    public void le_data(){
        Date data = new Date();
        LocalDate date = LocalDate.now();
        mes =""+data.getMonth();
        dia = String.format("%02d", data.getDate());
        ano = String.format("%04d", date.getYear());
        
        switch (data.getMonth()) {
            case 0: mes = "01"; break;
            case 1: mes = "02"; break;
            case 2: mes = "03"; break;
            case 3: mes = "04"; break;
            case 4: mes = "05"; break;
            case 5: mes = "06"; break;
            case 6: mes = "07"; break;
            case 7: mes = "08"; break;
            case 8: mes = "09"; break;
            case 9: mes = "10"; break;
            case 10:mes = "11"; break;
            case 11:mes = "12"; break;
            default:
                JOptionPane.showMessageDialog(null, "Mês inválido");
        }
        
        for (int i = 1; i <= 31; i++) {
            if (dia.equals(String.format("%02d", i))) {
                dia = String.format("%02d", i);
                break;
            }

            
            
        }
    }
}
