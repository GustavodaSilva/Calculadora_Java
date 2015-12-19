package calculadora;

public class CalculadoraBasica extends javax.swing.JFrame {
char operacao;
        public void limpar(){
        jLabel1.setText(" ");

    }
    
    public CalculadoraBasica() {
        initComponents();
    }
    double n1;
    double n2;
    double resultado;    
    boolean virgula;
    public double resultado(char op)
    {
        switch(op)
        {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            case 'n':
                resultado = n1 * n2;
                break;
            case 'y':
                resultado = Math.pow(n1, n2);
                break;
        }
        return resultado;
    }
    
    public String getVisor()
    {
        if("0".equals(jLabel1.getText()))
        {
            return "";
        }
        else
        {
            return jLabel1.getText();
        }       
    }
    
    public void setVetor()
    {
        if(!"0".equals(getVisor()) && n1 == 0 && !"".equals(getVisor()))
        {        
            n1 = Double.parseDouble(getVisor().replaceAll(",", "."));       
            limpaVisor(false);
            
        }else if(!"0".equals(getVisor()) && n2 == 0 && !"".equals(getVisor()))
        {
            n2 = Double.parseDouble(getVisor().replaceAll(",", "."));       
            limpaVisor(false);   
        }
    }
        
    public void limpaVisor(boolean tipo)
    {
        jLabel1.setText("");
        
        if(tipo == true)
        {
            n1 =  0;
            n2 =  0;
            operacao = ' ';
            jLabel1.setText("0");
        }else{
        
        }
        
        virgula = false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        Botao01 = new javax.swing.JButton();
        Botao02 = new javax.swing.JButton();
        Botao03 = new javax.swing.JButton();
        Botao04 = new javax.swing.JButton();
        Botao05 = new javax.swing.JButton();
        Botao06 = new javax.swing.JButton();
        Botao07 = new javax.swing.JButton();
        Botao08 = new javax.swing.JButton();
        Botao09 = new javax.swing.JButton();
        Botao00 = new javax.swing.JButton();
        Virgula = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        BotaoC = new javax.swing.JButton();
        BotaoCE = new javax.swing.JButton();
        Soma = new javax.swing.JButton();
        Subtracao = new javax.swing.JButton();
        Multiplicacao = new javax.swing.JButton();
        Divisao = new javax.swing.JButton();
        dividir_1 = new javax.swing.JButton();
        negativo = new javax.swing.JButton();
        Quadrado = new javax.swing.JButton();
        elevado_y = new javax.swing.JButton();
        elevado = new javax.swing.JButton();
        fatorial = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Botao01.setText("1");
        Botao01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao01ActionPerformed(evt);
            }
        });

        Botao02.setText("2");
        Botao02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao02ActionPerformed(evt);
            }
        });

        Botao03.setText("3");
        Botao03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao03ActionPerformed(evt);
            }
        });

        Botao04.setText("4");
        Botao04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao04ActionPerformed(evt);
            }
        });

        Botao05.setText("5");
        Botao05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao05ActionPerformed(evt);
            }
        });

        Botao06.setText("6");
        Botao06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao06ActionPerformed(evt);
            }
        });

        Botao07.setText("7");
        Botao07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao07ActionPerformed(evt);
            }
        });

        Botao08.setText("8");
        Botao08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao08ActionPerformed(evt);
            }
        });

        Botao09.setText("9");
        Botao09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao09ActionPerformed(evt);
            }
        });

        Botao00.setText("0");
        Botao00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao00ActionPerformed(evt);
            }
        });

        Virgula.setText(",");
        Virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VirgulaActionPerformed(evt);
            }
        });

        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });

        BotaoC.setText("C");
        BotaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCActionPerformed(evt);
            }
        });

        BotaoCE.setText("CE");
        BotaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCEActionPerformed(evt);
            }
        });

        Soma.setText("+");
        Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SomaActionPerformed(evt);
            }
        });

        Subtracao.setText("-");
        Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtracaoActionPerformed(evt);
            }
        });

        Multiplicacao.setText("*");
        Multiplicacao.setToolTipText("");
        Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacaoActionPerformed(evt);
            }
        });

        Divisao.setText("/");
        Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisaoActionPerformed(evt);
            }
        });

        dividir_1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dividir_1.setText("1/x");
        dividir_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividir_1ActionPerformed(evt);
            }
        });

        negativo.setText("+/-");
        negativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativoActionPerformed(evt);
            }
        });

        Quadrado.setText("X²");
        Quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuadradoActionPerformed(evt);
            }
        });

        elevado_y.setText("XY");
        elevado_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevado_yActionPerformed(evt);
            }
        });

        elevado.setText("^");
        elevado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        elevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadoActionPerformed(evt);
            }
        });

        fatorial.setText("Fat");
        fatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatorialActionPerformed(evt);
            }
        });

        jMenu1.setText("Exibir");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BotaoCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(elevado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fatorial))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(dividir_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(negativo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Quadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(elevado_y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Botao01, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(Botao04, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao05, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Botao06, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Botao02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Botao03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Botao07, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao08, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao09, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Botao00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao07, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao08, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao09, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao06, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao05, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao04, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Soma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao01, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao03, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividir_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(negativo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevado_y, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao00, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elevado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao06ActionPerformed
      jLabel1.setText(getVisor()+"6");
    }//GEN-LAST:event_Botao06ActionPerformed
    private void Botao01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao01ActionPerformed
        jLabel1.setText(getVisor()+"1");
      
    }//GEN-LAST:event_Botao01ActionPerformed
    private void elevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadoActionPerformed
        if(n1 == 0 && n2 == 0){
            double resultado = Math.sqrt(Double.parseDouble(getVisor()));
            jLabel1.setText(String.valueOf(resultado).replace(".", ","));
        }
        else if(n1 != 0 && n2 == 0){
            double resultado = Math.sqrt(Double.parseDouble(getVisor()));
            jLabel1.setText(String.valueOf(resultado).replace(".", ","));
        } 
    }//GEN-LAST:event_elevadoActionPerformed

    private void BotaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCActionPerformed
        limpaVisor(true);
    }//GEN-LAST:event_BotaoCActionPerformed
    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        if(n1 != 0 && operacao != ' ')
        {        
            n2 = Double.parseDouble(getVisor().replace(",", "."));            

            resultado = resultado(operacao);
            
            limpaVisor(true);          
            
            n1 = resultado;           
            
            jLabel1.setText(String.valueOf(resultado).replace(".", ","));     
            
            virgula = true;
        }       
    }//GEN-LAST:event_IgualActionPerformed
    private void Botao02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao02ActionPerformed
        jLabel1.setText(getVisor()+"2");
    }//GEN-LAST:event_Botao02ActionPerformed

    private void SomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SomaActionPerformed
        operacao = '+';
        setVetor();
    }//GEN-LAST:event_SomaActionPerformed

    private void Botao03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao03ActionPerformed
      jLabel1.setText(getVisor()+"3");
    }//GEN-LAST:event_Botao03ActionPerformed

    private void Botao04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao04ActionPerformed
      jLabel1.setText(getVisor()+"4");
    }//GEN-LAST:event_Botao04ActionPerformed

    private void Botao05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao05ActionPerformed
      jLabel1.setText(getVisor()+"5");
    }//GEN-LAST:event_Botao05ActionPerformed

    private void Botao07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao07ActionPerformed
      jLabel1.setText(getVisor()+"7");
    }//GEN-LAST:event_Botao07ActionPerformed

    private void Botao08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao08ActionPerformed
      jLabel1.setText(getVisor()+"8");
    }//GEN-LAST:event_Botao08ActionPerformed

    private void Botao09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao09ActionPerformed
       jLabel1.setText(getVisor()+"9");
    }//GEN-LAST:event_Botao09ActionPerformed

    private void Botao00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao00ActionPerformed
      jLabel1.setText(getVisor()+"0");
    }//GEN-LAST:event_Botao00ActionPerformed

    private void VirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VirgulaActionPerformed
        if(!virgula)
        {
            jLabel1.setText(getVisor()+",");
            virgula = true;
        }
    }//GEN-LAST:event_VirgulaActionPerformed

    private void BotaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCEActionPerformed
        if(getVisor().length() > 0)
        {
            if(getVisor().charAt(getVisor().length()-1) == ',')
            {
                virgula = false;
            }
            
            jLabel1.setText(getVisor().substring(0, getVisor().length() - 1));    
            
        }
    }//GEN-LAST:event_BotaoCEActionPerformed

    private void dividir_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividir_1ActionPerformed
        if(n1 == 0 && n2 == 0)
        {
            double valor = Double.parseDouble(getVisor());
            double resultado =  1 / valor;
            jLabel1.setText(String.valueOf(resultado).replace(".", ","));
        } 
    }//GEN-LAST:event_dividir_1ActionPerformed

    private void SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtracaoActionPerformed
        operacao = '-';
        setVetor();      
    }//GEN-LAST:event_SubtracaoActionPerformed

    private void MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacaoActionPerformed
        operacao = '*';
        setVetor(); 
    }//GEN-LAST:event_MultiplicacaoActionPerformed

    private void DivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisaoActionPerformed
        operacao = '/';
        setVetor();
    }//GEN-LAST:event_DivisaoActionPerformed

    private void negativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativoActionPerformed
        double valor = Double.parseDouble(getVisor());
        valor = valor * -1;
        jLabel1.setText(String.valueOf(valor));
    }//GEN-LAST:event_negativoActionPerformed

    private void elevado_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevado_yActionPerformed
        operacao = 'y';
        setVetor();
    }//GEN-LAST:event_elevado_yActionPerformed

    private void QuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuadradoActionPerformed
        if(n1 == 0 && n2 == 0)
        {
            double valor = Double.parseDouble(getVisor());
            double resultado = valor * valor;
            jLabel1.setText(String.valueOf(resultado).replace(".", ","));
        }
    }//GEN-LAST:event_QuadradoActionPerformed

    private void fatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatorialActionPerformed
        
    }//GEN-LAST:event_fatorialActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraBasica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao00;
    private javax.swing.JButton Botao01;
    private javax.swing.JButton Botao02;
    private javax.swing.JButton Botao03;
    private javax.swing.JButton Botao04;
    private javax.swing.JButton Botao05;
    private javax.swing.JButton Botao06;
    private javax.swing.JButton Botao07;
    private javax.swing.JButton Botao08;
    private javax.swing.JButton Botao09;
    private javax.swing.JButton BotaoC;
    private javax.swing.JButton BotaoCE;
    private javax.swing.JButton Divisao;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Multiplicacao;
    private javax.swing.JButton Quadrado;
    private javax.swing.JButton Soma;
    private javax.swing.JButton Subtracao;
    private javax.swing.JButton Virgula;
    private javax.swing.JButton dividir_1;
    private javax.swing.JButton elevado;
    private javax.swing.JButton elevado_y;
    private javax.swing.JButton fatorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton negativo;
    // End of variables declaration//GEN-END:variables
}
