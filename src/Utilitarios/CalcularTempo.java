
package Utilitarios;

import javax.swing.JOptionPane;

public class CalcularTempo {
    
    public String DataRestDoAno = "";
    public String DiasRestAno = "";
    public String HoraRestDia = "";
    public String MinutoRestHora = "";
    public String HoraDePermanencia = "";
    public String MinutoDePermanencia = "";
    
    public void Contagem(String Data) {
        try {
            
            String AnoEntrada = Data.substring(6, 10);
            String MesEntrada = Data.substring(3, 5);
            String DiaEntrada = Data.substring(0, 2);
            
            int Ano = Integer.parseInt(AnoEntrada);
            int Mes = Integer.parseInt(MesEntrada);
            int Dia = Integer.parseInt(DiaEntrada);
            
            int MC1 = 0;
            int MC2 = 31;
            int MC3 = 59;
            int MC4 = 90;
            int MC5 = 120;
            int MC6 = 151;
            int MC7 = 181;
            int MC8 = 212;
            int MC9 = 243;
            int MC10 = 273;
            int MC11 = 304;
            int MC12 = 334;
            
            int MB1 = 0;
            int MB2 = 31;
            int MB3 = 61;
            int MB4 = 91;
            int MB5 = 121;
            int MB6 = 152;
            int MB7 = 182;
            int MB8 = 213;
            int MB9 = 244;
            int MB10 = 274;
            int MB11 = 305;
            int MB12 = 335;
            
            int DiaRestanteAnoComum = 0;
            int DiaRestanteAnoBissexto = 0;
            int DiasRestante;
            
            int ResulDivisao = Ano % 4;
            if (ResulDivisao ==0){
                switch(Mes){
                    case 1:
                        DiaRestanteAnoBissexto = 366 - MB1 - Dia; break;
                    case 2: 
                        DiaRestanteAnoBissexto = 366 - MB2 - Dia; break;
                    case 3: 
                        DiaRestanteAnoBissexto = 366 - MB3 - Dia; break;
                    case 4: 
                        DiaRestanteAnoBissexto = 366 - MB4 - Dia; break;    
                    case 5: 
                        DiaRestanteAnoBissexto = 366 - MB5 - Dia; break;        
                    case 6: 
                        DiaRestanteAnoBissexto = 366 - MB6 - Dia; break;        
                    case 7:
                        DiaRestanteAnoBissexto = 366 - MB7 - Dia; break;
                    case 8: 
                        DiaRestanteAnoBissexto = 366 - MB8 - Dia; break;
                    case 9: 
                        DiaRestanteAnoBissexto = 366 - MB9 - Dia; break;
                    case 10: 
                        DiaRestanteAnoBissexto = 366 - MB10 - Dia; break;    
                    case 11: 
                        DiaRestanteAnoBissexto = 366 - MB11 - Dia; break;        
                    case 12: 
                        DiaRestanteAnoBissexto = 366 - MB12 - Dia; break;
                }
                DiasRestante = DiaRestanteAnoBissexto;
            } else{
                switch(Mes){
                    case 1:
                        DiaRestanteAnoComum = 365 - MC1 - Dia; break;
                    case 2: 
                        DiaRestanteAnoComum = 365 - MC2 - Dia; break;
                    case 3: 
                        DiaRestanteAnoComum = 365 - MC3 - Dia; break;
                    case 4: 
                        DiaRestanteAnoComum = 365 - MC4 - Dia; break;    
                    case 5: 
                        DiaRestanteAnoComum = 365 - MC5 - Dia; break;        
                    case 6: 
                        DiaRestanteAnoComum = 365 - MC6 - Dia; break;        
                    case 7:
                        DiaRestanteAnoComum = 365 - MC7 - Dia; break;
                    case 8: 
                        DiaRestanteAnoComum = 365 - MC8 - Dia; break;
                    case 9: 
                        DiaRestanteAnoComum = 365 - MC9 - Dia; break;
                    case 10: 
                        DiaRestanteAnoComum = 365 - MC10 - Dia; break;    
                    case 11: 
                        DiaRestanteAnoComum = 365 - MC11 - Dia; break;        
                    case 12: 
                        DiaRestanteAnoComum = 365 - MC12 - Dia; break;
                }
                DiasRestante = DiaRestanteAnoComum;
            }
            DiasRestAno = ("" + DiasRestante);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao calcular"+ e);
        }
    }
    
    public void ContagemHora(String Hora){
        try {
            String HoraE = Hora.substring(0, 2);
            int H = Integer.parseInt(HoraE);
            int HorR = 24 -H;
            HoraRestDia = ""+HorR;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro na Hora"+ e);
        }
    }
    
