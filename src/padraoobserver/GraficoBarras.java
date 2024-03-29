package padraoobserver;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoBarras implements Observador {

	private DefaultCategoryDataset dataSet;
	private JFrame frame = new JFrame();

	public GraficoBarras() {
		dataSet = new DefaultCategoryDataset();
		JFreeChart chart = ChartFactory.createBarChart("Carteira de A��es", "Siglas", "Quantidade", dataSet,
				PlotOrientation.VERTICAL, false, true, false);
		
		ChartPanel chartPanel = new ChartPanel(chart);
		frame.setContentPane(chartPanel);
		frame.setSize(500, 270);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mudancaQuantidade(String acao, Integer qtd) {
		dataSet.setValue(qtd, "quantidade", acao);
	}

}
