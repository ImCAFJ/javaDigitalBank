package br.esig.com.carlosbank.dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

/** Esta entidade que define o que é um cartÃ£o de crÃ©dito.
 * 
 * Um cartão de crédito é composto por: <p><br />
 * Um nÃºmero de 16 dígitos <p><br />
 * Data de validade do cartão <p><br />
 * Código de segurança de 3 dígitos <p><br />
 * 
 * @author Carlos Alberto
 * @since 30/05/2022
 * @version 1.0
 */
public class CartaoCredito {
	
	private Integer numeroCartao;
	
	private Date validade;
	
	private Integer codigoSeguranca;
	
	public CartaoCredito() throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Random random = new Random();
		
		this.numeroCartao = random.nextInt(16);
		this.codigoSeguranca = random.nextInt(3);
		this.validade = simpleDateFormat.parse("01/01/2030");
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Integer getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(Integer codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public Integer getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Integer numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

}
