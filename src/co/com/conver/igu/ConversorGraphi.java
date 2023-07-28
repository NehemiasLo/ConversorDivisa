package co.com.conver.igu;

/**
 * 
 * @author NehemiasDiaz
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ConversorGraphi extends JFrame {

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1, opcion2, opcion3;

	double peso, dolares, euros, libras, yen, won;
	double pulgadas, yardas, millas, preferencia;
	int continuar;

	
	public ConversorGraphi() {
		setSize(500, 300);
		setTitle("Conversor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		mostrarMenu();
		panel.add(menuBar);
		add(panel);

	}

	private void mostrarMenu() {
		// Inicializacion de los atributos
		menuBar = new JMenuBar();
		menu = new JMenu("Seleccione una opción de conversión");
		opcion1 = new JMenuItem("Conversor de Moneda");
		opcion2 = new JMenuItem("Conversor de Longitud");
		opcion3 = new JMenuItem("Salir");

		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);

		menuBar.add(menu);

// código para convertir moneda
		opcion1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// pidiendo el valor a convertir
				try {
					double importe = Integer.parseInt(
							JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir: ",
									"Importe", JOptionPane.CLOSED_OPTION));

					String[] possibleValues = { "De Pesos a Dólares", "De Pesos a Euro", "De Pesos a Libras",
							"De Pesos a Yen Japonés", "De Pesos a Won Coreano", "De Dólares a Pesos", "De Euro a Pesos",
							"De Libras a Pesos", "De Yen a Pesos", "De Won a Pesos" };
					String selectedValue = (String) JOptionPane.showInputDialog(null,
							"Elije la moneda a la que deseas convertir tu dinero", "Monedas",
							JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
					while (selectedValue != null) {
						switch (selectedValue) {

						case "De Pesos a Dólares":
							dolares = importe * 0.00025;
							JOptionPane.showMessageDialog(null,
									"Tienes " + String.format(java.util.Locale.US, "%.2f", dolares) + " Dólares",
									importe + " Pesos", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Pesos a Euro":
							euros = importe * 0.00023;
							JOptionPane.showMessageDialog(null,
									"Tienes " + String.format(java.util.Locale.US, "%.2f", euros) + " Euros",
									importe + " Pesos", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Pesos a Libras":
							libras = importe * 0.00020;
							JOptionPane.showMessageDialog(null,
									"Tienes " + String.format(java.util.Locale.US, "%.2f", libras)
											+ " Libras Esterlinas",
									importe + " Pesos", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Pesos a Yen Japonés":
							yen = importe * 0.036;
							JOptionPane.showMessageDialog(null,
									"Tienes " + String.format(java.util.Locale.US, "%.2f", yen) + " Yen Japones",
									importe + " Pesos", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Pesos a Won Coreano":
							won = importe * 0.32;
							JOptionPane.showMessageDialog(null, "Tienes " + won + " Won Coreano", importe + " Pesos",
									JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Dólares a Pesos":
							peso = importe * 3953.11;
							JOptionPane.showMessageDialog(null, "Tienes " + peso + " Pesos", importe + " Dólares",
									JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Euro a Pesos":
							euros = importe * 4338.20;
							JOptionPane.showMessageDialog(null, "Tienes " + euros + " Pesos", importe + " Euros",
									JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Libras a Pesos":
							libras = importe * 5057.11;
							JOptionPane.showMessageDialog(null, "Tienes " + libras + " Pesos", importe + " Libras",
									JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Yen a Pesos":
							yen = importe * 28.34;
							JOptionPane.showMessageDialog(null, "Tienes " + yen + " Pesos", importe + " Yen",
									JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Won a Pesos":
							won = importe * 3.07;
							JOptionPane.showMessageDialog(null, "Tienes " + won + " Pesos", importe + " Won",
									JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						default:
							JOptionPane.showMessageDialog(null, "No elegiste la opción correcta");
							break;
						}

						continuar = JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?", "Confirmando",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar == 0) {
							JOptionPane.showConfirmDialog(null, menuBar, "Conversor", JOptionPane.CLOSED_OPTION);
						} else {
							JOptionPane.showMessageDialog(null, "Programa finalizado", "Conversor",
									JOptionPane.CLOSED_OPTION);
							System.exit(ABORT);
						}

					}
					JOptionPane.showMessageDialog(null, "Hasta pronto", "Abandonando", JOptionPane.CLOSED_OPTION);
					System.exit(ABORT);

				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Ingresa sólo valores numéricos", "Valor no válido",
							JOptionPane.CLOSED_OPTION);

				}
			}
		});
// Opcion conversion medidas de longitud
		opcion2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					// pidiendo el valor a convertir
					double medicion = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingrese el valor  que desea convertir: ", "Medición", JOptionPane.CLOSED_OPTION));

					String[] alternativa = { "De Pulgadas a Milimetros", "De Pulgadas a Metros",
							"De Yardas a Centímetros", "De Yardas a Metros", "De Millas a Kilometros" };
					String elegida = (String) JOptionPane.showInputDialog(null, "Elije la preferencia a convertir",
							"Unidades de medida", JOptionPane.INFORMATION_MESSAGE, null, alternativa, alternativa[0]);

					while (elegida != null) {
						switch (elegida) {

						case "De Pulgadas a Milimetros":
							pulgadas = medicion * 25.4;
							JOptionPane
									.showMessageDialog(null,
											"Equivalen a " + String.format(java.util.Locale.US, "%.2f", pulgadas)
													+ " Milímetros",
											medicion + " Pulgadas", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Pulgadas a Metros":
							pulgadas = medicion * 0.0254;
							JOptionPane.showMessageDialog(null,
									"Equivalen a " + String.format(java.util.Locale.US, "%.2f", pulgadas) + " Metros",
									medicion + " Pulgadas", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Yardas a Centímetros":
							yardas = medicion * 91.44;
							JOptionPane
									.showMessageDialog(null,
											"Equivalen a " + String.format(java.util.Locale.US, "%.2f", yardas)
													+ " Centímetros",
											medicion + " Yardas", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Yardas a Metros":
							yardas = medicion * 0.9144;
							JOptionPane.showMessageDialog(null,
									"Equivalen a " + String.format(java.util.Locale.US, "%.2f", yardas) + " Metros",
									medicion + " Yardas", JOptionPane.YES_NO_CANCEL_OPTION);
							break;
						case "De Millas a Kilometros":
							millas = medicion * 1609.34;
							JOptionPane.showMessageDialog(null,
									"Equivalen a " + String.format(java.util.Locale.US, "%.2f", millas) + " Kilómetros",
									medicion + " Millas", JOptionPane.YES_NO_CANCEL_OPTION);
							break;

						default:
							JOptionPane.showMessageDialog(null, "No elegiste la opción correcta");
							break;
						}
						continuar = JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?", "Confirmando",
								JOptionPane.YES_NO_CANCEL_OPTION);

						if (continuar == 0) {
							JOptionPane.showConfirmDialog(null, menuBar, "Conversor", JOptionPane.CLOSED_OPTION);
						} else {
							JOptionPane.showMessageDialog(null, "Programa finalizado", "Conversor",
									JOptionPane.CLOSED_OPTION);
							System.exit(ABORT);
						}
					}

					JOptionPane.showMessageDialog(null, "Hasta pronto", "Abandonando", JOptionPane.CLOSED_OPTION);
					System.exit(ABORT);

				} catch (NumberFormatException e1) {
					JOptionPane.showInternalMessageDialog(null, "Ingresa sólo valores numéricos", "Valor no válido",
							JOptionPane.CLOSED_OPTION);

				}

			}

		});

		opcion3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saliendo ", "Conversor", JOptionPane.CLOSED_OPTION);
				System.exit(ABORT);
			}
		});
	}

	public static void main(String[] args) {
		ConversorGraphi ventana = new ConversorGraphi(); // objeto ventana
		ventana.setVisible(true);
	}

}
