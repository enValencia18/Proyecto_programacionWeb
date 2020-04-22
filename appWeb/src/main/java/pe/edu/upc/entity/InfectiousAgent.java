package pe.edu.upc.entity;

import java.util.Date;

public class InfectiousAgent {
	private int idInfectiousAgents;
	private String descriptionInfectiousAgents;
	private String typeInfectiousAgents;
	private int timeOfLifeInfectiousAgents;
	private Date appearanceDateInfectiousAgents;

//constructor sin parametros
	public InfectiousAgent() {
		super();
		// TODO Auto-generated constructor stub
	}

//constructor con parametros
	public InfectiousAgent(int idInfectiousAgents, String descriptionInfectiousAgents, String typeInfectiousAgents,
			int timeOfLifeInfectiousAgents, Date appearanceDateInfectiousAgents) {
		super();
		this.idInfectiousAgents = idInfectiousAgents;
		this.descriptionInfectiousAgents = descriptionInfectiousAgents;
		this.typeInfectiousAgents = typeInfectiousAgents;
		this.timeOfLifeInfectiousAgents = timeOfLifeInfectiousAgents;
		this.appearanceDateInfectiousAgents = appearanceDateInfectiousAgents;
	}

//getters y setters
	public int getIdInfectiousAgents() {
		return idInfectiousAgents;
	}

	public void setIdInfectiousAgents(int idInfectiousAgents) {
		this.idInfectiousAgents = idInfectiousAgents;
	}

	public String getDescriptionInfectiousAgents() {
		return descriptionInfectiousAgents;
	}

	public void setDescriptionInfectiousAgents(String descriptionInfectiousAgents) {
		this.descriptionInfectiousAgents = descriptionInfectiousAgents;
	}

	public String getTypeInfectiousAgents() {
		return typeInfectiousAgents;
	}

	public void setTypeInfectiousAgents(String typeInfectiousAgents) {
		this.typeInfectiousAgents = typeInfectiousAgents;
	}

	public int getTimeOfLifeInfectiousAgents() {
		return timeOfLifeInfectiousAgents;
	}

	public void setTimeOfLifeInfectiousAgents(int timeOfLifeInfectiousAgents) {
		this.timeOfLifeInfectiousAgents = timeOfLifeInfectiousAgents;
	}

	public Date getAppearanceDateInfectiousAgents() {
		return appearanceDateInfectiousAgents;
	}

	public void setAppearanceDateInfectiousAgents(Date appearanceDateInfectiousAgents) {
		this.appearanceDateInfectiousAgents = appearanceDateInfectiousAgents;
	}
}
