package com.green.day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    public static void main(String[] args) {
        //MyConn에 있는 getConn메소드 호출하고 메소드가 리턴해주는 값 담아보세요.
        Connection conn = MyConn.getConn();

        String sql = "INSERT INTO country(country_id, country) VALUES (111, '동하나라')";


        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


class MyConnTest2 {
    public static void main(String[] args) {

        //title : 처음 작성
        //ctnts : 처음 작성하는 내용입니다.
        //wirter : 홍길동
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle("새로운글");
        boardEntity.setCtnts("몇개만 쓰자");
        boardEntity.setWriter("어려워ㅜㅜㅜㅜ");

        //생성자 BoardEntity2 boardEntity2 = new BoardEntity2("처음 작성2", "처음 작성하는 내용입니다.2", "홍길동2");

//    BoardDao.insBoard(boardEntity);
    int row = BoardDao.insBoard(boardEntity);
    }
}

class MyConnTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(3);

        int row = BoardDao.delBoard(entity);
        System.out.println(row);

    }
}

class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(4);
        entity.setTitle("제목 하이");
        entity.setCtnts("수정내용");
        entity.setWriter("수정자");

        int row = BoardDao.updBoard(entity);
        System.out.println(row);
    }
}