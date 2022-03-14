package Connector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import practice.object;

public class StudentDB {
	public static boolean insertStudentToDb(object sc) {
		boolean flag = false;
		// jdbc code
		try {
			Connection con = ConnectionGenerator.CreateConnection();
			String sql = "Insert into reader(Name, ID, Roll_No) values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			// set the values of parameter
			ps.setString(1, sc.getName());
			ps.setString(2, sc.getId());
			ps.setString(3, sc.getRoll_No());

			// execute
			ps.executeUpdate();

			flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return flag;
	}

}
