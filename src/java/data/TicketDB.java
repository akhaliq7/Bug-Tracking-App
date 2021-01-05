/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import business.Ticket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author amar_
 */
public class TicketDB {
    public static int addTicket(Ticket ticket, int bugId, int userReporter, int userAssigned){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        String query
                = "INSERT INTO tickets (ticket_type, created_on, priority_value, bug_id, reporter, assigned) "
                + "VALUES (?,?,?,?,?,? )";
        String ticket_type = ticket.getTicketType();
        Timestamp created_on = ticket.getCreated();
        String priority_value = ticket.getPriorityValue();
        int bug_id = ticket.getBugId();
        int user_reporter = ticket.getUserReporter();
        int user_assigned = ticket.getUserAssigned();
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, ticket_type);
            ps.setTimestamp(2, created_on);
            ps.setString(3, priority_value);
            ps.setInt(4, bug_id);
            ps.setInt(5, user_reporter);
            ps.setInt(6, user_assigned);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
