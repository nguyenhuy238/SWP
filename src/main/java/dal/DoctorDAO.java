package dal;

import model.Doctor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DoctorDAO {
    DBContext ad = new DBContext();

        public ArrayList<Doctor> getAllDoctors() {
        ArrayList<Doctor> l = new ArrayList<>();
        String xSql = "select * from [HealthCareSystem].[dbo].[Doctor]";

        try {
            PreparedStatement ps = ad.getConnection().prepareStatement(xSql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                l.add(new  Doctor(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getNString(4), rs.getNString(5)));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (l);
    }


    public static void main(String[] args) {
        DoctorDAO dao = new DoctorDAO();
        ArrayList<Doctor> l = dao.getAllDoctors();
    }


}
