package tp1.WebService;

import Configuration.Db;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@WebService
public class StudentService {

    @WebMethod
    public List<Student> getAllStudents() {
        List<Student> studentsList = new ArrayList<>();
        try (
             Connection connection = Db.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM students");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("Name"));
                student.setCin(resultSet.getString("cin"));
                student.setBirth(resultSet.getDate("birth"));
                student.setFiliere(resultSet.getString("filiere"));
                studentsList.add(student);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentsList;
    }



    @WebMethod
    public Student getStudentByCIN(@WebParam(name = "cin") String cin) {
        try (Connection connection = Db.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM students WHERE cin = ?");
        ) {
            statement.setString(1, cin);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("Name"));
                student.setCin(resultSet.getString("cin"));
                student.setBirth(resultSet.getDate("birth"));
                student.setFiliere(resultSet.getString("filiere"));
                return student;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    @WebMethod
    public List<Student> getLimitedStudents(@WebParam(name = "limit") int limit) {
        List<Student> limitedStudentsList = new ArrayList<>();
        try (Connection connection = Db.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM students LIMIT ?");
        ) {
            statement.setInt(1, limit);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("Name"));
                student.setCin(resultSet.getString("cin"));
                student.setBirth(resultSet.getDate("birth"));
                student.setFiliere(resultSet.getString("filiere"));
                limitedStudentsList.add(student);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return limitedStudentsList;
    }



}

