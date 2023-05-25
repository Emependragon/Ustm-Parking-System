/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import Cadastro.Cadastro;
import Contagem.Preco;
import Contagem.Vagas;
import Utilitarios.Conexao;
import Utilitarios.Data;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    Conexao con_clientedia;
    Cadastro MostraCad = new Cadastro();
    Vagas Vag = new Vagas();
    Conexao Con_contasareceber;
    Conexao con_clientemen;
    Conexao con_vagas;
    Conexao con_preco;
    
    String Dia, Mes, Ano;
    int pesquisa =0;
    int VagasVeiculoG = 0, VagasVeiculoM = 0, VagasVeiculoP = 0;
    int TotalVMensG = 0, TotalVMensM = 0, TotalVMensP = 0;
    double valormesvgrande = 0, valormesvmedio = 0, valormesvpequeno = 0; 
    String StatusPagam = "PENDENTE";
    
    int TotalCodConta = 0, TotalDeClienteMen = 0, LinhaNavega =0;
    String NomeClien, PlacaVei, PorteVei, Modelo = " ", ValorCont = "";
    String tamanho = "P", registr ="E";
    int Hab = 0;
    int TotalVdiaG, TotalVdiaM, TotalVdiaP = 0;
    String CodGrav = "", PlacaGrav ="";
    String PesqPorData = "";
    public Principal() {
        initComponents();
        
        Data mostra_data = new Data();
        mostra_data.le_data();
        Dia = mostra_data.dia;
        Mes = mostra_data.mes;
        Ano = mostra_data.ano;
        
        DiaTP.setText(Dia);
        MesTP.setText(Mes);
        AnoTP.setText(Ano);
        MesMens.setSelectedItem(Mes);
        AnoMens.setText(Ano);
        
        Con_contasareceber = new Conexao();
        Con_contasareceber.conecta();
        PreencherTabelaContasAReceber();
        
        con_clientemen = new Conexao();
        con_clientemen.conecta();
        con_clientemen.executarSQL("select * from clientemen");
        
        con_clientedia = new Conexao();
        con_clientedia.conecta();
        
        con_vagas = new Conexao();
        con_vagas.conecta();
        con_vagas.executarSQL("select * from vagas");
        
        ContaVagas();
        TelaStatus.setVisible(false);
        con_preco = new Conexao();
        con_preco.conecta();
        painelprogresso1.setVisible(true);
        GerarContaPart0();
        
        Registro_Entrada_Saida.setVisible(false);
        
        PreencheTabelaClienteDiarista();
        ExcluirHistrico.setVisible(false);
   }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        DiaTP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MesTP = new javax.swing.JLabel();
        AnoTP = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaclientediarista = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        VagasDispVeDiaG = new javax.swing.JTextField();
        VagasDispVeDiaP = new javax.swing.JTextField();
        VagasDispVeDiaM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Registro_Entrada_Saida = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        placa = new javax.swing.JTextField();
        TestCodigo = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        BotaoPesquisar = new javax.swing.JButton();
        PainelDetalhe = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        dataentrada = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        horaentrada = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        cliente = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        PGRANDE = new javax.swing.JRadioButton();
        PMEDIO = new javax.swing.JRadioButton();
        jLabel44 = new javax.swing.JLabel();
        PPEQUENO = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        horasaida = new javax.swing.JLabel();
        datasaida = new javax.swing.JLabel();
        painerReceber = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        valorareceber = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        BotaoSalvar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        painelprogresso1 = new javax.swing.JInternalFrame();
        painelprogresso3 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        pc = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        TelaStatus = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PlacaMens = new javax.swing.JTextField();
        NomeMens = new javax.swing.JTextField();
        MesMensStatus = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        AnoMensStatus = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        porte = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        valorreceber = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        Statuspagam1 = new javax.swing.JRadioButton();
        Statuspagam2 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        CodMens = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AnoMens = new javax.swing.JTextField();
        MesMens = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaContasaReceber = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        VagasDispVeMensG = new javax.swing.JTextField();
        VagasDispVeMensP = new javax.swing.JTextField();
        VagasDispVeMensM = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        ExcluirHistrico = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CodHist = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ClienteHist = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        PlacaHist = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DataHist = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABELAHISTORICO = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        TotalRegistro = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        DiaTP.setText("00");

        jLabel2.setText("/");

        jLabel3.setText("/");

        MesTP.setText("00");

        AnoTP.setText("0000");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabelaclientediarista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Cliente", "Placa", "Data de Entrada", "Hora de Entrada", "Presença"
            }
        ));
        tabelaclientediarista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaclientediaristaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaclientediarista);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Vagas Disponíveis"));

        jLabel6.setText("Veículo Grande");

        jLabel7.setText("Veículo Médio");

        jLabel8.setText("Veículo Pequeno");

        VagasDispVeDiaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VagasDispVeDiaGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VagasDispVeDiaP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(VagasDispVeDiaG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VagasDispVeDiaM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(VagasDispVeDiaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(VagasDispVeDiaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(VagasDispVeDiaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton1.setText("Registrar Entrada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar Saída");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Registro_Entrada_Saida.setClosable(true);
        Registro_Entrada_Saida.setIconifiable(true);
        Registro_Entrada_Saida.setMaximizable(true);
        Registro_Entrada_Saida.setResizable(true);
        Registro_Entrada_Saida.setTitle("Registro Diarista");
        Registro_Entrada_Saida.setVisible(true);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("PLACA");

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        placa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        placa.setText("AAA-000-MM");
        placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaActionPerformed(evt);
            }
        });
        placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                placaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placa, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(placa, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        TestCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TestCodigo.setText("Código");

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });

        BotaoPesquisar.setText("Pesquisar");
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(TestCodigo)
                .addGap(37, 37, 37)
                .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(BotaoPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel22))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TestCodigo)
                            .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoPesquisar))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        PainelDetalhe.setBackground(new java.awt.Color(255, 255, 255));
        PainelDetalhe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel29.setText("Data de Entrada");

        dataentrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dataentrada.setText("00/00/000");

        jLabel37.setText("Hora");

        horaentrada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        horaentrada.setText("00:00");

        jLabel40.setText("Cliente");

        jLabel41.setText("Telefone");

        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });

        jLabel42.setText("Porte: ");

        buttonGroup2.add(PGRANDE);
        PGRANDE.setText("Grande");
        PGRANDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGRANDEActionPerformed(evt);
            }
        });

        buttonGroup2.add(PMEDIO);
        PMEDIO.setText("Médio");
        PMEDIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PMEDIOActionPerformed(evt);
            }
        });

        jLabel44.setText("Data de Saída");

        buttonGroup2.add(PPEQUENO);
        PPEQUENO.setText("Pequeno");
        PPEQUENO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPEQUENOActionPerformed(evt);
            }
        });

        jLabel50.setText("Hora");

        horasaida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        horasaida.setText("00:00");

        datasaida.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        datasaida.setText("00/00/000");

        javax.swing.GroupLayout PainelDetalheLayout = new javax.swing.GroupLayout(PainelDetalhe);
        PainelDetalhe.setLayout(PainelDetalheLayout);
        PainelDetalheLayout.setHorizontalGroup(
            PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDetalheLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDetalheLayout.createSequentialGroup()
                        .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelDetalheLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(dataentrada))
                            .addGroup(PainelDetalheLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datasaida)))
                        .addGap(531, 531, 531))
                    .addGroup(PainelDetalheLayout.createSequentialGroup()
                        .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDetalheLayout.createSequentialGroup()
                                .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelDetalheLayout.createSequentialGroup()
                                .addComponent(PGRANDE, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PMEDIO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelDetalheLayout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(horaentrada))
                                    .addComponent(PPEQUENO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PainelDetalheLayout.createSequentialGroup()
                                        .addComponent(jLabel50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(horasaida)))
                                .addGap(218, 218, 218)))
                        .addGap(68, 68, 68))))
        );
        PainelDetalheLayout.setVerticalGroup(
            PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDetalheLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(PGRANDE)
                    .addComponent(PMEDIO)
                    .addComponent(PPEQUENO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(dataentrada)
                    .addComponent(jLabel37)
                    .addComponent(horaentrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel50)
                    .addComponent(horasaida)
                    .addComponent(datasaida))
                .addGap(15, 15, 15))
        );

        painerReceber.setBackground(new java.awt.Color(255, 255, 255));
        painerReceber.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel53.setText("Tempo Total de Permanência: ");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel54.setText("00");

        jLabel55.setText("Horas e");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setText("00");

        jLabel57.setText("Minutos");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Valor a Receber");

        valorareceber.setText("0");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 255, 102));
        jLabel59.setText("0000");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 255, 102));
        jLabel60.setText("Meticais");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 255, 102));
        jLabel61.setText("00");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(0, 255, 102));
        jLabel62.setText("Centavos");

        javax.swing.GroupLayout painerReceberLayout = new javax.swing.GroupLayout(painerReceber);
        painerReceber.setLayout(painerReceberLayout);
        painerReceberLayout.setHorizontalGroup(
            painerReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painerReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painerReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painerReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painerReceberLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel55)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel56)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel57))
                    .addComponent(valorareceber, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painerReceberLayout.setVerticalGroup(
            painerReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painerReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painerReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painerReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(valorareceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        BotaoSalvar.setText("Concluir Entrada");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Habilitar botão excluir");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelDetalhe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painerReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BotaoExcluir)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PainelDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painerReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(0, 341, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Registro_Entrada_SaidaLayout = new javax.swing.GroupLayout(Registro_Entrada_Saida.getContentPane());
        Registro_Entrada_Saida.getContentPane().setLayout(Registro_Entrada_SaidaLayout);
        Registro_Entrada_SaidaLayout.setHorizontalGroup(
            Registro_Entrada_SaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registro_Entrada_SaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Registro_Entrada_SaidaLayout.setVerticalGroup(
            Registro_Entrada_SaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registro_Entrada_SaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro_Entrada_Saida)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro_Entrada_Saida)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        painelprogresso1.setClosable(true);
        painelprogresso1.setVisible(true);

        painelprogresso3.setBackground(new java.awt.Color(0, 107, 43));
        painelprogresso3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pc.setText("000%");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Concluído");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("AGUARDE... O SISTEMA ESTÁ GERANDO CONTAS A PAGAR PARA CLIENTE MENSALISTA");

        javax.swing.GroupLayout painelprogresso3Layout = new javax.swing.GroupLayout(painelprogresso3);
        painelprogresso3.setLayout(painelprogresso3Layout);
        painelprogresso3Layout.setHorizontalGroup(
            painelprogresso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelprogresso3Layout.createSequentialGroup()
                .addGroup(painelprogresso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelprogresso3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pc)
                        .addGap(18, 18, 18))
                    .addGroup(painelprogresso3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel35)
                        .addGap(0, 201, Short.MAX_VALUE)))
                .addComponent(jLabel34)
                .addGap(23, 23, 23))
        );
        painelprogresso3Layout.setVerticalGroup(
            painelprogresso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelprogresso3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(painelprogresso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelprogresso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(pc))
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel35)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelprogresso1Layout = new javax.swing.GroupLayout(painelprogresso1.getContentPane());
        painelprogresso1.getContentPane().setLayout(painelprogresso1Layout);
        painelprogresso1Layout.setHorizontalGroup(
            painelprogresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelprogresso1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelprogresso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelprogresso1Layout.setVerticalGroup(
            painelprogresso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelprogresso1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelprogresso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(painelprogresso1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(painelprogresso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(293, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(252, Short.MAX_VALUE)
                    .addComponent(painelprogresso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(742, 742, 742)))
        );

        jTabbedPane1.addTab("Cliente Diarista", jLayeredPane1);

        TelaStatus.setClosable(true);
        TelaStatus.setIconifiable(true);
        TelaStatus.setResizable(true);
        TelaStatus.setTitle("Status Pagamento Mensalista");
        TelaStatus.setVisible(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Cliente");

        jLabel4.setText("Placa do Veículo");

        jLabel5.setText("Mês");

        jLabel19.setText("Ano");

        jLabel20.setText("Porte");

        porte.setText("G");

        modelo.setText("mod");

        jLabel23.setText("Modelo:");

        jLabel24.setText("Valor a Receber");

        jLabel25.setText("Pagamento:");

        buttonGroup1.add(Statuspagam1);
        Statuspagam1.setText("Feito");
        Statuspagam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Statuspagam1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Statuspagam2);
        Statuspagam2.setText("Pendente");
        Statuspagam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Statuspagam2ActionPerformed(evt);
            }
        });

        jLabel26.setText("Cod");

        CodMens.setText("00");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(NomeMens, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodMens, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(MesMensStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(PlacaMens, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnoMensStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(porte, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(Statuspagam1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Statuspagam2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valorreceber, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NomeMens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(CodMens))
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PlacaMens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MesMensStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(AnoMensStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porte, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(valorreceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(Statuspagam1)
                    .addComponent(Statuspagam2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TelaStatusLayout = new javax.swing.GroupLayout(TelaStatus.getContentPane());
        TelaStatus.getContentPane().setLayout(TelaStatusLayout);
        TelaStatusLayout.setHorizontalGroup(
            TelaStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        TelaStatusLayout.setVerticalGroup(
            TelaStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Status de Pagamento");

        jLabel11.setText("Mês");

        jLabel12.setText("Ano");

        MesMens.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        MesMens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesMensActionPerformed(evt);
            }
        });

        TabelaContasaReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Placa", "Modelo do Veículo", "Pagamento Referente ao mês"
            }
        ));
        TabelaContasaReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaContasaReceberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaContasaReceber);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Vagas Disponíveis"));

        jLabel13.setText("Veículo Grande");

        jLabel14.setText("Veículo Médio");

        jLabel15.setText("Veículo Pequeno");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VagasDispVeMensP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VagasDispVeMensG, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VagasDispVeMensM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VagasDispVeMensG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(VagasDispVeMensM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(VagasDispVeMensP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesMens, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AnoMens, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(AnoMens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesMens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jLayeredPane2.setLayer(TelaStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(TelaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 246, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Cliente Mensalista", jLayeredPane2);

        ExcluirHistrico.setClosable(true);
        ExcluirHistrico.setTitle("Excluir HIstórico");
        ExcluirHistrico.setVisible(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Cod");

        CodHist.setText("Cod");

        jLabel27.setText("Cliente");

        jLabel28.setText("Placa");

        jButton5.setText("Exluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CodHist, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ClienteHist, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlacaHist, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CodHist))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(ClienteHist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(PlacaHist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout ExcluirHistricoLayout = new javax.swing.GroupLayout(ExcluirHistrico.getContentPane());
        ExcluirHistrico.getContentPane().setLayout(ExcluirHistricoLayout);
        ExcluirHistricoLayout.setHorizontalGroup(
            ExcluirHistricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ExcluirHistricoLayout.setVerticalGroup(
            ExcluirHistricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Histórico de Veículo Diarista");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Pesquisa por Data de Entrada");

        DataHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataHistActionPerformed(evt);
            }
        });
        DataHist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DataHistKeyReleased(evt);
            }
        });

        TABELAHISTORICO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "CLIENTE", "PLACA", "DATA ENTRDA", "HORA ENTRADA", "DATA SAÍDA", "HORA SAÍDA", "PRESENÇA"
            }
        ));
        TABELAHISTORICO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABELAHISTORICOMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TABELAHISTORICO);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Tolal");

        jLayeredPane3.setLayer(ExcluirHistrico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(DataHist, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(TotalRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(DataHist, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TotalRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                    .addContainerGap(688, Short.MAX_VALUE)
                    .addComponent(ExcluirHistrico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DataHist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TotalRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(316, 316, 316))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                    .addContainerGap(381, Short.MAX_VALUE)
                    .addComponent(ExcluirHistrico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Histórico", jLayeredPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DiaTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(MesTP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnoTP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaTP)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(MesTP)
                    .addComponent(AnoTP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem1.setText("Registrar Entrada");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Registrar Saída");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Sair");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Cliente Mensalista");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Editar");

        jMenuItem5.setText("Tabela de Preço");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Vagas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Resultados");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        BotaoRegistroEntrada();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        MostraCad.mostrar(this);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Preco().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Vag.mostrar(this); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void DataHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataHistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataHistActionPerformed

    private void TabelaContasaReceberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaContasaReceberMouseClicked
        TelaStatus.setVisible(true);
        PesquisaTabelaContasAReceber();
    }//GEN-LAST:event_TabelaContasaReceberMouseClicked

    private void MesMensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesMensActionPerformed
        if(pesquisa == 1){
            PreencherTabelaContasAReceber();
        }else{
            pesquisa =1;
        }
    }//GEN-LAST:event_MesMensActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir");
        if(opcao == JOptionPane.YES_NO_OPTION){
            ExcluirDaTabelaContas();
            PreencherTabelaContasAReceber();
            TelaStatus.setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AlterarStatusPagamento();
        PreencherTabelaContasAReceber();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Statuspagam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Statuspagam2ActionPerformed
        StatusPagam ="PENDENTE";
    }//GEN-LAST:event_Statuspagam2ActionPerformed

    private void Statuspagam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Statuspagam1ActionPerformed
        StatusPagam ="OK";
    }//GEN-LAST:event_Statuspagam1ActionPerformed

    private void placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        if(registr == "S"){
            RegistrarSaida();
            PreencheTabelaClienteDiarista();
            ContaVagas();
            Registro_Entrada_Saida.setVisible(false);
        } else{
            
            String PLac = String.valueOf(placa.getText());
            int cont = PLac.length();

            if(cont ==10){
            Gravar();
            PreencheTabelaClienteDiarista();
            ContaVagas();
            }
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    BotaoRegistroEntrada();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BotaoRegistroSaida();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BotaoRegistroSaida();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void PPEQUENOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPEQUENOActionPerformed
        tamanho = "P";
    }//GEN-LAST:event_PPEQUENOActionPerformed

    private void PMEDIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PMEDIOActionPerformed
        tamanho = "M";
    }//GEN-LAST:event_PMEDIOActionPerformed

    private void PGRANDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGRANDEActionPerformed
        tamanho = "G";
    }//GEN-LAST:event_PGRANDEActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(Hab ==0){
            BotaoExcluir.setEnabled(true);
            Hab = 1;
        }else if(Hab ==1){
            BotaoExcluir.setEnabled(false);
            Hab = 0;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void VagasDispVeDiaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VagasDispVeDiaGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VagasDispVeDiaGActionPerformed

    private void tabelaclientediaristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaclientediaristaMouseClicked
        PesquisaClicandoTabela();
    }//GEN-LAST:event_tabelaclientediaristaMouseClicked

    private void placaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaKeyReleased
        if(registr == "S"){
            String plac = String.valueOf(placa.getText());
            int cont = plac.length();
            if(cont == 10){
                BotaoExcluir.setVisible(true);
                BotaoPesquisar.setVisible(true);
                PainelDetalhe.setVisible(true);
                painerReceber.setVisible(true);
                BotaoSalvar.setVisible(true);
                PesquisaPelaPlaca();
            }
        }
    }//GEN-LAST:event_placaKeyReleased

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        if(registr == "S"){
            String v1= cod.getText();
            int cont = v1.length();
            if(cont > 0){
                BotaoExcluir.setVisible(true);
                BotaoPesquisar.setVisible(true);
                PainelDetalhe.setVisible(true);
                painerReceber.setVisible(true);
                BotaoSalvar.setVisible(true);
                PesquisaPorCod();
            }
        }    
    }//GEN-LAST:event_codActionPerformed

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        if(registr == "S"){
            String v1= cod.getText();
            int cont = v1.length();
            if(cont > 0){
                BotaoExcluir.setVisible(true);
                BotaoPesquisar.setVisible(true);
                PainelDetalhe.setVisible(true);
                painerReceber.setVisible(true);
                BotaoSalvar.setVisible(true);
                PesquisaPorCod();
            }
        } 
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE EXCLUR?");
            if(opcao == JOptionPane.YES_NO_OPTION){
                Excluir();
                PreencheTabelaClienteDiarista();
                ContaVagas();
                Registro_Entrada_Saida.setVisible(false );
            }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void DataHistKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DataHistKeyReleased
        String dat = DataHist.getText();
        int cont = dat.length();
        if(cont == 2){
            DataHist.setText(dat + "/");
        }
        if(cont == 5){
            DataHist.setText(dat + "/");
        }
        if(cont == 10){
            PesqPorData = " and dataentrada = '" + DataHist.getText() + "'";
            PreencherTabelaHISTORICO();
            ContarHistorico();
        } else {
            PesqPorData = "";
            PreencherTabelaHISTORICO();
            ContarHistorico();
        }
    }//GEN-LAST:event_DataHistKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "DESEJA REALMENTE EXCLUIR");
        if(opcao == JOptionPane.YES_NO_OPTION){
            ExcluirHistorico();
            PreencherTabelaHISTORICO();
            ContarHistorico();
            ExcluirHistrico.setVisible(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TABELAHISTORICOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABELAHISTORICOMouseClicked
        try {
            ExcluirHistrico.setVisible(true);
            int Linha = TABELAHISTORICO.getSelectedRow();
            con_clientedia.executarSQL("select * from clientedia"
                    + " where presenca = 'Ausente' " + PesqPorData + " order by cod LIMIT " + Linha + " , 1 ");
            con_clientedia.resultSet.first();
            CodHist.setText(con_clientedia.resultSet.getString("cod"));
            PlacaHist.setText(con_clientedia.resultSet.getString("placa"));
            ClienteHist.setText(con_clientedia.resultSet.getString("cliente"));
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Placa não encontrada" + e);
        }
    }//GEN-LAST:event_TABELAHISTORICOMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoMens;
    private javax.swing.JTextField AnoMensStatus;
    private javax.swing.JLabel AnoTP;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JTextField ClienteHist;
    private javax.swing.JLabel CodHist;
    private javax.swing.JLabel CodMens;
    private javax.swing.JTextField DataHist;
    private javax.swing.JLabel DiaTP;
    private javax.swing.JInternalFrame ExcluirHistrico;
    private javax.swing.JComboBox<String> MesMens;
    private javax.swing.JTextField MesMensStatus;
    private javax.swing.JLabel MesTP;
    private javax.swing.JTextField NomeMens;
    private javax.swing.JRadioButton PGRANDE;
    private javax.swing.JRadioButton PMEDIO;
    private javax.swing.JRadioButton PPEQUENO;
    private javax.swing.JPanel PainelDetalhe;
    private javax.swing.JTextField PlacaHist;
    private javax.swing.JTextField PlacaMens;
    private javax.swing.JInternalFrame Registro_Entrada_Saida;
    private javax.swing.JRadioButton Statuspagam1;
    private javax.swing.JRadioButton Statuspagam2;
    private javax.swing.JTable TABELAHISTORICO;
    private javax.swing.JTable TabelaContasaReceber;
    private javax.swing.JInternalFrame TelaStatus;
    private javax.swing.JLabel TestCodigo;
    private javax.swing.JTextField TotalRegistro;
    private javax.swing.JTextField VagasDispVeDiaG;
    private javax.swing.JTextField VagasDispVeDiaM;
    private javax.swing.JTextField VagasDispVeDiaP;
    private javax.swing.JTextField VagasDispVeMensG;
    private javax.swing.JTextField VagasDispVeMensM;
    private javax.swing.JTextField VagasDispVeMensP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel dataentrada;
    private javax.swing.JLabel datasaida;
    private javax.swing.JLabel horaentrada;
    private javax.swing.JLabel horasaida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel modelo;
    private javax.swing.JInternalFrame painelprogresso1;
    private javax.swing.JPanel painelprogresso3;
    private javax.swing.JPanel painerReceber;
    private javax.swing.JLabel pc;
    private javax.swing.JTextField placa;
    private javax.swing.JLabel porte;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTable tabelaclientediarista;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField valorareceber;
    private javax.swing.JTextField valorreceber;
    // End of variables declaration//GEN-END:variables

    public void PreencherTabelaContasAReceber(){
        Con_contasareceber.executarSQL("select * from contasareceber where "
                + " mes = '" + MesMens.getSelectedItem()+ "' and ano = '" + AnoMens.getText()+ "' order by cliente");
        
        TabelaContasaReceber.getColumnModel().getColumn(0).setPreferredWidth(400);
        TabelaContasaReceber.getColumnModel().getColumn(1).setPreferredWidth(200);
        TabelaContasaReceber.getColumnModel().getColumn(2).setPreferredWidth(200);
        TabelaContasaReceber.getColumnModel().getColumn(3).setPreferredWidth(200);
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaContasaReceber.getModel();
        modelo.setNumRows(0);
        
        try {
            while(Con_contasareceber.resultSet.next()){
                
                modelo.addRow(new Object[]{
                    Con_contasareceber.resultSet.getString("cliente"),
                    Con_contasareceber.resultSet.getString("placa"),
                    Con_contasareceber.resultSet.getString("modelo"),
                    Con_contasareceber.resultSet.getString("status")
                });
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro ao preencher a tebela");
        }
    }
    
    public void ContaVagas(){
         
        try {
            con_vagas.executarSQL("select * from vagas");

            con_vagas.resultSet.first();
            VagasVeiculoG = Integer.parseInt(con_vagas.resultSet.getString("vagasvgrande"));
            VagasVeiculoM = Integer.parseInt(con_vagas.resultSet.getString("vagasvmedio"));
            VagasVeiculoP = Integer.parseInt(con_vagas.resultSet.getString("vagasvpequeno"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados");
        }
            try {
            con_clientemen.executarSQL("select count(cod)as TotalVMensG from clientemen where port = 'G'");
            con_clientemen.resultSet.first();
            TotalVMensG = Integer.parseInt(con_clientemen.resultSet.getString("TotalVMensG"));
            
            con_clientemen.executarSQL("select count(cod)as TotalVMensM from clientemen where port = 'M'");
            con_clientemen.resultSet.first();
            TotalVMensM = Integer.parseInt(con_clientemen.resultSet.getString("TotalVMensM"));
            
            con_clientemen.executarSQL("select count(cod)as TotalVMensP from clientemen where port = 'P'");
            con_clientemen.resultSet.first();
            TotalVMensP = Integer.parseInt(con_clientemen.resultSet.getString("TotalVMensP"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a cntagem de cliente mensalista");

        }
            
        /*-----------------------------VAGAS DIARISTA---------------------------------------*/ 
        try {
            con_clientedia.executarSQL("select count(cod)as TotalVDiaG from clientedia where porte = 'G' and presenca = 'Presente'");
            con_clientedia.resultSet.first();
            TotalVdiaG = Integer.parseInt(con_clientedia.resultSet.getString("TotalVDiaG"));
            
            con_clientedia.executarSQL("select count(cod)as TotalVDiaM from clientedia where porte = 'M' and presenca = 'Presente'");
            con_clientedia.resultSet.first();
            TotalVdiaM = Integer.parseInt(con_clientedia.resultSet.getString("TotalVDiaM"));
            
            con_clientedia.executarSQL("select count(cod)as TotalVDiaP from clientedia where porte = 'P' and presenca = 'Presente'");
            con_clientedia.resultSet.first();
            TotalVdiaP = Integer.parseInt(con_clientedia.resultSet.getString("TotalVDiaP"));
            
        } catch (SQLException e) {
        }
        
        /*-------------------------------VAGAS DIARISTA-------------------------------------*/    
            try {
            int VagasDisponiveisClienteMensVG = VagasVeiculoG - TotalVMensG;
            int VagasDisponiveisClienteMensVM = VagasVeiculoM - TotalVMensM;
            int VagasDisponiveisClienteMensVP = VagasVeiculoP - TotalVMensP;
            
            VagasDispVeMensG.setText(""+ VagasDisponiveisClienteMensVG);
            VagasDispVeMensM.setText(""+ VagasDisponiveisClienteMensVM);
            VagasDispVeMensP.setText(""+ VagasDisponiveisClienteMensVP);
            
            /*---------------------------VAGAS DIARISTA-----------------------------------------*/ 
            int VagasDisponiveisClienteDiaVG = VagasDisponiveisClienteMensVG - TotalVdiaG;
            int VagasDisponiveisClienteDiaVM = VagasDisponiveisClienteMensVM - TotalVdiaM;
            int VagasDisponiveisClienteDiaVP = VagasDisponiveisClienteMensVP - TotalVdiaP;

            VagasDispVeDiaG.setText(""+ VagasDisponiveisClienteDiaVG);
            VagasDispVeDiaM.setText(""+ VagasDisponiveisClienteDiaVM);
            VagasDispVeDiaP.setText(""+ VagasDisponiveisClienteDiaVP);
            
            
            /*---------------------------VAGAS DIARISTA-----------------------------------------*/ 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular" +e);

        }
        
    }
    
    public void ValoresVeiMensais(){
        try {
            con_preco.executarSQL("select * from preco");
            con_preco.resultSet.first();
            
            valormesvgrande = Double.parseDouble(con_preco.resultSet.getString("valormesvgrande"));
            valormesvmedio = Double.parseDouble(con_preco.resultSet.getString("valormesvmedio"));
            valormesvpequeno = Double.parseDouble(con_preco.resultSet.getString("valormesvpequeno"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não possível localizar o preço");
        }
    }
    
    public void PesquisaTabelaContasAReceber(){
        ValoresVeiMensais();
        try {
            int Linha = TabelaContasaReceber.getSelectedRow();
            Con_contasareceber.executarSQL("select * from contasareceber where"
                    + " mes = '" + MesMens.getSelectedItem() + "' and ano = '" + AnoMens.getText() + "' order by cliente LIMIT " + Linha + " , 1 ");
            Con_contasareceber.resultSet.first();
            CodMens.setText(Con_contasareceber.resultSet.getString("cod"));
            NomeMens.setText(Con_contasareceber.resultSet.getString("cliente"));
            PlacaMens.setText(Con_contasareceber.resultSet.getString("placa"));
            MesMensStatus.setText(Con_contasareceber.resultSet.getString("mes"));
            AnoMensStatus.setText(Con_contasareceber.resultSet.getString("ano"));
            porte.setText(Con_contasareceber.resultSet.getString("porte"));
            modelo.setText(Con_contasareceber.resultSet.getString("modelo"));
            
            if(Con_contasareceber.resultSet.getString("porte").equals("G") & Con_contasareceber.resultSet.getString("valor").equals("0.00")){
                valorreceber.setText(""+valormesvgrande);
            }else if(Con_contasareceber.resultSet.getString("porte").equals("M") & Con_contasareceber.resultSet.getString("valor").equals("0.00")){
                valorreceber.setText(""+valormesvmedio);
            }else if(Con_contasareceber.resultSet.getString("porte").equals("P") & Con_contasareceber.resultSet.getString("valor").equals("0.00")){
                valorreceber.setText(""+valormesvpequeno);
            }else{
                valorreceber.setText(Con_contasareceber.resultSet.getString("valor"));
            }
            if(Con_contasareceber.resultSet.getString("status").equals("PENDENTE")){
                Statuspagam2.setSelected(true);
                StatusPagam ="PENDENTE";
            }else {
                Statuspagam1.setSelected(true);
                StatusPagam ="OK";
            }
        } catch (SQLException e) {
        } 
    }
    
    public void AlterarStatusPagamento(){
        
        try {
            String sql = "UPDATE contasareceber SET"
                    + " cliente = '" + NomeMens.getText() + "',"
                    + " placa = '" + PlacaMens.getText() + "',"
                    + " mes = '" + MesMensStatus.getText() + "',"
                    + " ano = '" + AnoMensStatus.getText() + "',"
                    + " porte = '" + porte.getText() + "',"
                    + " valor = '" + valorreceber.getText() + "',"
                    + " status = '" + StatusPagam + "',"
                    + " modelo = '" + modelo.getText() + "'"
                    + " where cod = " + CodMens.getText();
            
            Con_contasareceber.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Status Alterado!");
            Con_contasareceber.executarSQL("select * from contasareceber");
        } catch (SQLException e) {  
            JOptionPane.showMessageDialog(null, "Erro na Alteração!" + e);
        }
    }
    
    public void ExcluirDaTabelaContas(){
        try {
            String sqlDelete = "DELETE FROM contasareceber where cod = "+ CodMens.getText();
            Con_contasareceber.statement.executeUpdate(sqlDelete);
            JOptionPane.showMessageDialog(null, "Exclusão Realizada!");
            
            Con_contasareceber.executarSQL("select * from contasareceber");
            Con_contasareceber.resultSet.first();
  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir!");
  
        }
    }
    
    public void GerarContaPart0(){
        try {
            Con_contasareceber.executarSQL("select Count(cod)as TotalCod from contasareceber where"
               + " mes = '"+MesTP.getText()+"' and ano = '"+AnoTP.getText()+"'");
            Con_contasareceber.resultSet.first();
            TotalCodConta = Integer.parseInt(Con_contasareceber.resultSet.getString("TotalCod"));
            
            con_clientemen.executarSQL("select Count(cod)as ToTalDeClienteMen from clientemen");
            con_clientemen.resultSet.first();
            TotalDeClienteMen = Integer.parseInt(con_clientemen.resultSet.getString("TotalDeClienteMen"));
            
            if(TotalCodConta == 0 & TotalDeClienteMen > 0){
                GerarContaPart1();
                painelprogresso1.setVisible(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a contagem do código");
        }
    }
    
    public void GerarContaPart1(){
        if(LinhaNavega < TotalDeClienteMen){
            GerarContaPart2();
        }else{
            JOptionPane.showMessageDialog(null, "Operação completada com sucesso! ");
        PreencherTabelaContasAReceber();
        painelprogresso1.setVisible(false);
        }
    }
    
    public void GerarContaPart2(){
        try {
            con_clientemen.executarSQL("select * from clientemen order by cod LIMIT "+LinhaNavega+" , 1 ");
            con_clientemen.resultSet.first();
            NomeClien = (con_clientemen.resultSet.getString("nome"));
            PlacaVei = (con_clientemen.resultSet.getString("placa"));
            PorteVei = (con_clientemen.resultSet.getString("port"));
            Modelo = (con_clientemen.resultSet.getString("modelo"));
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Dados não encontrados ");
        }
        
        // GeraContaPart3();
        Tempo();
    }
    
    public void GeraContaPart3(){
        try {
            
            // Verifica se o ValorCont está vazio
        double VALOR;
        if (ValorCont.isEmpty()) {
            VALOR = 0.0; // Define um valor padrão, como zero
        } else {
            VALOR = Double.parseDouble(ValorCont); // Converte a string em double
        }
            String SQLInsert = "insert into contasareceber (cliente,placa,mes,ano,"
                    + "porte,valor,modelo,status) values ('"
                    + NomeClien+"','"
                    + PlacaVei+"','"
                    + MesTP.getText()+"','"
                    + AnoTP.getText()+"','"
                    + PorteVei+"','"
                    + VALOR+ "','"
                    + Modelo+"','"
                    + "PENDENTE"+ "')";
            Con_contasareceber.statement.executeUpdate(SQLInsert);
            //JOptionPane.showMessageDialog(null, "Entrada Registrada ");
            
            GeraContaPart4();
            
            Con_contasareceber.executarSQL("select * from contasareceber");
            Con_contasareceber.resultSet.first();
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro de Formato de Número: " + e.getMessage());

        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de Gravação " + e.getMessage());
        }
    }
    
    public void GeraContaPart4(){
        int V1 = 0;
        int porc = 0;
        V1 = LinhaNavega*100;
        porc = V1/TotalDeClienteMen;
        progressBar.setVisible(true);
        pc.setText(porc+"");
        
        if(LinhaNavega == (TotalDeClienteMen-1)){
            progressBar.setValue(100);
            pc.setText("100");
        }
        LinhaNavega++;
        GerarContaPart1();
    }
    
    public void Tempo(){
        Tempo cronometro = new Tempo(150, 30);
        cronometro.start();
    }
    
    public class Tempo extends Thread {
        private int delay; //Tempo em Milisegundos.
        private int tempo; //Tempo em Cronômetro.
        private int i;
        
        public Tempo (int pDeley, int pTempo) {
            this.delay = pDeley;
            this.tempo = pTempo;
        }
        
        public void run() {
            for(i=tempo; 1>=0; i--){
                try {
                    sleep(delay);
                } catch (InterruptedException e) {
                    //System.out.println("Problemas com Cronômetro Regressivo.");
                }
                //System.out.println(i);
                if(i==30){
                    GeraContaPart3();
                    stop();
                }
            }
        }
    }
    
    public void Gravar(){
        try{
        con_clientedia.executarSQL("select * from clientedia");
        String SQLinsert = "INSERT INTO clientedia (placa,cliente,telefone,porte,"
                + "dataentrada,horaentrada,datasaida,horasaida,valorreceber,mes,ano,presenca) VALUES ('"
                + placa.getText()+ "','"
                + cliente.getText()+ "','"
                + telefone.getText()+ "','"
                + tamanho + "','"
                + dataentrada.getText()+ "','"
                + horaentrada.getText()+ "','"
                + datasaida.getText()+ "','"
                + horasaida.getText()+ "','"
                + valorareceber.getText()+ "','"
                + "00" +"','"
                + "0000"+ "','"
                + "Presente" + "')";
        con_clientedia.statement.executeUpdate(SQLinsert);
        JOptionPane.showMessageDialog(null, "Entrada Registrada");
        
        placa.setText("");
        cliente.setText("");
        telefone.setText("");
        tamanho ="P";
        PPEQUENO.setSelected(true);
        
        con_clientedia.executarSQL("select * from clientedia");
        con_clientedia.resultSet.first();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro de Gravação" + e);
        }
    }
    
    public void BotaoRegistroEntrada(){
        Registro_Entrada_Saida.setVisible(true);
        BotaoSalvar.setVisible(true);
        BotaoSalvar.setText("Concluir Entrada");
        painerReceber.setVisible(false);
        BotaoExcluir.setVisible(false);
        
        BotaoPesquisar.setVisible(false);
        PainelDetalhe.setVisible(true);
        TestCodigo.setVisible(false);
        cod.setVisible(false);
        BotaoExcluir.setEnabled(false);
        registr = "E";
        tamanho = "P";
        
        PPEQUENO.setSelected(true);
        Data mostra_data = new Data();
        mostra_data.le_data();
        mostra_data.le_hora();
        dataentrada.setText(mostra_data.dia+"/"+mostra_data.mes+"/"+mostra_data.ano);
        horaentrada.setText(mostra_data.hora);
        datasaida.setText("00/00/0000");
        horasaida.setText("00:00");
        
        placa.setText("");
        cod.setText("");
        cliente.setText("");
        telefone.setText("");
    }
    
    public void BotaoRegistroSaida(){
        Registro_Entrada_Saida.setVisible(true);
        BotaoExcluir.setVisible(true);
        BotaoPesquisar.setVisible(true);
        PainelDetalhe.setVisible(false);
        painerReceber.setVisible(false);
        BotaoSalvar.setVisible(true);
        TestCodigo.setVisible(true);
        cod.setVisible(true);
        BotaoSalvar.setText("Concluir Saída");
        
        registr = "S";
        placa.setText("");
        cod.setText("");
        Data mostra_data = new Data();
        mostra_data.le_data();
        mostra_data.le_hora();
        datasaida.setText(mostra_data.dia+"/"+mostra_data.mes+"/"+mostra_data.ano);
        horasaida.setText(mostra_data.hora);
        dataentrada.setText("00/00/0000");
        horaentrada.setText("00:00");
        placa.setText("");
        cod.setText("");
        cliente.setText("");
        telefone.setText("");
        
    }
    
    public void PreencheTabelaClienteDiarista(){
        tabelaclientediarista.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelaclientediarista.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabelaclientediarista.getColumnModel().getColumn(2).setPreferredWidth(300);
        tabelaclientediarista.getColumnModel().getColumn(3).setPreferredWidth(150);
        tabelaclientediarista.getColumnModel().getColumn(4).setPreferredWidth(70);
        tabelaclientediarista.getColumnModel().getColumn(5).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaclientediarista.getModel();
        modelo.setNumRows(0);
        
        try {
            con_clientedia.executarSQL("select * from clientedia where presenca = 'Presente' order by cod");
            while (con_clientedia.resultSet.next()) 
            modelo.addRow(new Object[]{con_clientedia.resultSet.getString("cod"),
                    con_clientedia.resultSet.getString("cliente"),
                    con_clientedia.resultSet.getString("placa"),
                    con_clientedia.resultSet.getString("dataentrada"),
                    con_clientedia.resultSet.getString("horaentrada"),
                    con_clientedia.resultSet.getString("presenca")
                } );
                
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados"+e);
        }
    }
    
    public void MostraPesquisa(){
        try {
            con_clientedia.resultSet.first();
            cod.setText(con_clientedia.resultSet.getString("cod"));
            placa.setText(con_clientedia.resultSet.getString("placa"));
            cliente.setText(con_clientedia.resultSet.getString("cliente"));
            telefone.setText(con_clientedia.resultSet.getString("telefone"));
            dataentrada.setText(con_clientedia.resultSet.getString("dataentrada"));
            horaentrada.setText(con_clientedia.resultSet.getString("horaentrada"));
            CodGrav = con_clientedia.resultSet.getString("cod");
            PlacaGrav = con_clientedia.resultSet.getString("placa");
            
            if(con_clientedia.resultSet.getString("porte").equals("G")){
                PGRANDE.setSelected(true);
                tamanho = "G";
            } else if(con_clientedia.resultSet.getString("porte").equals("M")){
                PMEDIO.setSelected(true);
                tamanho = "M";
            } else{
                PPEQUENO.setSelected(true);
                tamanho = "P";
            }
        } catch (SQLException e) {
            PainelDetalhe.setVisible(false);
            painerReceber.setVisible(false);
            BotaoSalvar.setVisible(false);
            BotaoExcluir.setVisible(false);
            JOptionPane.showMessageDialog(null,"Placa não encontrada"+ e);
        }
    }
    
    public void PesquisaClicandoTabela(){
        Registro_Entrada_Saida.setVisible(true);
        BotaoExcluir.setVisible(true);
        BotaoExcluir.setEnabled(false);
        BotaoPesquisar.setVisible(true);
        PainelDetalhe.setVisible(true);
        painerReceber.setVisible(true);
        BotaoSalvar.setVisible(true);
        TestCodigo.setVisible(true);
        cod.setVisible(true);
        BotaoSalvar.setText("Concluir Saída"); 
        
        registr = "S";
        
        Data mostra_data = new Data();
        mostra_data.le_data();
        mostra_data.le_hora();
        datasaida.setText(mostra_data.dia+"/"+mostra_data.mes+"/"+mostra_data.ano);
        horasaida.setText(mostra_data.hora);
        
        int Linha = tabelaclientediarista.getSelectedRow();
        con_clientedia.executarSQL("select * from clientedia where presenca = 'Presente' order by cod LIMIT "+ Linha+ " , 1 ");
        MostraPesquisa();
    }
    public void PesquisaPelaPlaca(){
        con_clientedia.executarSQL("select * from clientedia where placa = '" + placa.getText() + "' and presenca = 'Presente'");
        MostraPesquisa();
    }
    public void PesquisaPorCod(){
         con_clientedia.executarSQL("select * from clientedia where presenca = 'Presente' and cod = "+cod.getText());
         MostraPesquisa();
    }
    
    public void RegistrarSaida(){
        try {
            String sql = "UPDATE clientedia SET"
                + " placa = '" + PlacaGrav+ "',"
                + " cliente = '" + cliente.getText() + "',"
                + " dataentrada = '" + dataentrada.getText() + "',"
                + " horaentrada = '" + horaentrada.getText() + "',"
                + " datasaida = '" + datasaida.getText() + "',"
                + " horasaida = '" + horasaida.getText() + "',"
                + " valorreceber = '" + valorareceber.getText() + "',"
                + " telefone = '" + telefone.getText() + "',"
                + " porte = '" + tamanho + "',"
                + " mes = '" + MesTP.getText() + "',"
                + " ano = '" + AnoTP.getText() + "',"
                + " presenca = 'Ausente'"
                + "where cod = "+ CodGrav;

            con_clientedia.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Saída registrada");
            placa.setText("");
            cod.setText("");
            cliente.setText("");
            telefone.setText("");
            con_clientedia.executarSQL("select * from clientedia");
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração" + e);
        }
    }
    
    public void Excluir(){
        try {
            String SQLDelet = "DELETE FROM clientedia where cod = " + CodGrav; 
            con_clientedia.statement.executeUpdate(SQLDelet);
            JOptionPane.showMessageDialog(null, "EXCLUSÃO REALIZADA");
            con_clientedia.executarSQL("select * from clientedia");
            con_clientedia.resultSet.first();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR" + e);
            
        }
    }
    
    public void PreencherTabelaHISTORICO(){
        
        TABELAHISTORICO.getColumnModel().getColumn(0).setPreferredWidth(50);
        TABELAHISTORICO.getColumnModel().getColumn(1).setPreferredWidth(350);
        TABELAHISTORICO.getColumnModel().getColumn(2).setPreferredWidth(100);
        TABELAHISTORICO.getColumnModel().getColumn(3).setPreferredWidth(100);
        TABELAHISTORICO.getColumnModel().getColumn(4).setPreferredWidth(100);
        TABELAHISTORICO.getColumnModel().getColumn(5).setPreferredWidth(100);
        TABELAHISTORICO.getColumnModel().getColumn(6).setPreferredWidth(100);
        TABELAHISTORICO.getColumnModel().getColumn(7).setPreferredWidth(100);
        
        DefaultTableModel modelo = (DefaultTableModel) TABELAHISTORICO.getModel();
        modelo.setNumRows(0);
        
        try {
            con_clientedia.executarSQL("select * from clientedia where presenca = 'Ausente' " + PesqPorData + " order by cod");
            while (con_clientedia.resultSet.next()){
                modelo.addRow(new Object[]{con_clientedia.resultSet.getString("cod"),
                con_clientedia.resultSet.getString("cliente"),
                con_clientedia.resultSet.getString("placa"),
                con_clientedia.resultSet.getString("dataentrada"),
                con_clientedia.resultSet.getString("horaentrada"),
                con_clientedia.resultSet.getString("datasaida"),
                con_clientedia.resultSet.getString("horasaida"),
                con_clientedia.resultSet.getString("presenca")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados" + e);
        }
    }
    
    public void ExcluirHistorico(){
        try{
        String SQLinsert ="DELETE FROM clientedia where cod = "+ CodHist.getText();
        con_clientedia.statement.executeUpdate(SQLinsert);
        JOptionPane.showMessageDialog(null, "EXCLUSÃO REALIZADA");
        
        con_clientedia.executarSQL("select * from clientedia");
        con_clientedia.resultSet.first();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "ERRO AO TENTAR EXCLUIR");
        }
    }
    
    public void ContarHistorico(){
        try {
            con_clientedia.executarSQL("SELECT Count(cod)as TotalCod FROM clientedia "
                    + "where presenca = 'Ausente' "+PesqPorData+" ");
            con_clientedia.resultSet.first();
            TotalRegistro.setText(con_clientedia.resultSet.getString("TotalCod"));
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a contagem do codigo"+ e);
        }
    }
}
