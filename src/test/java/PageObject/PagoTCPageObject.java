package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;


@DefaultUrl ("https://www.colsubsidio.com/ssoc/#/ingresar?goto=http:%2F%2F40.117.63.112%2Fportal%2Fsalud")

public class PagoTCPageObject extends PageObject {


	@WhenPageOpens
	public void maximiseScreen() throws InterruptedException {
		getDriver().manage().window().maximize();
		Thread.sleep(1000);
	}

	Properties loadProperty = new Properties();	
	
	//HOME
	static By User = PagoTCElements.txtUser.getValor_campo();
	static By Pass = PagoTCElements.txtPass.getValor_campo();
	static By Ing = PagoTCElements.btningreso.getValor_campo();
	static By Servicio = PagoTCElements.btnserv.getValor_campo();
	static By Ingreso = PagoTCElements.btningresarportal.getValor_campo();
	//AGENDAR CITA
	static By Agendar = PagoTCElements.btnagendar.getValor_campo();
	//TIPO DE CITA
	static By TipoCita = PagoTCElements.btntipocita.getValor_campo();
	static By CitaPresencial = PagoTCElements.btncitapresencial.getValor_campo();
	//SELECCION DE CIUDAD
	static By Ciudad = PagoTCElements.btnciudad.getValor_campo();
	static By Bogota = PagoTCElements.btnBogota.getValor_campo();
	static By ConfirmarCiudad = PagoTCElements.btnconfirmarciudad.getValor_campo();
	//SELECCION CENTRO MEDICO
	static By CentroMedico = PagoTCElements.btncentromedico.getValor_campo();
	static By CentroMedicoSuba = PagoTCElements.btncentromedicosuba.getValor_campo();
	static By Horario = PagoTCElements.btnhorario.getValor_campo();
	static By ConfirmarHorario = PagoTCElements.btnconfirmarhora.getValor_campo();
	//SELECCION FECHA
	static By Fecha = PagoTCElements.btnfecha.getValor_campo();
	static By ValidacionDisponibilidad = PagoTCElements.txtValidacionDisponibilidad.getValor_campo();
	static By Atras = PagoTCElements.btnAtras.getValor_campo();
	static By Hora = PagoTCElements.btnconfirmarhora.getValor_campo();
	static By Medico = PagoTCElements.btnmedico.getValor_campo();
	static By ConfirmarFecha = PagoTCElements.btnconfirmarfecha.getValor_campo();
	//ConfirmarReserva
	static By ConfirmarReserva = PagoTCElements.btnconfirmarreserva.getValor_campo();
	//PAGO
	static By BtnCitasAegndadas = PagoTCElements.btnCitasAgendadas.getValor_campo();
	static By BtnPagarCitaAgendada = PagoTCElements.btnPagarCitaAgendada.getValor_campo();
	static By BtnIconoPago = PagoTCElements.btnIcono.getValor_campo();
	static By TxtCel = PagoTCElements.txtCel.getValor_campo();
	static By TxtEmail = PagoTCElements.txtemail.getValor_campo();
	static By Captchat = PagoTCElements.btnCaptchat.getValor_campo();
	static By BtnConfirmarDatos = PagoTCElements.btnPagar.getValor_campo();
	static By BtnPSE = PagoTCElements.btnPSE.getValor_campo();
	static By MsjCreacion = PagoTCElements.MnsjCreacion.getValor_campo();
	//TIPO PERSONA
	static By BtnTipoPersona = PagoTCElements.btnTipoPersona.getValor_campo();
	static By BtnPersonaNatural = PagoTCElements.btnPersonaNatural.getValor_campo();
	static By BtnBanco = PagoTCElements.btnBanco.getValor_campo();
	static By BtnBancoUnionColombiano = PagoTCElements.btnBancoUnionColombia.getValor_campo();
	static By BtnContinuarPago = PagoTCElements.btnContinuarPago.getValor_campo();
	//EMAIL PSE
	static By TxtEmailPSE = PagoTCElements.txtEamilPSE.getValor_campo();
	static By BtnAceptar = PagoTCElements.btnAceptar.getValor_campo();
	static By BtnIrBanco = PagoTCElements.btnIrBanco.getValor_campo();
	//INFORMACION PAGO
	static By btnCredito = PagoTCElements.btnCredito.getValor_campo();
	static By TxtAegncia = PagoTCElements.btnAgency.getValor_campo();
	static By TxtAccount = PagoTCElements.btnAccount.getValor_campo();
	static By TxtPass = PagoTCElements.btnPass.getValor_campo();
	static By BtnCheck = PagoTCElements.btncheckout.getValor_campo();
	static By BtnPay = PagoTCElements.btnPay.getValor_campo();
	static By MsjAprobado = PagoTCElements.MnsjAprobado.getValor_campo();



