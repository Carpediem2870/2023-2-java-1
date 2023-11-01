package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

// Dao : Data Access Object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { //title, ctnts, writer
        int result = 0;
        String sql = "INSERT INTO board(title, ctnts, writer)" +
                "VALUES" +
                "(?, ?, ?)"; // try문 안에 Prepared가 붙은 PreparedStatement를 사용해서 String.format이 아닌 위의 내용대로 출력문 작성

        /*String sql = String.format("INSERT INTO board (title, ctnts, writer) VALUES ('%s', '%s', '%s')",
                entity.getTitle(),entity.getCtnts(),entity.getWriter());*/
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);

            ps.setString(1,entity.getTitle());
            ps.setString(2,entity.getCtnts());
            ps.setString(3,entity.getWriter());

            result = ps.executeUpdate(); // 영향받은 행을 넘겨준다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }

        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sql = "DELETE FROM board WHERE iboard = ?";

        Connection con = null;
        PreparedStatement ps = null;


        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);

            ps.setInt(1,entity.getIboard());

            result = ps.executeUpdate(); // 영향받은 행을 넘겨준다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }

        return result;
    }

    public static int updBoard(BoardEntity entity){
        int result = 0;
        String sql = "UPDATE board SET title = ?, ctnts = ?, writer = ?, updated_at = now() WHERE iboard =?";

        Connection con = null;
        PreparedStatement ps = null;


        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);

            ps.setString(1,entity.getTitle());
            ps.setString(2,entity.getCtnts());
            ps.setString(3,entity.getWriter());
            ps.setInt(4,entity.getIboard());
            result = ps.executeUpdate(); // 영향받은 행을 넘겨준다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }

        return result;


    }
}
