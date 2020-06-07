package it.polito.tdp.warehouse.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import it.polito.tdp.warehouse.model.* ;
import it.polito.tdp.warehouse.model.WMovement.directionEnum;

public class WarehouseDAO {
	/*
	 * Alternative query:
	 * SELECT time, objectId, size, direction FROM movements NATURAL JOIN objects ORDER BY time
	 */
	
	public List<WMovement> getAllMovements() {
		final String sql = "SELECT time, objectId, direction FROM movements ORDER BY time";
		List<WMovement> movements = new LinkedList<WMovement>();

		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				WMovement.directionEnum d;
				if (rs.getString("direction").equals("in"))
					d = directionEnum.IN;
				else
					d = directionEnum.OUT;
				WMovement m = new WMovement(rs.getInt("time"), rs.getInt("objectId"), d);
				movements.add(m);
			}
			return movements;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public Map<Integer, WObject> getAllObjects() {
		final String sql = "SELECT objectId, description, size FROM objects";
		Map<Integer, WObject> objects = new HashMap<Integer, WObject>();

		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				objects.put(rs.getInt("objectId"), new WObject(rs.getInt("objectId"), rs.getString("description"), rs.getInt("size")));
			}
			return objects;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}

