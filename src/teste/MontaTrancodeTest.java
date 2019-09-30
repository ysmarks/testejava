package teste;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Lists;



public class MontaTrancodeTest {
	
	private static final String INICIO = ">";
	private static final String FINAL = "^";
	private static final String SEPARADOR = "@";
	private static final String COMANDO = "C";
	private static final String TRANSACAO = "SMT";
	private static final String HEADER = "00A0000			H0000001ER1	0050";
	private static final String FORMATO = "EK01";
	private static final String INSTITUICAO = "004341";
	private static final String OPERACAO = "TEF";
	private static final int ESCALA = 2;
	
	
	public static void main(String[] args) {
		
		ZoneOffset z = ZoneOffset.of("+03:00");
		String o = OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		System.out.println(o);
		
		/*
		 * Dados entidadeNotificacao = new Dados(); Stream<String> nomes =
		 * Lists.newArrayList( FORMATO, INSTITUICAO,
		 * formatarDadosConta(entidadeNotificacao),
		 * formatarTitular(entidadeNotificacao.getTitular()),
		 * normalizarValores(entidadeNotificacao.getValor()), OPERACAO).stream(); String
		 * trancode = String.format("%s%s", HEADER,
		 * nomes.collect(Collectors.joining(SEPARADOR, INICIO, SEPARADOR+FINAL)));
		 * System.out.println(trancode);
		 */
		
	}
	public static Payload traduzir(Dados entidadeNotificacao) {
		Stream<String> dadosTrancode = Lists.newArrayList(
				FORMATO,
				INSTITUICAO,
				formatarDadosConta(entidadeNotificacao),
				formatarTitular(entidadeNotificacao.getTitular()),
				normalizarValores(entidadeNotificacao.getValor()),
				OPERACAO).stream();
		String trancode = String.format("%s%s", HEADER, dadosTrancode.collect(Collectors.joining(SEPARADOR, INICIO, SEPARADOR + FINAL)));
		
		return new Payload(COMANDO, TRANSACAO, trancode);
	}
	
	private static String formatarDadosConta(final Dados entidadeNotificacao) {
		return String.format("%04d%07d%01d%06d", 
				entidadeNotificacao.getAgencia(),
				entidadeNotificacao.getConta(),
				entidadeNotificacao.getDac(),
				entidadeNotificacao.getSufixo());
	}
	
	private static String formatarTitular(final Integer titular) {
		return String.format("%06d", titular);
	}
	
	private static String normalizarValores(final BigDecimal valor) {
		return String.format("%05d", valor.setScale(ESCALA).unscaledValue());
	}


}
