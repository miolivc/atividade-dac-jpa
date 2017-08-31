/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.br.atividade.dac.oficina;

import java.time.LocalDate;

/**
 *
 * @author ifpb
 */
public class OficinaApp {
    
    public static void main(String[] args) {
        
        Localizacao localizacao = new Localizacao();
        localizacao.setCidade("Cajazeiras");
        localizacao.setNumero(22);
        localizacao.setRua("projetada");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("000.000.000-00");
        funcionario.setFuncao(FuncaoFuncionario.EMPREGADO);
        funcionario.setNome("João");
        funcionario.setRg("1233233");
        funcionario.setSalario(1235.00);
        
        Oficina oficina = new Oficina();
        oficina.setLocalizacao(localizacao);
        oficina.getFuncionarios().add(funcionario);
        oficina.setSaldo(1213121.30);
        
        ConsertoPK consertoPK = new ConsertoPK();
        consertoPK.setDataConserto(LocalDate.now());
        consertoPK.setOficina(oficina);
        consertoPK.setFuncionario(funcionario);
        
        Conserto conserto = new Conserto();
        conserto.setConsertoPK(consertoPK);
        conserto.setValor(1213222.32);
        
        ConsertoDAO dao = new ConsertoDAO();
        dao.add(conserto);
        
    }
    
}
