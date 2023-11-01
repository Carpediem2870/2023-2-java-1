package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
            result = ps.executeUpdate(); // 영향받은 행을 넘겨준다. 셀렉트 제외하곤 나머지는 Update
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }

        return result;


    }
    public static List<BoardEntity> setBoartList() {
        List<BoardEntity> list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, ctnts, writer, created_at " +
                "From board ";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // SELECT를 쓸때는 해당내용이 들어가야함.
            while(rs.next()) {
/*                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_At");*/

                BoardEntity ent = new BoardEntity();
                ent.setIboard(rs.getInt("iboard"));
                ent.setTitle(rs.getString("title"));
                ent.setCtnts(rs.getString("ctnts"));
                ent.setWriter(rs.getString("writer"));
                ent.setCreatedAt(rs.getString("created_At"));

                list.add(ent);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }

    public static BoardEntity selBoardById(int iboard) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = " SELECT iboard, title, writer, ctnts, created_at, updated_at " +
                " FROM board WHERE iboard = ?";

        try {
            conn = MyConn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,iboard);
            rs = ps.executeQuery();  // 실행 셀렉트만 쿼리, 경우의 수 0, 1
            if(rs.next()) {

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));

                return entity;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(conn, ps, rs);
        }
        return null;

    }
}
