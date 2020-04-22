package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.InfectiousAgent;

public interface IinfectiousAgentDao {
	public void insert(InfectiousAgent infectious);

	public List<InfectiousAgent> list();
	
}
