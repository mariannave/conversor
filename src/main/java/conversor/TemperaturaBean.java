package conversor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="temperaturaBean")
@RequestScoped
public class TemperaturaBean {
	double celsius;
	double fahrenheit;
	
	double convertidoCelsius;
	double convertidoFahrenheit;
	
	double resultado;
	
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public double getConvertidoCelsius() {
		return convertidoCelsius;
	}
	public void setConvertidoCelsius(double convertidoCelsius) {
		this.convertidoCelsius = convertidoCelsius;
	}
	public double getConvertidoFahrenheit() {
		return convertidoFahrenheit;
	}
	public void setConvertidoFahrenheit(double convertidoFahrenheit) {
		this.convertidoFahrenheit = convertidoFahrenheit;
	}
	
	public void convertFahrenheit(){
		System.out.println("Convertendo pra Fahrenheit");
		resultado = (this.celsius * 1.8)+ 32.0;
		this.setConvertidoFahrenheit(resultado);
	}
	
	public void convertCelsius(){
		System.out.println("Convertendo pra Celsius");
		resultado = (5.0 / 9.0) * (this.fahrenheit - 32.0);
		this.setConvertidoCelsius(resultado);
	}
	
	

}
