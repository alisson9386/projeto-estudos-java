package cursojava.date;

import java.text.DecimalFormat;
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
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("\n\nNome do cliente: " + nome +
				"\nProduto comprado: " + produto + 
				"\nValor do produto: R$" + valorProduto + 
				"\nNúmero de parcelas: " + parcelaDesejada +
				"\nDetalhamento das parcelas: " +
				"\nParcela " + parcela + ", vencimento é: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()) + 
				"\nValor da Parcela: R$"+df.format(valorParcela));
		
		/*
		 * JOptionPane.showMessageDialog(null, "\n\nNome do cliente: " + nome +
		 * "\nProduto comprado: " + produto + "\nValor do produto: " + valorProduto +
		 * "\nNúmero de parcelas: " + parcelaDesejada + "\nDetalhamento das parcelas: "
		 * + "Parcela " + parcela + ", vencimento é: " + new
		 * SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()) +
		 * "\nValor da Parcela: "+valorParcela);
		 */
		}
		
		}
		
	}