    public void contagemMinuto(String Minuto){
        try {
            String MinutoE = Minuto.substring(3, 5);
            int M = Integer.parseInt(MinutoE);
            int MinR =60 -M;
            MinutoRestHora = ""+ MinR;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no Minuto"+ e);
        }
    }
    public void ContagemEntradaSaidaMesmoAno(String Dataentrada,String Datasaida, String Horaentrada, String Horasaida){
        try {
            CalcularTempo ContaDiaAnoEntrada = new CalcularTempo();
            ContaDiaAnoEntrada.Contagem(Dataentrada);
            int VDE = Integer.parseInt(ContaDiaAnoEntrada.DiasRestAno);
            
            CalcularTempo ContaDiaAnoSaida = new CalcularTempo();
            ContaDiaAnoSaida.Contagem(Datasaida);
            int VDS = Integer.parseInt(ContaDiaAnoSaida.DiasRestAno);
            int DiferencaDia = VDE -VDS;
            
            CalcularTempo ContaHoraE = new CalcularTempo();
            ContaHoraE.ContagemHora(Horaentrada);
            int VHE = Integer.parseInt(ContaHoraE.HoraRestDia);
            
            CalcularTempo ContaHoraS = new CalcularTempo();
            ContaHoraS.ContagemHora(Horasaida);
            int VHS = Integer.parseInt(ContaHoraS.HoraRestDia);
            int ResultHor = VHE + (DiferencaDia + 24 - VHS);
            
            CalcularTempo ContaMinutoE =new CalcularTempo();
            ContaMinutoE.contagemMinuto(Horaentrada);
            int VME =Integer.parseInt(ContaMinutoE.MinutoRestHora);
            
            CalcularTempo ContaMinutoS = new CalcularTempo();
            ContaMinutoS.Contagem(Horasaida);
            int VMS = Integer.parseInt(ContaMinutoS.MinutoRestHora);
            int ResultMin = VME - VMS;
            HoraDePermanencia = ("" + ResultHor);
            MinutoDePermanencia = ("" + ResultMin);
            
            if(ResultMin < 0){
                ResultHor = ResultHor -1;
                ResultMin = 60 + ResultMin;
                HoraDePermanencia = ("" + ResultHor);
                MinutoDePermanencia = ("" + ResultMin);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na Data e Hora " + e);
        }
    }
    
    public void ContagemEntradaSaidaDiferenca1Ano(String Dataentrada, String Datasaida, String Horaentrada, String Horasaida){
        try {
            CalcularTempo ContaDiaeAnoEntrada = new CalcularTempo();
            ContaDiaeAnoEntrada.Contagem(Dataentrada);
            int VDE = Integer.parseInt(ContaDiaeAnoEntrada.DiasRestAno);
            
            CalcularTempo ContaDiaAnoSaida = new CalcularTempo();
            ContaDiaAnoSaida.Contagem(Datasaida);
            int VDS = Integer.parseInt(ContaDiaAnoSaida.DiasRestAno);
            
            String Data = String.valueOf(Datasaida);
            String AnoSaida = Data.substring(6, 10);
            int DiferencaDia;
            int Ano = Integer.parseInt(AnoSaida);
            int ResultDivisao = Ano % 4;
            if(ResultDivisao ==0){
                DiferencaDia = VDE + (366 - VDS);
            }else{
                DiferencaDia = VDE + (365 - VDS);
            }
            
            CalcularTempo ContaHoraE = new CalcularTempo();
            ContaHoraE.ContagemHora(Horaentrada);
            int VHE = Integer.parseInt(ContaHoraE.HoraRestDia);
            
            CalcularTempo ContaHoraS = new CalcularTempo();
            ContaHoraS.ContagemHora(Horasaida);
            int VHS = Integer.parseInt(ContaHoraS.HoraRestDia);
            int ResultHor = VHE + (DiferencaDia * 24 - VHS);
            
            CalcularTempo ContaMinutoE = new CalcularTempo();
            ContaMinutoE.contagemMinuto(Horaentrada);
            int VME = Integer.parseInt(ContaMinutoE.MinutoRestHora);
            
            CalcularTempo ContaMinutoS = new CalcularTempo();
            ContaMinutoS.contagemMinuto(Horasaida);
            int VMS = Integer.parseInt(ContaMinutoS.MinutoRestHora);
            
            int ResultMin = VME - VMS;
            HoraDePermanencia =("" + ResultHor);
            MinutoDePermanencia = (""+ ResultMin);
            
            if(ResultMin < 0 ){
                ResultHor = ResultHor -1;
                ResultMin = 60 + ResultMin;
                HoraDePermanencia = ("" + ResultHor);
                MinutoDePermanencia = ("" + ResultMin);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na Data e Hora " + e);
        }
    }
    
}
