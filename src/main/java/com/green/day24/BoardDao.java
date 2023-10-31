package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

// data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { //title, ctnts, writer
        int result = 0;
        String sql = "INSERT INTO board(title, ctnts, writer)" +
                "VALUES" +
                "(?, ?, ?)"; // try문 안에 Prepared가 붙은 PreparedStatement 가 붙어서 아래내용이아닌 위의 내용대로 출력문 작성

        /*String sql = String.format("INSERT INTO board (title, ctnts, writer) VALUES ('%s', '%s', '%s')",
                entity.getTitle(),entity.getCtnts(),entity.getWriter());*/

        try {
            Connection con = MyConn.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,entity.getTitle());
            ps.setString(2,entity.getCtnts());
            ps.setString(3,entity.getWriter());

            result = ps.executeUpdate(); // 영향받은 행을 넘겨준다.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return result;
    }
}
