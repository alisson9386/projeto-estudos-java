package cursojava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		String nome = JOptionPane.showInputDialog("Nome do cliente");
		
		String produto = JOptionPane.showInputDialog("Produto comprado");
		
		double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto"));
		
		int parcelaDesejada = Integer.parseInt(JOptionPane.showInputDialog("Número de parcelas"));
		
		double valorParcela = valorProduto / parcelaDesejada;
		
		Date dataInicial = new SimpleDateFormat("dd-MM-yyyy").parse("30-03-2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for(int parcela = 1 ; parcela <= parcelaDesejada ; parcela ++) {
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Parcela " + parcela + ", vencimento é: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		JOptionPane.showMessageDialog(null, "Nome do cliente: " + nome +
											"\nProduto comprado: " + produto + 
											"\nValor do produto: " + valorProduto + 
											"\nNúmero de parcelas: " + parcelaDesejada +
											"\nDetalhamento das parcelas: " +
											"Parcela " + parcela + ", vencimento é: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()) + 
											"\nValor da Parcela: "+valorParcela);
		}
		
		}
		
	}

