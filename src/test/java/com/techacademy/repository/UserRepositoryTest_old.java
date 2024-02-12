package com.techacademy.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.techacademy.entity.User;

@SpringBootTest //SpringBootを再起動してdata.SQLなど実行
@ExtendWith(SpringExtension.class) //コンストラクタ・インジェクションを行なうために必要
class UserRepositoryTest_old {
    private final UserRepository userRepository;

    @Autowired //SpringBootのアノテーションの使用を可能にする
    UserRepositoryTest_old(UserRepository repository) {
        this.userRepository = repository;
    }

    @Test
    void testFindById() {
        User user = userRepository.findById(1).get();
        assertEquals(user.getId(), 1); //JUnit専用のメソッド。assertEquals() は2つの値が等しいかどうかを判定するメソッド。
        assertEquals(user.getName(), "キラメキ太郎");
    }
}