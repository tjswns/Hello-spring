package hello.hellospring.service;

import static org.junit.jupiter.api.Assertions.*;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

  MemberService memberService = new MemberService();

  @Test
  void join() {
    //given
    Member member = new Member();
    member.setName("hello");

    //when

    Long saveId = memberService.join(member);

    //then
    memberService.findOne(saveId);
    Assertions.assertThat()
  }

  @Test
  void findMembers() {
  }

  @Test
  void findOne() {
  }
}