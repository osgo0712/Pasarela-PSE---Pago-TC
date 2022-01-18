package Steps;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import PageObject.PagoTCPageObject;
import net.thucydides.core.annotations.Step;

public class PagoTCStep {
	
	PagoTCPageObject AgendamientoPageObject;

	@Step
	public void abrirHome() {
		AgendamientoPageObject.open();		
	}
	
	@Step
	public void Agenda() throws InterruptedException, AWTException {
		AgendamientoPageObject.ClickAgendar();		
	}

	@Step
	public void TipoCita() throws FileNotFoundException, IOException, InterruptedException, AWTException {
		AgendamientoPageObject.TipoCita();		
	}

	@Step
	public void SeleccionCiudad() throws AWTException, InterruptedException {
		AgendamientoPageObject.SeleccionarCiudad();
	}

	@Step
	public void SeleccionCentroMedico() throws InterruptedException, AWTException {
		AgendamientoPageObject.SeleccionCentroMedico();		
	}
	
	@Step
	public void SeleccionFecha() throws InterruptedException, AWTException {
		AgendamientoPageObject.SeleccionFecha();		
	}
	
	@Step
	public void ConfirmarReserva() throws InterruptedException, AWTException {
		AgendamientoPageObject.ConfirmarReserva();		
	}
	
	@Step
	public void CitasAgendadas() throws InterruptedException {	
		AgendamientoPageObject.CitaAgendada();
	}
	
	@Step
	public void ClickBtnPago() throws InterruptedException {
		AgendamientoPageObject.ClickBtnPagar();		
	}	
	
	@Step
	public void RegistroInfor() throws InterruptedException, AWTException {
		AgendamientoPageObject.RegistrarDatos();
	}
	
	@Step
	public void ConfirmacionDatos() throws InterruptedException {
		AgendamientoPageObject.ConfirmarDatos();
	}
	
	@Step
	public void ValidarMensajeCreacion() throws InterruptedException  {
		AgendamientoPageObject.ValidarMensajeCreacion();
	}
	
	@Step
	public void DatosDePago() throws InterruptedException  {
		AgendamientoPageObject.RegistroDatosPago();
	}
	
	@Step
	public void IngresoEmail() throws InterruptedException  {
		AgendamientoPageObject.IngresoEmailPSE();
	}
	
	@Step
	public void IngresoInformacionTC() throws InterruptedException  {
		AgendamientoPageObject.InformacionTC();
	}

	@Step
	public void RealizarPago() throws InterruptedException  {
		AgendamientoPageObject.RealizarPago();
	}

	@Step
	public void MensajeAprobado() throws InterruptedException  {
		AgendamientoPageObject.ValidarMensajeAprobacion();
	}

}
