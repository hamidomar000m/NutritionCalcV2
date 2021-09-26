package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel line = new JLabel("");
		line.setOpaque(true);
		line.setBackground(Color.BLACK);
		line.setBounds(498, 156, 4, 400);
		frame.getContentPane().add(line);
		
		JLabel appNameLbl = new JLabel("Clean Eat");
		appNameLbl.setBackground(new Color(0, 0, 0));
		appNameLbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 44));
		appNameLbl.setBounds(413, 22, 205, 52);
		frame.getContentPane().add(appNameLbl);
		
		JButton ern�hrungsempfehlungBtn = new JButton("Ern\u00E4hrungsempfehlung");
		ern�hrungsempfehlungBtn.setBounds(41, 611, 171, 23);
		frame.getContentPane().add(ern�hrungsempfehlungBtn);
		
		JButton settingsBtn = new JButton("Settings");
		settingsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Settings clicked");
			}
		});
		settingsBtn.setBounds(854, 611, 89, 23);
		frame.getContentPane().add(settingsBtn);
		
		//Creating the diagram
		DefaultPieDataset<String> pieDataSet = new DefaultPieDataset<String>();
		pieDataSet.setValue("proteins", 110.0);
		pieDataSet.setValue("carbohydrates", 245.0);
		pieDataSet.setValue("fats", 75.0);
		
		JFreeChart pieChart = ChartFactory.createPieChart("N�hrstoffverteilung", pieDataSet,  true,  true,  true);
		//PiePlot<?> plotter = (PiePlot<?>) pieChart.getPlot();
		ChartPanel chartPnl = new ChartPanel(pieChart);
		chartPnl.setBackground(new Color(154, 205, 50));
		chartPnl.setBounds(51, 156, 392, 400);
		chartPnl.setLayout(null);
		frame.getContentPane().add(chartPnl);
		
		JLabel dayLbl = new JLabel("Montag");
		dayLbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		dayLbl.setBounds(522, 156, 101, 33);
		frame.getContentPane().add(dayLbl);
		
		JLabel caloriesDayLbl = new JLabel("Offene Kalorien f\u00FCr den Tag: 2184");
		caloriesDayLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		caloriesDayLbl.setBounds(522, 200, 244, 19);
		frame.getContentPane().add(caloriesDayLbl);
		
		JLabel caloriesWeekLbl = new JLabel("Offene Kalorien f\u00FCr die Woche: 15291");
		caloriesWeekLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		caloriesWeekLbl.setBounds(522, 230, 269, 19);
		frame.getContentPane().add(caloriesWeekLbl);
		
		JLabel makron�hrstoffeLbl = new JLabel("Makron\u00E4hrstoffe");
		makron�hrstoffeLbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		makron�hrstoffeLbl.setBounds(522, 289, 144, 21);
		frame.getContentPane().add(makron�hrstoffeLbl);
		
		JLabel carbohydratesLbl = new JLabel("Kohlenhydrate: 245g");
		carbohydratesLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		carbohydratesLbl.setBounds(522, 319, 149, 19);
		frame.getContentPane().add(carbohydratesLbl);
		
		JLabel proteinsLbl = new JLabel("Proteine: 110g");
		proteinsLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		proteinsLbl.setBounds(522, 349, 104, 19);
		frame.getContentPane().add(proteinsLbl);
		
		JLabel fatsLbl = new JLabel("Fette: 75g");
		fatsLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		fatsLbl.setBounds(522, 379, 73, 19);
		frame.getContentPane().add(fatsLbl);
		
		JLabel mikron�hrstoffeLbl = new JLabel("Mikron\u00E4hrstoffe");
		mikron�hrstoffeLbl.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		mikron�hrstoffeLbl.setBounds(522, 422, 138, 21);
		frame.getContentPane().add(mikron�hrstoffeLbl);
		
		JLabel magnesiumLbl = new JLabel("Magnesium: ");
		magnesiumLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		magnesiumLbl.setBounds(522, 454, 92, 19);
		frame.getContentPane().add(magnesiumLbl);
		
		JLabel ironLbl = new JLabel("Eisen:");
		ironLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		ironLbl.setBounds(522, 484, 45, 19);
		frame.getContentPane().add(ironLbl);
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}