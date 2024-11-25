package com.cisco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cisco.dbutil.DbUtil;
import com.cisco.pojo.Trainer;

public class TrainerDAO {

    // Register a new Trainer (Create)
    public boolean registerTrainer(Trainer trainer) {
        String sql = "INSERT INTO trainer (tName, tPassword, tEmail, tGender, slotdate, slots) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DbUtil.getConn(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, trainer.gettName());
            stmt.setString(2, trainer.gettPassword());
            stmt.setString(3, trainer.gettEmail());
            stmt.setString(4, trainer.gettGender());
            stmt.setDate(5, new java.sql.Date(trainer.getSlotdate().getTime()));
            stmt.setInt(6, trainer.getSlots());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0; // If rows affected > 0, registration was successful

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Get a Trainer by Email (Read)
    public Trainer getTrainerByEmail(String tEmail) {
        String sql = "SELECT * FROM trainer WHERE tEmail = ?";
        try (Connection conn = DbUtil.getConn();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tEmail);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Trainer trainer = new Trainer();
                trainer.setTid(rs.getInt("tid"));
                trainer.settName(rs.getString("tName"));
                trainer.settPassword(rs.getString("tPassword"));
                trainer.settEmail(rs.getString("tEmail"));
                trainer.settGender(rs.getString("tGender"));
                trainer.setSlotdate(rs.getDate("slotdate"));
                trainer.setSlots(rs.getInt("slots"));
                return trainer;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null; // Return null if no trainer found
    }

    // Get all Trainers (Read All)
    public List<Trainer> getAllTrainers() {
        List<Trainer> trainers = new ArrayList<>();
        String sql = "SELECT * FROM trainer";
        try (Connection conn = DbUtil.getConn();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Trainer trainer = new Trainer();
                trainer.setTid(rs.getInt("tid"));
                trainer.settName(rs.getString("tName"));
                trainer.settPassword(rs.getString("tPassword"));
                trainer.settEmail(rs.getString("tEmail"));
                trainer.settGender(rs.getString("tGender"));
                trainer.setSlotdate(rs.getDate("slotdate"));
                trainer.setSlots(rs.getInt("slots"));
                trainers.add(trainer);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return trainers;
    }

    // Update Trainer details (Update)
    public boolean updateTrainer(Trainer trainer) {
        String sql = "UPDATE trainer SET tName = ?, tPassword = ?, tGender = ?, slotdate = ?, slots = ? WHERE tEmail = ?";
        try (Connection conn = DbUtil.getConn();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, trainer.gettName());
            stmt.setString(2, trainer.gettPassword());
            stmt.setString(3, trainer.gettGender());
            stmt.setDate(4, new java.sql.Date(trainer.getSlotdate().getTime()));
            stmt.setInt(5, trainer.getSlots());
            stmt.setString(6, trainer.gettEmail());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0; // If rows affected > 0, update was successful
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Delete Trainer by Email (Delete)
    public boolean deleteTrainer(String tEmail) {
        String sql = "DELETE FROM trainer WHERE tEmail = ?";
        try (Connection conn = DbUtil.getConn();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tEmail);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0; // If rows affected > 0, delete was successful
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Validate Login (Check if email and password are correct)
    public boolean validateLogin(String tEmail, String tPassword) {
        String sql = "SELECT * FROM trainer WHERE tEmail = ? AND tPassword = ?";
        try (Connection conn = DbUtil.getConn();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tEmail);
            stmt.setString(2, tPassword);

            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Returns true if a match is found
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
