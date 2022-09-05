package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // null값 처리하기 위해 Optional 사용
    Optional<Member> findByName(String name); // null값 처리하기 위해 Optional 사용
    List<Member> findAll();
}
