package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IinfectiousAgentDao;
import pe.edu.upc.entity.InfectiousAgent;
import pe.edu.upc.serviceinterface.IinfectiousAgentService;

@Named
@RequestScoped
public class InfectiousAgentServiceImpl implements IinfectiousAgentService {

	@Inject /*injeccion de dependecias*/
	private IinfectiousAgentDao iD;
	@Override
	public void insert(InfectiousAgent infectious) {
		// TODO Auto-generated method stub
		try {
			iD.insert(infectious);
		} catch (Exception e) {
			System.out.println("Error en el service al insertar un infectious agent");
		}
	}

	@Override
	public List<InfectiousAgent> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}
	
}
