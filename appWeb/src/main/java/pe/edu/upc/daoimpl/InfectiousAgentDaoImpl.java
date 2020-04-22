package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.conexion.Conexion;
import pe.edu.upc.daointerface.IinfectiousAgentDao;
import pe.edu.upc.entity.InfectiousAgent;

public class InfectiousAgentDaoImpl implements IinfectiousAgentDao {
	private Connection oCn;

	public InfectiousAgentDaoImpl() {
		oCn = Conexion.AbrirConexion();
	}

//@override significa que lo copiaste
	@Override
	public void insert(InfectiousAgent infectious) {

		// manipular la data insert, modficacion a la BD
		try {
			String sql = "insert into infectiousagents(descriptionInfectiousAgents,typeInfectiousAgents,timeOfLifeInfectiousAgents,appearanceDateInfectiousAgents)" 
		+ " values(?,?,?,?)";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ps.setString(1, infectious.getDescriptionInfectiousAgents());
			ps.setString(2, infectious.getTypeInfectiousAgents());
			ps.setInt(3, infectious.getTimeOfLifeInfectiousAgents());
			ps.setDate(4, new java.sql.Date(infectious.getAppearanceDateInfectiousAgents().getTime()));
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			System.out.print("Error al insertar registro de Infectious Agent");
		}
	}

	@Override
	public List<InfectiousAgent> list() {
		// TODO Auto-generated method stub
		List<InfectiousAgent> lista = new ArrayList<InfectiousAgent>();
		try {
			String sql = "select * from infectiousagents";
			PreparedStatement ps = oCn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				InfectiousAgent i=new InfectiousAgent();
				i.setIdInfectiousAgents(rs.getInt("IdInfectiousAgents"));
				i.setDescriptionInfectiousAgents(rs.getString("descriptionInfectiousAgents"));
				i.setTypeInfectiousAgents(rs.getString("typeInfectiousAgents"));
				i.setTimeOfLifeInfectiousAgents(rs.getInt("timeOfLifeInfectiousAgents"));
				i.setAppearanceDateInfectiousAgents(rs.getDate("appearanceDateInfectiousAgents"));
				lista.add(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar los datos de infectious agent");
		}
		return lista;
	}
}
