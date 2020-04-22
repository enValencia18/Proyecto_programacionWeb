package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.InfectiousAgent;
import pe.edu.upc.serviceinterface.IinfectiousAgentService;

@Named
@RequestScoped
public class InfectiousAgentController {
	@Inject
	private IinfectiousAgentService iService;

	private InfectiousAgent i;
	List<InfectiousAgent> listaInfectiousAgent; 

	// constructor
	@PostConstruct
	public void init() {
		this.listaInfectiousAgent = new ArrayList<InfectiousAgent>();
		this.i = new InfectiousAgent();
		this.list();
	}

	// metodos o eventos
	public String newInfectious() {
		this.setI(new InfectiousAgent());
		return "infectiousAgent.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanInfectiousAgent();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaInfectiousAgent = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanInfectiousAgent() {
		this.init();
	}

	// gets y setters
	public InfectiousAgent getI() {
		return i;
	}

	public void setI(InfectiousAgent i) {
		this.i = i;
	}

	public List<InfectiousAgent> getListaInfectiousAgent() {
		return listaInfectiousAgent;
	}

	public void setListaInfectiousAgent(List<InfectiousAgent> listaInfectiousAgent) {
		this.listaInfectiousAgent = listaInfectiousAgent;
	}

}