	public void ClickAgendar() throws InterruptedException, AWTException {
		if (element(User).isDisplayed()) {
			Thread.sleep(1000);
			find(User).click();
			find(User).sendKeys("53084100");
			Thread.sleep(1000);	
			find(Pass).click();
			find(Pass).sendKeys("Mafe2408");
			Thread.sleep(1500);	
			find(Ing).click();
			Thread.sleep(5000);	
			find(Servicio).click();
			Thread.sleep(1000);	
			find(Ingreso).click();
			Thread.sleep(3000);	
			find(Agendar).click();
			Thread.sleep(3000);	
		}		
	}

	public void TipoCita() throws InterruptedException {
		find(TipoCita).click();
		Thread.sleep(2000);	
		find(CitaPresencial).click();
		Thread.sleep(4000);	
	}

	public void SeleccionarCiudad() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		find(Ciudad).click();
		Thread.sleep(1000);
		find(Bogota).click();
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		find(ConfirmarCiudad).click();
		Thread.sleep(1000);
	}

	public void SeleccionCentroMedico() throws InterruptedException, AWTException {
		find(CentroMedico).click();
		Thread.sleep(1000);
		find(CentroMedicoSuba).click();
		Thread.sleep(1000);	
		find(Horario).click();
		Thread.sleep(1000);	
		find(ConfirmarHorario).click();
		Thread.sleep(1000);	

	}

	public void SeleccionFecha() throws AWTException, InterruptedException {

		Robot robot = new Robot();	
			Thread.sleep(1000);	
			find(Fecha).click();
			Thread.sleep(3000);		
			//HORA
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			//MEDICO
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			find(ConfirmarFecha).click();
			Thread.sleep(3000);
		
	}

	public void ConfirmarReserva() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(3000);
		find(ConfirmarReserva).click();
		Thread.sleep(9000);

	}

	public void CitaAgendada() throws InterruptedException {
		if(element(BtnCitasAegndadas).isDisplayed()) {
			find(BtnCitasAegndadas).click();
			Thread.sleep(1000);
		}
	}

	public void ClickBtnPagar() throws InterruptedException {


		String mainTab = getDriver().getWindowHandle();
		String newTab = "";	
		System.out.println("Main Tab" + mainTab);
		find(BtnPagarCitaAgendada).click();
		Thread.sleep(2000);

		Set<String> handles = getDriver().getWindowHandles();
		for (String actual : handles) {
			System.out.println("Handle id:" + actual);	
			if (!actual.equalsIgnoreCase(mainTab)) {
				//Cambio de Pestaña
				getDriver().switchTo().window(actual);
			}
		}

	}


	public void RegistrarDatos()  {
		try {
			//Robot robot = new Robot();
			find(BtnIconoPago).click();
			Thread.sleep(2000);
			find(TxtCel).sendKeys("3104985492");
			Thread.sleep(1000);
			find(TxtEmail).sendKeys("Test@gmail.com");
			Thread.sleep(2000);
			getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id=\"ngrecaptcha-0\"]/div/div/iframe")));
			Thread.sleep(1000);
			find(Captchat).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(9000);
			getDriver().switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

	public void ConfirmarDatos() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		find(BtnConfirmarDatos).click();	
		Thread.sleep(6000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		find(BtnPSE).click();	
		Thread.sleep(2000);
	}

	public void ValidarMensajeCreacion() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
	}

	public void RegistroDatosPago() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,500)");
		find(BtnTipoPersona).click();
		Thread.sleep(2000);
		find(BtnPersonaNatural).click();
		Thread.sleep(2000);
		find(BtnBanco).click();
		Thread.sleep(2000);
		find(BtnBancoUnionColombiano).click();
		Thread.sleep(2000);
		find(BtnContinuarPago).click();
		Thread.sleep(3000);

	}

	public void IngresoEmailPSE() throws InterruptedException {

		find(TxtEmailPSE).sendKeys("oscaesgo@colsubsidio.com");
		Thread.sleep(2000);
		find(BtnAceptar).click();
		Thread.sleep(1000);
		find(BtnIrBanco).click();
		Thread.sleep(2000);
	}

	public void InformacionTC() throws InterruptedException {
		find(btnCredito).click();
		Thread.sleep(1000);
		find(TxtAegncia).sendKeys("1234");
		Thread.sleep(2000);
		find(TxtAccount).sendKeys("1234");
		Thread.sleep(2000);
		find(TxtPass).sendKeys("12345");
		Thread.sleep(2000);
		find(BtnCheck).click();
		Thread.sleep(2000);
	}

	public void RealizarPago() throws InterruptedException {
		find(BtnPay).click();
		Thread.sleep(3000);
	}

	public void ValidarMensajeAprobacion() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(5000);		
	}

}