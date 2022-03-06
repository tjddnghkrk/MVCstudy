package hello.sevlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository
{
        private static Map<Long, Member> store = new HashMap<>();
        private static long sequence = 0L;

        private static final MemberRepository instance = new MemberRepository();

        public static MemberRepository getInstance(){
            return instance;
        }

        private MemberRepository(){ // 생성자 막기. 싱글톤으로 하기 위해서
        }

        public Member save(Member member){
            member.setId(++sequence);
            store.put(member.getId(), member);
            return member;
        }

        public Member findById(Long id){
            return store.get(id);
        }

        public List<Member> findeAll(){
            return new ArrayList<>(store.values());
        }

        public void clearStore(){
            store.clear();
        }
}
