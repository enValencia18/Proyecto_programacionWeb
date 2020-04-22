package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.InfectiousAgent;

public interface IinfectiousAgentService {
	public void insert(InfectiousAgent infectious);

	public List<InfectiousAgent> list();

}
